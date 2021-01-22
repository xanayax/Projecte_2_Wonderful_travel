package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.LlistaReserves;
import model.Reserva;

public class ReservesDAO {
	
	public static LlistaReserves selectAllReserves() throws SQLException {
		
	LlistaReserves llistaReserves = new LlistaReserves();
		String query = "SELECT * FROM reserves";
		
		ResultSet rs = Connexio.objectStatement().executeQuery(query);
		
		while(rs.next()) {
			llistaReserves.addReserva(new Reserva(rs));
		}
		
		return llistaReserves;
	}
	
	
	public static void insertReserva(Reserva reserva) throws SQLException {

		Connection conexion = null;
		PreparedStatement stmt = null;

		try {

			conexion = Connexio.getConnection();
			
			stmt = (PreparedStatement) conexion.prepareStatement("INSERT INTO reserves (data, pais, nom_client, "
					+ "telefon, num_persones, preu) VALUES (?,?,?,?,?,?)");
			
			stmt.setDate(1, reserva.getData());
			stmt.setString(2, reserva.getPais());
			stmt.setString(3, reserva.getNom_client());
			stmt.setString(4, reserva.getTelefon());
			stmt.setInt(5, reserva.getNum_persones());
			stmt.setFloat(6, reserva.getPreu());
			
			stmt.executeUpdate();


		} finally {
			conexion.close();
			stmt.close();
		}
	}
	
	
	public static void deleteReserva(int id) throws SQLException {

		Connection conexion = null;
		PreparedStatement stmt = null;

		try {

			conexion = Connexio.getConnection();
			
			stmt = (PreparedStatement) conexion.prepareStatement("DELETE FROM reserves WHERE id = ?");
			
			stmt.setInt(1, id);
			
			stmt.executeUpdate();


		} finally {
			conexion.close();
			stmt.close();
		}
	}
}

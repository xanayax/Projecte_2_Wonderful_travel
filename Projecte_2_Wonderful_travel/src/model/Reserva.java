package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class Reserva {
	
	int id;
	Date data;
	String pais;
	String nom_client;
	String telefon;
	int num_persones;
	int preu;
	
	
	public Reserva(ResultSet rs) throws SQLException {
		setId(rs.getInt("id"));
		setData(rs.getDate("data"));
		setPais(rs.getString("pais"));
		setNom_client(rs.getString("nom_client"));
		setTelefon(rs.getString("telefon"));
		setNum_persones(rs.getInt("num_persones"));
		setPreu(rs.getInt("preu"));
	}
	
	
	public Reserva(HttpServletRequest req) {
		setData(req);
		setPais(req.getParameter("pais"));
		setNom_client(req.getParameter("nom_client"));
		setTelefon(req.getParameter("telefon"));
		setNum_persones(req);
		setPreu(req);
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	public void setData(HttpServletRequest req) {
		this.data = Date.valueOf(req.getParameter("data"));
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getNom_client() {
		return nom_client;
	}


	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public int getNum_persones() {
		return num_persones;
	}


	public void setNum_persones(int num_persones) {
		this.num_persones = num_persones;
	}
	
	public void setNum_persones(HttpServletRequest req) {
		this.num_persones = Integer.parseInt(req.getParameter("num_persones"));
	}


	public int getPreu() {
		return preu;
	}


	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	public void setPreu(HttpServletRequest req) {
		this.preu = Integer.parseInt(req.getParameter("preu"));
	}
	
	
	
}

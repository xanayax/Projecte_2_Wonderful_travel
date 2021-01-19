package controlador;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DAO.ReservesDAO;
import model.LlistaReserves;
import model.Reserva;

/**
 * Servlet implementation class InsertarReserva
 */
@WebServlet("/InsertarReserva")
public class InsertarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarReserva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Date data = Date.valueOf((request.getParameter("data")));
		String pais = request.getParameter("pais");
		String nom_client = request.getParameter("nom_client");
		String telefon = request.getParameter("telefon");
		int num_persones = Integer.parseInt(request.getParameter("num_persones"));
		int preu = Integer.parseInt(request.getParameter("preu"));
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);

		Reserva reserva = new Reserva(request);
		
		try {
			
			ReservesDAO.insertReserva(reserva);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

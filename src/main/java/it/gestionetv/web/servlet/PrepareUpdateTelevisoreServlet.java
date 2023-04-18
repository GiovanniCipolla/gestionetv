package it.gestionetv.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.gestionetv.model.Televisore;
import it.gestionetv.service.MyServiceFactory;
import it.gestionetv.service.televisore.TelevisoreService;

/**
 * Servlet implementation class PrepareUpdateTelevisoreServlet
 */
@WebServlet("/PrepareUpdateTelevisoreServlet")
public class PrepareUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// -------BINDING
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		Long idTelevisore = Long.parseLong(request.getParameter("idDaInviareComeParametro"));
		Televisore result = null;

		
		
		// -------VALIDAZIONE

		
		
		
		// -------BUSINESS
		try {
			result = televisoreServiceInstance.caricaSingolo(idTelevisore);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("televisoreDaModificare", result);

		
		
		// -------FORWARD
		request.getRequestDispatcher("modifica.jsp").forward(request, response);

	}

}

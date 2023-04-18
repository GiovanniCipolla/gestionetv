package it.gestionetv.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.gestionetv.service.MyServiceFactory;

/**
 * Servlet implementation class PrepareDeleteTelevisoreServlet
 */
@WebServlet("/PrepareDeleteTelevisoreServlet")
public class PrepareDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// -------BINDING
		String parametroIdDaEliminare = request.getParameter("idDaInviareComeParametro");
		Long idTelevisoreDaRimuovere = Long.parseLong(parametroIdDaEliminare);

		// -------VALIDAZIONE
		// al momento vuota

		// -------BUSINESS
		request.setAttribute("abitanteDaInviareAPaginaRimozione",
				MyServiceFactory.getTelevisoreServiceInstance().caricaSingolo(idTelevisoreDaRimuovere));

		// -------FORWARD
		request.getRequestDispatcher("delete.jsp").forward(request, response);
	}

}

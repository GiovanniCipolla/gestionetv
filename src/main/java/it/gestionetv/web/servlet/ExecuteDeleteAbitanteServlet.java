package it.gestionetv.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.gestionetv.service.MyServiceFactory;
import it.gestionetv.service.televisore.TelevisoreService;

/**
 * Servlet implementation class ExecuteDeleteAbitanteServlet
 */
@WebServlet("/ExecuteDeleteAbitanteServlet")
public class ExecuteDeleteAbitanteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// -------BINDING
		String parametroIdDaEliminare = request.getParameter("idDaRimuovere");
		Long idTelevisoreDaRimuovere = Long.parseLong(parametroIdDaEliminare);

		// -------VALIDAZIONE
		// al momento vuota

		// -------BUSINESS
		TelevisoreService abitanteService = MyServiceFactory.getTelevisoreServiceInstance();
		abitanteService.elimina(idTelevisoreDaRimuovere);
		request.setAttribute("listTelevisoriAttributeMarca", abitanteService.listAll());

		// -------FORWARD
		request.getRequestDispatcher("results.jsp").forward(request, response);

	}

}

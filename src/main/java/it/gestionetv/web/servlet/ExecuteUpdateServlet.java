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

@WebServlet("/ExecuteUpdateServlet")
public class ExecuteUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				// Binding
				String marcaDaPagina = request.getParameter("marcaEditInput");
				String modelloDaPagina = request.getParameter("modelloEditInput");
				String prezzoDaPagina = request.getParameter("prezzoEditInput");
				String numeroPolliciDaPagina = request.getParameter("numeroPolliciEditInput");
				String codiceDaPagina = request.getParameter("codiceEditInput");
				String parametroIdTelevisore = request.getParameter("idEditInput");
				
				Long idTelevisore = Long.parseLong(parametroIdTelevisore);
				Televisore nuovoTelevisore = new Televisore(idTelevisore, marcaDaPagina, modelloDaPagina, Integer.parseInt(prezzoDaPagina),
						Integer.parseInt(numeroPolliciDaPagina), codiceDaPagina);

				// validazione
				if (marcaDaPagina.isBlank() || modelloDaPagina.isBlank() || prezzoDaPagina.isBlank() || prezzoDaPagina == null
						|| numeroPolliciDaPagina.isBlank() || numeroPolliciDaPagina == null || codiceDaPagina.isBlank()) {
					String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare TUTTI i campi in maniera corretta.";
					request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
					request.setAttribute("televisoreDaModificare",
							MyServiceFactory.getTelevisoreServiceInstance().caricaSingolo(idTelevisore));
					request.getRequestDispatcher("modifica.jsp").forward(request, response);
					return;
				}

				MyServiceFactory.getTelevisoreServiceInstance().aggiornaSingolo(nuovoTelevisore);
				request.setAttribute("listTelevisoriAttributeMarca", MyServiceFactory.getTelevisoreServiceInstance().listAll());
				
				request.getRequestDispatcher("results.jsp").forward(request, response);

	}
}

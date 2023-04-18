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
import it.gestionetv.utility.UtilityForm;

@WebServlet("/ExecuteInsertServlet")
public class ExecuteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		//-----------------------------BINDING
		String marcaTelevisoreParam = request.getParameter("marcaInput");
		String modelloTelevisoreParam = request.getParameter("modelloInput");
		String prezzoTelevisoreParam = request.getParameter("prezzoInput");
		String numeroPolliciTelevisoreParam = request.getParameter("numeroPolliciInput");
		String codiceTelevisoreParam = request.getParameter("codiceInput");
		Integer prezzoResult = UtilityForm.parseFromString(prezzoTelevisoreParam);
		Integer numeroPolliciResult = UtilityForm.parseFromString(numeroPolliciTelevisoreParam);
		Televisore televisoreDaInserire = new Televisore(marcaTelevisoreParam, modelloTelevisoreParam, prezzoResult,
				numeroPolliciResult, codiceTelevisoreParam);

		
		
		//-----------------------------VALIDAZIONE
		if (televisoreDaInserire.getMarca().isBlank() || televisoreDaInserire.getModello().isBlank()
				|| prezzoResult == null || numeroPolliciResult == null || televisoreDaInserire.getCodice().isBlank()) {
			String messaggioDaInviareAPagina = "Attenzione! E' Necessario valorizzare correttamente tutti i campi!";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			request.getRequestDispatcher("insert.jsp").forward(request, response);
			return;
		}

		
		
		//-----------------------------BUSINESS
		TelevisoreService televisoreService = MyServiceFactory.getTelevisoreServiceInstance();
		televisoreService.inserisci(televisoreDaInserire);
		request.setAttribute("listTelevisoriAttributeMarca", televisoreService.listAll());
		
		
		
		//-----------------------------FORWARD
		request.getRequestDispatcher("results.jsp").forward(request, response);

	}

}

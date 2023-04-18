package it.gestionetv.service;

import it.gestionetv.dao.MyDaoFactory;
import it.gestionetv.service.televisore.TelevisoreService;
import it.gestionetv.service.televisore.TelevisoreServiceImpl;

public class MyServiceFactory {
	// rendiamo questo factory SINGLETON
		private static TelevisoreService TELEVISORE_SERVICE_INSTANCE;

		public static TelevisoreService getTelevisoreServiceInstance() {
			if (TELEVISORE_SERVICE_INSTANCE == null)
				TELEVISORE_SERVICE_INSTANCE = new TelevisoreServiceImpl();

			TELEVISORE_SERVICE_INSTANCE.setTelevisoreDAO(MyDaoFactory.getTelevisoreDAOInstance());

			return TELEVISORE_SERVICE_INSTANCE;
		}
}

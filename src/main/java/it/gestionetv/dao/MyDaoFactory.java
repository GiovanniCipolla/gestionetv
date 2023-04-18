package it.gestionetv.dao;

import it.gestionetv.dao.televisore.TelevisoreDAO;
import it.gestionetv.dao.televisore.TelevisoreDAOImpl;

public class MyDaoFactory {
	private static TelevisoreDAO TELEVISORE_DAO_INSTANCE = null;

	public static TelevisoreDAO getTelevisoreDAOInstance() {
		if (TELEVISORE_DAO_INSTANCE == null)
			TELEVISORE_DAO_INSTANCE = new TelevisoreDAOImpl();

		return TELEVISORE_DAO_INSTANCE;
	}
}
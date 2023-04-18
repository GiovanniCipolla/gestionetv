package it.gestionetv.service.televisore;

import java.util.List;

import it.gestionetv.dao.televisore.TelevisoreDAO;
import it.gestionetv.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {
	
	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
		
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisore caricaSingolo(Long id) {
		try {
			return televisoreDAO.get(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}

	@Override
	public int inserisci(Televisore input) {
		try {
			return televisoreDAO.insert(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}

	@Override
	public List<Televisore> listAll() {
		try {
			return televisoreDAO.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}

	@Override
	public void elimina(Long id) {
		try {
			televisoreDAO.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);

		}
		
	}

	@Override
	public void aggiornaSingolo(Televisore input) {
		try {
			televisoreDAO.update(input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);

		}
		
	}
	
}
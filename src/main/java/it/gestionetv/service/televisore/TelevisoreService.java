package it.gestionetv.service.televisore;

import java.util.List;

import it.gestionetv.dao.televisore.TelevisoreDAO;
import it.gestionetv.model.Televisore;



public interface TelevisoreService {
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);
	public Televisore caricaSingolo(Long id) ;
	public int inserisci(Televisore input);
	public List<Televisore> listAll();
	public void elimina(Long id);
	public void aggiornaSingolo(Televisore input);
}

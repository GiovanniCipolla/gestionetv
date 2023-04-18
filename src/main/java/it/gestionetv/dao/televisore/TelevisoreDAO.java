package it.gestionetv.dao.televisore;

import java.util.List;


import it.gestionetv.dao.IBaseDAO;
import it.gestionetv.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore> {
	public List<Televisore> findByMarcaAndModello(String marca, String modello);

}
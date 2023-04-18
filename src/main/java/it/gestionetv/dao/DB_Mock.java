package it.gestionetv.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.gestionetv.model.Televisore;


public class DB_Mock {
	
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "samsung", "galaxy7", 600, 40, "SGLX"));
		LISTA_TELEVISORI.add(new Televisore(4l, "lg", "xperya2", 400, 32, "LGSP"));
		LISTA_TELEVISORI.add(new Televisore(6l, "samsung", "galaxy5", 290, 28, "HSVS"));
		LISTA_TELEVISORI.add(new Televisore(25l, "samsung", "sensitive", 230, 24, "SOSY"));
		LISTA_TELEVISORI.add(new Televisore(29l, "sony", "erk9",  190, 22, "ASCT"));
		LISTA_TELEVISORI.add(new Televisore(31l, "panasonic", "lightLed",  3000, 70, "PLHT"));
		LISTA_TELEVISORI.add(new Televisore(50l, "lg", "gamingSpecial",  770, 38, "ACGS"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}
}

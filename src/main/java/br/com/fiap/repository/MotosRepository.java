package br.com.fiap.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.fiap.model.MotosModel;

public class MotosRepository {
	
	private static MotosRepository instance;

	private static Map<Long, MotosModel> motos;
	
	public static MotosRepository getInstance() {

		if (instance == null) {
			instance = new MotosRepository();
		}
		return instance;
	}

	public MotosRepository() {
		motos = new HashMap<Long, MotosModel>();
		
		motos.put(1L, new MotosModel(1L, "Marca da moto 1", "Nome da moto 1", "Modelo da moto 1", "Descrição da moto 1",
				10000, "Detalhes 1, 2, 4 da moto 1", 2 , 12));
		
		motos.put(2L, new MotosModel(2L, "Marca da moto 2", "Nome da moto 2", "Modelo da moto 2", "Descrição da moto 2",
				20000, "Detalhes 1, 2, 4 da moto 2", 2 , 12));
		
		motos.put(3L, new MotosModel(3L, "Marca da moto 3", "Nome da moto 3", "Modelo da moto 3", "Descrição da moto 3",
				30000, "Detalhes 1, 2, 4 da moto 3", 2 , 12));
		
		motos.put(4L, new MotosModel(4L, "Marca da moto 4", "Nome da moto 4", "Modelo da moto 4", "Descrição da moto 4",
				40000, "Detalhes 1, 2, 4 da moto 4", 2 , 12));
	}

	public ArrayList<MotosModel> findAll() {
		return new ArrayList<MotosModel>(motos.values());
	}

	public MotosModel findById(long id) {
		return motos.get(id);
	}

	public void save(MotosModel motosModel) {
		Long newId = (long) (motos.size() + 1);
		motosModel.setId(newId);
		motos.put(newId, motosModel);
	}

	public void update(MotosModel motosModel) {
		motos.put(motosModel.getId(), motosModel);
	}

	public void deleteById(long id) {
		motos.remove(id);
	}

}

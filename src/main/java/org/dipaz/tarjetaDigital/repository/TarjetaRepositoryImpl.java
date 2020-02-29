package org.dipaz.tarjetaDigital.repository;

import java.util.ArrayList;
import java.util.List;

import org.dipaz.tarjetaDigital.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository{

	private static List<Tarjeta> tarjetasDigitales =
			new ArrayList<Tarjeta>();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Crear Tarjeta:::::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtnerTodas() {
		System.out.println(":::Obtener todas las tarjetas");
		return tarjetasDigitales;
	}
	
}

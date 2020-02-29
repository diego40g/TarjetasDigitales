package org.dipaz.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.dipaz.tarjetaDigital.model.Tarjeta;
import org.dipaz.tarjetaDigital.repository.TarjetaRepository;
import org.dipaz.tarjetaDigital.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "org.dipaz.tarjetaDigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService{

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtnerTodas() {
		return tarjetaRepository.obtnerTodas();
	}

}

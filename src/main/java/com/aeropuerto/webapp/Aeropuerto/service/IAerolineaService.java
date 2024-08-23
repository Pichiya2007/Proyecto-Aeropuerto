package com.aeropuerto.webapp.Aeropuerto.service;

import java.util.List;

import com.aeropuerto.webapp.Aeropuerto.model.Aerolinea;

public interface IAerolineaService {

    public List<Aerolinea> listarAerolineas();

    public Aerolinea buscarAerolineaPorId(Long id);

    public Boolean guardarAerolinea(Aerolinea aerolinea);

    public void eliminarAerolinea(Aerolinea aerolinea);

    public Boolean verificarNombreAerolinea(Aerolinea nuevaAerolinea);
}

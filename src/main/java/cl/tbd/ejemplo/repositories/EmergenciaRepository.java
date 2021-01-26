package cl.tbd.ejemplo.repositories;

import java.util.List;

import org.bson.Document;

import cl.tbd.ejemplo.models.Emergencia;

public interface EmergenciaRepository {
    public List<Emergencia> getEmergencias();
    public Emergencia createEmergencia(Emergencia emergencia);
    
}

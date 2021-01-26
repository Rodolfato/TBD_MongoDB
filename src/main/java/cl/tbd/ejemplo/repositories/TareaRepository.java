package cl.tbd.ejemplo.repositories;

import java.util.List;

import org.bson.Document;

import cl.tbd.ejemplo.models.Tarea;

public interface TareaRepository {

    public List<Tarea> getTareas();
    public Tarea createTarea(Tarea tarea);
    
}

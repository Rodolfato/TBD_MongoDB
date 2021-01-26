package cl.tbd.ejemplo.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.tbd.ejemplo.models.Tarea;
import cl.tbd.ejemplo.repositories.TareaRepository;

@RestController
public class TareaService {

    private final TareaRepository tareaRepository;

    TareaService(TareaRepository tareaRepository){
        this.tareaRepository = tareaRepository;
    }

    @GetMapping("/tareas")
    public List<Tarea> getEmergencias(){
        return tareaRepository.getTareas();
    }

    @PostMapping("/tareas")
    @ResponseBody
    public Tarea createEmergencia(@RequestBody Tarea emergencia){
        Tarea result = tareaRepository.createTarea(emergencia);
        return result;
    }
    
}

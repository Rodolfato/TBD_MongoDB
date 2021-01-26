package cl.tbd.ejemplo.services;

import java.util.List;
import org.bson.Document;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.tbd.ejemplo.models.Emergencia;
import cl.tbd.ejemplo.models.Tarea;
import cl.tbd.ejemplo.repositories.EmergenciaRepository;

@RestController
public class EmergenciaService {

    private final EmergenciaRepository emergenciaRepository;

    EmergenciaService(EmergenciaRepository emergenciaRepository){
        this.emergenciaRepository = emergenciaRepository;
    }

    @GetMapping("/emergencias")
    public List<Emergencia> getEmergencias(){
        return emergenciaRepository.getEmergencias();
    }

    @PostMapping("/emergencias")
    @ResponseBody
    public Emergencia createEmergencia(@RequestBody Emergencia emergencia){
        Emergencia result = emergenciaRepository.createEmergencia(emergencia);
        return result;
    }

    @GetMapping("/emergencias/{id_eme}")
    public List<Emergencia> getTareasByEmergencia(@PathVariable String id_eme){
        List<Emergencia> results = emergenciaRepository.getTareasFromEemergencia(id_eme);
        return results;
    }
    



}

package cl.tbd.ejemplo.repositories;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cl.tbd.ejemplo.models.Emergencia;

@Repository
public class EmergenciaRepositoryImp implements EmergenciaRepository {

    @Autowired
    MongoDatabase database;

    @Override
    public List<Emergencia> getEmergencias() {
        MongoCollection<Emergencia> collection = database.getCollection("emergencia", Emergencia.class);
        List <Emergencia> emergencias = collection.find().into(new ArrayList<>());
        
        return emergencias;    
    }

    @Override
    public Emergencia createEmergencia(Emergencia emergencia) {
        MongoCollection<Emergencia> collection = database.getCollection("emergencia", Emergencia.class);
        collection.insertOne(emergencia);
        return emergencia;
    }
    
}

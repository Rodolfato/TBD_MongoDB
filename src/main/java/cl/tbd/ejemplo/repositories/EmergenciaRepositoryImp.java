package cl.tbd.ejemplo.repositories;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import cl.tbd.ejemplo.models.Emergencia;
import cl.tbd.ejemplo.models.Tarea;

import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.MongoTemplate;

@Repository
public class EmergenciaRepositoryImp implements EmergenciaRepository{

    @Autowired
    MongoDatabase database;

    @Autowired
    private MongoTemplate mongoTemplate;

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

    @Override
    public List<Emergencia> getTareasFromEemergencia(String id_emergencia) {
        Aggregation aggregation = Aggregation.newAggregation(
            Aggregation.match(Criteria.where("_id").is(id_emergencia)),
            Aggregation.unwind("$tareas"),
            Aggregation.lookup("tarea", "tareas", "_id", "tareasDetail")
            
        );
        List<Emergencia>  results  = mongoTemplate.aggregate(aggregation, "emergencia", Emergencia.class).getMappedResults();   
        
        return results;
    }
    
}

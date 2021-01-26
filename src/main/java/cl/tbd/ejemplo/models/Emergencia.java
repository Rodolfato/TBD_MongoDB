package cl.tbd.ejemplo.models;

import java.util.List;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Emergencia {

    @BsonId
    ObjectId _id;

    /*@Id 
    private String _id;*/


    private String nombre;
    private String descrip;
    private String finicio;
    private String ffin;
    private List<ObjectId> tareas;
    private List<Tarea> tareasDetail;



    

    public ObjectId getId() {
        return this._id;
    }

    public void setId(ObjectId id) {
        this._id = id;

    }

    public List<Tarea> getTareasDetails(){
        return this.tareasDetail;
    }

    public void setTareasDetails(List<Tarea> tareas){
        this.tareasDetail = tareas;
    }

    public List<ObjectId> getTareas(){
        return this.tareas;
    }

    public void setTareas(List<ObjectId> tareas){
        this.tareas = tareas;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescrip(){
        return descrip;
    }

    public void setDescrip(String descrip){
        this.descrip = descrip;
    }

    public String getFinicio(){
        return finicio;
    }

    public void setFinicio(String finicio){
        this.finicio = finicio;
    }

    public String getFfin(){
        return ffin;
    }

    public void setFfin(String ffin){
        this.ffin = ffin;
    }

  


    
}

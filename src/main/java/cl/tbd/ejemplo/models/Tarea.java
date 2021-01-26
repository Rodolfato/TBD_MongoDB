package cl.tbd.ejemplo.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;


public class Tarea {

    @BsonId
    ObjectId _id;

    private String nombre;
    private String descrip;
    private int cant_vol_requeridos;
    private int cant_vol_inscritos;
    private String finicio;
    private String ffin;

    public ObjectId getId() {
        return this._id;
    }

    public void setId(ObjectId id) {
        this._id = id;
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

    public int getCant_vol_requeridos(){
        return cant_vol_requeridos;
    }

    public void setCant_vol_requeridos(int cant_vol_requeridos){
        this.cant_vol_requeridos = cant_vol_requeridos;
    }

    public int getCant_vol_inscritos(){
        return cant_vol_inscritos;
    }

    public void setCant_vol_inscritos(int cant_vol_inscritos){
        this.cant_vol_inscritos = cant_vol_inscritos;
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

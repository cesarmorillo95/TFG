package com.example.cemo9.a2armario.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by cemo9 on 20/03/2018.
 */

public class Clothes extends RealmObject{

    //ID, Imagen, Nombre, Color, Tipo, Estilo, Estacion, Parte de arriba o abajo
    @PrimaryKey
    private int id;
    @Required
    private String title;
    @Required
    private Date createdAt;


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.lang.reflect.Type;
import java.util.Date;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 *
 * @author ccepeda
 */
public final class JsonUtil {

    private JsonUtil() {

    }

    /**
     * Función que permite convertir los datos de una clase en JSON
     * @param object Objeto a convertir
     * @return JSON de los datos del objeto en formato String
     */
    public static String convertDTOToString(Object object) {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
            public Date deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
                return new Date(je.getAsJsonPrimitive().getAsLong());
            }
        });
        Gson gson = builder.create();
        return gson.toJson(object);
    }

    /**
     * Función que permite convertir Json a un DTO cualquiera
     * @param <F> Datos Json
     * @param <D> Classe DTO
     * @param F Contiene los datos del Json en formato String
     * @param classDestino Clase a la que se quiere convertir (DTO)
     * @return Objecto DTO
     */
    public static <F, D> D convertJsonToDTO(final String F, Class<D> classDestino) {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
            public Date deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
                return new Date(je.getAsJsonPrimitive().getAsLong());
            }
        });
        Gson gson = builder.create();
        return gson.fromJson(F, classDestino);
    }

}

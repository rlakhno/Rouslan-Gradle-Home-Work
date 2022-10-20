package org.example;

import com.google.gson.Gson;

public class ConvertToJson {

    public String toJson(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}

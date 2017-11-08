package controllers;

import play.libs.Json;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import com.auth0.beans.Any;
import com.auth0.beans.Level;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonController extends Controller {

    public Result returnHash(){
        Map<String, Object> result = new HashMap<>();
        result.put("SOAP", "XML");
        result.put("Rest", "Json");
        result.put("evento", "Java Day GT");
        result.put("Cuando", 2017);

        return ok(Json.toJson(result));
    }

    public Result returnObject(){
        Any any = new Any();
        any.level = Level.AVANZADOS;
        List<String> exito = new ArrayList<>();
        exito.add("valor 1");
        exito.add("valor 2");
        exito.add("valor 3");
        any.tags = exito;

        return ok(Json.toJson(any));
    }

    public Result catchObject(){
        JsonNode jsonNode = request().body().asJson();
        Any any = Json.fromJson(jsonNode, Any.class);

        return ok(Json.toJson(any));
    }

}
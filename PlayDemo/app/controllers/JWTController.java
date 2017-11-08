package controllers;

import play.libs.Json;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

import com.auth0.beans.Any;
import com.auth0.beans.Level;
import com.auth0.utils.JWTUtils;

import com.fasterxml.jackson.databind.JsonNode;

public class JWTController extends Controller {

    public Result returnToken(){
        Any any = new Any();
        any.level = Level.AVANZADOS;
        List<String> exito = new ArrayList<>();
        exito.add("valor 1");
        exito.add("valor 2");
        exito.add("valor 3");
        any.tags = exito;

        return ok(JWTUtils.generateJWT(any));
    }

    public Result validateToken(){
        String token = request().body().asText();
        
        return ok("Token Válido: " + JWTUtils.validateJWT(token));
    }

}
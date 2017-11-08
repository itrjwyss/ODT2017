package com.auth0.beans;

public enum Level {

    ROCK_START,
    PRINCIPIANTES,
    INTERMEDIOS,
    AVANZADOS;

    public String getStr(){
        switch(this){
            case ROCK_START:
                return "Rock Starts";
            case PRINCIPIANTES:
                return "Principiantes";
            case INTERMEDIOS:
                return "Intermedios";
            default:
                return "Avanzados";
        }
    }

}
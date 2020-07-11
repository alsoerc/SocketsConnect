package com.io.connect.Sensor;

/**
 *
 * @author alsorc
 * Posibles mensajes que el sensor retorna hacia las vistas
 */
public enum MessageResponse {
    
    LIGHT_ON("LIGHT_SENSOR_ON"),LIGHT_OFF("LIGHT_SENSOR_OFF"),
    PRESENCE_ON("PRESENCE_ON"), PRESENCE_OFF("PRESENCE_OFF"),
    SOUND_ON("SOUND_ON"), SOUND_OFF("SOUND_OFF");
    
    private String value;
    
    MessageResponse(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
    
}

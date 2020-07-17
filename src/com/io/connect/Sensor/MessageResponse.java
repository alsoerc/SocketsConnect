package com.io.connect.Sensor;

/**
 *
 * @author alsorc
 * Posibles mensajes que el sensor retorna hacia las vistas
 */
public enum MessageResponse {
    
    LIGHT_ON("DESKTOP_LIGHT_SENSOR_ON"),LIGHT_OFF("DESKTOP_LIGHT_SENSOR_OFF"),
    PRESENCE_ON("DESKTOP_PRESENCE_ON"), PRESENCE_OFF("DESKTOP_PRESENCE_OFF"),
    SOUND_ON("DESKTOP_SOUND_ON"), SOUND_OFF("DESKTOP_SOUND_OFF"),
    
    MOVIL_LIGHT_ON("MOVIL_LIGHT_SENSOR_ON"),MOVIL_LIGHT_OFF("MOVIL_LIGHT_SENSOR_OFF"),
    MOVIL_PRESENCE_ON("MOVIL_PRESENCE_ON"), MOVIL_PRESENCE_OFF("MOVIL_PRESENCE_OFF"),
    MOVIL_SOUND_ON("MOVIL_SOUND_ON"), MOVIL_SOUND_OFF("MOVIL_SOUND_OFF");
    
    
    private String value;
    
    MessageResponse(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
    
}

package com.io.connect;

/**
 *
 * @author alsorc
 * Mensaje que la vista envía hacia el sensor
 */
public enum Messages {
    
    LIGHT_ON("LIGHT:ON"), LIGHT_OFF("LIGHT:OFF"),
    PRESENCE_ON("PRESENCE:ON"), PRESENCE_OFF("PRESENCE:OFF"), PRESENCE_ANALIZAR("PRESENCE:ANALIZAR"),
    SOUND_ON("SOUND:ON"), SOUND_OFF("SOUND:OFF"), SOUND_ANALIZAR("SOUND:ANALIZAR");
    
    private String value;
    
    Messages(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}



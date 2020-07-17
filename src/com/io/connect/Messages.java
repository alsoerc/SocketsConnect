package com.io.connect;

/**
 *
 * @author alsorc
 * Mensaje que la vista envía hacia el sensor
 */
public enum Messages {
    
    LIGHT_ON("DESKTOP:LIGHT:ON"), LIGHT_OFF("DESKTOP:LIGHT:OFF"),
    PRESENCE_ON("DESKTOP:PRESENCE:ON"), PRESENCE_OFF("DESKTOP:PRESENCE:OFF"), PRESENCE_ANALIZAR("DESKTOP:PRESENCE:ANALIZAR"),
    SOUND_ON("DESKTOP:SOUND:ON"), SOUND_OFF("DESKTOP:SOUND:OFF"), SOUND_ANALIZAR("DESKTOP:SOUND:ANALIZAR");
    
    private String value;
    
    Messages(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}



package org.multipleks.struktura;

public class Screen {
    private ScreenType type;

    public Screen (ScreenType type){
        this.type = type;
    }

    public ScreenType getType(){
        return type;
    }
}

package org.multipleks;

public class Screen {
    private ScreenType type;

    public Screen (ScreenType type){
        this.type = type;
    }

    public ScreenType getType(){
        return type;
    }
}

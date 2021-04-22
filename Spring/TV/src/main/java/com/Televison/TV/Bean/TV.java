package com.Televison.TV.Bean;

public class TV {
    private Panel panel;

    private Os os;
    
    public TV(Panel panel, Os os) {
        this.panel = panel;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Tivi [panel = " + this.panel.getModel() + ", os = " + this.os.getSystem() + "]";
    }
    
}

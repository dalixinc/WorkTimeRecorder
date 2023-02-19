package com.dalixinc.scratch;

import javax.swing.*;
import java.awt.*;

// TODO - Investigate this lazy-initialised Singleton implementation
public class PTPanelAlt {

    private JPanel parent;

    private PTPanelAlt(){
        //FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        parent = new JPanel(new GridLayout(0, 1));


    }

    public PTPanelAlt getPTPanel () {
        if (parent == null)
            return new PTPanelAlt().getPTPanel();
        else
            return null;//parent;
    }
}



package com.simple.ipeer.sgs.main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author iPeer
 */
public class ExitHandler implements WindowListener {

    private MainGUI mainGUI;
    
    public ExitHandler(MainGUI main) {
	this.mainGUI = main;
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
	System.err.println("Closing!");
	mainGUI.saveSettings();
	
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}

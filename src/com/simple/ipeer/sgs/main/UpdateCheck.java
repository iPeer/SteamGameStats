package com.simple.ipeer.sgs.main;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author iPeer
 */
public class UpdateCheck {
    
    public static final double thisVersion = 1.12;
    private static final String projectID = "sgs";
    private MainGUI main;

    public UpdateCheck(MainGUI main) {
	this.main = main;
    }
    
    public void checkForUpdates() {
	try {
	URL u = new URL("http://ipeer.auron.co.uk/versions/"+projectID);
	InputStream in = u.openStream();
	Scanner s = new Scanner(in);
	double newVersion = thisVersion;
	while (s.hasNextLine())
	    newVersion = Double.parseDouble(s.nextLine());
	if (newVersion > thisVersion)
	    main.announceUpdate(newVersion);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(main.getRootPane(), "Unable to check for updates.\n"+e.toString(), "Oops!", JOptionPane.ERROR_MESSAGE);
	}
    }

}

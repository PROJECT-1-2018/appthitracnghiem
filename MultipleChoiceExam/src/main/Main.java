/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Gui.Login;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author DuongSon
 */
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(WindowsLookAndFeel.class.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Login login = new Login();
        login.setVisible(true);
    }
}

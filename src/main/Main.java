/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import waterTankProject.AlarmWindow;
import waterTankProject.DisplayWindow;
import waterTankProject.SplitterWindow;
import waterTankProject.WaterLevel;
import waterTankProject.WaterLevelObservable;


/**
 *
 * @author PADMA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WaterLevelObservable waterLevelObservable=new WaterLevelObservable();
        
        new WaterLevel(waterLevelObservable).setVisible(true);
    }
    
}

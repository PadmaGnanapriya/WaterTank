/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterTankProject;

/**
 *
 * @author PADMA
 */

import waterTankProject.AlarmWindow;

public class WaterLevelObservable {
    
    AlarmWindow alarmWindow=new AlarmWindow();
    DisplayWindow displayWindow = new DisplayWindow();
    SplitterWindow splitterWindow = new SplitterWindow();
    private int waterValue;
    

    public void setSliderValue(int sliderValue){
        if(this.waterValue!=sliderValue){
            this.waterValue=sliderValue;
            notifyWaterLevelObservers();
        }
        
    }
    public void notifyWaterLevelObservers(){
        alarmWindow.updateWaterLevel(waterValue);
        displayWindow.updateWaterLevel(waterValue);
        splitterWindow.updateWaterLevel(waterValue);
    }
}

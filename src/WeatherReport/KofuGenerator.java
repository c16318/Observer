/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

import java.util.Random;

/**
 *
 * @author matsu
 */
public class KofuGenerator extends Generator{
    Random random = new Random();
    int number = 5;
    String name = "Kofu";
    
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    //乱数を発生させて、観察者に通知
    public void execute(){
        number += 1;
        notifyObservers();
    }
}
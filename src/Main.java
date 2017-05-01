/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class Main {
    public static void main(String[] args){
        NumberGenerator generator = new IncrementalNumberGenerator(10,50,5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        
        generator.execute();
        
    }
}

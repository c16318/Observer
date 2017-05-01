
/**
 *数を表示する（観察者）
 * @author c16318
 */
public class DigitObserver implements Observer{
     public void update(NumberGenerator generator){
        System.out.println("DigitObserver:" + generator.getNumber());
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            
        }
    }
}

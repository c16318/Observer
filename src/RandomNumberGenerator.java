/**
 *ランダムに数を生成するクラス
 * @author c16318
 */
import java.util.Random;


public class RandomNumberGenerator extends NumberGenerator{
    Random random = new Random();
    int number;
    
    public int getNumber(){
        return number;
    }
    
    //乱数を発生させて、観察者に通知
    public void execute(){
        for(int i = 0;i < 20;i++){
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}

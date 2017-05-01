

/**
 *簡易グラフで数を表示(観察者) 
 * @author c16318
 */
public class GraphObserver implements Observer{
    
    public void update(NumberGenerator generator){
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for(int i = 0;i < count;i++){
            System.out.print("*");
        }
        System.out.println();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            
        }
    }
    
}

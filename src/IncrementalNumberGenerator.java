/**
 *
 * @author c16318
 */
public class IncrementalNumberGenerator extends NumberGenerator{
    int start;
    int end;
    int inc;
    int number;
    
    public int getNumber(){
        return number;
    }
    
    public IncrementalNumberGenerator(int start,int end,int inc){
        this.start = start;
        this.end = end;
        this.inc = inc;
    }
    
    
    public void execute(){
        for(int i = start;i < end;i+=inc){
            number = i;
            notifyObservers();
        }
    }
}

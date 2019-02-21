import java.io.*;
import java.util.ArrayList;

public class BagNovice{

    public ArrayList<String> sizeBag = new ArrayList<String>();    
    public BagNovice(){
        sizeBag.add(0,"a");
        sizeBag.add(1, "b");
        sizeBag.add(2, "c");
        sizeBag.add(3, "d");
        sizeBag.add(4, "e");
        sizeBag.add(5, "f");
        sizeBag.add(6, "g");
    } 

    public String showItem(){
        ItemMain itemToUse = new ItemMain();
        for(int i = 0; i < 10; i ++){
            int size = sizeBag.size();
            if( size == 0 ){
                System.out.println("\n ----- No  items ------");
                break;
            }else if(size != 0 ){
                for(int j = 0 ; j<10;j++){
                System.out.println("Name items : "+sizeBag.get(j));
                }
            }
        }
        return "";
    } 
   
}
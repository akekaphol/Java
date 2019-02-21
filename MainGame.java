import java.io.*;

public class MainGame{

    private BagNovice  bagGame ; 
    
    public MainGame(){
       
    }
    public static void main( String[] args ){

        BagNovice bagGame = new BagNovice();
        Novice Charecter = new Novice() ;
        int i;
        int selete ;
       
        System.out.println("========= Welcome To My Game ==========");
        Charecter.setName();

        Charecter.showStatus();
        System.out.println("\n ================ Login to Game ==============");
        
        int rnd ;
        for( i = 0; i >= -1;i++ ){
        Charecter.damageHp();
        if(Charecter.hp <= 0){
            System.out.println("\n \n -------- Ahhhh !!!  You Dead!!! --------- \n \n ");
            break;
        }
        System.out.println("My Present Health point : "+Charecter.hp+" Point");
        System.out.println(" Noooo!!!  Attack Nowww \n");
        System.out.println("\t \t Enter number for play !!!!");
        System.out.println("*** When attacking 20 damage will random to drop items *** \n");
        System.out.println(" \t \t ++++ add using auto items ++++ \n");
        System.out.println("Number 1 = Random value for Attack , if Attack > 5 point exp + 3 Point.");
        System.out.println("Number 2 = Random value for skill Heal hp. ");
        Charecter.seleteNum();
       

        }     
    }
}
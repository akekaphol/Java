import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Novice{
    Scanner sc = new Scanner(System.in);
    private  BagNovice bag ; 
    private ItemGame itemRnd ;
    public int hp  ;
    public int exp  ;
    public int level  ;
    String name ;
    int selete ;
    public int totalDamage;

    public Novice(){
        hp = 100 ;
        exp = 0 ;
        level = 1 ;
        totalDamage = 0 ;
        BagNovice bag = new BagNovice();
        ItemGame itemRnd = new ItemGame();
    }
    
    //Set name charecter
    public String setName(){
        System.out.println("-------- What your name ???--------");
        System.out.print("My name is : ");
        name = sc.nextLine();
         return "" ;
    }    

    //Show status charecter
    public String showStatus(){
        System.out.println("\n +++++++++++ MY STATUS POINT +++++++++++ \n");
        System.out.println("My name is : "+name );
        System.out.println("My Level : "+level );
        System.out.println("My Health point : "+hp+"  Point");
        System.out.println("My Experience ( exp ) : "+exp+"  Point");
        
        return "";
    }

    //Damage to hp charecter
    public  void damageHp(){
       
        Random rand = new Random();
        int rnd = rand.nextInt(20);
        System.out.println("\n \n You hit Attack : "+rnd+" Point !!!");
         if(hp > 0 ){
            hp = hp - rnd;
        }
        
    }

    public void playGame(){
        BagNovice bagGame = new BagNovice();
        ItemMain item = new ItemMain();
        Random rand = new Random();
        switch(selete){
            case 1:
             rand = new Random();
              int  rnd = rand.nextInt(20);
            System.out.println("\n \n Damage : "+rnd+" Point ");
                totalDamage += rnd ;

             if(rnd >= 5 ){
                exp += 3 ;
                System.out.println("My exp : "+exp+" Point ");
                if(totalDamage >= 20){
                    System.out.println("\n ++++ You have items drop ++++ \n");
                    item.randomItemUsing();
                    totalDamage = 0; 
                 } 
                else if ( exp >= 10  ){
                level++ ;
                System.out.println("Ha Ha Ha I'm Level up to : Level "+level);
                exp = 0 ;
            }
        }
            break;
            case 2:
             rand = new Random();
             rnd = rand.nextInt(20);
            System.out.println("Heal me to hp : "+rnd+" Point");
            if(hp == 100){
                break;
            }else{
                hp += rnd ;
                System.out.println("Wowwww  Thank You to Heal : "+hp+" Point");
            }
            break;

            default:
            System.out.println("No No Again Please");
            break;
        }
        
    }

    public void seleteNum(){
        selete = 0;
        System.out.print("Input number : ");
        selete = sc.nextInt();
        playGame();
    }



    

}
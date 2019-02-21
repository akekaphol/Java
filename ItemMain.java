import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class ItemMain{
    int ShortSword,LongSword ,Bow,Spear ,MachineGun;
    int BloodBottle,BloodBottleBig,AttackBottle;

    Random rnd = new Random();
    public ItemMain(){
        ShortSword = 2 ;
        LongSword = 3;
        Bow = 4;
        Spear = 5;
        MachineGun = 10;
        BloodBottle = 10;
        AttackBottle = 5 ;
    
    }
    public String randomItemUsing(){
        Novice nv = new Novice();
        BagNovice bag = new BagNovice();
        int selectKey = rnd.nextInt(100);
        if(selectKey < 100){
           
            bag.sizeBag.set(1,"BloodBottle");
            nv.hp += BloodBottle;
            
            System.out.println("New items : "+bag.sizeBag.get(1)+" add Hp 10 Point \n My Present Health point : "+nv.hp+" Point");

            bag.sizeBag.set(2,"BlootBottle");
            nv.hp += BloodBottle;
            System.out.println("New items : "+bag.sizeBag.get(2)+" add Hp 10 Point \n My Present Health point : "+nv.hp+" Point");
            if(selectKey <= 40){
                bag.sizeBag.set(6,"ShortSword");
                nv.exp += ShortSword ;
                System.out.println("New items : "+bag.sizeBag.get(6)+"add Exp 2 Point \n My Exp : "+nv.exp+" Point");
                if(selectKey <= 30){
                    bag.sizeBag.set(4,"LongSword");
                    nv.exp += LongSword ;
                    System.out.println("New items : "+bag.sizeBag.get(4)+"add Exp 3 Point \n My Exp : "+nv.exp+" Point");
                    bag.sizeBag.set(5,"AttackBottle");
                    nv.exp += AttackBottle ;
                    System.out.println("New items : "+bag.sizeBag.get(5)+"add Exp 5 Point \n My Exp : "+nv.exp+" Point");
                    if(selectKey <= 10){
                        bag.sizeBag.set(3,"Spear");
                        nv.exp += Spear;
                        System.out.println("New items : "+bag.sizeBag.get(3)+"add Exp 5 Point \n My Exp : "+nv.exp+" Point");
                        if(selectKey <= 5){
                            bag.sizeBag.set(0,"MechineGun");
                            nv.exp += MachineGun;
                            System.out.println("New items : "+bag.sizeBag.get(0)+"add Exp 10 Point \n My Exp : "+nv.exp+" Point");
                        }
                    }
                }
            }
        } 
      
        return "";
    }

}
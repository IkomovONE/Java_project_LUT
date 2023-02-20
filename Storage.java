package Main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author ikomovone
 */


public class Storage {

    
    
    protected static HashMap<Integer, Lutemon> Lutemons= new HashMap<>();
    protected static String name;
    static int id= 0;
    static int lutemonCount=0;
    
    
    
    

    public static void createLutemon(Scanner sc) {
        System.out.println("Add 1) White, 2) Green, 3) Pink, 4) Orange, 5) Black");
        String color;
        int att;
        int defence;
        int health;
        int maxHealth;
        int experience;
        
        
        
    
        if(sc.hasNext()) {
            int y = 0;
            String choice = sc.next();
            try{
                
                y = Integer.parseInt(choice);
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
            switch(y) {
                
                case 1:
                    System.out.println("Give it a name:");
                    name= sc.next();
                    color= "White";
                    att= 5;
                    defence= 4;
                    experience = 0;
                    health= 20;
                    maxHealth = 20;
                    addLutemon(name, color, att, defence, experience, health, maxHealth);
                    break;


                    
                case 2:
                    System.out.println("Give it a name:");
                    name= sc.next();
                    
                    color= "Green";
                    att= 6;
                    defence= 3;
                    experience = 0;
                    health= 19;
                    maxHealth= 19;
                    addLutemon(name, color, att, defence, experience, health, maxHealth);
                    break;
                case 3:
                    System.out.println("Give it a name:");
                    name= sc.next();
                    color= "Pink";
                    att= 7;
                    defence= 2;
                    experience = 0;
                    health= 18;
                    maxHealth= 18;
                    addLutemon(name, color, att, defence, experience, health, maxHealth);
                    break;
                case 4:
                    System.out.println("Give it a name:");
                    name= sc.next();
                    color= "Orange";
                    att= 8;
                    defence= 1;
                    experience = 0;
                    health= 17;
                    maxHealth= 17;
                    addLutemon(name, color, att, defence, experience, health, maxHealth);
                    break;
                case 5:
                    System.out.println("Give it a name:");
                    name= sc.next();
                    color= "Black";
                    att= 9;
                    defence= 0;
                    experience = 0;
                    health= 16;
                    maxHealth= 16;
                    addLutemon(name, color, att, defence, experience, health, maxHealth);
                    break;
                    
            }
        }
    }
    
                    
         
    static public void addLutemon(String name, String color, int att, int defence, int experience, int health, int maxHealth) {
        
        
        Lutemons.put(id, new Lutemon(id++, name, color, att, defence, experience, health, maxHealth));
        lutemonCount++;
      
    }
    
    
    
    
    static void listLutemons() {
        
        System.out.println("There are the following Lutemons at Home:");
        
        for (Map.Entry y : Lutemons.entrySet()){
            
            Lutemon j= Lutemons.get(y.getKey());
            System.out.println(j.printStats());
           
        }
        
        TrainingArea.listLutemons();
        
        BattleField.listLutemons();
      
    }

    
    
    
    
    static void moveLutemons(Scanner sc) {
   
        String namee = null;
        String color = null;
        String iddd = null;
        int att = 0;
        int defence = 0;
        int health = 0;
        int maxHealth = 0;
        int experience= 0;
        
        
        
        
        System.out.println("Give the ID of Lutemon that should be moved:");
        
        
        
        iddd= sc.next();
        
        int idd= 0;
        
        try{
            idd = Integer.parseInt(iddd);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        
        
        
        System.out.println("Where would the Lutemon be moved? 1) Home, 2) Training area, 3) Battle field");
        
        
        int i = 0;
        String si = sc.next();
        try{
            i = Integer.parseInt(si);
        }
        catch (NumberFormatException ex){
                    
            ex.printStackTrace();
                    
        
                }
        
             
            
        
        if(Lutemons.containsKey(idd)){
            Lutemon h= Lutemons.get(idd);
            namee= h.getName();
            color= h.getColor();
            att= h.getAtt();
            defence= h.getDef();
            experience= h.getExp();
            health= h.getHealth();
            maxHealth= h.getmaxHealth();
            Lutemons.remove(idd);
        }
        else if(TrainingArea.TrainLutemons.containsKey(idd)){
            Lutemon y= TrainingArea.TrainLutemons.get(idd);
            namee= y.getName();
            
            color= y.getColor();
            att= y.getAtt();
            defence= y.getDef();
            experience= y.getExp();
            health= y.getHealth();
            maxHealth= y.getmaxHealth();
            TrainingArea.TrainLutemons.remove(idd);
            
        }
        else if (BattleField.BattleLutemons.containsKey(idd)){
            Lutemon k= BattleField.BattleLutemons.get(idd);
            namee= k.getName();
            
            color= k.getColor();
            att= k.getAtt();
            defence= k.getDef();
            experience= k.getExp();
            health= k.getHealth();
            maxHealth= k.getmaxHealth();
            BattleField.BattleLutemons.remove(idd);
            
        }
        
        else {
            
            
            System.out.println("no lutemon with id "+idd+" could be found!");
            
            return;
            
            
        }
        
        
        
        
    
           
                
                
                switch(i) {
                    case 1:
                        
                        Storage.getLutemon(idd, namee, color, att, defence, experience, health, maxHealth);
                        break;
                        
                    case 2:
                        
                        TrainingArea.getLutemon(idd, namee, color, att, defence, experience, health, maxHealth);
                        break;
                        
                        
                    case 3:
                        
                        BattleField.getLutemon(idd, namee, color, att, defence, experience, health, maxHealth);
                        break;
                       
                }
                
        
     
    }
    
    
    
    
    

    
    
    
    
    
    
    
    
    static void getLutemon(int id, String name, String color, int att, int defence, int experience, int health, int maxHealth) {
        
        health= maxHealth;
        
        Lutemons.put(id, new Lutemon(id, name, color, att, defence, experience, health, maxHealth));
       
    }
    
    
    static int lutemonCount() {
        return lutemonCount;
        
    }

    
 
}

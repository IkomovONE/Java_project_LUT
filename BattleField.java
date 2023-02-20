
package Main;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ikomovone
 */
class BattleField {
    
    protected static HashMap<Integer, Lutemon> BattleLutemons= new HashMap<>();

    static void getLutemon(int id, String namee, String color, int att, int defence, int experience, int health, int maxHealth) {
        BattleLutemons.put(id, new Lutemon(id, namee, color, att, defence, experience, health, maxHealth));
    }

    static void listLutemons() {
        
        System.out.println("There are the following Lutemons at Battle field:");
        
        for (Map.Entry e : BattleLutemons.entrySet()){
            
            Lutemon s= BattleLutemons.get(e.getKey());
            System.out.println(s.printStats());
           
        }
        
    }

    public static void letLutemonsFight(Scanner sc) {
        
        
        
        int a;
        int b;
        boolean exit = false;
        
        
        listLutemons();
        
        System.out.println("Give the ID of the first fighter:");
        
        a= sc.nextInt();
        
        Lutemon A= BattleLutemons.get(a);
        
        Lutemon temp= BattleLutemons.get(a);
 
        System.out.println("Give the ID of the second fighter:");
        
        b= sc.nextInt();
        
        Lutemon B= BattleLutemons.get(b);
        
        
        
        
        while (!exit){
            
            temp= A;
            
            
            
            
            
            
            if (B.defence(A.attack(A, B))) {
                
                System.out.println(B.getColor()+"("+B.getName() +") manages to escape death.");
                
                A=B;
                
                B= temp;
                
            }
            
            else  {
                
                System.out.println(B.getColor()+"("+B.getName()+") gets killed.");
                
                A.addExp();
                
                B.die();
                
                System.out.println("the battle is over.");
                
                exit= true;
                
                
                break;
                
                
            }
            
            
        }
        
        
    }

    
    
}

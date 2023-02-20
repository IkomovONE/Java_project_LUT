
package Main;



import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ikomovone
 */
class TrainingArea {
    
    
    protected static HashMap<Integer, Lutemon> TrainLutemons= new HashMap<>();

    static void getLutemon(int id, String namee, String color, int att, int defence, int experience, int health, int maxHealth) {
        TrainLutemons.put(id, new Lutemon(id, namee, color, att, defence, experience, health, maxHealth));
    }

    static void listLutemons() {
        
        System.out.println("There are the following Lutemons at Training area:");
        for (Map.Entry l : TrainLutemons.entrySet()){
            
            Lutemon u= TrainLutemons.get(l.getKey());
            System.out.println(u.printStats());
           
        }
    }

    public static void trainLutemons() {
        
        
        for (Map.Entry l : TrainLutemons.entrySet()){
            
            Lutemon u= TrainLutemons.get(l.getKey());
            u.gainExp();
            String name = u.getName();
            String color = u.getColor();
           
            System.out.println(color+"("+name+") trains and gain experience!");
           
        }
        
        
        
    }
    
    
    
    

    
    
    
    
    
}

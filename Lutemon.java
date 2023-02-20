package Main;

/**
 *
 * @author ikomovone
 */
class Lutemon {

    

    
    protected  String name;
    protected  String color;
    protected  int attack;
    protected  int defence;
    protected  int experience;
    protected  int health;
    protected  int maxHealth;
    protected int id;
    private static int lutemonCount;
    
    
    
    
    

    

    Lutemon(int id, String name, String color, int att, int defence, int experience, int health, int maxHealth) {
        this.id= id;
        this.name= name;
        this.color= color;
        this.attack= att;
        this.defence= defence;
        this.experience= experience;
        this.health= health;
        this.maxHealth= maxHealth;
        
        
    }
    
    
    String printStats() {
        
        String b = id+ ": " +color+  "(" +name+  ")"  + " att: "  + attack  +  "; def: "  + defence+ "; exp:"  + experience  +  "; health: "  + health+"/"+maxHealth;
        return b;      
    }

    
    String getName() {
        return this.name;
    }

    String getColor() {
        return this.color;
    }
     
    int getAtt() {
        return this.attack;
    }


    int getDef() {
        return this.defence;
    }
    
    int getExp() {
        return this.experience;
    }
        

    int getHealth() {
        return this.health;
    }

    int getmaxHealth() {
        return this.maxHealth;
    }

    void gainExp() {
        experience++;
    }
        

    
    
    
    int attack(Lutemon A, Lutemon B) {
        
        int attPower;
        
        attPower= attack+ experience;
        
        System.out.println(A.printStats());
        System.out.println(B.printStats());
        
        System.out.println(color+ "(" +name+ ") attacks "+ B.getColor()+ "(" + B.getName() + ")");
        
        return attPower;
        
        

        
    }

    
    
    boolean defence(int attack) {
        
        health= health+ defence-attack;
        
        if (health > maxHealth) {
            
            health= maxHealth;
            
            
        }
        
        if (health <= 0) {
            
            
            return false;
            
            
            
            
        }
        
        else {
            return true;
        }
        
        
        
    }

    void addExp() {
         experience++;
    }

    void die() {
        BattleField.BattleLutemons.remove(id);
    }
    
    
    
    
}

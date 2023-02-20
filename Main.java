package Main;


import java.util.Scanner;

/**
 *
 * @author ikomovone
 */

public class Main {
    
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in).useDelimiter("\n");
        boolean exit = false;

        System.out.println("Welcome to the Lutemon simulator!");
        
        
        

        Main home = new Main();
           
        while (!exit) {
            System.out.println("1) Create a Lutemon, 2) List all the Lutemons, 3) Move Lutemons, 4) Train Lutemons, 5) Let them fight, 0) Exit");
            
            if(scn.hasNext()) {
                int i = 0;
                String si = scn.next();
                try{
                    i = Integer.parseInt(si);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                
                switch(i) {
                    case 1:
                        Storage.createLutemon(scn); 
                        break;
                        
                    case 2:
                        Storage.listLutemons();
                        break;
                        
                    case 3:
                        Storage.moveLutemons(scn);
                        break;
                    case 4:
                        TrainingArea.trainLutemons();
                        break;
                    case 5:
                        BattleField.letLutemonsFight(scn);
                        break;
                    case 0:
                        System.out.println("The game has closed. In total " +Storage.lutemonCount()+ " Lutemons were created.");
                        exit = true;
                        break;
                }
                
                

            }
        }
        scn.close();
        
        
    }
}
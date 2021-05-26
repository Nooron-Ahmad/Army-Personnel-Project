
public class PersonnelList {

	public static void main(String[] args) {
        
        Soldiers soldier[] = new Soldiers[4];  
        soldier[0] = new MilitaryRank("Tony Adam", 24, "Private");   
        soldier[1] = new MilitaryRank("Cameron Brown", 31, "Corporal");  
        soldier[2] = new MilitaryID("Jamal Jones", 28, "Specialist", 37946); 
        soldier[3] = new MilitaryID("Brad Miller", 36, "Sergeant", 62847);  
        for(int i = 0; i < soldier.length; i++){
            if( soldier[i].getClass().getSimpleName().equalsIgnoreCase("MilitaryRank")) 
                System.out.println("Soldier's Rank: " + ((MilitaryRank)soldier[i]).getRank());
            else if(soldier[i].getClass().getSimpleName().equalsIgnoreCase("MilitaryID")) 
                System.out.println("Soldier's ID: " + ((MilitaryID)soldier[i]).getIDNum());
        }
        System.out.println(); 
        
        for(int i = 0; i < soldier.length; i++){
            System.out.println("Class is: " + soldier[i].getClass().getSimpleName()); 
            System.out.println(soldier[i]); 
        }   
    }
}

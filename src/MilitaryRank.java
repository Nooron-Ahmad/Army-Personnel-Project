
public class MilitaryRank extends Soldiers {
	
	private String rank;
    
    public MilitaryRank(String name, int age, String rank) {
        super(name, age); 
        this.rank = rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public String getRank() {
        return rank;
    }
    
    public String toString() { 
        return super.toString() + "\n" + " Soldier's Rank: " + rank;
    }  
}

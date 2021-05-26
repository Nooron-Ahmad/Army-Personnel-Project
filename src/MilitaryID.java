
public class MilitaryID extends MilitaryRank {
	
	private int IDnum;
    
    public MilitaryID(String name, int age, String rank, int IDnum) {
        super(name, age, rank);
        this.IDnum = IDnum;
    }
    
    public void setIDNum(int IDnum) {
        this.IDnum = IDnum;
    }
    
    public int getIDNum() {
        return IDnum;
    }
    
    public String toString() { 
        return super.toString() + "\n" + " Soldier's ID Number: " + IDnum;
    }

}

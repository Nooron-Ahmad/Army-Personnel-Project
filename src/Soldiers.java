
public abstract class Soldiers {
	
	private String name;
    private int age;
    
    public Soldiers(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String toString() { 
        return " Soldier's Name: " + name + "\n" + " Soldier's Age: " + age;
    } 
    
}

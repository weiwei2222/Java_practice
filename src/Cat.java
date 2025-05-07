
public class Cat {
	int catage = 0;
	String catcolor = null;
	int catid;
	
	Cat(int age, String color, int id) {
		this.catage = age;
		this.catcolor = color;
		this.catid = id;
	}

    
    String meow() {
    	return "Hello cat.";
    }
}
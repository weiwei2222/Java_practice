
public class Main {
    public static void main(String[] args) {
    	Cat mycat = new Cat(2, "oragne", 034);
    	Cat jackCat = new Cat(3, "whit", 435);
        System.out.println(jackCat.meow() + "His id is " + jackCat.catid +". He is " + jackCat.catage + " years. His color is " +  jackCat.catcolor);
    }
}

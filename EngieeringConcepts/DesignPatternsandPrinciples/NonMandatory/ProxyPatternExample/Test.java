package ProxyPatternExample;

public class Test {
    public static void main(String[] args) {
        
        Image img1 =  new ProxyImage("cat image 1");
        img1.display();
        img1.display();
    }
}

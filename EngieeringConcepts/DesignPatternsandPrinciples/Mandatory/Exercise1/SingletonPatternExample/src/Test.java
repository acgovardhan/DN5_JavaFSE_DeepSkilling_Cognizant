public class Test {
    public static void main(String[] args) {

        //creating multiple instances for testing if they are the same object 
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        System.out.println(log1 == log2);
        //prints true as both instances are same
    }
}

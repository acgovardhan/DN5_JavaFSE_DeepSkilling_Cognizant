public class Test {
    public static void main(String[] args) {
        Computer comp1 = new Computer.Builder()
                        .setCPU("octa core")
                        .setRAM(16)
                        .setStorage(1024)
                        .build();

        comp1.Display();
    }
}

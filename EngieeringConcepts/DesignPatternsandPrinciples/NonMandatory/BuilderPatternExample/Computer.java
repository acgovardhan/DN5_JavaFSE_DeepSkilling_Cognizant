public class Computer {
    private String CPU;
    private int RAM;
    private int Storage;

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    public void Display(){
        System.out.println("computer -> cpu: "+CPU+", ram : "+RAM+"GB , storage : "+Storage+" GB");
    }

    public static class Builder{

        private String CPU;
        private int RAM;
        private int Storage;

        public Builder setCPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int ram){
            this.RAM = ram;
            return this;
        }

        public Builder setStorage(int storage){
            this.Storage = storage;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }


}

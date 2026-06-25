package CommandPatternExample;

public class Test {
    public static void main(String[] args) {
        Light bulb1 =  new Light();

        Command turnOn = new LightOnCommand(bulb1);
        Command turnoff =  new LightOffCommand(bulb1);

        RemoteControl rc1 =  new RemoteControl(turnOn);
        RemoteControl rc2 =  new RemoteControl(turnoff);

        rc2.executeCommand();
        rc1.executeCommand();
        
}
}
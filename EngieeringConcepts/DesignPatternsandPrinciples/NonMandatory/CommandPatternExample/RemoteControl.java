package CommandPatternExample;

public class RemoteControl {
    private Command command;

    RemoteControl(Command command){
        this.command = command;
    }

    //execute command
    void executeCommand(){
        command.execute();
    }
}

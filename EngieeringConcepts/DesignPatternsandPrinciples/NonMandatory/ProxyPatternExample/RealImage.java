package ProxyPatternExample;

public class RealImage implements Image {

    String filename;
    RealImage(String filename){
        this.filename  = filename;
        loadImage(filename);
    }

    void loadImage(String filename){
        System.out.println("loading "+filename+" from server...");
    }

    @Override
    public void display(){
        System.out.println("viewing image "+filename+" from remote server..");
    }
}

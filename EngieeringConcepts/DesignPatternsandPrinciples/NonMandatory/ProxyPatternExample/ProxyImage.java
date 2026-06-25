package ProxyPatternExample;

public class ProxyImage implements Image{
    
    private RealImage img;
    String filename;

    ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display(){
        if(img == null){
            img = new RealImage(filename);
        }
        img.display();
    }
}

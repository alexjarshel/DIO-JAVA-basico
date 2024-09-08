package applications;

public class InternetBrowser implements App{
    
    @Override
    public void start(){
        System.out.println("Start internet browser");
    }
    
    @Override
    public void close(){
        System.out.println("Internet Browser closed");
    }
}

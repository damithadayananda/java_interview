package designPattern.creational.factory;

public class factory {
    public osInterface getOs(String name){
        if(name.equals("deprecated")){
           return new windows(); 
        }else if(name.equals("popular")){
            return new android();
        }
        return new mac();
    }
}

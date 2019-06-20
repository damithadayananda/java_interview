package userDefinedException;

public class myExcetion {
    public void my_exception(int amount) throws  customException{
        if(amount<100){
            throw new customException("low amount");
        }
    }
}

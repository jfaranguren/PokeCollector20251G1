package exceptions;

public class MyErrorException extends Exception {

    public MyErrorException(){

    }

    public MyErrorException(String errorMessage){
        super(errorMessage);
    }
    

    
}

public class GeometrischesObjektException extends Exception{
    String message;
    GeometrischesObjektException(){}
    GeometrischesObjektException(String message){
        super();
        this.message = message;
    }
    public String errorMessage(){
        return message;
    }
    
}


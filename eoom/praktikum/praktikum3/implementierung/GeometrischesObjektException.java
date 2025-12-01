public class GeometrischesObjektException extends Exception{
    String message;
    GeometrischesObjektException(){}
    GeometrischesObjektException(String message){
        this.message = message;
    }
    public String errorMessage(){
        return message;
    }
    
}


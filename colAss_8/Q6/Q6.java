class NovowelException extends Exception{
    public NovowelException(String message){
        super(message);
    }
}

public class Q6 {
    public static void checkVowel(String str) throws NovowelException{
        if(!str.toLowerCase().matches(".*[aeiou].*")){
            throw new NovowelException("string does not contain vowels");

        }
        System.out.println("string contains");
    }


    public static void main(String[] args) {
        try{
            checkVowel("hllo");
        }
        catch(NovowelException e){
            System.out.println(e.getMessage());
        }
    }
}

import java.util.regex.*;
public class patternmatch {
    public static void main(String[] args){
    Pattern p=Pattern.compile("[a-z0-9]+@[a-z]+[.]com");
    Matcher m=p.matcher("atharva@gmail.com");
    if(m.matches()){
        System.out.println("valid email");

    }
    else{
    System.out.println("invalid");
    }
    
    
}}

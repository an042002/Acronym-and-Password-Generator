/**
 This class represents the string generator class for generating acronym and passwords
 @author Abhiiraj Nikam  
 */
import java.util.Scanner;
import java.lang.String;

public class StringGenerator {
    /**
    This method represents the generation of acronym
    @return result the acronym of input
     */
        public static String generateAcronym(String text) {
            String result="";
            
            Scanner tokenizer = new Scanner (text);
                while(tokenizer.hasNext()) {
                    String word="";
					word= tokenizer.next();
                    if(Character.isUpperCase(word.charAt(0))) {
                         result = result+ word.charAt(0);
                    }
                    else if(Character.isDigit(word.charAt(0))) {
                        result = result + word;
                    }
                }
            return result;
        }
    /**
    This method represents the generation of password
    @return result the password of input
     */
        public static String generatePassword(String text) {
            String result="";
            int counter=0;
            Scanner tokenizer = new Scanner (text);
                while(tokenizer.hasNext()) {
                    String word="";
					word = tokenizer.next();
                    if(!(word.length()<3)) {
                        counter++;
                        if(counter%2==0) {
                            for(int i=0; i<=1; i++) {
                                char name = word.toUpperCase().charAt(i);
                                char c1;
                                if(name=='B') {
                                    name='3';
                                }
                                else if(name=='H') {
                                    name='#';
                                }
                                else if(name=='t') {
                                    name='+';
                                }
                                else if(name=='l') {
                                    name = '!';
                                }
                                result = result + name;
                                
                            }
                                
                        }
                        else {
                            for(int j=word.length()-2; j<=word.length()-1;j++) {
                                char name = word.toLowerCase().charAt(j);
                                
                                if(name=='B'){
                                    name='3';
                                }
                                else if(name=='H') {
                                    name='#';
                                }
                                else if(name=='t'){
                                    name='+';
                                }
                                else if(name=='l') {
                                    name = '!';
                                }
                                result = result + name;
                            }
                        }
                    }
            
            }
            return result;
        }
}


//..... A statement analyzer in java that can perform required calculation given as an input in simple english ....... //

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
    
        analyzerv2 obj1 = new analyzerv2() ;

        String str ;
        String ans ;
       
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("W : ");
            str = sc.nextLine() ;
            
            System.out.print("C : ");
            try {   ans = obj1.analyze(str);
            } catch (Exception e) { ans = null ; }
        
            if(ans == "quit"){
                System.out.println("Thanks For Using \n    Bye");
                break ;
            }else{
                System.out.println(ans);
            }
        }
        
        sc.close();
    }

}


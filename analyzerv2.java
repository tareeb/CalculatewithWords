public class analyzerv2  extends operations{

    //help 

    double[] numbers  ;
    String temp = "0" ; 

    String[] quitkeyword      = {"quit","bye","exit","close"};
    String[] thiskeyword      = {"this","that","answer","result","it"};
    String[] thenkeyword      = {"then"};
    String[] addkeyword       = {"add","sum","+"};
    String[] productkeyword   = {"product","multiply","*"};
    String[] tablekeyword     = {"table"};
    String[] powerkeyword     = {"power","^","exponent"} ; 
    String[] roundkeyword     = {"round"} ;
    String[] logkeyword       = {"log"} ;
    String[] maxkeyword       = {"maximum","max"} ;	
	String[] minkeyword       = {"minimum","min"} ;   
    String[] averagekeyword   = {"average"} ;
    String[] factorialkeyword = {"factorial"};
    String[] primekeyword     = {"prime"} ;
    String[] evenoddkeyword   = {"even","odd"} ;
    String[] factorkeyword    = {"factors"};  
    String[] lcmkeyword       = {"lcm"};
    String[] hcfkeyword       = {"hcf","gcd","gcf"};
    String[] randomkeyword    = {"random"};
    String[] trignomatrykeyword = {"sin","cos","tan","sinh","cosh","tanh"};
    String[] dividekeyword    = {"divide","/"};
    String[] subtractkeyword  = {"subtract","sub"};
    String[] fromkeyword      = {"from"};
    String[] clearkeyword     = {"cls","clear","clearsecreen"};

public String analyze(String str){
        str = " " + str ;                   //to remove a bug

        str = str.toLowerCase();
        String[] strr = str.split("then");
         
        int i=0 ;
        while(i < strr.length){
        
        getnumbers(strr[i]);

        if(findkeyword(strr[i], quitkeyword))      { return "quit"; }
        if(findkeyword(strr[i], thiskeyword))      { thiskeywordfunction(); }   //it will store previous reslut at index 0
        if(findkeyword(strr[i], clearkeyword))     { temp = "" ;  clearscreen();              }


        if(findkeyword(strr[i], productkeyword))   {   temp = product(numbers);                  }
        if(findkeyword(strr[i], tablekeyword))     {   temp = "0" ;                 return  table(numbers);     }
        if(findkeyword(strr[i], powerkeyword))     {   temp = power(numbers);                    }
        if(findkeyword(strr[i], roundkeyword))     {   temp = round(numbers);                    }
        if(findkeyword(strr[i], logkeyword))       {   temp = log(numbers);                      }
        if(findkeyword(strr[i], maxkeyword))       {   temp = maximum(numbers);                  }
        if(findkeyword(strr[i], minkeyword))       {   temp = minimum(numbers);                  }
        if(findkeyword(strr[i], averagekeyword))   {   temp = average(numbers);                  }
        if(findkeyword(strr[i], factorialkeyword)) {   temp = factorial(numbers);                }
        if(findkeyword(strr[i], primekeyword))     {   temp = "0";                  return  prime(numbers);     }
        if(findkeyword(strr[i], evenoddkeyword))   {   temp = "0";                  return  evenodd(numbers);   }
        if(findkeyword(strr[i], factorkeyword))    {   temp = "0" ;                 return  factors(numbers);   }
        if(findkeyword(strr[i], lcmkeyword))       {   temp = lcm(numbers);                       }
        if(findkeyword(strr[i], hcfkeyword))       {   temp = hcf(numbers);                       }
        if(findkeyword(strr[i], randomkeyword))    {   temp = random(numbers);                    }
        if(findkeyword(strr[i], dividekeyword))    {   temp = divide(numbers);                    }

        if(findkeyword(strr[i], trignomatrykeyword)) { temp = trignomatry(numbers,keywordwordno(str,trignomatrykeyword));             }

        if(findkeyword(strr[i], addkeyword))       {   temp = add(numbers);                       }
        if(findkeyword(strr[i], subtractkeyword))  
        { 
           
           if( (findkeyword(strr[i], fromkeyword)) && (findkeyword(strr[i], thiskeyword))) 
           {
               if(wordsequence(strr[i], fromkeyword) > wordsequence(strr[i], thiskeyword) )
                    temp=subtractfrom(numbers);
                else    
                    temp=subtract(numbers);
            }
            else if( findkeyword(strr[i], fromkeyword))
            {
                temp=subtractfrom(numbers); 
            }
            else
            {
                temp=subtract(numbers);
            }          
        }
         
         
        i++;
        
        }

        return temp ;
    }







    public void getnumbers(String str){
        String numstr = str.replaceAll("[^0-9[.[-]]]+", " ");
        
        if((str.charAt(0)>='a' && str.charAt(0)<='z')||(str.charAt(0)==' ')){       //to remove a bug
            numstr = numstr.substring(1);
        }

        String[] strArray = numstr.split(" ");

        numbers = new double[strArray.length];

        for(int i=0 ; i < strArray.length ; i++ ){
            try {
                numbers[i] = Double.parseDouble(strArray[i]);
            } catch (Exception e) {}
           
        }
    }

    public boolean findkeyword(String str , String[] keyword){
        
        int temp = -1 ; 

        for(int i=0 ; i < keyword.length ; i++){
            temp = str.indexOf(keyword[i]) ;

            if(temp>=0){
                return true;
            }
        }
        
        return false ;
    }

    public void thiskeywordfunction(){
        double[] tempnumbers =   new double[numbers.length] ;
            tempnumbers = numbers.clone();
            
            numbers = new double[tempnumbers.length+1];
            numbers[0] = Double.parseDouble(temp);
            for(int i = 1 ; i < numbers.length ; i++){
                numbers[i] = tempnumbers[i-1];
            }
    }

    public int wordsequence(String str , String[] keyword ){
    
        int temp = -1 ; 
        
        for(int i=0 ; i < keyword.length ; i++){
            temp = str.indexOf(keyword[i]) ;
            if(temp>=0){
                break ;
            }   
        }
        return temp ;
    }

    public int keywordwordno(String str , String[] keyword ){
    
        int temp = -1 ; 
        int keywordno = -1;
        for(int i=0 ; i < keyword.length ; i++){
            temp = str.indexOf(keyword[i]) ;
            if(temp>=0){
                keywordno = i ;
            }   
        }
        return keywordno ;
    }

}

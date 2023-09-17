
public class operations {
    
    public String add(double numbers[]){
        double sum = 0 ;
        for(int i=0 ; i<numbers.length ; i++){
            sum = sum + numbers[i];
        }
        return String.valueOf(sum);
    }

    public String product(double numbers[]){   
        double product = 1 ;
        for(int i=0 ; i<numbers.length ; i++){
            product = product * numbers[i];
        }
        return String.valueOf(product);
    }

    public String table(double numbers[]){
        String temp = "";
        double  l ;
        l = numbers.length > 1 ?  numbers[1] : 5 ; 
        for(int i=1 ; i<=l ; i++){
            temp = temp + "\n" + numbers[0] + " * " + i + " = " + i*numbers[0];
        }
        return temp ;
    }

    public String power(double numbers[]){ 
        double power ;
        if(numbers.length == 0 ){ power = 0 ; }
        else if(numbers.length == 1 ){ power = numbers[0] ; }
        else 
        power = Math.pow(numbers[0], numbers[1]) ;
        
        return String.valueOf(power);
    }

    public String round(double numbers[]){   
        double round = Math.round(numbers[0]);
        return String.valueOf(round);
    }

    public String log(double numbers[]){   //use double
        double log = Math.log(numbers[0]);
        return String.valueOf(log);
    }

    public String maximum(double numbers[])
    {
	    double max = numbers[0] ;
	    for(int i=0 ; i < numbers.length ; i++) {
    	    if( max < numbers[i] )  max = numbers[i];   
        }
	    return  String.valueOf(max);
    }

    public String minimum(double numbers[])
    {
	    double min = numbers[0] ;
	    for(int i=0 ; i < numbers.length ; i++) {
    	    if( min > numbers[i] )  min = numbers[i];
	    }
	    return  String.valueOf(min);
    }

    public String average(double numbers[])
    {
	    double sum = Double.parseDouble(add(numbers)) ;
        double avr = sum / numbers.length ;
	    return  String.valueOf(avr);
    } 

    public String factorial(double numbers[]){
        double factorial = 1 ;
        for(int i=(int)numbers[0] ; i>=1 ; i--){
            factorial = factorial * i ;
        }
        return String.valueOf(factorial) ;
    }
    
    public String prime(double numbers[])
    {
	    
	if(numbers[0]==0)    {	return "Not prime" ;	}
	if(numbers[0]==0)    {	return "Not prime" ;	}
	
	for(int i=2 ; i<=(numbers[0]/2) ; i++)
	{
		if(numbers[0]%i == 0)   {	return "Not a Prime"  ;	}	
	}
	return "Prime" ;

	}   

    public String evenodd(double numbers[])
    {
	    
	if(numbers[0]%2 == 0 ){
        return "Even";
    }
	return "Odd" ;

	}   

    public String factors(double numbers[]){
        String factor = "" ;
        for(int i=1 ; i<= numbers[0] ; i++){
            if(numbers[0]%i == 0){
                factor = factor + " " + i ; 
            }
        }
        return factor ;
    }

    public String hcf(double numbers[]){
        int hcf = 0  , c ;
        
        for(int i=(int)numbers[0] ; i>=2 ; i-- )
        {
            c = 0 ;
            for(int j=0 ; j<numbers.length ; j++)
            {
                if( (int)numbers[j] %i==0 )
                  {
                      hcf = i ;
                      c++;
                  }
                else
                    hcf = 1 ;
            }
            if(c>=numbers.length)
                break;
        }
        return String.valueOf(hcf) ;
    }

    public String lcm(double numbers[]){
        int lcm = 0, c ;
	
	    for(int i=2 ; i>=2 ; i++ )
	    {
		    c = 0  ;
		    for(int j=0 ; j<numbers.length ; j++)
		    {
			    if( (i%(int)numbers[j]==0) )
			    {
			    	lcm = i ;
				    c++;
			    }
		    }
		        if(c>=numbers.length)
			        break;	
	    }
            return String.valueOf(lcm) ;
    }

    public String random(double numbers[])
    {
	    double random = 0 ;

        if(numbers[0] == 0) { 
            random = Math.round(Math.random()*1000) ;
            random = random / 1000 ;
        }
        else if (numbers.length == 1) { random = Math.random()*(numbers[0]-0+1)+0; 
            random = Math.floor(random) ;  }
        else { random = Math.random()*(numbers[1]-numbers[0]+1)+numbers[0]; 
            random = Math.floor(random) ;  }

	    return  String.valueOf(random);
    }

    public String divide(double numbers[]){
        double result = numbers[0] / numbers[1] ;
        return String.valueOf(result);
    }

    public String subtract(double numbers[]){
        double result = numbers[0] - numbers[1] ;
        return String.valueOf(result);
    }

    public String subtractfrom(double numbers[]){
        double result = numbers[1] - numbers[0] ;
        return String.valueOf(result);
    }

    public void clearscreen(){
        System.out.print("\033[H\033[2J") ;  
        System.out.flush();   
    }

    public String trignomatry(double numbers[] , int x ){
        double result = 0;
        
        numbers[0] = Math.toRadians(numbers[0]) ;
        if      (x==0)  result = Math.sin(numbers[0])  ;  
        else if (x==1)  result = Math.cos(numbers[0])  ;
        else if (x==2)  result = Math.tan(numbers[0])  ;
        else if (x==3)  result = Math.sinh(numbers[0]) ;
        else if (x==4)  result = Math.cosh(numbers[0]) ;
        else if (x==5)  result = Math.tanh(numbers[0]) ;

        result = Math.round(result*1000);
        result = result / 1000 ;
        return String.valueOf(result);
    }

   

   

    






}

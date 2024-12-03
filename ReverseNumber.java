class ReverseNumber { 
   public static void main(String[]a) 
{   int number =729; 
int result =0; 
 int digit =0;  
 System.out.println( "number is;"+number);
for(;number>0;) 
{ 
digit=number%10; 
number =number/10; 
result=(result*10)+digit; 
}   

    
System.out.println("Reverse Number is;"+result); 
} 
 
    } 

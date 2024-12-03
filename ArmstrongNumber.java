class ArmstrongNumber { 
   public static void main(String[]a) 
{   int number =153; 
int digit =0; 
 int result =0;  
int original=number;  
for(;number>0;) 
{ 
digit=number%10; 
result =result+(digit *digit *digit ); 
number=number/10; 
}   
 if (result==original) { 
    
System.out.println(original+" is Armstrong Number"); 
} 
 else 
{ 
  System.out.println(original+" is NOT Armstrong Number");  
 }
    } 
}
import java.util.Scanner;
public class CheckPrime {
	int i,num,count=0;
	public void Checking(int num){
	for(i=1;i<num;i++){
		 //count=0;
	    if(num%i==0){
	    	count++;
	    }
	}
	if(count<2){
		System.out.println("this is prime number");
	}
    if(count>=2){
		System.out.println("this is not prime number");
	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner one=new Scanner(System.in);
System.out.println("enter the number that you want to check:");
int j=one.nextInt();
 CheckPrime ck=new CheckPrime( );
 //int m=23;
 ck.Checking(j);
	}

}

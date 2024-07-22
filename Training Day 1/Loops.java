package TrainingLec1;


public class EvenNum {

	public static void main(String[] args) {
	
		System.out.println("Even Numbers from 1 to 30 using a while loop:::");
		int i=1;
		while(i<=30){
			if(i%2==0){
				System.out.println(i);
			}i++;
		}
		
		System.out.println("Odd Numbers from 1 to 30 using a do-while loop:::");
		int j=1;
		do {
			if(j%2!=0) {
				System.out.println(j);	
			}
			j++;
		}while(j<=30);
	
	}

}
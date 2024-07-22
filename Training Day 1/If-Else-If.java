package TrainingLec1;
import java.util.Scanner;


public class Percentage {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Please Enter Marks: ");
		int mark = sc.nextInt();
        
		if(mark>=90) {
			System.out.println("A");
		}
		else if(mark>=80 && mark<=90){
            System.out.println("B");
        }
        else if(mark>=70 && mark<=80){
            System.out.println("C");
        }
        else{
            System.out.println("Fail....!!!!");
        }
    
	}

}
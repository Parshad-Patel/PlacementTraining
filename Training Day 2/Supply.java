package TrainingLec2;

import java.util.Scanner;

public class Supply {
    // Private member variables to store food information
	private int Code;
	private String FoodName,Sticker,FoodType;
	
    // This method determines the type of food based on the sticker color
	public void GetType() {
		String s=Sticker.toLowerCase();
		System.out.println(s);
		if (s.equals("green")) {
			this.FoodType="-Vegetarian";
		}
		else if(s.equals("yellow")) {
			this.FoodType="-Contains Egg";
		}
		else if(s.equals("red")) {
			this.FoodType="-Non Vegetarian";
		}
		else {
			this.FoodType="-Unknown";
		}
	}
	
    // This method prompts the user to input food details and sets the member variables
	public void FoodIn() {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Please Enter Code:: ");
        Code = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter Food Name:: ");
        FoodName = sc.nextLine();
        
        System.out.print("Enter Sticker:: ");
        Sticker = sc.nextLine();
        
        sc.close();
        
        GetType();
	}
	
	// This method displays the food details
	public void FoodOut() {
		System.out.println("Code: " + Code);
        System.out.println("Food Name: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("Food Type: " + FoodType);
	}

}
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class lab1p2 {
	
	
    public static void main(String[] args) {
    	
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double root1, root2, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic equation:ax^2 + bx + c");
        
        
        System.out.print("Enter a: ");
        try{
        	a = sc.nextDouble();
        	
        	if(a == 0.0){
        		System.out.println("Please enter non-zero number for a:");
				boolean t = true;
				while(t){
					try{
						if(sc.hasNext()){
							a = sc.nextDouble();
						}
						
						if (a != 0.0){
							break;
						}
						else{
							System.out.println("Please enter non-zero number for a: ");
						}
					}
					catch(InputMismatchException ex2){
						System.out.println("Try again. (" +
						          "Incorrect input: an integer is required)");
						sc.nextLine();  // add to avoid loop of catch
					}
				}
        	}
        }
        catch(InputMismatchException ex) {
        	System.out.println("Try again. (" +
  		          "Incorrect input: an integer is required)");
        	sc.nextLine();  // add to avoid loop of catch
        	
			boolean t = true;
			while(t){
				try{
					if(sc.hasNext()){
						a = sc.nextDouble();
					}
					
					if (a != 0.0){
						break;
					}
					else{
						System.out.println("Please enter non-zero number for a: ");
					}
				}
				catch(InputMismatchException ex2){
					System.out.println("Try again. (" +
					          "Incorrect input: an integer is required)");
					sc.nextLine();  // add to avoid loop of catch
				}
			}
        }
        
        
        System.out.print("Enter b: ");
        try{
//        	b = sc.nextDouble();
        	
        	if(b == b){
//        		System.out.println("Please enter non-zero number for b:");
				boolean t = true;
				while(t){
					try{
						if(sc.hasNext()){
							b = sc.nextDouble();
						}
						
						if (b == b){
							break;
						}
						else{
//							System.out.println("Please enter non-zero number for b: ");
						}
					}
					catch(InputMismatchException ex2){
						System.out.println("Try again. (" +
						          "Incorrect input: an integer is required)");
						sc.nextLine();  // add to avoid loop of catch
					}
				}
        	}
        }
        catch(InputMismatchException ex) {
        	System.out.println("Try again. (" +
  		          "Incorrect input: an integer is required)");
        	sc.nextLine();  // add to avoid loop of catch
        	
			boolean t = true;
			while(t){
				try{
					if(sc.hasNext()){
						b = sc.nextDouble();
					}
					
					if (b != 0.0){
						break;
					}
					else{
						System.out.println("Please enter non-zero number for b: ");
					}
				}
				catch(InputMismatchException ex2){
					System.out.println("Try again. (" +
					          "Incorrect input: an integer is required)");
					sc.nextLine();  // add to avoid loop of catch
				}
			}
        }
        
        
        
        
        
        System.out.print("Enter c: ");
        try{
//        	c = sc.nextDouble();
        	
        	if(c == c){
//        		System.out.println("Please enter non-zero number for c:");
				boolean t = true;
				while(t){
					try{
						if(sc.hasNext()){
							c = sc.nextDouble();
						}
						
						if (c == c){
							break;
						}
						else{
//							System.out.println("Please enter non-zero number for c: ");
						}
					}
					catch(InputMismatchException ex2){
						System.out.println("Try again. (" +
						          "Incorrect input: an integer is required)");
						sc.nextLine();  // add to avoid loop of catch
					}
				}
        	}
        }
        catch(InputMismatchException ex) {
        	System.out.println("Try again. (" +
  		          "Incorrect input: an integer is required)");
        	sc.nextLine();  // add to avoid loop of catch
        	
			boolean t = true;
			while(t){
				try{
					if(sc.hasNext()){
						c = sc.nextDouble();
					}
					
					if (c != 0.0){
						break;
					}
					else{
						System.out.println("Please enter non-zero number for c: ");
					}
				}
				catch(InputMismatchException ex2){
					System.out.println("Try again. (" +
					          "Incorrect input: an integer is required)");
					sc.nextLine();  // add to avoid loop of catch
				}
			}
        }
        
        
        
        System.out.println("Quadratic equation: " + a + "x^2 + " + b + "x + " + c);
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("Roots are real and unequal");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("First root is: " + root1);
            System.out.println("Second root is: " + root2);
        }
        else if(d == 0)
        {
            System.out.println("Roots are real and equal");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Root:" + root1);
            System.out.println("Root:" + root1);
        }
        else
        {
            System.out.println("Roots are not real");
        }
    }
}
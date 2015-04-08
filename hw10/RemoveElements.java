//Nelson Westwood
//Methods Java Program
//
// generate a random number between 0-9
// Create sentence based on methods and such

import java.util.Random;
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int [] randomInput (){
  	final int size = 10;
  	Random randomGenerator = new Random();
  	int [] list;
  	list = new int [size];
  	int i = 0; 
  	for (i=0; i<size; i++){
  		int randomNumber = randomGenerator.nextInt(10); 
  		list[i] = randomNumber;
  	}
  	return list;
  }
 public static int [] delete (int [] list, int pos){
 	final int size2 = 9;
 	int [] array2;
 	array2 = new int [size2];
 	int array2loc = 0;
 	if (pos >= 10 || pos < 0){
 		System.out.println("The index is not valid");
 		return list;
 	}
 	for (int j=0; j<list.length; j++){
 		if (j!=pos){
 		array2[array2loc] = list[j];
 		array2loc++;
 	}
 }
 return array2;
 }
 public static int [] remove (int [] list, int target){
 	int targetCount =0;
 	if (target >= 10){
 		System.out.println("Element " + target + " was not found");
 		return list;
 	}
 	for (int i = 0; i<list.length; i++){
 		if (list[i]==target)
 		targetCount++;
 	}
 	if (targetCount == 0)
 	return list;
 	
 	int size3 = 10-targetCount;
 	int [] array3 = new int [size3];
 	int array3loc=0;
 	for (int k = 0; k<list.length; k++){
 		if (list[k]!=target) {
 		array3[array3loc]=list[k];
 		array3loc++;
 		}
 		
 	}
 	return array3;
 	}
 }
	
	
	
	
	


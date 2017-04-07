import java.io.*;
import java.util.Scanner;

public class AddressBook {

    	private Contact[] friends; // An array of Contacts - each stores info for one friend
    	private int numfriends; // Number of friends currently in AddressBook

   	 // Create an empty AddressBook
   	 public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
   	 public int numfriends() {
	    return friends.size;
    	}
	 public int haveContact(String s) {
		 for(int i = 0; i < friends.length; i++){
			 if(friends[i].equals(s)){
				 return i;
			 }
		 }
		 return -1;
	 }
	 public Delete(String s) {
	 	int temp = haveContact(s);
		if(temp == -1){
	
		}
		else{
			friends[s] == friends[friends.length-1];
			numfriends --;
		}
	 }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in)
		 Addressbook blackbook = new Addressbook();
		 
		 menu();
		 int choice = sc.nextInt();
		 
		 if(choice == 1) {
			 
			 System.out.println("What is their name?");
			 String name = sc.next();
			 System.out.println("How old is " + name + "?");
			 int age = sc.nextInt();
			 System.out.println("What is " + name + "'s phone number?");
			 int phoneNumber = sc.nextInt();
			 System.out.println("What month was " + name + " born in (in numerical fashion)?");
			 int month = sc.nextInt();
			 System.out.println("What day of the month was " + name + " born on?");
			 int day = sc.nextInt();
			 
			 Contact = new Contact(name, age, phoneNumber, month, day);
		 }
		 if(choice == 2) {
			 System.out.println("What contact do you want to delete?");
			 String forWhomTheBellTolls = sc.next();
			 
			 Delete(forWhomTheBellTolls);
		 }
		 if(choice == 3) {
			 System.out.println("You have:" blackbook.numfriends);
		 }
		 if(choice == 4) {
			 for(int i = 0; i < blackbook.numfriends; i++){
				 friends[i].printContact();
			 }
		 }
		 if(choice == 5) {
			 System.out.println("Okay, bye loser");
		 }
		 else {
			 System.out.println(" Choose one of the options idiot");
			 menu();
		 }
	 }
	 public menu() {
		 System.out.println("Options:");
		 System.out.println("1. Add Contact");
		 System.out.println("2. Remove Contact");
		 System.out.println("3. Print number of contact");
		 System.out.println("4. Print all contacts");
		 System.out.println("5. quit"); 
	 }
    }

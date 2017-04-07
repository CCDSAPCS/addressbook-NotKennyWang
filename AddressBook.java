import java.io.*;
import java.util.Scanner;

public class AddressBook {

        private Contact[] friends; // An array of Contacts - each stores info for one friend
        private int numfriends; // Number of friends currently in AddressBook

        
     // Create an empty AddressBook
     public AddressBook() {
        friends = new Contact[10];
        numfriends = 0;
    }
    public int numfriends(){
       int count = 0;
        for (int i = 0; i < friends.length; i++) 
        {
        if(friends[i] != null)
        {
            count++;
        }
       }
       return count;
    }
    public void Delete(String s) {
        int temp = haveContact(s);
        if(temp == -1){
    
        }
        else{
            int tempTemp = 0;
            for(int i = 0; i < friends.length; i++){
                if(friends[i].equals(s)){
                   friends[tempTemp] = friends[friends.length-1];
                   numfriends --; 
                }
            }
        }
    }
    public int haveContact(String s) {
         for(int i = 0; i < friends.length; i++){
             if(friends[i].equals(s)){
                 return i;
             }
         }
         return -1;
     }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         AddressBook blackbook = new AddressBook();
         
         blackbook.menu();
         /*
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
             
             Contact temp = new Contact(name, age, phoneNumber, month, day);
         }
         if(choice == 2) {
             System.out.println("What contact do you want to delete?");
             String forWhomTheBellTolls = sc.next();
             
             blackbook.Delete(forWhomTheBellTolls);
         }
         if(choice == 3) {
             System.out.println("You have:" + blackbook.numfriends);
         }
         if(choice == 4) {
             for(int i = 0; i < blackbook.numfriends; i++){
                 blackbook.friends[i].printContact();
             }
         }
         if(choice == 5) {
             System.out.println("Okay, bye loser");
         }*/
     }
    public void menu() {
         System.out.println("Options:");
         System.out.println("1. Add Contact");
         System.out.println("2. Remove Contact");
         System.out.println("3. Print number of contact");
         System.out.println("4. Print all contacts");
         System.out.println("5. quit"); 
         
         Scanner sc = new Scanner(System.in);
         

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
             
             friends[numfriends] = new Contact(name, age, phoneNumber, month, day);
             menu();
         }
         if(choice == 2) {
             System.out.println("What contact do you want to delete?");
             String forWhomTheBellTolls = sc.next();
             
             Delete(forWhomTheBellTolls);

             menu();
         }
         if(choice == 3) {
             System.out.println("You have:" + numfriends);
             menu();
         }
         if(choice == 4) {
             for(int i = 0; i < numfriends; i++){
                 friends[i].printContact();
             }
             menu();
         }
         if(choice == 5) {
             System.out.println("Okay, bye loser");
           
         }
     }
}

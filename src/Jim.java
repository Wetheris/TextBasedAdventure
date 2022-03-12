import java.util.Scanner;  //Importing Scanner

public class Jim {

  String userName; //Declaring a string 'userName'
   int userAge; //Declaring an integer 'userAge'
  Person player1 = new Person(userName, userAge); //Declaring player1 - Assign userName / userAge to : Person


  public static void main(String[] args) {
    Jim jm = new Jim(); //We are creating an instance of Jim
    jm.intro(); // We're calling the non-static intro method in the JM class via the jm instance of Jim

}

public void intro(){

  Scanner scanner = new Scanner(System.in); // We are creating a scanner

  System.out.println("My name is Jim, Welcome to Text Game Name. What is your name?");

  String userName = scanner.nextLine(); //We are taking the user input and saving it as the userName variable

  System.out.println("Your name is: " + userName); //printing user name

  player1.setName(userName); //We're calling the setName method to player1 using the userName from the input

  System.out.println("Hello,"   + userName);

  System.out.println("How old are you?");

  int userAge = scanner.nextInt();

  player1.setAge(userAge);

  System.out.println("oh shit, you are " + userAge);
  System.out.println("Rescue me from tHE COMPUTER");

  Level1 lvl = new Level1(); //We are creating an instance of level one to run

  lvl.runLevel1(player1); //call the run level one method with the player1 object

}

}

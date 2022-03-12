import java.util.Locale;
import java.util.Scanner;

public class Level1 {

public void runLevel1(Person person){ //We are passing the player to the class

  Scanner scanner = new Scanner(System.in); // We are creating a scanner
  System.out.println("-------------LEVEL-1----------------");
  System.out.println("hello " + person.name);
  try {
    Thread.sleep(2000);
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  System.out.println("\"You arrived at office. Late as usual.\"");
  System.out.println("What is your excuse to tell debbie from accounting?");
  System.out.println("-------------------------------------");
  System.out.println("A -\"My dog had to go to the vet late last night.\"");
  System.out.println("B -\"I got in a car accident and was in the Emergency Department.\"");
  System.out.println("C -\"Fuck off, Debbie.\"");
  String answer1 = scanner.nextLine().toUpperCase(Locale.ROOT); //We're taking the answer to the question - storing as upper case

  if (answer1.toUpperCase(Locale.ROOT).equals("A")) {
    System.out.println("");

  }
  else if (answer1.toUpperCase(Locale.ROOT).equals("B")) {

  }

  else if (answer1.toUpperCase(Locale.ROOT).equals("C")){

  }

  else {
    System.out.println("you fucked up");
  }




}

}

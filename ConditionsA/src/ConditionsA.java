import java.util.Scanner;

public class ConditionsA {
    public static void main(String[] args)
    {
        Scanner kb=new Scanner (System.in);

        int age;

        System.out.print("Enter your age as an integer to see if you are eligible to vote.");
        age=kb.nextInt();

        if (age>=18)
            System.out.println("You can register to vote.");
        else
            System.out.println("You can't vote. You're age is "+age);

/*
 * Enter your age as an integer to see if you are eligible to vote.
 * 24
You can register to vote.
Enter your age as an integer to see if you are eligible to vote.18
You can register to vote.
			//do not use ; after if or else conditional statements.


Enter your age as an integer to see if you are eligible to vote.17
You can't vote. You're age is 17
 */

        //create the grade variable. pass if more than 60.

        int grade;
        System.out.println("Enter the grade as an integer:");
        grade=kb.nextInt();

        if(grade<=60)
            System.out.println("You fail.");
        else
            System.out.println("You pass.");

        //create two variables- an integer for credits and a double for gpa.
        //display you can apply to the honor society if credit at least 60 and gpa at least 3.7
        //otherwise display sorry you can't apply

        int credits;
        double gpa;
        System.out.println("Enter number of credits completed as an integer: ");
        credits=kb.nextInt();
        System.out.println("Enter gpa as a double: ");
        gpa=kb.nextDouble();

        if((credits>=60)&&(gpa>=3.7))
            System.out.println("You can apply to the honor society");
        else
            System.out.println("Sorry you can't apply. \nYou must have at least 60 credits completed and a gpa of 3.7. You have "+credits+" and a "+gpa);

        //create a variable called age2
        //output free admission if age is less than 2 or greater than 65

        int age2;
        System.out.println("Enter your age as an integer to see cost of admission: ");
        if ((age2<2)||(age2>65))
            System.out.println("Your admission is free. ");
        else
            System.out.println("Your admission is full price. \nYou must be less than 2 years or greater than 65 for free admission and you are "+age2);

        //create a variable called score and output perfect score if score=104

        int score;
        System.out.println("Enter your score on the first test ");
        score=kb.nextInt();
        if(score==104)
            System.out.println("Perfect score! ");
        else
            System.out.println("Not a perfect score. A perfect score is 104 and your score is "+score);




    }
}

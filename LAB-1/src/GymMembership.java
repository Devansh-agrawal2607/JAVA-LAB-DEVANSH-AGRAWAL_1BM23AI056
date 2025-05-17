/*Design a membership management system for a fitness center, where the
system should allow gym administrators to store information about gym
members-name, age, membership status(true/false), and membership duration
 (in months). Calculate the membership fee based on the membership
 duration using a predefined fee. Display detailed information of the member. */
import java.util.Scanner;

public class GymMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to gym membership management system");
        System.out.println("Enter member name:");
        String name = sc.nextLine();
        System.out.println("Enter member age: ");
        int age = sc.nextInt();
        System.out.println("Enter Membership status(True/False): ");
        Boolean MembershipStatus = sc.nextBoolean();
        System.out.println("Enter Membership Duration(In Months): ");
        int MembershipDuration = sc.nextInt();
        double MembershipFee = MembershipDuration * 50.0;

        System.out.println("\n Membership details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Membership status: " + MembershipStatus);
        System.out.println("Membership Duration: " + MembershipDuration);
        System.out.println("Membership fee: $ " + MembershipFee);
    }
}

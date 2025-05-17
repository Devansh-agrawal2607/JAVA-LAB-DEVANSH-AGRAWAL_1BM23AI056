import java.util.Scanner;

/*3b. Write a program in Java for String handling which performs the following:
i) Checks the capacity of String Buffer objects.
ii) Reverses the contents of string given on console and converts the resultant string in upper case.
iii) Reads a string from console and appends it to the resultant string.
*/
public class String_Buffer_Handling {
    public static void main(String[] args) {
        // Task i
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of String BUffer object sb1:" + sb1.capacity());
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println("Capacity of String Buffer object sb2:" +sb2.capacity());
        // Task ii
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputstring = scanner.nextLine();
        StringBuffer reversedBuffer = new StringBuffer(inputstring);
        reversedBuffer.reverse();
        String reversedUpercase = reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed struing to uppercase:" + reversedUpercase);
        // Task iii
        System.out.print("Enter  String to append: ");
        String appendString = scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending: "+reversedBuffer);
    }
}

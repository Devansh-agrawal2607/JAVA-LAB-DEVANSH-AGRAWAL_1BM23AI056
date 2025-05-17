/*Create an enumeration Day of Week with seven values SUNDAY through SATURDAY.
Add a method Workday() to the DayofWeek class that returns true if the value on which it
is called is MONDAY through FRIDAY.
 */
public class ENUMERATION {
    public enum DayOfWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

    public boolean isWorkday(){
        return (this != SATURDAY && this != SUNDAY);
    }
    }

    public static void main(String[] args) {
        System.out.println("Is monday workday? " +DayOfWeek.MONDAY.isWorkday());
        System.out.println("Is Saturday workday? " +DayOfWeek.SATURDAY.isWorkday());
    }
}

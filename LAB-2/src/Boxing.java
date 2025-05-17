/*Demonstrate boxing of primitive data types into their corresponding wrapper
class objects and unbox them back to their primitive forms.*/
public class Boxing {
    public static void main(String[] args) {
        Integer BoxedInt = Integer.valueOf(10);
        Double BoxedDouble = Double.valueOf(10.5);
        Character BoxedChar = Character.valueOf('A');
        Boolean BoxedBool = Boolean.valueOf(true);
        Float BoxedFloat = Float.valueOf(30.5f);

        int unboxedInt = BoxedInt.intValue();
        double unboxedDouble = BoxedDouble.doubleValue();
        char unboxedChar = BoxedChar.charValue();
        boolean unboxedBool = BoxedBool.booleanValue();
        float unboxedFloat = BoxedFloat.floatValue();

        System.out.println("Boxed Integer : " + BoxedInt);
        System.out.println("UnBoxed Integer : " + unboxedInt);
        System.out.println("Boxed Double : " +BoxedDouble);
        System.out.println("UnBoxed Double  : " +unboxedDouble);
        System.out.println("Boxed Character : " +BoxedChar);
        System.out.println("UnBoxed Character : " +unboxedChar);
        System.out.println("Boxed Boolean : " +BoxedBool);
        System.out.println("UnBoxed Boolean : " +unboxedBool);
        System.out.println("Boxed float : " +BoxedFloat);
        System.out.println("UnBoxed float : " +unboxedFloat);
    }
}

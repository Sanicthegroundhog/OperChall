public class Operator {
    public static void main(String[] args) {

        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00;
        System.out.println("theRemainder = " + theRemainder);
        boolean NoRemainder = (theRemainder == 0.00) ? true : false;
        System.out.println("NoRemainder = " + NoRemainder);
        if (NoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
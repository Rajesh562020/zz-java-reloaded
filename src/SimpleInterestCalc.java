/*
* The program to calculate the simple interest of fixed values;
* */
public class SimpleInterestCalc{

    public static void main(String[] args) {
        float principal, rateOfInterest, simpleInterest;
        int time;
        principal = 1000.50f;
        rateOfInterest = 15.5f;
        time = 3;

        //Simple Interest Formula
        simpleInterest = (principal * rateOfInterest * time)/100;

        System.out.println("The Simple Interest = "+ simpleInterest +"Rs.");
    }
}

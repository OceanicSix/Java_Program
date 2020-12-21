package study.window_class;
/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;
    int total;

    public void doIt(Window win){
        myWindow = win;

//        ex01();
//        ex02();
        //ex03();
        ex04();

//        firstExample();
        //secondExample();
        //constants();
        //dataTypesExamples();
        //dataTypesConversions();
        //testing();
    }

    private void ex01(){
        //<<<Documentation for methods of the Window class>>>
        //that can be applied to the instance of Window referenced by the variable myWindow
        //myWindow.clearOut()               clears all text from the output text area
        //myWindow.readIn()                 returns as a String whatever text is in the input text area
        //myWindow.writeOut(someExp)        displays its expression parameter but does NOT throw a line
        //myWindow.writeOutLine(someExp)    displays its expression parameter but does throw a line

        //the two write methods will except any value of a primitive type and display the String version of the value
        //how this kind of flexibility is implemented and what is the String version of a non-String value
        //are topics for much later
        //<<<end>>>

        //YOUR CODE BELOW HERE
        myWindow.clearOut();

        myWindow.writeOutLine("ex01 here");
        myWindow.writeOut("ex01");

        String inputText = myWindow.readIn();
        myWindow.writeOutLine(inputText);

        //YOUR CODE ABOVE HERE
    }

    private void ex02(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();
        myWindow.writeOutLine("ex02 here");
        myWindow.writeOutLine(7);
        myWindow.writeOutLine(8);
        myWindow.writeOutLine(9);
        myWindow.writeOutLine(7+8+9);

        //YOUR CODE ABOVE HERE
    }

    private void ex03(){
        //YOUR CODE BELOW HERE
        myWindow.clearOut();
        myWindow.writeOutLine("ex03 here");
        //YOUR CODE ABOVE HERE
    }

    private void ex04(){
        //YOUR CODE BELOW HERE
//        myWindow.clearOut();
//        myWindow.writeOutLine("ex04 here");
        int a = 12;
        double b = 12;

        myWindow.writeOutLine(b);
        String c = "123";
        boolean f = true;
        b =a ;

        myWindow.writeOutLine(b);
        //YOUR CODE ABOVE HERE
    }

    //SYNTAX TEMPLATES
    //dataType variableName [= dataValue][, variableName [= dataValue] ]…;
    //variableName = expression;
    //final dataType CONST_NAME [= dataValue][, CONST_NAME[= dataValue] ]…;

    //WORKSHOP CODE
    private void firstExample(){
        String firstName = "Stephen";   //declaration and initial assignment
        String lastName, fullName;      //declaration only


        myWindow.clearOut();            //clear display

        lastName = "Huxford";           //assignment of String literal

        fullName = firstName + " " + lastName;  //assignment of String expression

        lastName = firstName;
        firstName = lastName;

        fullName = "Dear " + fullName;
        myWindow.writeOutLine(fullName); //write to display
    }

    private void secondExample(){
        int number1; //declarations first in a method
        int sum;

        myWindow.clearOut();

        //myWindow.writeOutLine(number); //error
        //myWindow.writeOutLine(number1); //error

        number1 = 7;
        myWindow.writeOutLine(number1);

        number1 = number1 + 1; //mathematical impossibility
        myWindow.writeOutLine(number1);

        myWindow.writeOutLine(number1 + 11); //bad style, calculate then display
        sum = number1 + 11;
        myWindow.writeOutLine(number1 + 11);

        myWindow.writeOutLine(number1); //variable value unchanged
    }

    private void constants(){
        final int NUMBER_OF_DEPARTMENTS = 39;

        //NUMBER_OF_DEPARTMENTS = 40; error
    }

    private void dataTypesExamples(){
        char myChar, firstInitial = 'S', fullStop = '.';
        int enrolledStudents = 100, total = 0;
        double weightInKilos, totalWeightInKilos = 0.0;
        boolean testResult = false;

        myWindow.clearOut();
        myWindow.writeOutLine("First initial is " + firstInitial + fullStop);
        myWindow.writeOutLine("Number of enrolled students: " + enrolledStudents + fullStop);
        myWindow.writeOutLine("Test result was " + testResult + fullStop);
    }

    private void dataTypesConversions(){
        float money;
        int dollars = 3; //IDE tells me this var is redundant

        money = dollars; //widening conversion OK, loss of accuracy

        double sum = 17.0, result;
        int count = 10;

        result = sum / count; //copy of count promoted to double

        double moreMoney = 5.67;
        int moreDollars = 3;

        //moreDollars = moreMoney; //type mismatch compiler error reported
        moreDollars = (int) moreMoney; //cast forces conversion with truncation

        String digitString = "123";
        int intTarget;

        //target = (int) "123"; // error inconvertible types

        boolean found = true;
        float floatTarget;

        //floatTarget = (float) found;

    }

    private void testing(){
        myWindow.clearOut();
//
//        double d = 0.1, result = 0.0;
//
//        for (int i = 0; i <=10000000; i++)
//            result += d;
//
//
//        myWindow.writeOutLine("10 million * 0.1 = " + result + " (whooops!!!)");

//        final int MINUTES_IN_AN_HOUR = 60;
//        final int HOURS_IN_A_DAY = 24;
//        final int DAYS_IN_FEBRUARY =29;
//
//        int minutesInMonth = MINUTES_IN_AN_HOUR * HOURS_IN_A_DAY * DAYS_IN_FEBRUARY;

    }


    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}

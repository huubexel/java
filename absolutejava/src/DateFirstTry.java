public class DateFirstTry {

    // public means that there are no restrictions on how these
    // instance variables are used.

    // Java does not have global variables

    // in Java, you cannot have two variables
    // with the same name inside a single method definition
    // if you declare it outside the block, you can use it
    // inside and outside the block.
    // As standard try to teach yourself to name variables outside
    // the block if the memory will be located anyhow to that var.

    // Instance variables
    public String month;
    public int day;
    public int year;

    public void writeOutput() { // heading
        // method body
        System.out.println(month + " " + day + ", " + year);
    }
    // void means this is a method for performing an action,
    // NOT to producing a value.
    // A method that performs some action
    // other than returning a value is called a void method.
    // If you use the void, the function return nothing at all.

    public void makeItNewYears() {
        month = "January";

        // Say you would want to end a void method before it runs
        // out of statements, do the following:
        return;

        // Then this will give an error but that's okay if you
        // are in something like an if else
        //day = 1;
    }

    // tip on top of page 216 is usefull

    public void YellIfNewYear() {
        if (month.equals("January")) {
            System.out.println("Hurrah!");
        } else {
            System.out.println("Not New Year's Day.");
        }
    }
}
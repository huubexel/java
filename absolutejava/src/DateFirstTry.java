public class DateFirstTry {

    // Good method comments:
    //     precondition:  state what is assumed to be true
    //                    when the method is called.
    //     postcondition: effect of the method call
    // If you are just returning something with the postcondition
    // you most of the time just tell what you return without
    // saying 'postcondition'. Below an example

    /**
     Precondition: All instance variables of the calling object have
     values.

     Returns a string describing the data in the calling object.
     */

    // public means that there are no restrictions on how these
    // instance variables are used.
    //private means
    // that the instance variable cannot be accessed by name
    // outside of the class definition.

    // It is considered good programming practice to make
    // all instance variables private.
    // You can still access the variables only through getters
    // and setters.
    // Get is straight forward, whatever you do, you get
    // a value that at least looks like something you want.
    // But for a setter you can for example test
    // whether that what you are setting is something that can be set
    // For example, you want to set someone's birthday, than you cannot
    // set the year to the year 3000, because that year has not arrived
    // yet, you make the setter a check.
    // You can also make the setter return if the setting is done
    // correct and false if it is not done correct.

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
    public int number;

    public void writeOutput(int number) { // heading
        // method body

        // This is an example of when to use this.
        this.number = number;
        // This line updates the instance variable number of only
        // this instance of the class (last part not sure about)

        // if you make an 'equals' method, you can check all
        // the instance variables of both objects and if those
        // check out, you have a match (that will do for now)


        System.out.println(month + " " + day + ", " + year);
        System.out.println(number);
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
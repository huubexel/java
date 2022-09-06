public class DateFirstTry {

    // public means that there are no restrictions on how these
    // instance variables are used.


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

    public void makeItNewYears() {
        month = "January";
        day = 1;
    }

    public void YellIfNewYear() {
        if (month.equals("January")) {
            System.out.println("Hurrah!");
        } else {
            System.out.println("Not New Year's Day.");
        }
    }
}
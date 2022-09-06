public class DateFirstTryDemo {
    public static void main(String[] args) {

        // An object of a class is typically named by a variable
        // of the class type. For example, the program DateFirstTryDemo
        // in Display 4.1 declares the two variables date1 and
        // date2 to be of type DateFirstTry, as follows:
        DateFirstTry date1, date2;
        // This gives variables of the class DateFirstTry
        // But these are not the objects of the class.

        // Here you actually get the objects
        date1 = new DateFirstTry();
        date2 = new DateFirstTry();

        // Normally these 2 things above are combined in 1 statement:
        DateFirstTry date3 = new DateFirstTry();

        // Here fill in your data and feed it to the date1 instance vars.
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;

        System.out.println("date1:");
        date1.writeOutput(); // invoking a method from a class
        date1.YellIfNewYear();
        date1.makeItNewYears();
        System.out.println("It has become new year!");
        date1.YellIfNewYear();
        date1.writeOutput();

        date2.month = "July";
        date2.day = 4;
        date2.year = 1776;

        System.out.println("date2:");
        date2.writeOutput(); // invoking a method from a class
    }
}

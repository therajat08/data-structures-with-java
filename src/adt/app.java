package adt;

public class app {

    public static void main(String[] args)
    {
        counter  myCounter =  new counter("myCounter");

        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());
    }
}

package adt;

public class counter {

    private int value = 0;
    private String name= null;

    public counter(String str)
    {
        name = str;
    }

    public void increment(){
        value = value + 1;
    }

    public  int getCurrentValue(){

        return  value;
    }

    public String toString(){
        return  name + ":" + value;
    }
}

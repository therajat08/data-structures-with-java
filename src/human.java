public class human {
    String name;
    int height;
    String eyeColor;

    public human(String name, int height, String eyeColor) {
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("hi my name is " + name);
        System.out.println("my eye color is " + eyeColor);
    }
}

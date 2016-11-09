/**
 * Created by Joshua Sew-Hee on 11/8/2016.
 */
public class Painting{
    protected String title;
    protected String artist;
    protected double value;

    public Painting(String t, String a){
        title = t;
        artist = a;
        value = 400;
    }

    public void display(){
        System.out.println("The artist is " + artist + ".");
        System.out.println("The title is " + title+ ".");
        System.out.println("The value is " + value + ".");
    }
}

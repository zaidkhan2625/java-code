package oops;

public class Student {
    public static class students{
        int rn;
        String name;
        String clas;
    }
    public static class car extends students{
        int price;
    }
    public static void main(String[] args) {
        students one = new students();
        car two = new car();
        one.name="zaid";
        one.rn=10;
        one.clas="mca";
        two.price=1000;
        two.name="jeep";
        System.out.println(two.name);
    }
    
}

package oops;

public class Student {
    public static class students{
        int rn;
        String name;
        String clas;
    }
    public static void main(String[] args) {
        students one = new students();
        one.name="zaid";
        one.rn=10;
        one.clas="mca";
        System.out.println(one.name);
    }
    
}

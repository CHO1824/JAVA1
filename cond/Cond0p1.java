package cond;

public class Cond0p1 {
    public static void main(String[] args) {
        int age = 17;
        String ststus;
        if (age >= 18){
            ststus = "성인";
        }else {
            ststus = "미성년자";
        }
        System.out.println("age = " + age + " ststus = " + ststus);
    }
}

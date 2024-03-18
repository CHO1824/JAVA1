package cond;

public class SocreEx1 {
    public static void main(String[] args) {
        int distance = 110;
        String km;

       if (distance <= 1) {
           km = "도보를 이용하세요.";
       }else if (distance <= 10){
           km = "자전거를 이용하세요.";
       } else if (distance <= 100) {
           km = "자동차를 이용하세요.";
       }else{
           km = "비행기를 이용하세요.";
       }
        System.out.println(km);
    }
}

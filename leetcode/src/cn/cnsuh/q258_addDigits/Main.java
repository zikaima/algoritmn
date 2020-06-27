package cn.cnsuh.q258_addDigits;

public class Main {
    public static void main(String[] args) {
        int num = 100;
        int i = addDigits(num);
        System.out.println(i);
    }

    static int addDigits(int num) {
        if(num<10){
            return num;
        }
        while(true){
            int tmp = 0;
            while(num > 0){
                tmp+=num%10;
                num/=10;
            }
            num=tmp;
            if(num<10){
                return num;
            }
        }
    }
}

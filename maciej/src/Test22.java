import java.util.Arrays;

public class Test22 {

    public static String[]myA(String s){

        String[]myArr = new String[7];
        String []zero = s.split(" ");
        String one1 = zero[0];
        String two2 = zero[1];
        String three3 = zero[2];
        String[]one = one1.split("/");
        String[]two = two2.split(":");


        myArr[0] = one[2];
        myArr[1] = one[1];
        myArr[2] = one[0];
        myArr[3] = two[0];
        myArr[4] = two[1];
        myArr[5] = two[2];
        myArr[6] = three3;


        return myArr;
    }


    public static void main(String[] args) {

        String[]test = Test22.myA("18/10/2022 10:12:33 PM");
        System.out.println(Arrays.toString(test));
//        System.out.println(test[0]);
//        System.out.println(test[1]);
//        System.out.println(test[2]);


    }
}

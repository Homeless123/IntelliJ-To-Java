package day14_forLoop;

public class WarmUpTasks {
    public static void main(String[] args) {
        combine("JavA","Apple");
        combine("BarcelonA","Atalanta");
        combine("Mickey","Mike");
        System.out.println(  sumOf2IntegerNumber(10,11));
        System.out.println(  sumOf3IntegerNumber(10,20,40));
        System.out.println(  sumOf4IntegerNumber(50,25,25,25));
        System.out.println(     sumOf4IntegerNumber(45,78,98,8789));

    }
    public static String combine(String str1, String str2) {

        String result;

//        if (str1.endsWith( ""+ str2.charAt(0)) ){
//            result = str1 + str2.substring(1);
//        }else {
//            result = str1 + str2;
//        }
//        System.out.println(result);

        if (str1.charAt(str1.length()-1) == str2.charAt(0)){
            result = str1 + str2.substring(1);// 1.st character of the 2.nd string should be excluded in the concatenation
        }else {
            result = str1 + str2;
        }
        System.out.println(result);


        return result;
    }

    public static int sumOf2IntegerNumber (int number1, int number2){
        return number1 + number2;

    }
    public static int sumOf3IntegerNumber (int number1, int number2, int number3){
     //   return number1 + number2 + number3;
       return sumOf2IntegerNumber(number1, number2) + number3;
    }
    public static int sumOf4IntegerNumber (int number1, int number2, int number3, int number4){
        //return number1 + number2 + number3 + number4;
        // return sumOf3IntegerNumber(number1 , number2 , number3 ) + number4;
      //  return sumOf2IntegerNumber(number1, number2) + sumOf2IntegerNumber(number3, number4);
      //  return sumOf2IntegerNumber(sumOf3IntegerNumber(number1, number2, number3), number4 );
        return sumOf3IntegerNumber(sumOf2IntegerNumber(number1,number2),number3,number4);


    }

}

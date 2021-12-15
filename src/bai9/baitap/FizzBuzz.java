package bai9.baitap;

public class FizzBuzz {
    public static String fizzOrBuzz(int number){
        boolean errorInput = number < 0 || number > 99 ;
        if (errorInput){
            return "Không kiểm tra được số này";
        } else if ( number % 3 != 0 && number % 5 != 0 ){
            return "tự đọc số " + number ;
        } else if ( number % 3 == 0 ) {
            if ( number % 5 == 0 ){
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else {
            return "Buzz" ;
        }
    }
//    public static String readNumber(int number ){
//        int hangChuc = number / 10 ;
//        int hangDonVi = number % 10 ;
//
//        switch (hangChuc){
//            case 1:
//                return "muoi";
//            case 2:
//                return "hai";
//            case 3:
//                return "ba";
//            case 4:
//                return "bon";
//            case 5:
//                return "nam";
//            case 6:
//                return "sau";
//            case 7:
//                return "bay";
//            case 8:
//                return "tam";
//            case 9:
//                return "chin";
//        }
//        switch (hangDonVi){
//            case 1:
//                return "mot";
//            case 2:
//                return "hai";
//            case 3:
//                return "ba";
//            case 4:
//                return "bon";
//            case 5:
//                return "nam";
//            case 6:
//                return "sau";
//            case 7:
//                return "bay";
//            case 8:
//                return "tam";
//            case 9:
//                return "chin";
//            case 0:
//                return "muoi";
//        }
//        return hangChuc +" "+ hangDonVi ;
//    }
}

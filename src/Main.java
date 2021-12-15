public class Main {
    public static void main(String[] args) {
        multiplesOf7();
        System.out.println();
        multipleOf8();
        System.out.println();
        multipleOf9();
    } // end of main method

    public static void multiplesOf7() {
        System.out.print("multiple of 7: ");
        // solution 1
        // not correct solution
        //int n = 7;
//        for (int i = 0; i < 100; i++) {
//            int multiple = i * n;
//            System.out.print(multiple + " ");
//            if(multiple > 100){
//                break;
//            } // end of if statement
//        } // end of for loop i

        // solution 2
        for(int i = 0; i <=100; i++) {
            if(i%7==0) {
                System.out.print(i + " ");
            }
        }

    } // end of multiplesOf7

    public static void multipleOf8() {
        System.out.print("multiple of 8: ");
        for(int i = 0; i <=200; i++) {
            if(i%8==0) {
                System.out.print(i + " ");
            }
        }

    } // end of multipleOf8

    public static void multipleOf9() {
        System.out.print("multiple of 9: ");
        for(int i = 0; i <=300; i++) {
            if(i%9==0) {
                System.out.print(i + " ");
            }
        }
    } // end of multipleOf9

    // file created 15th december 2021

} // end of Main class

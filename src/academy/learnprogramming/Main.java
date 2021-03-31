package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int number = 4;
//        int finishNumber = 20;
//
//
//        while(number <= finishNumber){
//            number++;
//
//            if(!isEvenNumber(number)){
//                    continue;
//                }
//
//            System.out.println("Even number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int totalFound = 0;

        while(number <= finishNumber){
            number++;

            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
            totalFound++;
            if(totalFound >= 5)
                break;

        }

        System.out.println("Total even numbers found = " + totalFound);
    }

    private static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }
        else
            return false;
    }
}

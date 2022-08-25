public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1(){
        int i = 0;
        while(i<10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(;i>=1;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task2(){
        int friday = 3;
        for (int i = friday ; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
        System.out.println();
    }

    private static void task3() {
        int currentYear = 2022;
        int startOfPeriod = currentYear - 200;
        int finishOfPeriod = currentYear + 79;
        for (int year = 0; year <= finishOfPeriod; year+=79) {
            if(year > startOfPeriod){
                System.out.println(year);
            }
        }
        System.out.println();
    }

    private static void task4() {
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if(i%3 == 0){
                System.out.print("ping ");
            }
            if(i%5 == 0){
                System.out.print("pong ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void task5() {
        int first = 0;
        int second = 1;
        for (int i = 0; i < 10; i++) {
            int sum = first + second;
            System.out.print(first + " ");
            first = second;
            second = sum;
        }

    }


}
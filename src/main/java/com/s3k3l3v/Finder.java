package com.s3k3l3v;

public class Finder {
    private int firstNumber;
    private int secondNumber;
    private int firstNumber1;
    private int secondNumber2;
    private int result;

    protected void findCommonDividerTwoWholePositiveNumbers(int firstNumber, int secondNumber){

        if ((firstNumber < 0) | (secondNumber < 0)){
            System.out.println("You have both negative number. Please try to enter more numbers");
        }
        else if ((firstNumber == 0) & (secondNumber == 0)){
            System.out.println("Please enter don't zero number");
        }

        if (firstNumber<secondNumber){
            secondNumber2 = firstNumber;
            firstNumber1 = secondNumber;
            while (secondNumber2 > 0){
                int p = firstNumber1 % secondNumber2;
                result = secondNumber2;
                secondNumber2 = p;
            }
        }else {
            secondNumber2 = secondNumber;
            firstNumber1 = firstNumber;
            while (firstNumber1 > 0){
                int p = secondNumber2 % firstNumber1;
                result = firstNumber1;
                firstNumber1 = p;
            }
        }

        System.out.println(result);

    }

    protected int summNumbers(int number){
        int sum =0;

        if(number>0){
            while(number>0){
                sum+=number%10;
                number=number/10;
            }
        }
        else if(number<0){
            while(number<0){
                sum+=number%10;
                number=number/10;
            }
        }

        return Math.abs(sum);

    }

    protected boolean findPrimeNumber(int num){
        int factors = 0;
        int j = 1;

        while(j <= num)
        {
            if(num % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);

//        int i =0;
//        int num =0;
//        //Empty String
//        String  primeNumbers = "";
//
//        for (i = 1; i <= 100; i++)
//        {
//            int counter=0;
//            for(num =i; num>=1; num--)
//            {
//                if(i%num==0)
//                {
//                    counter = counter + 1;
//                }
//            }
//            if (counter ==2)
//            {
//                //Appended the Prime number to the String
//                primeNumbers = primeNumbers + i + " ";
//            }
//
//        }
////        System.out.println("Prime numbers from 1 to 100 are :");
////        System.out.println(primeNumbers);
//        return primeNumbers;
    }

    protected int summRowFactorial(int n){
        if (n==0){
            return 1;
        }else
        return n * summRowFactorial(n-1);
    }

    public int sumRowForN(int n) {
        int temp = 1, result = 1;
        for (int i = 2; i <= n; i++) {
            temp = - temp * i;
            result += temp;
        }
        return result;
    }

    protected void howSixNumbersHaveThreeFirstDigitEqualsThreeSecondDigit()
    {
        int sum = 0;
        for(int i = 000001; i <= 999999; i++){
            int number1 = i/100000;
            int number2 = (i/10000)%10;
            int number3 = (i/1000)%10%10;
            int number4 = (i/100)%10%10%10;
            int number5 = (i/10)%10%10%10%10;
            int number6 = i%10%10%10%10;

            if(number1 + number2 + number3 == number4 + number5 + number6){
                sum++;
            }
        }
        System.out.println( sum + " amount number which have equals ...");
    }

    protected int fibonacci(int num){

        if (num <= 1)
            return num;
        else
            return fibonacci(num-1) + fibonacci(num-2);
    }



    protected void arraysOf20NumberFibonacci(int n){
        int[] array = new int[20];
        array[0] = 1;
        System.out.println(0 + " : " + array[0]);
        for (int i = 1; i <= n-1; i++) {
            array[0] = fibonacci(i);
            array[i] = fibonacci(i+1);
            System.out.println(i +" : "+ array[i]);
        }
    }

    protected void arraysOf100ElementForPrime(int n) {
        int[] arr = new int[100];

        for (int i = 0; i <= n; i++) {
            if (findPrimeNumber(i)) {
                arr[i] = i;
                System.out.print(arr[i]);
            }
        }
    }

    protected void twoDimensionalArraySymbolChB(int a, int b){
        char[][] arrChar = new char[a][b];
        for (int j = 0; j < a; j++){
            for (int k =0; k < b; k++){
                if ((j+k)%2==0){
                    arrChar[j][k] = 'Ч';
                }else
                {
                    arrChar[j][k] = 'Б';
                }
//                System.out.println(arrChar[j][k]);
            }
        }

        for (int o = 0; o < a; o++) {
            for (int p = 0; p < b;  p++) {
                System.out.print(arrChar[o][p] + " ");
            }
            System.out.println();
        }

    }

    protected void sixDimensionalArray(){
        int[][][][][][] arr = new int[10][10][10][10][10][10];
        int numbers = 1;
        int array[] = new int[100];
        for (int k =1; k< array.length; k++){
            array[k] = k;
        }

//        for (int a = 0; a< array.length; a ++){
//            System.out.println(array[a]);
//        }

        for (int q= 0; q<10; q++){
            for (int w= 0; w<10; w++){
                for (int e= 0; e<10; e++){
                    for (int r= 0; r<10; r++){
                        for (int t= 0; t<10; t++){
                            for (int y= 0; y<10; y++){
                             arr[q][w][e][r][t][y] = numbers;
                            numbers++;
                            }
                        }
                    }
                }
            }
        }

        for (int q1= 0; q1<10; q1++){
            for (int w2= 0; w2<10; w2++){
                for (int e3= 0; e3<10; e3++){
                    for (int r4= 0; r4<10; r4++){
                        for (int t5= 0; t5<10; t5++){
                            for (int y6= 0; y6<10; y6++){
                                System.out.println(arr[q1][w2][e3][r4][t5][y6] + " ");
                            }
                        }
                    }
                }
            }
            System.out.println();
        }


//        for (int[][][][][] a : arr){
//            System.out.println(Arrays.deepToString(a));
//        }

    }

    protected void createTriangularArrayOfTenRows(){
       for (int j =0; j< 10; j++){
           int C = 1;
           System.out.print(" " +C);
           for (int k =1; k <= j;k++){
               C *= (j-k +1);
               C /= k;
               System.out.print(" " + C);
           }
           System.out.println();
       }
    }


    public static void main(String[] args) {
        Finder f = new Finder();
//        f.findCommonDividerTwoWholePositiveNumbers(2, 6);  //1.1

//        System.out.println(f.summNumbers(-52)); //1.2

//        f.findPrimeNumber();//1.3

//        System.out.println(f.sumRowForN(6));//1.4

//        f.howSixNumbersHaveThreeFirstDigitEqualsThreeSecondDigit();//1.5
//
//        System.out.println(f.fibonacci(20));

//        f.arraysOf20NumberFibonacci(20); //1.6

//        f.arraysOf100ElementForPrime(100); // 1.7

//         f.twoDimensionalArraySymbolChB(5,7); // 1.8

//        f.sixDimensionalArray(); //1.9

        f.createTriangularArrayOfTenRows(); //1.10

//       System.out.println(f.summRowFactorial(6));
    }
}

public class Fibonacci {

    public static void main(String[] args) {


        for (int i = 0; i < 11; i++) {
            long currentNum = fibonacciConstantTime(i);
            if (currentNum == Long.MAX_VALUE){
                System.out.println(String.format("Reached max LONG @ n = %d",i));
                break;
            }
            System.out.println(String.format("n = %d : "+ currentNum,i));
        }

        for (int i = 0; i < 11; i++) {
            long currentNum = fibonacciLoop(i);
            if (currentNum == Long.MAX_VALUE){
                System.out.println(String.format("Reached max LONG @ n = %d",i));
                break;
            }
            System.out.println(String.format("n = %d : "+ currentNum,i));
        }

        System.out.println();
        for (int i = 0; i < 90; i++) {
            long constant = fibonacciConstantTime(i);
            long loop = fibonacciLoop(i);
            boolean result = constant == loop;
            if (result == false){
                System.out.println(String.format("Value at %d does NOT equal.",i));
                System.out.println(String.format("Loop = %d and Constant = %d",loop,constant));
            }
        }


    }

    private static long fibonacciConstantTime(int n){
        return (long) ((1/Math.sqrt(5))*(Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n)));
    }

    private static long fibonacciLoop(int n){
        long[] fibonacci = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            if (i <= 1) {fibonacci[i] = i;}
            else{
                fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
            }
        }
        return fibonacci[fibonacci.length-1];

    }

}

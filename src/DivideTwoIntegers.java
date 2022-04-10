public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(DivideTwoIntegers.getAnswer(7,-3));
        System.out.println(DivideTwoIntegers.getAnswer(10,3));
        System.out.println(DivideTwoIntegers.getAnswerUsingMathFloorDiv(7,-3));
        System.out.println(DivideTwoIntegers.getAnswerUsingMathFloorDiv(10,3));
    }

    private static int getAnswer(int dividend,  int divisor){
        return (int)Math.floor(dividend / divisor);
    }
    private static int getAnswerUsingMathFloorDiv(int dividend,  int divisor){
        return Math.floorDiv(dividend, divisor);
    }
}

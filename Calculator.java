public class Calculator {
    public static void main(String[] args) {
        int a = 15;
        int b = 2;

        System.out.println("Addition:"+add(a,b));
        System.out.println("Addition:"+sub(a,b));
    }
    private static int add (int a, int b){
        return a+b;
    }
    private static int sub (int a, int b){
        return a-b;
    }
    
}
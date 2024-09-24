public class Main {
    public static void main(String[] args) {
        try{
            // Dividir por zero vai dar erro!
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block.");
        }

        catch(ArithmeticException e){
            System.out.println("Arithmetic exception => " + e.getMessage());
        }
    }
}

package algebra;

public class AssociativeProperty {
    
       
    public static void main(String[] args){
        associativeAddition();
        associativeMultiplication(); 
        cancellingFraction();
        cancellingFraction1();
        equalFractions();
        multiplyingFractions1();
        multiplyingFractions2();
        subtrationIsNotCommutative();
        subtrationIsNotAssociative();
        subtration();
        factoringACubicPolynominal();
    }
    
    private static void associativeAddition(){
        int A,B,C;
        
        A = 14;
        B = 45;
        C = 50;
        
        
        int result1 = (A + B) + C;
        int result2 = A + (B + C);
        
        
        boolean result3 = (A + B) + C == A + (B + C);
        
        
        printResult("(A + B) + C = ", result1);
        printResult("A + (B + C) = ", result2);
        printResult("(A + B) + C = A + (B + C) is ", result3);
        
        
    }
    
    private static void associativeMultiplication(){
        int A,B,C;
        
        A = 10;
        B = 20;
        C = 30;
        
        int result1 = (A * B) * C;
        int result2 = A * (B * C);
        
        boolean result3 = (A*B)*C == A*(B*C);   
        
        printResult("(A * B) * C = ", result1);
        printResult("A * (B * C) = ", result2);
        printResult("(A*B)*C == A*(B*C) = ", result3);
        
    }
    
    public static void cancellingFraction(){
        int A,B;
        
        A = 3;
        B = 3;
        
        int result1 = A/B;
        
        A = 4/3;
        B = 4/3;
        
        int result2 = A/B;
        
        A = ((4/3)/(4/3));
        B = ((4/3)/(4/3));
        
        int result3 = A/B;
        
         A = -1221212;
        B = -1221212;
        
        int result4 = A/B;
        
        
//        A = 0;
//        B = 0;
//        
//        int result4 = A/B;
//        
        printResult("3/3 = ", result1);
        printResult("(4/3)/(4/3)",result2);
        printResult("((4/3)/(4/3))/((4/3)/(4/3)) = ",result3);
        printResult("-1221212/-1221212 = ",result4);
        printResult("A/B = 1",true);
      //  printResult("0/0 = ",result4);
        
    }
    
    public static void cancellingFraction1(){
        
        double A,B,C;
        
        A = 2;
        B = 1;
        C = 4;
        
        double result1 = (A/C);
        double result2 = ((A*B)/(A*A));
        double result3 = (A/A)*(B/A);
        double result4 = (B*(B/A));
        double result5 = B/A;
        
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);
        
        System.out.println((double)2/4);
        
        boolean result6 = (result1 == result2) == (result3 == result4) == (result5 == result1);
        
        printResult("(A/C) = ((A*B)/(A*A)) = (A/A)*(B/A) = (B*(B/A)) = B/A  is ",result6);
    }
    
    
    private static void equalFractions(){
        
        double A,B;
                
        A = 20;
        B = 40;
        
        double result1 = (A/B);
        double result2 = ((A/2)/(B/2));
        
        boolean result3 = result1 == result2;
        
        printResult("20/40 = ",result1);
        printResult("((20/2)/(40/2)) = ", result2);
        printResult("(A/B) == ((A/2)/(B/2)) is ",result3);
    
    }
    
    private static void multiplyingFractions1(){
        
        double A,B,C,D;
        
        A = 20;
        B = 12;
        C = 29;
        D = 300;
        
        double result1 = (A/B) * (C/D);
        double result2 = ((A*C)/(B*D));
        
        boolean result3 = result1 == result2;
        
        printResult("(A/B) * (C/D) == ((A*C)/(B*D)) is ", result3);
        
    }
    
    private static void multiplyingFractions2(){
        
        double A,B,C;
        
        A = 10;
        B = 20;
        C = 45;
        
        double result1 = (A*(B/C));
        double result2 = ((A*B)/C);
        boolean result3 = result1 == result2;
        
        printResult("(A*(B/C)) == ((A*B)/C) is ", result3);
        
    }
    
    private static void subtrationIsNotCommutative(){
    
        float A,B;
        
        A = 1;
        B = 2;
        
        boolean result = (A-B) == (B-A);
        
        printResult("(A-B) == (B-A) is ", result);
    }
    
    private static void subtrationIsNotAssociative(){
        
        float A,B,C;
        
        A = 9;
        B = 4;
        C = 1;
        
        float result1 = (A-B)-C;
        float result2 = A - (B-C);
        boolean result3 = result1 == result2;
        
        printResult("(A-B)-C == A - (B-C) is ", result3);
        
    }
    
    private static void subtration(){
        // a - b = a + (-b)
        
        float A,B;  
        
        A = 10;
        B = 3;
        
        boolean result = A - B == A + (-B);
        
        printResult("a - b = a + (-b) is ", result);
    }
    
    private static void factoringACubicPolynominal(){
        // x^3 + 6x^2 - 4x - 24
        // (x^2 - a^2) = (x-a)(x+a)
        float A,B;
        
        A = Math.round((float)Math.random() * 10);
        B = Math.round((float)Math.random() * 10);
       
        
        boolean result = (Math.pow(A,2) - Math.pow(B,2)) == (A-B) * (A+B);
        
        System.out.println(Math.pow(A,2) - Math.pow(B,2) + " = " + (A-B) * (A+B));
        printResult("(x^2 - a^2) = (x-a)(x+a) is ", result);
        
    }
    
    private static void printResult(String formula, Object result){
         System.out.println(formula +  result);
    }
}

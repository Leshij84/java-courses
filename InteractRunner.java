package Calculator;
import java.util.Scanner;

//класс для запуска калькулятора. Поддерживает ввод пользователя.
public class InteractRunner {

    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "no", clean = "yes";
            String first;
            while(!exit.equals("yes")){
                System.out.println("Enter +,-,*,/");
                String operand = reader.next();
                if(clean.equals("yes")){
                System.out.println("Enter first arg :");
                first = reader.next();
                }
                else {
                    first=""+calc.getResult();
//                    System.out.println(first);
                }
                System.out.println("Enter second arg :");
                String second = reader.next();
                if(operand.equals("+"))calc.add(Integer.valueOf(first),Integer.valueOf(second));
                if(operand.equals("-"))calc.dif(Integer.valueOf(first),Integer.valueOf(second));
                if(operand.equals("/"))calc.div(Integer.valueOf(first),Integer.valueOf(second));
                if(operand.equals("*"))calc.mult(Integer.valueOf(first),Integer.valueOf(second));
                System.out.println("Result : " + calc.getResult());
                System.out.println("Exit : yes/no");
                exit = reader.next();
                if(!exit.equals("yes")) {
                    System.out.println("Clean result : yes/no");
                    clean=reader.next();
                    if (clean.equals("yes")) calc.cleanResult();
                }
            }
        }finally{
            reader.close();
        }
    }
}

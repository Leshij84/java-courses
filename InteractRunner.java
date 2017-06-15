package Calculator;

import java.util.Scanner;

/*
класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {

    /*
    * Переменная для чтения данных пользователя
    */
    private Scanner reader;

    /*
    * Переменная для ввода данных
    */

    private String operand, first, second;

    /*
   * консктруктор класса по умолчанию
   */

    public InteractRunner() {
        super();
        this.reader = new Scanner(System.in);
    }


    public static void main(String[] arg) {

        Calculator calc = new Calculator();
        InteractRunner calcRunner = new InteractRunner();
        try {
            String exit = "no", clean = "yes";
            while (!exit.equals("yes")) {
                calcRunner.data(calcRunner, calc, clean);
                calcRunner.calculation(calc, calcRunner.operand, Integer.valueOf(calcRunner.first), Integer.valueOf(calcRunner.second));
                System.out.println("Exit : yes/no");
                exit = calcRunner.reader.next();
                if (exit.equals("yes")) break;
                System.out.println("Clean result : yes/no");
                clean = calcRunner.reader.next();
            }
        } finally {
            calcRunner.reader.close();
        }
    }

    /*
    выполняет вычисление взависимости от выбранного арифмического знака
    */
    private void calculation(Calculator calc, String operand, int arg1, int arg2) {
        if (operand.equals("+")) calc.add(arg1, arg2);
        if (operand.equals("-")) calc.dif(arg1, arg2);
        if (operand.equals("/")) calc.div(arg1, arg2);
        if (operand.equals("*")) calc.mult(arg1, arg2);
        System.out.println("Result : " + calc.getResult());
    }

    /*
    * ввод данных в командной строки
    */
    private void data(InteractRunner calcRunner, Calculator calc, String clean) {
        System.out.println("Enter +,-,*,/");
        calcRunner.operand = reader.next();
        if (clean.equals("no")) {
            calcRunner.first = String.valueOf(calc.getResult());
        } else {
            calc.cleanResult();
            System.out.println("Enter first arg :");
            calcRunner.first = reader.next();
        }
        System.out.println("Enter second arg :");
        calcRunner.second = reader.next();
    }


}

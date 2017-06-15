
/**
 * Created by Leshij on 14.06.2017.
 * класс реализует калькулятор
 */
package Calculator;

public class Calculator {

    /*
    результат вычисления.
    */
    private int result;

    /**
     * Суммируем аргументы.
     */
    public void add(final int arg1,final int arg2) {
        this.result = arg1 + arg2;
    }

    /**
     * вычитаем аргументы
     */
    public void dif(final int arg1,final int arg2) {
        this.result = arg1 - arg2;
    }

    /**
     * делим аргументы
     */
    public void div(int arg1, int arg2) {
        this.result = arg1 / arg2;
    }

    /**
     * умножаем аргументы
     */
    public void mult(int arg1, int arg2) {
        this.result = arg1 * arg2;
    }

    /**
     * Получить результат
     *
     * @return результат вычисления.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * Очистить результат вычисления.
     */
    public void cleanResult() {
        this.result = 0;
    }
};

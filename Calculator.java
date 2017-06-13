package Calculator;

/**
 * Created by Leshij on 14.06.2017.
 */
//класс реализует калькулятор
public class Calculator{
    //результат вычисления.
    private int result;
    /**
     Суммируем аргументы.
     @param params аргументы суммирования.
     */
    public void add(int ... params) {
        for (Integer param: params){
            this.result += param;
        }
    }
    public void dif(int a,int b) {
        this.result=a-b;
    }

    public void div(int a,int b) {
        this.result=a/b;
    }

    public void mult(int a,int b) {
        this.result=a*b;
    }
    /**
     Получить результат
     @return результат вычисления.
     */
    public int getResult(){
        return this.result;
    }
    /**
     Очистить результат вычисления.
     */
    public void cleanResult(){
        this.result = 0;
    }

};

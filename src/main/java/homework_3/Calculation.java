package homework_3;
/* Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
   Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */


public class Calculation {

    public <E extends Number, T extends Number> double sum(E a, T b){

        return a.doubleValue() + b.doubleValue();
    }


    public <E extends Number, T extends Number> double multiply(E a, T b){

        return a.doubleValue() * b.doubleValue();
    }

    public <E extends Number, T extends Number> double divide(E a, T b){

        return a.doubleValue() - b.doubleValue();
    }

    public <E extends Number, T extends Number> double subtract(E a, T b){

        return a.doubleValue() / b.doubleValue();
    }



}

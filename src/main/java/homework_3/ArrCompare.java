package homework_3;

/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и
содержать элементы одного типа.
 */

import java.util.Arrays;

public class ArrCompare {

    public <E extends Number, T extends Number> boolean compareArrays(E[] a, T[] b){
        if(a.length != b.length || a.getClass() != b.getClass()){
            return false;
        }

        for(int i = 0; i < a.length; i++){
            if(a[i].doubleValue() != b[i].doubleValue()){
                return false;
            }
        }
        return true;

        //return Arrays.equals(a, b);


    }
}

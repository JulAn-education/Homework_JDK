package homework_3;

import java.io.DataInputStream;

public class Program {

    public static void main(String[] args) {
        String t = "string";
        DataInputStream v = new DataInputStream(System.in);
        Integer k = 5;
        MegaClass<Comparable, DataInputStream, Number> megaObject = new MegaClass<>(t, v, k);
        megaObject.printTypes();

        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 29384759823476L;
        MyList<Number> myList = new MyList<>(numArray);
        myList.printList();

        Integer num = 5;
        myList.addElement(num);

        myList.printList();
        System.out.println("size:" + myList.getSize());
        System.out.println("array length:" + myList.getArrayLength());

        myList.removeElement(2);
        myList.printList();
        System.out.println("size:" + myList.getSize());
        System.out.println("array length:" + myList.getArrayLength());

        for (Number number :
                myList) {
            System.out.println(number);
        }
    }



}

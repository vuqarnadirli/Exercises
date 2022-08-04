package main;

import utility.MathUtil;

public class Main {
    public static void main(String[] args) {
        // 1. 0 - dan verilmish edede qeder butun 2 - ye bolune bilen ededleri chap et.
//        MathUtil.find(50, 3);
//        MathUtil.findBy2(6);
        //------------------------------------------
        //2. 0-dan verilmish edede qeder sade ededleri chap et.

//        MathUtil.simpleNumbers(100);

        //3.Verilmish ededin butun ededleri cemini tap.
//        int result=MathUtil.total(1273456);
//        System.out.println("Total = " + result);
        //-------------------------------------

        //4. 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek
//        int a = 5;
//        int b = 3;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println(a);
//        System.out.println(b);
        //--------------------------------------------------------------------

        //5. Ededin reqemlerinin sayini tapin.//12345
//        int count=MathUtil.countDigit(126345);
//        System.out.println(count);
        //--------------------------------------------------------------------

        // 6.Fordan istifade etmeden Faktorial <- cox chetindir bu :) ama ugurlar
//        int factorial=MathUtil.factorial(5);
//        System.out.println(factorial);
        //--------------------------------------------------------------------

//        7.Verilen string-in tersi ile duzunun bir birine beraber olub olmadigi.

//        String s = "so661os";
//        boolean control = MathUtil.strControl(s);
//        System.out.println(control);

        //9.Method 1 reqem, bir simvol ve 1 boolean qebul edir.
        //a qeder c simvolunu chap etsin. altAlta dəyişəni true-dursa altAlta eks halda yan yana chap etsin

//        foo(5,'c',false);

//        10.method 3 reqem qebul edir a,b,c,
//        a-dan b-ye qeder butun ededleri c qeder quvvete yukseldir Math.pow-dan istifadə edərək
        MathUtil.pow(1, 5, 2);

    }

    public static void foo(int a, char ch, boolean control) {
        for (int i = 0; i < a; i++) {
            if (control) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
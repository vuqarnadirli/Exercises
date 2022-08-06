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
//----------------------------------------------------------------------------
//        8.Daxil edilen reqemlerin tersi ile duzunun eyni olub olmadigini teyin eden method yazin
//
//         Meselen 545 ve 545 duzdur amma 574 475 sehvdir
//        System.out.println( checkPoly(5145));


        //9.Method 1 reqem, bir simvol ve 1 boolean qebul edir.
        //a qeder c simvolunu chap etsin. altAlta dəyişəni true-dursa altAlta eks halda yan yana chap etsin

//        foo(5,'c',false);

        //--------------------------------------------------------------------

//        10.method 3 reqem qebul edir a,b,c,
//        a-dan b-ye qeder butun ededleri c qeder quvvete yukseldir Math.pow-dan istifadə edərək
        //MathUtil.pow(1, 5, 2);
        //--------------------------------------------------------------------

        //12.methoda daxil edilen reqemin musbet, menfi yoxsa 0 oldugunu teyin eden method yazin.
        //Eger menfidirse method geriye -1 qaytarsin, 0-dirsa 0, musbetdirse +1 qaytarsin.

        //System.out.println(findSign(0));

        //--------------------------------------------------------------------

        //13. Methoda 4 reqem daxil edilir eger bu reqemlerden her hansisa 2-si bir birine beraberdirse geriye true qaytarsin

//        int a = 20;
//        int b = 0;
//        int c = 20;
//        int d = 50;
//        boolean control;
//        control=compare4Number(a,b,c,d);
//        System.out.println(control);
        //--------------------------------------------------------------------

//        14. Methoda 4 reqem daxil edilir.a,b,c,d eger ededler artan ardicilliqla daxil edilibse geriye true qaytarsin eks halda false

//        int a, b, c, d;
//        a = 11;
//        b = 12;
//        c = 10;
//        d = 16;
        // System.out.println(checkIncrement(a,b, c,d));

        //--------------------------------------------------------------------


        //15. Method bir String ve bir int qebul edir ve hemin String-in hemin index-inde olan simvolunu qaytarsin.
        //
        //Meselen: Salam, 4 a herfini return edecek
        //System.out.println(returnChar("salam", 6));
        //--------------------------------------------------------------------

        //16. Method 2 String qebul edir ve onlarin beraber olub olmadigini return edir true ve ya false
        //System.out.println(compareString("Salam","Salam"));
        //--------------------------------------------------------------------

        //17.Method String s, char c, int count qebul edir. S-i count qeder c ile birleshdirir ve geriye return edir
        //
        //foo(String s, char c, int count){}
        //
        //foo(“Soz”, ‘c’, 5); -> Sozccccc
        //System.out.println(concatString("Soz", 'c', 5));

        //18. Method 3 String qebul edir. String a, String b, String c. A ve b-nin ichinde c varsa onda true eks halda false
//        String a = "Salam necesen togo";
//        String b = " Haradasan togo";
//        String c = "togo";
//
//        System.out.println(checkString(a, b, c));
//----------------------------------------------------------------------------

//        19.method String a, int begin, int end daxil edilir. A-nin begin ve end arasini alt alta chap edir.

//        String a="Hello World";
//        printChar(a,3,7);
        //--------------------------------------------------------------------

//        20. 2 soz daxil edilir uzunlugu boyuk olan String geriye return edilir.
//
//          “Hello”,Hello World” ->Hello World return olacaq
        //System.out.println(checkMaxLength("Hello","Hello World"));

        //--------------------------------------------------------------------

//        21.Ele bir method yazin ki: HeLLo WorlD-> chevrilsin olsun hEllO wORLd.
//
//Yeni boyuk herfler kichikle, kichik herfler boyukle evez olsun
        String s = "HeLLo WorLD";
        System.out.println(changeCharCase(s));
        //--------------------------------------------------------------------

//        22.”     Salam necesen ishler nece gedir      “ metnini “Salam necesen ishler nece gedir” halina getirin.

//        String s = "     Salam necesen ishler nece gedir      ";
//        System.out.println(trimText(s));


    }

    //8
    public static boolean checkPoly(int a) {
        int qaliq = 0;
        int temp = 0;
        int temp2 = a;

        while (a > 0) {
            qaliq = a % 10;
            temp = temp * 10 + qaliq;
            a = a / 10;
        }
        if (temp2 == temp)
            return true;
        return false;
    }

    //10
    public static void foo(int a, char ch, boolean control) {
        for (int i = 0; i < a; i++) {
            if (control) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }

    //12
    public static int findSign(int a) {
        if (a == 0) {
            return 0;
        }
        if (a > 1) {
            return 1;
        } else {
            return -1;
        }
    }

    //13
    public static boolean compare4Number(int a, int b, int c, int d) {
        if (a == b || a == c || a == d) {
            return true;
        }
        if (b == c || b == d) {
            return true;
        }
        if (c == d) {
            return true;
        }
        return false;
    }

    //14
    public static boolean checkIncrement(int a, int b, int c, int d) {
        if (a < b && b < c && c < d) {
            return true;
        }
        return false;
    }

    //15
    public static char returnChar(String s, int index) {
        return s.charAt(index - 1);
    }

    //16
    public static boolean compareString(String s1, String s2) {
        return s1.equals(s2);
    }

    //17
    public static String concatString(String s, char ch, int count) {
        for (int i = 0; i < count; i++) {
            s += ch;
        }
        return s;
    }

    //18
    public static boolean checkString(String a, String b, String c) {
        if (a.contains(c) && b.contains(c)) {
            return true;
        }
        return false;
    }

    //19
    public static void printChar(String a, int begin, int end) {
        for (int i = begin; i < end; i++) {
            System.out.println(a.charAt(i));
        }
    }

    //20
    public static String checkMaxLength(String a, String b) {
        if (a.length() > b.length())
            return a;
        return b;
    }

    //21
    public static String changeCharCase(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                temp += Character.toLowerCase(s.charAt(i));
            } else {
                temp += Character.toUpperCase(s.charAt(i));
            }
        }
        return temp;
    }

    //22
    public static String trimText(String s) {
        return s.trim();
    }
}
public class Programmedecalcul {

    public static void main(String[] args) {
        int a,b,add,sous,divi,multi;
        a = 10;
        b= 5;
        add = addition(a,b);
        sous = soustraction(a,b);
        divi = division(a,b);
        multi = multiplication(a,b);


        System.out.println("soustraction =" + sous );
        System.out.println("addition = " + add);
        System.out.println("division =" + divi);
        System.out.println("multiplication =" +  multi);
    }


        private static int addition (int a, int b){


            int c;
            c = a + b;
            return c;
    }


        private static int soustraction (int a, int b){

            int c;
            c = a - b;
            return c;
    }


        private static int division (int a, int b){

            int c;
            c = a / b;
            return c;
    }



        private static int multiplication (int a, int b){



        int c;
        c= a * b;
        return c;

}

}











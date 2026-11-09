public class first {
    static int power(int base, int exponent){
        if (exponent < 0) {
            System.out.println("Ошибка: Отрицательный показатель");
            return 0;
        }
        else if (exponent == 0){
            return 1;
        }
        else {
            return base * power(base, exponent - 1);
        }
    }

    static void output(){
        System.out.println(power(2,0));
        System.out.println(power(2,3));
        System.out.println(power(5,1));
        System.out.println(power(-2,3));

        System.out.println(power(2,-1));
    }
}

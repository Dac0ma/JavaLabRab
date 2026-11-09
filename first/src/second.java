public class second {
    static int signal(int first, int difference, int n){
        if (n == 0) {
            return first;
        }
        else {
            return signal(first, difference, n - 1) + difference;
        }
    }
    static void output(){
        System.out.println("Результат 1: " + signal(12, -3, 4));
        System.out.println("Результат 2: " + signal(5, 2, 3));
        System.out.println("Результат 3: " + signal(7, 100, 0));
    }
}

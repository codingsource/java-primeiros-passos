public class Fatorial {
    public static void main(String[] args) {
        int num = 40;
        long fatorial = 1; 
        for(int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
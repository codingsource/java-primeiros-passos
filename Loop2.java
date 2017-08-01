public class Loop2 {
    public static void main(String[] args) {
        int count = 0;
        int x = 0;

        while(count <= 1000) {
            count++;
            x += count;
            
            System.out.println(x);
        }

    }        
}
import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p, q;

        System.out.print("Masukkan ekspresi matematika (infix) : ");
        q = sc.nextLine();
        q = q.trim();
        q = q + ")";

        int total = q.length();

        Postfix22 post = new Postfix22(total);
        p = post.konversi(q);
        
        System.out.println("Postfix : " + p);
    }
}
import java.util.Scanner;

public class TenWordsWisdom {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t >= 1) {
            while(t-->0) {
                int n = in.nextInt();
                int wq = -1;
                int wl = 0;
                for (int i = 0; i < n; i++) {
                    int len = in.nextInt();
                    int qlty = in.nextInt();
                    if (len <= 10) {
                        if(qlty>wl)
                        {
                            wl=qlty;
                            wq=i+1;
                        }

                    }
                }
                System.out.println(wq);
            }
        }
    }



}

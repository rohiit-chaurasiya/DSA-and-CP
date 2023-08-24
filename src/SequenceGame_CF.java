import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame_CF {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int kiet = in.nextInt();
        if (kiet >= 1) {
            while (kiet-- > 0) {
                int lenn = in.nextInt();

                if (lenn >= 1) {
                    ArrayList<Long> arr = new ArrayList<>();
                    for(int i=0;i<lenn;i++)
                    {
                        arr.add(in.nextLong());
                    }

                    StringBuilder result=new StringBuilder();
                    result.append(arr.get(0)+" ");
                    Long prev=arr.get(0);
                    int cnt=1;
                    for(int i=1;i<lenn;i++)
                    {
                        Long temp=arr.get(i);
                        if(prev<=temp)
                        {
                            result.append(temp+" ");
                            prev=temp;
                            cnt+=1;
                        }
                        else{
                            result.append(temp+" "+temp+" ");
                            prev=temp;
                            cnt+=2;
                        }
                    }
                    System.out.println(cnt);
                    System.out.println(result.toString());


                }

            }

        }
    }
}

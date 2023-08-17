import java.util.*;

public class UnitedWeStand_CF {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int kiet = in.nextInt();
        if (kiet >= 1) {
            while (kiet-- > 0) {
                int len = in.nextInt();
                if(len>=2)
                {
                    ArrayList<Integer>arr=new ArrayList<>();
                    for(int i=0;i<len;i++)
                    {
                        arr.add(in.nextInt());
                    }
                    ArrayList<Integer> b = new ArrayList<>();
                    ArrayList<Integer> c = new ArrayList<>();

                    boolean possible = true;
                    int val=arr.get(0);
                    for(int i=1;i<len;i++)
                    {
                        if(arr.get(i)!=val)
                        {
                            possible=false;
                        }

                    }

                    if(possible==true)
                    {
                        System.out.println("-1");
                    }
                    else{
                        Collections.sort(arr);
                        int last=arr.get(len-1);
                        String str1="";
                        String str2="";
                        str2=str2+""+arr.get(len-1)+" ";

                        int temp=1;
                        for(int i=len-2;i>=0;i--)
                        {
                            if(arr.get(i)==last)
                            {
                                str2=str2+""+arr.get(i)+" ";
                                temp+=1;
                            }
                            else{
                                str1=str1+""+arr.get(i)+" ";
                            }

                        }

                        int temp2=len-temp;
                        System.out.println(temp2+" "+temp);
                        System.out.println(str1);
                        System.out.println(str2);

                    }

                }

            }
        }
    }
}

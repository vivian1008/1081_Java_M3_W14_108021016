import java.util.*;
public class M3Q18{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =Integer.parseInt(scn.nextLine());
        for(int i=0; i<n; i++){
            String str[] =scn.nextLine().split(" ");
            int len = str.length;
            int data[] = new int[len];
            for(int j=0; j<len; j++){
                switch(str[j].charAt(0)){
                    case 'C':
                    data[j]=0;
                    break;

                    case'D':
                    data[j]=13;
                    break;

                    case'H':
                    data[j]=26;
                    break;

                    case'S':
                    data[j]=39;
                    break;
                }
                data[j]=Integer.parseInt(str[j].subString(i));
            }
        }
    }
}
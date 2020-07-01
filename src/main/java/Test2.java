/**
 * @author steng
 * @description
 * @date 2020-07-01 12:23 上午
 **/
public class Test2 {

    public static int reverse(int x) {
        Integer d = x;
        String str = d.toString();
        char[] s = str.toCharArray();
        int i =0;

        if(s[0] == '-'){
            i = 1;
        }

        for( int j = s.length-1 ; i< s.length/2;i++,j--){
            char p = s[i];
            char l = s[j];

            s[i] = l;
            s[j] = p;
        }
        str = new String(s);

        Integer result =  Integer.parseInt(str);
        return  result;

    }

    public static void main(String[] args) {
        int k = -10;
        k = reverse(k);
        System.out.println(k);

    }
}

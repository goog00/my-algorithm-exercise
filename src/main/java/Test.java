/**
 * @author steng
 * @description
 * @date 2020-06-27 7:23 下午
 **/
public class Test {
    public static void main(String[] args) {
        int k = re(11);
        System.out.println(k);

        int k2 = re2(11);
        System.out.println(k2);

        int k3 = re3(11);
        System.out.println(k3);



        char[] chars = new char[]{'a'};
        String str = "";
        str.valueOf(chars[0]);
    }

    public static int re(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return re(n-1) + re(n-2);
    }




    public static int re2(int n){
        int fib[] = new int[n];

        if(n == 0 || n == 1) return  1;
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i<n;i++){

            fib[i] = fib[i-1] + fib[i-2];

        }
        return fib[n-1];

    }

    public static int re3(int n){
        int fib[] = new int[n];
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        if(fib[n] != 0){
            return fib[n];
        }
        return fib[n] = re3(n-1) + re3(n-2);



    }
}

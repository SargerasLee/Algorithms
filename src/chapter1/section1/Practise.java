package chapter1.section1;

import com.sun.org.apache.regexp.internal.REUtil;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

/**
 * @ClassName Practise
 * @Description TODO
 * @Author lichanghao
 * @Date 2021/1/1 14:51
 * @Version 1.0
 **/
public class Practise {
    @Test
    public void q6(){
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 fn=fn-1+fn-2 斐波那契数列
        int f=0;
        int g=1;
        for (int i=0;i<=15;i++){
            StdOut.print(f+" ");
            f=f+g;
            g=f-g;
        }
    }
    @Test
    public void q7(){
        //牛顿迭代法求平方根
        double t=9.0;
        while (Math.abs(t-9.0/t)>0.00000000009){
            t=(9.0/t+t)/2.0;
        }
        StdOut.printf("%.10f\n",t);

        //1+2+。。。+999
        int sum=0;
        for (int i=1;i<1000;i++){
            for (int j=0;j<i;j++){
                sum++;
            }
        }
        StdOut.println(sum);
        //1000+ 100o+...1000 log2 1024=10 1024>1000
        int s=0;
        for (int i=1;i<1000;i*=2){
            for (int j=0;j<1000;j++){
                s++;
            }
        }
        StdOut.println(s);
    }

    @Test
    public void q16(){
        StdOut.println(exR1(6));
    }

    @Test
    public void q18(){
        StdOut.println(myStery(2,25));
        StdOut.println(myStery(3,11));
        StdOut.println(myStery2(2,25));
        StdOut.println(myStery2(3,11));
    }

    @Test
    public void q19(){
        //StdOut.println(Fibonacci(10));
        //StdOut.println(Fibonacci2(20));
        StdOut.println(Fibonacci3(40));
    }

    @Test
    public void q20(){
        StdOut.println(LnFactorial(10));
    }

    @Test
    public void q24(){
        int x = euclid(1111111,1234567);
        System.out.println(x);
    }

    //1.1习题24
    public static int euclid(int a,int b){
        //欧几里得算法 求最大公约数
        //若b=0；最大公约数为a，否则 ，a与b 的最大公约数就是 b 与 a%b 的最大公约数
        System.out.println(a+","+b);
        if(b==0){
            return a;
        }else{
            return euclid(b,a%b);
        }
    }
    public double LnFactorial(int N){
        //计算 ln N!
        double E =Math.E;
        long sum=1;
        for(int i=N;i>=1;i--){
            sum*=i;
        }
        return Math.log(sum);
    }

    public static long Fibonacci(int N){
        if(N==0) return 0;
        if(N==1) return 1;
        return Fibonacci(N-2)+Fibonacci(N-1);
    }

    public static long Fibonacci2(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        long[] arr=new long[n+1];
        arr[0]=0;arr[1]=1;
        for(int i=2;i<n+1;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        return arr[n];
    }

    public static long Fibonacci3(int n){
        //0 1 1 2 3 5 8
        //p q
        //temp=p;p=q;q=temp+q;
        if(n==0) return 0;
        if(n==1) return 1;
        int p=0;
        int q=1;
        int temp;
        for(int i=2;i<n+1;i++){
            temp=p;
            p=q;
            q=temp+q;
        }
        return q;
    }

    public static int myStery(int a,int b){
        //a*b
        if(b==0) return 0;
        if(b%2==0) return myStery(a+a,b/2); //b偶数a*2 * b/2
        return myStery(a+a,b/2)+a;//b奇数 a*2 * b/2 +a
    }
    public static int myStery2(int a,int b){
        // a^b
        if(b==0) return 1;
        if(b%2==0) return myStery2(a*a,b/2); //b偶数a^2  * a^(b/2)
        return myStery2(a*a,b/2)*a;//b奇数  a^2  * a^(b/2) *a
    }
    public static String exR1(int n){
        if(n<=0) return "";
        return exR1(n-3)+n+exR1(n-2)+n;
    }
}

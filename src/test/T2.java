package test;

import java.util.*;

public class T2 {
    public static long getMinimumTime(int[] t, int[] p, long k) {
        int n=t.length;
        Arrays.sort(t);
        Integer[] q=new Integer[n];
        for(int i=0;i<n;i++) q[i]=p[i];
        Arrays.sort(q,Collections.reverseOrder());
        long l=0,r=(long)1e18,a=r;
        while(l<=r){
            long m=(l+r)/2,x=0;
            for(int i=0;i<n;i++){
                long mx=m/q[i];
                if(t[i]>mx) x+=t[i]-mx;
                if(x>k) break;
            }
            if(x<=k){ a=m; r=m-1; }
            else l=m+1;
        }
        return a;
    }

    public static long getMinTime(ArrayList<Integer> s, ArrayList<Integer> e, long m){
        int n=s.size(); long[][] ev=new long[2*n][2]; int k=0;
        for(int i=0;i<n;i++){
            long a=s.get(i),b=e.get(i); if(a>b){long t=a;a=b;b=t;}
            ev[k][0]=a; ev[k][1]=1; k++; ev[k][0]=b+1; ev[k][1]=-1; k++;
        }
        Arrays.sort(ev,0,k,(x,y)->Long.compare(x[0],y[0]));
        long a=0,p=ev[0][0],t=0;
        for(int i=0;i<k;i++){
            long x=ev[i][0],l=x-p;
            if(l>0 && a>0){
                long add=a*l;
                if(t+add>=m) return p+(m-t+a-1)/a-1;
                t+=add;
            }
            a+=ev[i][1]; p=x;
        }
        return -1;
    }

    public static void main(String[] args){
        ArrayList<Integer> s=new ArrayList<>(Arrays.asList(4,6,3));
        ArrayList<Integer> e=new ArrayList<>(Arrays.asList(3,5,2));
        System.out.println(getMinTime(s,e,3)); // Output: 10
    }


}

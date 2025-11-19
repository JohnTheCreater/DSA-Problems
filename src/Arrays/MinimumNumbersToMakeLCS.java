//package Arrays;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class MinimumNumbersToMakeLCS {
//
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] A = new int[n];
//        for(int i = 0 ; i <  n ; i++)
//            A[i] = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[] B = new int[m];
//        for(int i = 0 ; i < m ; i++)
//            B[i] = scanner.nextInt();
//
//        int min = n;
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i  < n ; i++)
//        {
//            int matchedLength = findMaximumMatching(map);
//            int maxMatched = 0;
//            for(Integer key : map.keySet())
//            {
//                int value = map.get(key);
//                if (key < i && value > maxMatched )
//                    maxMatched = value;
//            }
//            int rem = maxMatched - n;
//            if(maxMatched == 0) rem += i;
//            else
//            if(matchedLength - n + i < min ) min = matchedLength - n + i;
//
//        }
//        System.out.println(min);
//    }
//
//    private static int findMaximumMatching() {
//
//
//    }
//}

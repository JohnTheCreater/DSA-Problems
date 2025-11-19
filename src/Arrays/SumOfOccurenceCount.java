package Arrays;

public class SumOfOccurenceCount {

    public static  void main(String[] args)
    {
        int[] arr = {1,1,2,2,2,3,4};

        int[] freq = new int[100001];
        int max = 0 , maxFreq = 0;
        for(int num : arr)
        {
            if(num > max) max = num;
            freq[num]++;
            if(freq[num] > maxFreq) maxFreq = freq[num];
        }
        int[] hash = new int[maxFreq + 1];
        for(int i = 0 ; i <= max ;i++)
        {
            if(freq[i] == 0) continue;

            hash[freq[i]] += i * freq[i];
        }

        for(int i = 0 ; i <= maxFreq ;i++)
        {
            if(hash[i] == 0) continue;
            System.out.println(i +" -> "+hash[i]);
        }
    }
}

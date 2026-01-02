class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, max = 0;
        int[] count = new int[100001];
        int type = 0;

        for(int right = 0;right<fruits.length; right++){
            if(count[fruits[right]]==0)
            type++;

            count[fruits[right]]++;

            while(type>2){
                count[fruits[left]]--;

                if(count[fruits[left]]==0)
                type--;

                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
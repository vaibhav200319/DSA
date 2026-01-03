class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (x,y) -> y[1] - x[1]);
        int unit = 0;

        for(int i=0; i<boxTypes.length && truckSize>0; i++){

            int BB = boxTypes[i][0];
            int BBB = boxTypes[i][1];

            while(BB>0 && truckSize>0){
                unit += BBB;
                BB--;
                truckSize--;
            }
        }
        return unit;
    }
}
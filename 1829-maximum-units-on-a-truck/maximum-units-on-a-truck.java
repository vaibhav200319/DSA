class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (x,y) -> y[1] - x[1]);

        int units = 0;

        for(int i=0; i<boxTypes.length && truckSize > 0; i++){

            int boxes = boxTypes[i][0];
            int preBox = boxTypes[i][1];

            while(boxes > 0 && truckSize > 0){
                units += preBox;
                boxes--;
                truckSize--;
            }
        }
        return units;
    }
}
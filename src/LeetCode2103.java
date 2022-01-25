public class LeetCode2103 {

    static class Ring{
        private int red = 0;
        private int green =0;
        private int blue =0;

        public void addRed(int num){
            this.red+=num;
        }
        public void addGreen(int num){
            this.green+=num;
        }
        public void addBlue(int num){
            this.blue+=num;
        }
        public int getRed(){
            return red;
        }
        public int getGreen(){
            return green;
        }
        public int getBlue(){
            return blue;
        }
    }

    public static int countPoints(String rings) {
        // Create an array of rings
        Ring[] myRings = new Ring[10];
        for (int i = 0;i < myRings.length;i++){
            myRings[i] = new Ring();
        }

        // Temp var for color and position
        char currColor;
        int currPosition;

        // Add rings to each rod
        for (int i=0;i < rings.length();i+=2){
            currColor = rings.charAt(i);
            currPosition = Character.getNumericValue(rings.charAt(i+1));
            System.out.println(currPosition);
            if (currColor == 'R'){
                myRings[currPosition].addRed(1);
            }
            else if (currColor == 'G'){
                myRings[currPosition].addGreen(1);
            }
            else {
                myRings[currPosition].addBlue(1);
            }
        }

        // Count rods w/ 1 of each color
        int myResult = 0;
        for (int i = 0;i < myRings.length;i++){
            if (myRings[i].getBlue() > 0 && myRings[i].getRed() > 0 && myRings[i].getGreen() > 0){
                myResult++;
            }
        }
        return myResult;
    }

    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }

}

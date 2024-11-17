public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int h = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int a = Integer.parseInt(args[2]);
        int totalM = ((h * 60) + m + a);
        int totalH = (totalM / 60);
        int newH = totalH % 24;
        int newM = totalM - ((totalH) * 60);

        String minTwoDig = "";
        String hourTwoDig = "";
        if (newM < 10) {
            minTwoDig = ("0" + newM); 
        }
        else{
            minTwoDig = String.valueOf(newM);
        }
        if (newH < 10) {
        hourTwoDig = ("0" + newH);   
        }
        else {
            hourTwoDig = String.valueOf(newH);
        }
        System.out.println(hourTwoDig + ":" + minTwoDig);

    }

}

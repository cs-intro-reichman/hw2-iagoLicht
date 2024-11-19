public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int h = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int m = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int a = Integer.parseInt(args[1]);
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
        if (hourTwoDig.length() == 4) {   
            String formatted = hourTwoDig.substring(0, 2) + ":" + hourTwoDig.substring(2);
            System.out.println(formatted);
        }
        System.out.println(hourTwoDig + ":" + minTwoDig);

    }

}

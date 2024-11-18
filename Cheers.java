// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Replace this comment with your code
                String s = args[0].toUpperCase();
                int n = Integer.parseInt(args[1]);
                String vowels = "AEFHILMNORSX";
                for (int i = 0; i < s.length(); i++) {
                        char current = s.charAt(i);
                        if (vowels.indexOf(current) >= 0) {
                                System.out.println("Give me an " + current + ": " + current + "!");
                        } else {
                                System.out.println("Give me a  " + current + ": " + current + "!");
                        }
                        }
                        System.out.println("What does that spell?");
                
                        for (int i = 0; i < n; i++) {
                                System.out.println(s + "!!!");
                        }
                }
        }

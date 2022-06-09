import java.util.*;
public class app {
    public static void main(String [] args) {
        while (true) {
            //Storing user input
            int user_input;
            //Defining list to store the perpendicular and hypotenuse
            List<Integer> all_results = new ArrayList<Integer>();
            //Syntax to get input from user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the hypotenuse: \u221A");
            user_input = sc.nextInt();
            //Adding user input to be calculated
            all_results.add(user_input);
            all_results.add((int)0);
            //Calculating perpendicular and hypotenuse for the given user input
            if (Math.round(Math.sqrt(all_results.get(0))) != Math.sqrt(all_results.get(0))) {//If the user input is a perfect square
                for (int i = 0; i < all_results.size(); i++) {
                    while (Math.round(Math.sqrt(all_results.get(i))) != Math.sqrt(all_results.get(i))) {// Looping until the user input is a perfect square
                        List<Integer> result = new ArrayList<Integer>();
                        List<String> no = new ArrayList<String>();
                        result = numberline(all_results.get(i));
                        System.out.println(result);
                        //Checking is the result perpendicular and hypotenuse are perfect squares
                        for (int j = 0; j < result.size(); j++) {
                            if (Math.round(Math.sqrt(result.get(j))) == Math.sqrt(result.get(j))) {
                                no.add(Integer.toString((int)(Math.sqrt(result.get(j)))));
                            } else {
                                no.add("\u221A" + result.get(j));
                            }
                        }
                        //Printing to the user the results
                        System.out.println("The altitude and base respectively for \u221A" + all_results.get(i) + " are: [" + no.get(0) + "," + no.get(1) + "]");
                        all_results = result;
                    }
                }
            }else {
                System.out.println("The altitude and base respectively for \u221A" + user_input + " are: [" + (int)Math.sqrt(all_results.get(0)) + "," + all_results.get(1) + "]");

            }

        }
    }
    //The function that calculates hypotenuse and perpendicular of a particular number
    public static List<Integer> numberline(int a) {
        //Defining variables and required lists
        int smart_sum, sum;
        // Stores all the possible values of hypotenuse and perpendicular
        List<Integer> all_sums = new ArrayList<Integer>();
        //Stores the recommended values of hypotenuse and perpendicular
        List<Integer> returner = new ArrayList<Integer>();
        List<ArrayList<Integer>> all_perpendicular_and_hypotenuse = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<=a;i++) {
            for (int j=0;j<=i;j++) {
                if (i+j==a) {
                    ArrayList<Integer> perpendicular_and_hypotenuse = new ArrayList<Integer>();
                    if ((int)(Math.sqrt(i)) == Math.sqrt(i) || (int)(Math.sqrt(j)) == Math.sqrt(j)) {
                        //Defining variables
                        int perpendicular,hypotenuse;
                        // Calculating and storing values of perpendicular and hypotenuse
                        if ((int)(Math.sqrt(i)) == Math.sqrt(i)) {
                            perpendicular = (int)(Math.sqrt(i));
                        } else {
                            perpendicular = i;
                        }
                        if (Math.round(Math.sqrt(j)) == Math.sqrt(j)) {
                            hypotenuse = (int)(Math.sqrt(j));
                        } else {
                            hypotenuse = j;
                        }
                        //Calculating and storing sum of perpendicular and hypotenuse
                        sum = (perpendicular+hypotenuse)+0;
                        perpendicular_and_hypotenuse.add(i);
                        perpendicular_and_hypotenuse.add(j);
                        all_sums.add(sum);
                        all_perpendicular_and_hypotenuse.add(perpendicular_and_hypotenuse);
                    }
                }
            }
        }
        //Finding the recommended values of hypotenuse and perpendicular
        smart_sum = all_sums.get(0);
        for (int i=0;i<all_perpendicular_and_hypotenuse.size();i++) {
            smart_sum = Math.min(smart_sum, all_sums.get(i));
        }
        //Storing the recommended values to return it
        for(int i=0;i<all_perpendicular_and_hypotenuse.size();i++) {
            if (smart_sum == all_sums.get(i)) {
                if (all_perpendicular_and_hypotenuse.get(i).get(1) == 0) {
                    if ((int)(Math.sqrt(all_perpendicular_and_hypotenuse.get(i).get(0))) == Math.sqrt(all_perpendicular_and_hypotenuse.get(i).get(0))) {
                        returner.add(all_perpendicular_and_hypotenuse.get(i).get(0));
                        returner.add((int)0);
                    }
                } else {
                    returner.add(all_perpendicular_and_hypotenuse.get(i).get(0));
                    returner.add(all_perpendicular_and_hypotenuse.get(i).get(1));
                }
            }
        }
        //Returning the hypotenuse and perpendicular
       return returner;
    }
}

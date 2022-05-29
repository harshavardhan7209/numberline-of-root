import java.util.*;
public class app {
    public static void main(String [] args) {
        while (true) {
            int y;
            List<Integer> l = new ArrayList<Integer>();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the hypotenuse: \u221A");
            y = sc.nextInt();
            l.add(y);
            l.add((int)0);
            if (Math.round(Math.sqrt(l.get(0))) != Math.sqrt(l.get(0))) {
                for (int i = 0; i < l.size(); i++) {
                    while (Math.round(Math.sqrt(l.get(i))) != Math.sqrt(l.get(i))) {
                        List<Integer> m = new ArrayList<Integer>();
                        List<String> no = new ArrayList<String>();
                        m = numberline(l.get(i));
                        System.out.println(m);
                        for (int j = 0; j < m.size(); j++) {
                            if (Math.round(Math.sqrt(m.get(j))) == Math.sqrt(m.get(j))) {
                                no.add(Integer.toString((int)(Math.sqrt(m.get(j)))));
                            } else {
                                no.add("\u221A" + m.get(j));
                            }
                        }
                        System.out.println("The altitude and base respectively for \u221A" + l.get(i) + " are: [" + no.get(0) + "," + no.get(1) + "]");
                        l = m;
                    }
                }
            }else {
                System.out.println("The altitude and base respectively for \u221A" + y + " are: [" + (int)Math.sqrt(l.get(0)) + "," + l.get(1) + "]");

            }

        }
    }
    public static List<Integer> numberline(int a) {
        int za, z;
        List<Integer> e = new ArrayList<Integer>();
        List<Integer> aeh = new ArrayList<Integer>();
        List<ArrayList<Integer>> h = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<=a;i++) {
            for (int j=0;j<=i;j++) {
                if (i+j==a) {
                    ArrayList<Integer> zd = new ArrayList<Integer>();
                    if ((int)(Math.sqrt(i)) == Math.sqrt(i) || (int)(Math.sqrt(j)) == Math.sqrt(j)) {
                        int l,y;
                        if ((int)(Math.sqrt(i)) == Math.sqrt(i)) {
                            l = (int)(Math.sqrt(i));
                        } else {
                            l = i;
                        }
                        if (Math.round(Math.sqrt(j)) == Math.sqrt(j)) {
                            y = (int)(Math.sqrt(j));
                        } else {
                            y = j;
                        }
                        z = (l+y)+0;
                        zd.add(i);
                        zd.add(j);
                        e.add(z);
                        h.add(zd);
                    }
                }
            }
        }
        za = e.get(0);
        for (int i=0;i<h.size();i++) {
            za = Math.min(za, e.get(i));
        }
        for(int i=0;i<h.size();i++) {
            if (za == e.get(i)) {
                if (h.get(i).get(1) == 0) {
                    if ((int)(Math.sqrt(h.get(i).get(0))) == Math.sqrt(h.get(i).get(0))) {
                        aeh.add(h.get(i).get(0));
                        aeh.add((int)0);
                    }
                } else {
                    aeh.add(h.get(i).get(0));
                    aeh.add(h.get(i).get(1));
                }
            }
        }
       return aeh;
    }
}

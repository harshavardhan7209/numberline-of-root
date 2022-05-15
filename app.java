import java.util.*;
public class app {
    public static void main(String[] args) {
        while (true) {
            List<Integer> m = new ArrayList<Integer>();
            List<String> mn = new ArrayList<String>();
            Scanner x = new Scanner(System.in);
            System.out.print("Enter the hypotenuse: \u221A");
            Double y = x.nextDouble();
            List<Integer> l = new ArrayList<Integer>();
            l = numberline(y);
            if (l.get(1)!=0) {
                if (Math.round(Math.sqrt(l.get(0))) == Math.sqrt(l.get(0))) {
                    mn.add(Integer.toString((int)Math.sqrt(l.get(0))));
                }else {
                    mn.add("\u221A" + l.get(0));
                }
                if (Math.round(Math.sqrt(l.get(1))) == Math.sqrt(l.get(1))) {
                    mn.add(Integer.toString((int)Math.sqrt(l.get(1))));
                }else {
                    mn.add("\u221A" + l.get(1));
                }
                System.out.println("The altitude and base respectively for \u221A" + y.intValue() + " are: " + mn);
            }else {
                System.out.println("The altitude is: 0 and the base is: " + l.get(0));
            }
            if (l.get(1)!=0) {
                for (int i = 0; i < l.size(); i++) {
                    while (Math.round(Math.sqrt(l.get(i))) != Math.sqrt(l.get(i))) {
                        List<String> no = new ArrayList<String>();
                        m = numberline(l.get(i));
                        if (Math.round(Math.sqrt(m.get(0))) == Math.sqrt(m.get(0))) {
                            no.add(Integer.toString((int)Math.sqrt(m.get(0))));
                        }else {
                            no.add("\u221A" + m.get(0));
                        }
                        if (Math.round(Math.sqrt(m.get(1))) == Math.sqrt(m.get(1))) {
                            no.add(Integer.toString((int)Math.sqrt(l.get(1))));
                        }else {
                            no.add("\u221A" + m.get(1));
                        }
                        System.out.println("The altitude and base respectively for \u221A" + l.get(i).intValue() + " are: " + no);
                        l = m;
                    }
                }
            }
        }
    }
    public static List<Integer> numberline(double a) {
        int abcd = 0, efgh = 0;
        List<Integer> e = new ArrayList<Integer>();
        List<ArrayList<String>> g = new ArrayList<ArrayList<String>>();
        List<ArrayList<Integer>> h = new ArrayList<ArrayList<Integer>>();
        
        for (int i=0;i<(a+1);i++) {
            for (int j=0;j<(i+1);j++) {
                if (i+j==a) {
                    int m,z;
                    if ((Math.round(Math.sqrt(i)) == Math.sqrt(i)) || (Math.round(Math.sqrt(j)) == Math.sqrt(j))) {
                        ArrayList<String> d = new ArrayList<String>();
                        ArrayList<Integer> zd = new ArrayList<Integer>();
                        if (Math.round(Math.sqrt(i)) == Math.sqrt(i)) {
                            d.add(Integer.toString((int)(Math.sqrt(i))));
                            m = (int)(Math.sqrt(i));
                        }else{
                            d.add("\u221A" + i);
                            m = i;
                        }
                        if (Math.round(Math.sqrt(j)) == Math.sqrt(j)) {
                            d.add(Integer.toString((int)(Math.sqrt(j))));
                            z = (int)(Math.sqrt(j));
                        }else{
                            d.add("\u221A" + j);
                            z = j;
                        }
                        int zc = (m+z)*1;
                        zd.add(i);
                        zd.add(j);
                        g.add(d);
                        e.add(zc);
                        h.add(zd);
                    }
                }
            }
        }
        int za = e.get(0);
        for (int i=0;i<g.size();i++) {
            za = Math.min(za, e.get(i));
        }
        for(int i=0;i<e.size();i++) {
            if (za == e.get(i)) {
                if (h.get(i).get(1) == 0) {
                    if (Math.round(Math.sqrt(h.get(i).get(0))) == Math.sqrt(h.get(i).get(0))) {
                        abcd = ((int)(Math.sqrt(h.get(i).get(0))));
                        efgh = 0;
                    }
                }else {
                    abcd = (h.get(i).get(0));
                    efgh = (h.get(i).get(1));
                    
                }
            }
        }
       return Arrays.asList(abcd,efgh);
    }
}

import java.util.*;
public class app {
    public static void main(String [] args) {
        while (true) {
            List<Long> m = new ArrayList<Long>();
            List<String> mn = new ArrayList<String>();
            Scanner x = new Scanner(System.in);
            System.out.print("Enter the hypotenuse: \u221A");
            Long y = x.nextLong();
            List<Long> l = new ArrayList<Long>();
            l.add(y);
            l.add((long)0);
            for (int i = 0; i < l.size(); i++) {
                while (Math.round(Math.sqrt(l.get(i))) != Math.sqrt(l.get(i))) {
                    List<String> no = new ArrayList<String>();
                    m = numberline(l.get(i));
                    for (int j = 0; j <m.size(); j++) {
                        if (Math.round(Math.sqrt(m.get(j))) == Math.sqrt(m.get(j))) {
                            no.add(Long.toString((long)Math.sqrt(m.get(j))));
                        }else {
                            no.add("\u221A" + m.get(j));
                        }
                    }
                    System.out.println("The altitude and base respectively for \u221A" + l.get(i).intValue() + " are: " + no);
                    l = m;
                }
            }
        }
    }
    public static List<Long> numberline(long a) {
        long abcd = 0, efgh = 0, za, zc;
        List<Long> e = new ArrayList<Long>();
        List<ArrayList<Long>> h = new ArrayList<ArrayList<Long>>();
        for (long i=0;i<(a+1);i++) {
            for (long j=0;j<(i+1);j++) {
                if (i+j==a) {
                    long m,z;
                    ArrayList<Long> zd = new ArrayList<Long>();
                    if (Math.round(Math.sqrt(i)) == Math.sqrt(i)) {
                        m = (long)(Math.sqrt(i));
                    }else{
                        m = i;
                    }
                    if (Math.round(Math.sqrt(j)) == Math.sqrt(j)) {
                        z = (long)(Math.sqrt(j));
                    }else{
                        z = j;
                    }
                    zc = (m+z)*1;
                    zd.add(i);
                    zd.add(j);
                    e.add(zc);
                    h.add(zd);
                }
            }
        }
        za = e.get(0);
        for (int i=0;i<h.size();i++) {
            za = Math.min(za, e.get(i));
        }
        for(int i=0;i<h.size();i++) {
            if (za == e.get(i)) {
                abcd = (h.get(i).get(0));
                efgh = (h.get(i).get(1));
            }
        }
       return Arrays.asList(abcd,efgh);
    }
}

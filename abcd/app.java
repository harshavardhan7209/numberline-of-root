import java.util.*;
public class app {
	public static void main(String[] args) {
		List<Integer> e = new ArrayList<Integer>();
		List<ArrayList<String>> g = new ArrayList<ArrayList<String>>();
		List<ArrayList<Integer>> h = new ArrayList<ArrayList<Integer>>();
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the hypotenuse: √");
		double a = x.nextDouble();
		System.out.print("Do you want to see: \n1.All the results or \n2.The recommended result\n: ");
		int zb = x.nextInt();
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
	                                             d.add("√" + i);
	                                             m = i;
						}
						if (Math.round(Math.sqrt(j)) == Math.sqrt(j)) {
							d.add(Integer.toString((int)(Math.sqrt(j))));
							z = (int)(Math.sqrt(j));
						}else{
							d.add("√" + j);
	                                                z = j;
						}
						int zc = (m+z)*1;
						zd.add(m);
						zd.add(z);
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
		if(zb == 1) {
			System.out.println("The possible sides of this right triangle are: ");
			for (int i=0;i<g.size();i++) {
				System.out.println("(" + g.get(i).get(0) + ", " + g.get(i).get(1) + ")");
			}
			for(int i=0;i<e.size();i++) {
				if (za == e.get(i)) {
					if (h.get(i).get(1) == 0) {
						if (Math.round(Math.sqrt(h.get(i).get(0))) == Math.sqrt(h.get(i).get(0))) {
							System.out.println("The recommended trick is that use base directly as:\n " + h.get(i).get(0) + " units.");
						}
					}else {
						System.out.println("The recommended side values are: (" + g.get(i).get(0) + ", " + g.get(i).get(1) + ")");
					}				
				}
			}
		}else {
			for(int i=0;i<e.size();i++) {
				if (za == e.get(i)) {
					if (h.get(i).get(1) == 0) {
						if (Math.round(Math.sqrt(h.get(i).get(0))) == Math.sqrt(h.get(i).get(0))) {
							System.out.println("The recommended trick is that use base directly as:\n " + h.get(i).get(0) + " units.");
						}
					}else {
						System.out.println("The recommended side values are: (" + g.get(i).get(0) + ", " + g.get(i).get(1) + ")");
					}
				}
			}
		}
	}
	}

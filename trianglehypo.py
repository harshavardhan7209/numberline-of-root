import math

from numpy import mat
def numberline(a):
    aeh = []
    f = []
    g = []
    h = []
    idk = []
    for i in range(0,(a+1)):
        for j in range(0, (i+1)):
            if i+j == a:
                if math.trunc(math.sqrt(i)) == math.sqrt(i) or math.trunc(math.sqrt(j)) == math.sqrt(j):
                    idll = []
                    d = []
                    zd = []
                    r = int(i)
                    s = int(j)
                    if math.trunc(math.sqrt(i)) == math.sqrt(i):
                        d.append(str(int(math.sqrt(i))))
                        l = (int(math.sqrt(i)))
                    else:
                        d.append("√" + str(int(i)))
                        l = int(i)
                    if math.trunc(math.sqrt(j)) == math.sqrt(j):
                        d.append(str(int(math.sqrt(j))))
                        y = (int(math.sqrt(j)))
                    else:
                        d.append("√" + str(int(j)))
                        y = int(j)
                    idll.append(i)
                    idll.append(j)
                    idk.append(idll)
                    zd.append(r)
                    zd.append(s)
                    h.append(zd)
                    z = (l+y)*1
                    f.append(d)
                    g.append(z)
                    # print("Option is √(" + str(l) + "\u00b2 + " + str(y) + "\u00b2)")
    za = g[0]
    for i in range(0, len(g)):
        za = min(za, g[i])
    
    for i in range(0, len(f)):
        if za == g[i]:
            if h[i][1] == 0:
                if math.trunc(math.sqrt(h[i][0])) == math.sqrt(h[i][0]):
                    aeh.append(int(math.sqrt(h[i][0])))
                    aeh.append(0)
            else:
                aeh.append(idk[i][0])
                aeh.append(idk[i][1])
    return aeh
def main():
    m = []
    mn = []
    l = []
    y = int(input("Enter the hypotenuse: \u221A"))
    l = numberline(y)
    if l[1]!=0:
        if math.trunc(math.sqrt(l[0])) == math.sqrt(l[0]):
            mn.append(int(math.sqrt(l[0])))
        else:
            mn.append("\u221A" + str(l[0]))
        if math.trunc(math.sqrt(l[1])) == math.sqrt(l[1]):
            mn.append(int(math.sqrt(l[1])))
        else:
            mn.append("\u221A" + str(l[1]))
        print("The altitude and base respectively for \u221A" + str(y) +" are: [" + str(mn[0]) + "," + str(mn[1]) + "]")
                
    else:
        print("The altitude is: 0 and the base is: " + str(l[0]))
    if l[1]!=0:
        for i in range(len(l)):
            while math.trunc(math.sqrt(l[i])) != math.sqrt(l[i]):
                m = numberline(l[i])
                no = []
                if math.trunc(math.sqrt(m[0])) == math.sqrt(m[0]):
                    no.append(int(math.sqrt(m[0])))
                else:
                    no.append("\u221A" + str(m[0]))
                if math.trunc(math.sqrt(m[1])) == math.sqrt(m[1]):
                    no.append(int(math.sqrt(m[1])))
                else:
                    no.append("\u221A" + str(m[1]))
                print("The altitude and base respectively for \u221A" + str(l[i]) + " are: [" + str(no[0]) + "," + str(no[1]) + "]")
                l = m
main()
while True:
    x = input("Do you want to continue(Y/N): ")
    if x == "y":
        main()
    else:
        break
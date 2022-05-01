import math
def main():
    a = int(input("Enter the hypotenuse: √"))
    zb = int(input("Do you want to see: \n1.All the results or \n2.The recommended result\n: "))
    f = []
    g = []
    h = []
    for i in range(0,(a+1)):
        for j in range(0, (i+1)):
            if i+j == a:
                if math.trunc(math.sqrt(i)) == math.sqrt(i) or math.trunc(math.sqrt(j)) == math.sqrt(j):
                    d = []
                    zd = []
                    r = int(i)
                    s = int(j)
                    if math.trunc(math.sqrt(i)) == math.sqrt(i):
                        d.append(str(int(math.sqrt(i))))
                        l = (int(math.sqrt(i)))
                    else:
                        d.append("√" + str(int(i)))
                        l = (i)
                    if math.trunc(math.sqrt(j)) == math.sqrt(j):
                        d.append(str(int(math.sqrt(j))))
                        y = (int(math.sqrt(j)))
                    else:
                        d.append("√" + str(int(j)))
                        y = j
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
    if zb == 1:
        print("The possible sides of this right triangle are: ")
        for el in f:
            print("(" + str(el[0]) + ", " + str(el[1]) + ")")
        for i in range(0, len(f)):
            if za == g[i]:
                if h[i][1] == 0:
                    if math.trunc(math.sqrt(h[i][0])) == math.sqrt(h[i][0]):
                        print("The recommended trick is that use base directly as:\n " + str(int(math.sqrt(h[i][0]))) + " units.")
                else:
                    print("The recommended side values are: (" + str(f[i][0]) + ", " + str(f[i][1]) + ")")
    else:
        for i in range(0, len(f)):
            if za == g[i]:
                if h[i][1] == 0:
                    if math.trunc(math.sqrt(h[i][0])) == math.sqrt(h[i][0]):
                        print("The recommended trick is that use base directly as:\n " + str(int(math.sqrt(h[i][0]))) + " units.")
                else:
                    print("The recommended side values are: (" + str(f[i][0]) + ", " + str(f[i][1]) + ")")

main()
while True:
    x = input("Do you want to continue(Y/N): ")
    if x == "y":
        main()
    else:
        break
import math
def numberline(a):
    aeh = []
    g = []
    h = []
    for i in range(0,(a+1)):
        for j in range(0, (i+1)):
            if i+j == a:
                if math.trunc(math.sqrt(i)) == math.sqrt(i) or math.trunc(math.sqrt(j)) == math.sqrt(j):
                    zd = []
                    if math.trunc(math.sqrt(i)) == math.sqrt(i):
                        l = (int(math.sqrt(i)))
                    else:
                        l = i
                    if math.trunc(math.sqrt(j)) == math.sqrt(j):
                        y = (int(math.sqrt(j)))
                    else:
                        y = j
                    zd.append(i)
                    zd.append(j)
                    h.append(zd)
                    z = (l+y)*1
                    g.append(z)
    za = g[0]
    for i in range(0, len(g)):
        za = min(za, g[i])
    for i in range(0, len(g)):
        if za == g[i]:
            if h[i][1] == 0:
                if math.trunc(math.sqrt(h[i][0])) == math.sqrt(h[i][0]):
                    aeh.append(h[i][0])
                    aeh.append(0)
            else:
                aeh.append(h[i][0])
                aeh.append(h[i][1])
    return aeh
def main():
    y = int(input("Enter the hypotenuse: \u221A"))
    l = [y, 0]
    if math.trunc(math.sqrt(l[0])) != math.sqrt(l[0]):
        for i in range(len(l)):
            while math.trunc(math.sqrt(l[i])) != math.sqrt(l[i]):
                m = numberline(l[i])
                no = []
                for j in range(len(m)):
                    if math.trunc(math.sqrt(m[j])) == math.sqrt(m[j]):
                        no.append(int(math.sqrt(m[j])))
                    else:
                        no.append("\u221A" + str(m[j]))
                print("The altitude and base respectively for \u221A" + str(l[i]) + " are: [" + str(no[0]) + "," + str(no[1]) + "]")
                l = m
    else:
        print("The altitude and base respectively for \u221A" + str(y) + " are: [" + str(int(math.sqrt(y))) + "," + str(l[1]) + "]")
main()
while True:
    x = input("Do you want to continue(Y/N): ")
    if x.lower() == "y" or x.lower() == "yes":
        main()
    else:
        break

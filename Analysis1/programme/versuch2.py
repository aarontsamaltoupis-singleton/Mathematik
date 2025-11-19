import matplotlib.pyplot as plt
xlist = []
ylist = []
def folge(n):
    returnvalue = 1/n
    return returnvalue


def summe(n):
    returnvalue = 0
    for x in range(1,n+1):
        xlist.append(x)
        returnvalue += folge(x)
        ylist.append(returnvalue)
    return returnvalue 

summe(50)
print(xlist,ylist)
plt.plot(xlist,ylist)
plt.show()

import math
n= 10000000

def a(n,m):
    return (m**(1/n))
def b(n):
    return (1+1/n)

def c(n):
    returnvalue = (n*(n**(1/n))/(n+1))
    for x in range(1,n+1):
        returnvalue *= 1/(x**(1/n))
    return returnvalue-1
    


print(c(n))


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
# folge aller zahlen ohne 9
def c(n):
    c = []
    f = []
    x = 1
    while len(c)<n:
        if str(9) not in str(x):
            c.append(x)
                
            
        x+=1
    
    return c

# anzahl aller zahlen ohne 9 zwischen 1 und n
def f(n):
    f = []
    for x in range(1,n+1):
        if str(9) not in str(x):
            f.append(x)

    return len(f)
    


# folge aller zahlen
def id(n):
    return list(range(n))

i = 5
n = 10**i
#print(c(n)[-1])
#print(f(n))
#print(n*n/f(n))

for n in range(1,1000):
    print(10**n/9**n-n**2)

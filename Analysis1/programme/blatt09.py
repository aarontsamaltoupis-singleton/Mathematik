import scipy.special
import numpy as np

z = 1
c=0.5
a = 1-c
print(a,-a)

br = np.linspace(-a, a, int((2*a)/0.1)+1).tolist()

def f(n, a):
    """Generate the first n elements of the sequence with factor a."""
    seq = []
    for i in range(1, n+1):
        # find the block (k) and position in block (m)
        k = (i-1).bit_length() - 1  # same as floor(log2(i-1)) but handles i=1
        m = i - 2**k - 1
        value = a * (2**k - 1 - 2*m) / 2**k
        seq.append(value)
    return seq


f_list = f(10000, a)
print(f_list)


for z in br:
    for n in range(10):
        def b(n):
            sum = 0
            for k in range(0,n+1):
                sum+= (scipy.special.binom(n,k)*(c/f_list[k])**k)*z**n
            return sum
        
        result = b(n)*z**n - (z+c)**n
        print(result)

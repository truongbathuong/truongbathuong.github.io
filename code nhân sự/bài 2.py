n = int(input('Nhap n:'))
def Fibonacci(x):
    if (x==0 or x==1):
        return x
    else:
        return Fibonacci(x-1)+Fibonacci(x-2)
print("{} số đầu tiên của Fibonacci là:".format(n))	
for i in range(1, n+1):
	print(Fibonacci(i),end=' ')
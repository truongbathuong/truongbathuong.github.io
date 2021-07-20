def snt(n):
    if n<2:
        return False
    elif n%2==0 and n!=2:
        return False
    for i in range(3,n,2):
        if(n%i==0):
            return False
    return True
n = int(input("Nhập n: "))
if snt(n):
    print("{} là số nguyên tố".format(n))
else:
    print("{} không phải là số nguyên tố".format(n))
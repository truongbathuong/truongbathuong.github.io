def number(n,b):
    if n<0 or b<2 or b>32:
        return ""; #cho nay co the sua thanh cho nhap lai
    sb=""
    x=0
    y=n
    while y>0:
        if b>10:
            x=y%b
            if x>=10:
                sb=sb+str(chr(55+x))
            else:
                sb=sb+str(x)
        else:
            sb=sb+str(y%b)
        y = int(y/b)
    return "".join(reversed(sb))# đảo ngược chuỗi sb

n=int(input("Nhập số nguyên dương n = "))
b=int(input("Nhập he co so b = "))
print("Hệ cơ số",b,"của số nguyên",n,"là:",number(n,b))
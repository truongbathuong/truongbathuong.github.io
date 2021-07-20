n=input("Nhập chuỗi nhị phân 4 chữ số, phân cách nhau bởi dấu phẩy: ").split(',')
d = dict()
for i in n:
    s=0
    l=len(i)-1
    for j in range (0, l+1):
        s=s+(int(i[j])*(2**(l-j)))
    key = i
    d[key]=s
lis=[]

for i in d.values():
    if i%5==0:
        lis.append(i)
a=[]       
for j in range(0,len(lis)):
    for key, value in d.items():  
        if lis[j] == value:
            print(key,end=',')
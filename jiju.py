a=int(input("how meney times do u want repeat:"))
d={}
for i in range(0,a):
	num1=input("enter the key:")
	num2=input("enter value:")
	d[num1]=num2
print(d.values())
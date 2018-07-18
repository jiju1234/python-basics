import random
a=[1,2,43,54,4,5,6,7,4,65,6]
b=int(input("how many random numbers do u want:"))
while b>0:
	c=random.choice(a)
	print(c)
	b=b-1
	
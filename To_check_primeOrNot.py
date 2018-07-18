a=int(input("enter a number to check prime or not:"))
if a>1:
		for i in range(2,a):
			if a%i==0:
				print("not a prime number")
else:
	print("enter a positive number")
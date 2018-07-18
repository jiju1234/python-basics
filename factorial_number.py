mul=1
a=int(input("enter a number:"))
for i in range(1,a+1):
	mul=mul*i
print(mul)
		#write for checking a palindrome or not
u_input=input("enter a string:")
if(u_input[::-1]==u_input):
 print("its a palindrome")
else:
 print("this",u_input,"not a palindrome")
"""write a program for dice game checking"""
import random
m_list=[1,2,3,4,5,6]
u_list=int(input("enter a random number"))
if(u_list>=1 and u_list<=6):
 if(u_list==random.choice(m_list)):
  print("LUCKY!!!!! U WON")
 else:
  print("SORRY BETTER LUCK NEXT TIME!!!!!!!")
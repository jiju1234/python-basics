string=input("enter a string   :")
l=len(string)
p=l-1
index=0
if string[index]==string[p]:
 print("its aplindrome")
 index=index+1
 p=p-1
else:
 print("not a palindrome")
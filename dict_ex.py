try:
	dict={}
	dict.update({'name':input("enter your name:")})
	dict.update({'age':int(input("enter your age:"))})
	print("your result is:")
	for j in dict:
			print(j,":",dict[j])
except:
		print("check your code")
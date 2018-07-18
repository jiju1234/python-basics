#q1 
a=[10,20,[30,40,[50]],[60,70],[80],90]
b=[]
for i in a:
	try:
		for j in i:
			b.append(j)
	except:
		b.append(i)
print(b)
		
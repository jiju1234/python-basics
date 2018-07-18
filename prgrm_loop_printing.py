input=[10,20,[30,40,[50],[60,70]],[80],90] 
l = []
for i in input:    
	if type(i) is list:
		for j in i:
			if type(j) is list:
				l.extend(j)
			else:
				l.append(j)
	else:
		l.append(i)
print(l)
a=[6,2,7,8,8,6,3,2,9]
for i in range(0,len(a)):
 for j in range(i+1,len(a)):
   if a[i]+a[j]==8:
     print(a[i],a[j])
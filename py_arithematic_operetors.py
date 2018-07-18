import anju
def result():
 print("enter your choice 1.add 2.sub 3.div 4.mul:")
 m=int(input())
 if(m==1):
  anju.add()
 elif(m==2):
  anju.sub()
 elif(m==3):
  anju.div()
 elif(m==4):
  anju.mul()
result()
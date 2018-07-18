class student:
    studentList=[]
    def __init__(self,college,name,dep,age,year):
        self.college=college
        self.name=name
        self.dep=dep
        self.age=age
        self.year=year
    def add(self):
        dict = {}
        dict['college']=self.college
        dict['name']=self.name
        dict['dep']=self.dep
        dict['age']=self.age
        dict['year']=self.year
        student.studentList.append(dict)
a=int(input("how maney students details do u want to enter:"))
while a>0:
    print("enter students details:")
    emp1 = student(input("ENTER YOUR COLLEGE:\n"),
                   input("ENTER YOUR NAME:\n"),
                   input("ENTER YOUR DEP:\n"),
                   input("ENTER YOUR AGE:\n"),
                   input("ENTER THE YEAR:\n"))
    emp1.add()
    a=a-1
for i in student.studentList:
    print(i)


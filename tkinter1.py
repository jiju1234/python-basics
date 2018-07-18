import tkinter as tk
from tkinter import *
app = tk.Tk()
#creating a Label
app.geometry("800x700")
app.title("GUI PROJECT")
label1 = Label(app,  text="task",bg="red",fg='white')
label1.pack(ipadx=100,pady=20,side=LEFT,ipady=20)
e1=Entry(app,bd=5)
e1.pack(side=BOTTOM)
label2 = Label(app,  text="project",bg="green",fg="white")
label2.pack(ipadx=80,pady=40,side=LEFT,ipady=20)
e2=Entry(app,bd=5)
e2.pack(side=LEFT)
label3 = Label(app,  text="status",bg="blue",fg="white")
label3.pack(ipadx=100,side=LEFT,ipady=20)
e3=Entry(app,bd=5)
e3.pack(side=LEFT)
#updating text 
#label.config(text="changed")
app.mainloop()

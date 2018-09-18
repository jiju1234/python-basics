"""GUI CREATION AND SEND PARTICULAR STATUS TO MAIL"""
from tkinter import Tk, Text, TOP, BOTH, X, N, LEFT
from tkinter.ttk import Frame, Label, Entry
import tkinter
import smtplib
class Example(Frame):
								#CLass
	def __init__(self):
		super().__init__()
		self.initUI()
	def initUI(self):												#design each labels,entry,and add to frame
		self.master.title("GUI PROJECT")
		self.pack(fill=BOTH, expand=True)
		frame1 = Frame(self)
		frame1.pack(fill=X)
		lbl1 = Label(frame1, text="TASK", width=8)
		lbl1.pack(side=LEFT, padx=5, pady=100)						#labels 
		entry1 = Entry(frame1)
		entry1.pack(fill=X, padx=5, expand=True)
		frame2 = Frame(self)
		frame2.pack(fill=X)
		lbl2 = Label(frame2, text="PROJECTE", width=8)
		lbl2.pack(side=LEFT, padx=5, pady=5)                         
		entry2 = Entry(frame2)										#entry/textfeild
		entry2.pack(fill=X, padx=5, expand=True)
		frame3=Frame(self)
		frame3.pack(fill=X)
		labl3=Label(frame3,text="STATUS",width=8)
		labl3.pack(side=LEFT,padx=5,pady=5)
		entry3=Entry(frame3)
		entry3.pack(fill=X,padx=2,expand=True)
		#frame4=Frame(self)
		#frame4.pack(fill=X)
		Example.content=entry3.get()
		def function():	
			content='jiju'
			mail=smtplib.SMTP('smtp.gmail.com',587)
			mail.ehlo()
			mail.starttls()
			mail.sendmail('jijusebastian2@gmail.com','jijusebastian2@gmail.com',content)
			mail.close()
		A=tkinter.Button(frame3,text="SEND STATUS",command=function())		#BUTTON WHICH EXCUTE "smtp"
		A.pack()
		close=tkinter.Button(frame3,text="CLOSE",command=self.quit)			#close entire gui
		close.pack()
def main():																	#function which calls class
	root = Tk()
	root.geometry("300x300+300+300")
	app = Example()
	root.mainloop()
if __name__ == '__main__':
	main()
		
		

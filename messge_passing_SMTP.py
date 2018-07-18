"""sending a message using SMTP """
"""simple messge passing"""
import smtplib                                                     #import module
content='helo jiju'                                                #content for sending
mail=smtplib.SMTP('smtp.gmail.com',587)                            #find server adress
mail.ehlo()
mail.starttls()
mail.login('jijusebastian2@gmail.com','*********')
mail.sendmail('jijusebastian2@gmail.com','jijusebastian2@gmail.com',content)
mail.close()
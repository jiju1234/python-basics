import smtplib
content='hai jiju am here'
mail=smtplib.SMTP('smtp.gmail.com',587)
mail.ehlo()
mail.starttls()
mail.login('jijusebastian2@gmail.com','9744305407')
mail.sendmail('jijusebastian2@gmail.com','jijusebastian2@gmail.com',content)
mail.close()
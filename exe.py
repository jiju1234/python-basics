num1, num2 = eval(input("Enter two numbers, separated by a comma : "))
result = num1 / num2
print("Result is", result)
except ZeroDivisionError:
 print("Division by zero is error !!")
except SyntaxError:
 print("Comma is missing. Enter numbers separated by comma like this 1, 2")
except:
 print("Wrong input")
else:
 print("No exceptions")
finally:
    print("This will execute no matter what")
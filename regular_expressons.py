import re
print("Python regular expressions")
s = "my ph number is 802"
matchVal = re.search(r"\d\d\d", s)
print("Match Values are ",matchVal)
print("Filtered values : ",matchVal.group())

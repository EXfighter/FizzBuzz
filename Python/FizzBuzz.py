userInput = int( input("How many number do you want to play to: "))

for i in range(1,userInput+1):
    out = ""
    if i % 3 == 0:
        out +="Fizz"
    if i % 5 == 0:
        out +="Buzz"
    if out == "":
        out = str(i)
    print(out)
    
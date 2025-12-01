firstNumber = int(input("Enter a number: "))
newNumber = firstNumber
count = 2
sumOfNumber = 1

while newNumber != count:
    if newNumber % count == 0:
        sumOfNumber += count
        print(newNumber)
    count += 1

if sumOfNumber == firstNumber:
    print("The number is a perfect number")
else:
    print("This number is not a perfect number")


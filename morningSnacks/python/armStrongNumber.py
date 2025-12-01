number = input("Enter a number: ")

lengthOfNumber = len(number)
newNumber = int(number)
total = 0

def exponential(firstNumber, secondNumber):
    total = 1
    for count in range(1, secondNumber + 1):
        total *= firstNumber
    return total

while newNumber != 0:
    lastDigit = newNumber % 10
    cube = exponential(lastDigit, lengthOfNumber)
    total += cube
    newNumber = newNumber // 10
    print(total)

if total == int(number):
    print("it is an armstrong number")
else:
    print("it is not an armstrong number")


number = int(input("Enter a number: "))

factorial = 1
secondFactorial = 0
newNumber = number

while newNumber != 0:
    lastDigit = newNumber % 10
    for count in range(1, lastDigit + 1):
        factorial *= count
    newNumber = newNumber // 10
    secondFactorial += factorial
    factorial = 1

if number == secondFactorial:
    print("Its a strong number")


def armStrong(number):
    lengthOfNumber = len(str(number))
    newNumber = number
    total = 0

    while newNumber != 0:
        lastDigit = newNumber % 10
        cube = exponential(lastDigit, lengthOfNumber)
        total += cube
        newNumber = newNumber // 10

    if total == number:
        print(number)
        return number


def exponential(firstNumber, secondNumber):
    total = 1
    for count in range(1, secondNumber + 1):
        total *= firstNumber
    return total


for count in range(1, 1001):
    armStrong(count)


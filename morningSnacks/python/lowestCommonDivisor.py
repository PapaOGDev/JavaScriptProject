firstNumber = int(input("Enter the first number: "))
secondNumber = int(input("Enter the second number: "))

def greatestCommonDivisor(firstNumber, secondNumber):
    while secondNumber != 0:
        temp = secondNumber
        secondNumber = firstNumber % secondNumber
        firstNumber = temp
    return firstNumber

def lowestCommonMultiple(firstNumber, secondNumber):
    return (firstNumber * secondNumber) // greatestCommonDivisor(firstNumber, secondNumber)

print("LCM =", lowestCommonMultiple(firstNumber, secondNumber))


firstNumber = int(input("Enter the first number: "))
secondNumber = int(input("Enter the second number: "))

count = 1
largestCommonDivisor = None

while count <= firstNumber / 2 or count <= secondNumber / 2:
    if firstNumber % count == 0 and secondNumber % count == 0:
        largestCommonDivisor = count
    count += 1

print(largestCommonDivisor)


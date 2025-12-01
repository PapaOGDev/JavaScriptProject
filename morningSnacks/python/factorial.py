number = int(input("Enter a number: "))
factorial = 1

if number < 0:
    print("Factorial does not exist for negative numbers.")
elif number == 0:
    print("Factorial of 0 is 1.")
else:
    for count in range(1, number + 1):
        factorial *= count
    print("Factorial of " + str(number) + " is " + str(factorial))


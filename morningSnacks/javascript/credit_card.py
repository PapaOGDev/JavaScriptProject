card_number = input("Hello, kindly enter card details to verify: ")

print(f"*******************************************\n** Credit Card Type: {cardType(cardNumber)}\n** Credit Card Number: {cardNumber}\n** Credit Card Digit Length: {cardNumber.length}\n** Credit Card Validity Status \n{ifDivisibleByTen(cardNumber)}\n*******************************************")

const input = require("prompt-sync")();

let firstNumber = Number(input("Enter the first number: "));
let secondNumber = Number(input("Enter the second number: "));

function greatestCommonDivisor(firstNumber, secondNumber) {
    while (secondNumber !== 0) {
        let temp = secondNumber;
        secondNumber = firstNumber % secondNumber
        secondNumber = firstNumber % secondNumber;
        firstNumber = temp;
    }
    return firstNumber;
}

function lowestCommonMultiple(firstNumber, secondNumber) {
    return (firstNumber * secondNumber) / greatestCommonDivisor(firstNumber, secondNumber);
}

console.log("LCM =", lowestCommonMultiple(firstNumber, secondNumber));


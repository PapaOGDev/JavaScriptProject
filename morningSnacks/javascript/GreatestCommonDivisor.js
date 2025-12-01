const input = require(`prompt-sync`)();
let firstNumber = input("Enter the first number: ");
let secondNumber = input("Enter the second number: ");
let count = 1;
var largestCommonDivisor;
while(count <= firstNumber/2 || count<= secondNumber/2){
    if(firstNumber%count==0 && secondNumber%count==0){
        largestCommonDivisor = count
}
    count++
}
console.log(largestCommonDivisor)

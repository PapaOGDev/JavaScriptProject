const input = require(`prompt-sync`)();

let firstNumber = input("Enter a number: ");
newNumber = firstNumber
let count = 2;
let sumOfNumber = 1;
while(newNumber != count){
      if(newNumber%count==0){
        sumOfNumber+=count
        console.log(newNumber)
    }
    count++
}
if (sumOfNumber == Number(firstNumber)){
console.log("The number is a perfect number")
}else{
console.log("This number is not a perfect number")
}



const input = require(`prompt-sync`)();

let number = input("Enter a number: ");

    let lengthOfNumber = number.length
    let newNumber = number;
    let total=0;
        while(newNumber != 0){
            let lastDigit = newNumber%10;
            let cube = exponential(lastDigit, lengthOfNumber);
            total += cube;
            newNumber=Math.floor(newNumber/10);
            console.log(total)
        }
    if (total == number){
        console.log("it is an armstrong number")
}else{
console.log("it is not an armstrong number") ;
}


function exponential(firstNumber, secondNumber){
    let total = 1;
    for (let count=1;count<=secondNumber;count++){
        total*=firstNumber;
    }
    return total;
}



for(count=1;count<=1000;count++){
  armStrong(count)
}

function armStrong(number){

    let lengthOfNumber = number.toString().length
    let newNumber = number;
    let total=0;
        while(newNumber != 0){
            let lastDigit = newNumber%10;
            let cube = exponential(lastDigit, lengthOfNumber);
            total += cube;
            newNumber=Math.floor(newNumber/10);
        }
    if (total == number){
        console.log(number)
        return number;
}

}

function exponential(firstNumber, secondNumber){
    let total = 1;
    for (let count=1;count<=secondNumber;count++){
        total*=firstNumber;
    }
    return total;
}

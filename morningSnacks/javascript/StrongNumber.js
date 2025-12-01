const input = require(`prompt-sync`)(); 

let number = input("Enter a number: ");

    let factorial = 1 ;
    let secondFactorial = 0;
    newNumber = number
    while(newNumber!=0){
            let lastDigit = newNumber%10;
            for(count=1;count<=lastDigit;count++){
                factorial *=count
            }
            newNumber=Math.floor(newNumber/10);
            secondFactorial += factorial
            factorial = 1
}
if(number == secondFactorial){
console.log("Its a strong number")
}

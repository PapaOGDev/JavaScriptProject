const input = require(`prompt-sync`)();
let number = input("Enter a number: ");
let factorial = 1;

if (number < 0) {
    console.log("Factorial does not exist for negative numbers.");
} else if (number === 0) {
    console.log("Factorial of 0 is 1.");
} else {
    for (let count = 1; count <= number; count++) {
        factorial *= count;
    }
    console.log("Factorial of " + number + " is " + factorial);
}


let person = {
    "firstName":"Oluwagbogo",
    "lastName":"Omiwole",
    "age":44
}

function addEmail(){
    person["email"] = "omiwoleoluwagbogo@gmail.com"

}

function updateAge(){
    person['age'] = 14
    console.log(person['age'])
}

function deleteLastName(){
        delete person['lastName']
    console.log(person['lastName'])
}

function accessAndPrintValue(){
    console.log(person['firstName'])
    console.log(person.firstName)
}

console.log(addEmail())
console.log(updateAge())
accessAndPrintValue()
console.log(person)

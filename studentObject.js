student = {
    "name":"omiwole oluwagbogo",
    "age": 41,
    "grade":"A",
}

function addSchool(){
    student["school"]="semicolon"
}

function changeGrade(){
    student["grade"] = "B"
}

function removeAge(){
    student["age"] =32
}

function printKeys(){
    console.log(Object.keys(student))
}

function printValues(){
    console.log(Object.values(student))
}

addSchool()
changeGrade()
removeAge()

printKeys()

printValues()

var qas = JSON.parse(localStorage.getItem("qas"));

//foeach entry in the qas, create an object of QA
var qaList = [];
for (var i = 0; i < qas.length; i++) {
    var qa = new QA(jsonObj[i].question, jsonObj[i].answer, jsonObj[i].answer2, jsonObj[i].img);
    qaList.push(qa);
}

appendToTable(qaList);
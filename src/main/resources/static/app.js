(function setSnakeBoard(){
    let table = document.querySelector("#table");
    let yAxis = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v"];

    for(i = 0; i < yAxis.length; i++){

        var currTr = document.createElement("tr");
        currTr.setAttribute("id", yAxis[i]);

        for(j = 0; j < yAxis.length; j++){
            let currTd = document.createElement("td");
            currTd.setAttribute("id", `${yAxis[i]}${j}`);
            currTr.appendChild(currTd);
        }
        table.appendChild(currTr);
    }
})()
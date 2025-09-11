var setEnv = function(){
	let frame = "start : <input type='text'>" +
			"<br>" +
			"end : <input type='text'>" +
			"<br>" +
			"<button>calc</button><br>" +
			"<div></div>";
	document.write(frame);

	document.querySelector("button").onclick = function(){ actionShow(); }
	document.querySelector("div").style = "display:flex;";
}

var getMultiTable = function(start, end){
	let multiTable = "";
	for(let i = start; i <= end; i++){
		multiTable += "<div>";
		for(let j = 1; j <= 9; j++){
			multiTable += "<div>" + i + " x " + j + " = " + i*j + "</div>";
		}
		multiTable += "</div>";
	}

	return multiTable;
}


var actionShow = function(){
	let input = document.querySelectorAll("input");
	let startNum = input[0].value;
	let endNum = input[1].value;
	let print = document.querySelector("div");
	
	let message = "";
	if(startNum > endNum || startNum == null || endNum == null || startNum <2 || endNum < 2 || startNum > 9 || endNum > 9) {
		message = "again";
	}else{
		message = getMultiTable(startNum, endNum);
	}
	
	
	print.innerHTML = message;
}
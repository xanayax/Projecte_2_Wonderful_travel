/*
function imageEnlarge() {
	 document.getElementsByClassName('imgPais').style.height="10%";
	 document.getElementById('imgPais').style.width="10%";
	 document.getElementById('imgPais').style.position='absolute';
}
	function imageReset() {

	 document.getElementById('imgPais').style.height="200";
	 document.getElementById('imgPais').style.width="400";
	 document.getElementById('imgPais').style.position='absolute';
} */


// data d'avui predeterminada
var date = new Date();
var day = date.getDate();
var month = date.getMonth() + 1;
var year = date.getFullYear();

if (month < 10) month = "0" + month;
if (day < 10) day = "0" + day;

var today = year + "-" + month + "-" + day;

document.getElementById("data").value = today;



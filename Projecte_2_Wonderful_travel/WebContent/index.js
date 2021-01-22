var continents = [ //Array
    { //Objecte
        nom: "Europa",
        paisos: [ //Array 
            { //Objecte
                nom: "Espanya",
                preu: "300",
                imatge: "imatges/espanya.jpg"
            },
            {
                nom: "França",
                preu: "500",
                imatge: "imatges/franca.jpg"
            },
            {
                nom: "Alemanya",
                preu: "963",
                imatge: "imatges/alemania.jpg"
            },
            {
                nom: "Itàlia",
                preu: "703",
                imatge: "imatges/italia.jpg"
            },
        ]
    },
    {
        nom: "Àsia",
        paisos: [
            {
                nom: "Japó",
                preu: "2000",
                imatge: "imatges/japo.jpg"
            },
            {
                nom: "Xina",
                preu: "1234",
                imatge: "imatges/xina.jpg"
            },
            {
                nom: "Indonèsia",
                preu: "7578",
                imatge: "imatges/indonesia.jpg"
            },
            {
                nom: "Índia",
                preu: "9469",
                imatge: "imatges/india.jpg"
            }
        ]
    },
    {
        nom: "Àfrica",
        paisos: [
            {
                nom: "Kènia",
                preu: "7936",
                imatge: "imatges/kenia.jpg"
            },
            {
                nom: "Nigèria",
                preu: "6756",
                imatge: "imatges/nigeria.jpg"
            },
            {
                nom: "Madagascar",
                preu: "6784",
                imatge: "imatges/madagascar.jpg"
            },
            {
                nom: "Egipte",
                preu: "8553",
                imatge: "imatges/egipte.jpg"
            }
        ]
    },
    {
        nom: "Oceania",
        paisos: [
            {
                nom: "Austràlia",
                preu: "3245",
                imatge: "imatges/australia.jpg"
            },
            {
                nom: "Nova Zelanda",
                preu: "8975",
                imatge: "imatges/nzelanda.jpg"
            },
            {
                nom: "Illes Salomó",
                preu: "7845",
                imatge: "imatges/isalomo.jpg"
            },
            {
                nom: "Papua Nova Guinea",
                preu: "7845",
                imatge: "imatges/guinea.jpg"
            }
        ]
    },
    {
        nom: "Amèrica",
        paisos: [
            {
                nom: "Estats Units",
                preu: "7892",
                imatge: "imatges/usa.jpg"
            },
            {
                nom: "Canadà",
                preu: "4321",
                imatge: "imatges/canada.jpg"
            },
            {
                nom: "Mèxic",
                preu: "7895",
                imatge: "imatges/mexic.jpg"
            },
            {
                nom: "Xile",
                preu: "7894",
                imatge: "imatges/xile.jpg"
            }
        ]
    }
]

//Input Destinacions Paisos

document.getElementById("data").setAttribute("onekeydown", "return false");
document.getElementById("preu").setAttribute("readonly", "");

var continentEscollit = document.getElementById("continent");
var paisEscollit = document.getElementById("pais");

continentEscollit.addEventListener('change', mostrarLlistatPaisos);
paisEscollit.addEventListener('change', mostrarPreuPais);
paisEscollit.addEventListener('change', mostrarImatgePais);

function mostrarLlistatPaisos() {
    let continent = continentEscollit.value;
    var llista = document.getElementById("pais");
    var htmlPaisos = "<option selected disabled>Paisos</option>";
    
    for (let i = 0; i < continents.length; i++) {
        if (continents[i].nom == continent) {
            for (let j = 0; j < continents[i].paisos.length; j++) {
                var paisos = continents[i].paisos[j].nom;
                htmlPaisos += "<option value='" + paisos + "'>" + paisos + "</option>";

            }   
            llista.innerHTML = htmlPaisos;
        }
    }
}


function mostrarPreuPais() {
    let continent = continentEscollit.value;
    let pais = paisEscollit.value;

    for (let i = 0; i < continents.length; i++) {
        if (continents[i].nom == continent) {
            for (let j = 0; j < continents[i].paisos.length; j++) {
                if (continents[i].paisos[j].nom == pais) {
                    var preus = continents[i].paisos[j].preu;
                    document.getElementById("preu").value = preus;
                }
            }
        }
    }
}

function mostrarImatgePais() {
    let continent = continentEscollit.value;
    let pais = paisEscollit.value;
    var htmlImatge = "";

    for (let i = 0; i < continents.length; i++) {
        if (continents[i].nom == continent) {
            for (let j = 0; j < continents[i].paisos.length; j++) {
                if (continents[i].paisos[j].nom == pais) {
                    var imatges = continents[i].paisos[j].imatge;
                    htmlImatge += '<img src="' + imatges + '"' + ' width="400"' + 'height="200">';
                    console.log(htmlImatge);
                    document.getElementById("imatge").innerHTML = htmlImatge;
                }
            }
        }
    }
}

// data d'avui predeterminada
var date = new Date();
var day = date.getDate();
var month = date.getMonth() + 1;
var year = date.getFullYear();

if (month < 10) month = "0" + month;
if (day < 10) day = "0" + day;

var today = year + "-" + month + "-" + day;

document.getElementById("data").value = today;



function init() {

    var nom = document.getElementById("nom");
    nom.setAttribute("required", "nom");

    var data = document.getElementById("data");
    data.setAttribute("required", "data");

    var telefon = document.getElementById("telefon");
    telefon.setAttribute("required", "telefon");
    telefon.setAttribute("maxlength", "9");

    var numPers = document.getElementById("numPers");
    numPers.setAttribute("required", "numPers");
    numPers.setAttribute("minlength", "1");
    numPers.setAttribute("maxlength", "99");

}


// validar formulari
function validateForm() {

	// agafem el seu valor
    var nom = document.forms["formulari"]["nom"].value;
    var data = document.forms["formulari"]["data"].value;
    var telefon = document.forms["formulari"]["telefon"].value;
    var numPers = document.forms["formulari"]["numPers"].value;

	//si alergies està buit
	if (nom == "" || data == "" || telefon == "" || numPers == "") {
		alert("Marca tots els camps!");
		return false;
	}
}

formulari.addEventListener('submit', validateForm);


function _init() {
	init();
}



// rellotge


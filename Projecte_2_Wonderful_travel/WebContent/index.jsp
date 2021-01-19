<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel=stylesheet href="style.css">
<script src="index.js"></script>
</head>
<body>


	<form action="InsertarReserva">

		<b><label for="data">Data</label></b> <input type="date" name="data"
			id="data"><br> <b><label for="pais">Destí</label></b>

		<!-- input type="pais" name="pais" id="pais"><br> -->


		<input list="continents" id="continent">
		<datalist id="continents">
			<option value="Europa">
			<option value="Àsia">
			<option value="Àfrica">
			<option value="Oceania">
			<option value="Àmerica">
		</datalist>
		<input list="paisos" id="pais" name="pais">
		<datalist id="paisos">
			<option value="asd">
			<option value="ads">
			<option value="Àasffrica">
			<option value="israel">
			<option value="adfsf">
		</datalist>
		<br>


		<!-- cosa con js -->

		<b><label for="nom">Nom</label></b> <input type="text"
			name="nom_client" id="nom_client"><br> <b><label
			for="telef">Telèfon</label></b> <input type="tel" name="telefon"
			id="telefon"><br> <b><label for="numPers">Persones</label></b>
		<input type="tel" name="num_persones" id="num_persones"><br>

		<b><label for="preu">Preu</label></b> <input type="text" name="preu"
			id="preu">&#8364<br> <input type="checkbox"
			name="descompte" id="descompte"> <b><label
			for="descompte">Descompte 20%</label></b><br> <input type="submit"
			name="afegir" value="Afegir">

		<script src="index.js"></script>

	</form>

	<a href="MostrarTotesReserves">Càrregar reserves</a>
	<br>

	<div id="divFora">
		<c:forEach var="reserva" items="${llistaReserves}">
			<div id="divDins">
				<div id="brossa">

					<a href="EsborrarReserva"><img src="imatges/brossa.png" width="20" height="25"></a> 

				</div>
				${reserva.data}<br> 
				${reserva.pais}<br>
				${reserva.nom_client}<br> 
				${reserva.telefon}<br>
				${reserva.num_persones} persones<br> 
				${reserva.preu}&#8364<br>

				<c:choose>
					<c:when test="${reserva.pais == 'Alemanya'}">
						<img src="imatges/alemania.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Espanya'}">
						<img src="imatges/espanya.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'França'}">
						<img src="imatges/franca.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Itàlia'}">
						<img src="imatges/italia.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Xina'}">
						<img src="imatges/xina.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Japó'}">
						<img src="imatges/japo.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Indonèsia'}">
						<img src="imatges/indonesia.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Índia'}">
						<img src="imatges/india.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Kènia'}">
						<img src="imatges/kenia.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Nigèria'}">
						<img src="imatges/nigeria.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Madagascar'}">
						<img src="imatges/madagascar.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Egipte'}">
						<img src="imatges/egipte.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Austràlia'}">
						<img src="imatges/australia.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Nova Zelanda'}">
						<img src="imatges/nzelanda.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Illes Salomó'}">
						<img src="imatges/isalomo.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Papua Nova Guinea'}">
						<img src="imatges/guinea.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Estats Units'}">
						<img src="imatges/usa.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Canadà'}">
						<img src="imatges/canada.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Mèxic'}">
						<img src="imatges/mexic.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:when test="${reserva.pais == 'Xile'}">
						<img src="imatges/xile.jpg" class="imgPais" width="400"
							height="200">
					</c:when>

					<c:otherwise>
            			No chuta
         			</c:otherwise>
				</c:choose>

			</div>
		</c:forEach>
	</div>


</body>
</html>
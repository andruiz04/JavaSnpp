<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<h1 class="text-center bg-dark text-light">Calculadora 1.0</h1>
	<div class="row">
		<div class="col-4 bg-info">
		
		</div>
		<div class="cot-4">
			<form method="get" action="calcular">
				<input type="number" name="num1">
				<input type="number" name="num2">
				<select name="operacion">
					<option value="sum">Sumar</option>
					<option value="rest">Restar</option>
					<option value="mul">Multiplicar</option>
					<option value="div">Dividir</option>
				</select>
				<button type="submit">=</button>
			</form>
			<% 
				if(request.getParameter("res") != null){
					double r = Double.valueOf(request.getParameter("res"));
					out.println("Resultado: " + r);
				}
			
			%>
		</div>
		<div class="col-4">
			
		</div>
	</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>
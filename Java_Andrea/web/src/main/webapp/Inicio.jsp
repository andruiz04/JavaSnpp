<!DOCTYPE HTML>
<html>
	<head>
		<title>Primera APP en Java Web</title>
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="bootstrap.min.css"/>
		
		<style>
			h1{
				font-family: Arial, sans serif;
				font-size: 24pt;
				background-color: rgb(255, 0, 128);
				color:pink;
			}
			
			.subtitulo{
				font-size: 18pt;
				background-color: skyblue;
				color:black;
			}
			input{
				width:200px;
				height:50px;
				font-size:18pt;
			}
			
			button{
				background-color: pink;
				width:200px;
				height:50px;
				font-size:18pt;
				transition:300ms;
				border-radius:10px 0px 10px 0px;
			}

			button:hover{
				background-color:purple;
				border-radius:0px 10px 0px 10px;
			}
		
		</style>
	</head>
	<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">INTEPY</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contactos</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Beneficios</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Productos
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">OUTLET</a></li>
            <li><a class="dropdown-item" href="#">Servicios</a></li>
            <li><a class="dropdown-item" href="#">Almacén</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
		<h1>FORMULARIO DE LOGIN</h1>
		<h2>Complete el formulario</h2>
		<h2 class="subtitulo">Lea los términos y condiciones</h2>
		<form method="post" action="login">
			<input name="email" type="email" placeholder="Email:"/>
			<input name="pass" type="password" placeholder="Contraseña:"/>
			<button type="submit" class="btn btn-outline-info">Iniciar sesión</button>
		</form>
		<a href="#">¿Olvidaste tu contraseña?</a>
		<img src="Wallpaper.PNG">
	</body>
	<script type="text/javascript" src="bootstrap.bundle.min.js"></script>
</html>
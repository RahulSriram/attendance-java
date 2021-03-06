<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>logout</title>
		<style type="text/css">
		
		body {
			margin: 0;
			padding: 0;
			overflow: hidden;
			height: 100%; 
			max-height: 100%; 
			font-family:Sans-serif;
			line-height: 1.5em;
		}
		
		#header {
			position: absolute;
			top: 0;
			left: 0;
			width: 100%;
			height: 100px; 
			overflow: hidden;  
			background: #BCCE98;
		}
		
		#nav {
			position: absolute; 
			top: 100px; 
			left: 0; 
			bottom: 0;
			width: 230px;
			overflow: auto;  
			background: #DAE9BC; 		
		}
		
		#logo {
			padding:10px;
		}
		
		main {
			position: fixed;
			top: 100px; 
			left: 230px; 
			right: 0;
			bottom: 0;
			overflow: auto; 
			background:#fff;
		}
		
		.innertube {
			margin: 15px;
		}
		
		p {
			color: #555;
		}

		nav ul {
			list-style-type: none;
			margin: 0;
			padding: 0;
		}
		
		nav ul a {
			color: darkgreen;
			text-decoration: none;
		}
				
		/*IE6 fix*/
		* html body{
			padding: 100px 0 0 230px; 
		}
		
		* html main{ 
			height: 100%; 
			width: 100%; 
		}
		
		</style>
		
		<script type="text/javascript">
			var bodyText=[ (sentenceCount){
				for (var i=0; i<sentenceCount; i++)
				document.write(bodyText[Math.floor(Math.random()*7)]+" ")
			}
		</script>	
	
	</head>
	
	<body>		

		<header id="header">
			<div id="logo">
				<h1>ARM</h1>
			</div>
		</header>
				
		<main>
			<div class="innertube">
				
				<h1>LOGOUT</h1>
				<p><script>generateText(300)</script>
YOU HAVE BEEN SUCCESFULLY LOGGED OUT</p>
				
			</div>
		</main>

		<nav id="nav">
			<div class="innertube">
				<h1>CATEGORY</h1>
				<ul>
					<li><a href="HOME.php">HOME</a></li>
					<li><a href="personaldetails.php">PERSONAL DETAILS</a></li>
					<li><a href="VIEWPERCENTAGE.html">VIEW PERCENTAGE</a></li>
					<li><a href="individual.html">INDIVIDUALATTENDANCE</a></li>
					
                                        <li><a href="i.html">LOGOUT</a></li>
				</ul>
				
				
			</div>
		</nav>	
	</body>
</html>

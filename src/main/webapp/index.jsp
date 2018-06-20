<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="images/notes.ico" type="image/x-icon">
<title>Vaijyant Tomar</title>

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="vtjs/jquery.sticky.js"></script>
<script type="text/javascript" src="vtjs/vtjs.js"></script>
<script>
	$(window).load(function() {
		$("#header").sticky({ topSpacing: 0, center:true});
	});
</script>
<link href="vt.css" rel="stylesheet" type="text/css" />
</head>
<div id="clockbox" align="right"
	style="font-size: large; padding-top: 10px; padding-right: 20px; font-weight: bold; text-shadow: 2px 2px black"></div>
<body>
	<div id="wrapper">



		<h1 align="center">Experiments</h1>
		<h2 align="center">just some random tests...</h2>
		<div id="header">
			<div id="menu">
				<ul class="navigation">
					<li><a href="index.jsp" class="selected menu_01">Home</a></li>
					<li><a href="MyNotes" class="menu_02">Notes</a></li>
					<li><a href="about.jsp" class="menu_03">About</a></li>
					<li><a href="MyProjects" class="menu_04">Projects</a></li>
					<li><a href="contact.jsp" class="menu_05">Contact</a></li>
				</ul>
			</div>
		</div>

		<!--header ends
	content starts  -->
		<div id="content">
			<p class="paragraph">
				This web site serves the purpose of sharing notes. Well along that,
				I get the space to work and experiment with different tags of html
				and understand CSS a bit. So, anyway, you're here for notes.
				Navigate to <em>Notes</em> tab to find them all there...! O, in any
				case you wish to be critic, please goto to the <em>Contact</em> tab.
			</p>
			<p align="right">Thank You. :D</p>
		</div>

		<!--content ends
	footer starts  -->

		<div id="footer">
			<div id="social_box">
				<a href="https://www.facebook.com/vaijyant.tomar"><img
						src="images/facebook.png" alt="facebook" /></a> <a
					href="http://www.youtube.com/user/Vaijyant"><img
					src="images/youtube.png" alt="youtube" /></a>
			</div>
			<div id="footer_right">Designed by Vaijyant Tomar</div>
		</div>
	</div>

</body>
</html>
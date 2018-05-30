<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="images/notes.ico" type="image/x-icon">
<title>Vaijyant: Notes</title>

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="vtjs/jquery.sticky.js"></script>
<script type="text/javascript" src="vtjs/vtjs.js"></script>


<script>
	$(window).load(function() {
		$("#header").sticky({
			topSpacing : 0,
			center : true
		});
	});
</script>
<link href="vt.css" rel="stylesheet" type="text/css" />
</head>
<div id="clockbox" align="right"
	style="font-size: large; padding-top: 10px; padding-right: 20px; font-weight: bold; text-shadow: 2px 2px black"></div>
<body>
	<div id="wrapper">

		<h1 align="center">Notes</h1>
		<h2 align="center">for CSE batch of 2011 - 2015</h2>
		<div id="header">
			<div id="menu">
				<ul class="navigation">
					<li><a href="index.jsp" class="menu_01">Home</a></li>
					<li><a href="Notes" class="selected menu_02">Notes</a></li>
					<li><a href="about.jsp" class="menu_03">About</a></li>
					<li><a href="Projects" class="menu_04">Projects</a></li>
					<li><a href="contact.jsp" class="menu_05">Contact</a></li>
				</ul>
			</div>
		</div>

		<!--header ends
	content starts  -->
		<div id="content">
			<p class="paragraph">
				This section contains all the notes for 7th sem... scroll down to
				locate the required notes! Also, if you come across any notes send
				it <a href="contact.jsp"
					style="text-shadow: none; font-size: inherit;"><i>my way</i></a>.
				Don't forget to tell your friends too. Keep the sharing going... :D
			</p>
			
				<c:forEach var="subject" items="${subList}">

					<h2 class="paraheading">${subject.subjectName}</h2>

					<table align="center" id="fancy_table">

						<tr>
							<th>S. No.</th>
							<th>Notes</th>
							<th>Dated</th>
						</tr>
						<c:forEach var="note" items="${allNotesList}">
							<c:if test="${note.notesSubject == subject.subjectAbb}">
								<tr>
									<td>${note.notesId}.</td>
									<td><a href="${note.notesLink}">${note.notesDescription}</a></td>
									<td>${note.notesDate}</td>
								</tr>
							</c:if>
						</c:forEach>
					</table>

					<hr class="styled">

				</c:forEach>
			
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
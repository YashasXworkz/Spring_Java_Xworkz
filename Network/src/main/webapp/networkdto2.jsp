<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="network" method="post">
    Id: <input type="number" placeholder="Enter id" name="id"> <br> Network Name: <input type="text" placeholder="Enter Network name" name="nwkName"> <br> Network Type: <input type="text" placeholder="Enter Network type" name="nwkType"> <br> Network Speed: <input type="number" placeholder="Enter Network speed" name="nwkSpeed"> <br> Network IP Address: <input type="text" placeholder="Enter Network ip" name="ipAddess"> <br>
    <br> <input type="submit">
  </form>
  <hr>
  <h3>${nwkDto}</h3>
</body>
</html>
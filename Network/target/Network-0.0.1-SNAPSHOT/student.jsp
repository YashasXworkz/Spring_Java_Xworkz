<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
table {
  border-collapse: collapse; margin: 10px 0px 10px 0px;
}

th {
  background-color: grey;
}

td,th {
  border: 1px solid black; text-align: center; padding: 10px;
}
</style>
</head>
<body>
  <h3>Student Marks form</h3>
  <form action="onMarks" method="post">
    Student Name: <input type="text" name="sname" placeholder="student name" required><br> Physics: <input type="number" name="phy" placeholder="physics marks" required><br> Chemistry: <input type="number" name="chem" placeholder="chemistry marks" required><br> Mathematics: <input type="number" name="math" placeholder="mathematics marks" required><br> Kannada: <input type="number" name="kan" placeholder="kannada marks" required><br>
    English: <input type="number" name="eng" placeholder="english marks" required><br> Programming Language: <input type="number" name="prog" placeholder="programming marks" required><br> <br> <input type="submit" value="submit marks">
  </form>
  <hr>
  <table>
    <tr>
      <th>Student Name</th>
      <th>Physics Marks</th>
      <th>Chemistry Marks</th>
      <th>Mathematics Marks</th>
      <th>Kannada Marks</th>
      <th>English Marks</th>
      <th>Programming Language</th>
      <th>Total Marks</th>
      <th>Percentage (%)</th>
      <th>Highest Marks</th>
      <th>Lowest Marks</th>
    </tr>
    <c:forEach items="${stud}" var="st">
      <tr>
        <td>${st.studName}</td>
        <td>${st.phyMarks}</td>
        <td>${st.chemMarks}</td>
        <td>${st.mathMarks}</td>
        <td>${st.kanMarks}</td>
        <td>${st.engMarks}</td>
        <td>${st.progLang}</td>
        <td>${st.totMarks}</td>
        <td>${st.percentage}</td>
        <td>${st.highestMarks}</td>
        <td>${st.lowestMarks}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
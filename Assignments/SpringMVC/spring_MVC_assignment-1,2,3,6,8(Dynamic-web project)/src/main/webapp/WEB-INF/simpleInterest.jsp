<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/springMVCassignment/siresult" method="post">
  <table>
  <tr>
    <td> Principal amount : </td>
    <td><input type="text" name="principalamount"></td>
  </tr>
  <tr>
    <td> Number of Years : </td>
    <td><input type="text" name="noofyears"></td>
  </tr>
  <tr>
    <td> Rate of Interest : </td>
    <td><input type="text" name="rateofinterest"></td>
  </tr>
  </table>
 <input type="submit" value="submit">

</form>
</body>
</html>
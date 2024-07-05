<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CALCULATOR</title>
</head>
<body>
<h1>Введите два числа a и b</h1>

<form action="/IdrishMedetHW22_war_exploded/calc-servlet" method="post">
    <input name="a" placeholder="A: ">
    <br><br>
    <input name="b" placeholder="B: ">
    <br><br>
    <input name="type" placeholder="*, +, -, /">
    <br><br>
    <button type="submit">Calculate</button>
</form>

</body>
</html>

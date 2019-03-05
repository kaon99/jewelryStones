<%@ page import="java.util.List" %>
<%@ page import="com.model.entities.Stone" %>
<%@ page import="jdk.nashorn.internal.objects.Global" %><%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 26.02.2019
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>List</title>
</head>
<body>
<div>

    <%
        /**
         * This code use to print necklace and service result
         */
        out.print(request.getAttribute("necklacePrint"));
        out.print(  request.getAttribute("necklace"));
        out.print(request.getAttribute("rangePrint"));
        out.print( request.getAttribute("findStonesTransparencyInRange"));
        out.print(request.getAttribute("sortPrint"));
        out.print( request.getAttribute("sortByCost"));
        out.print(request.getAttribute("sumOfCostPrint"));
        out.println( request.getAttribute("sumOfCost"));
        out.print(request.getAttribute("sumOfWeightPrint"));
        out.println(request.getAttribute("sumOfWeight"));
    %>



</div>
<div>

</div>
</body>
</html>

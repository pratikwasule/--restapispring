<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="reg" modelAttribute="ok" method="post">
<table border="4" bgcolor="cyan">
<tr><td>State Name</td>
<td><f:select path="stCode" id="st">
<f:option value="0">select----</f:option>
<f:options items="${lst}" itemValue="stCode" itemLabel="stName"></f:options>
</f:select></td></tr>
<tr><td>Dist Name</td>
<td><f:select path="dtCode" id="distcode">
  
</f:select></td></tr>
<tr><td>Name</td><td><f:input path="name"/></td></tr>
<tr><td>Phone</td><td><f:input path="mob"/></td></tr>
 
<tr><td><input type="submit"></td><td><a href=view>View</a></td></tr>
</table>
</f:form> 

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   <script type="text/javascript">
   
    $(document).ready(function(){
    	
    	$("#st").change(function(){
    		 alert("State Search");
    		$.ajax({
    		    url : "dist?stCode="+$("#st").val(),
    		    type: "GET",
    		    success: function(data)
    		    {
    		        console.log(data);
    		        $("#distcode").empty();
    		        for(var i=0; i<data.length; i++ ){
    		        	$("#distcode").append("<option value="+data[i].distCode+">"+data[i].distName+"</option>");
    		        }
    		    },
    		    error: function (errorThrown)
    		    {
    		    	console.log(errorThrown);
    		 
    		    }
    		   });
    		 
    	});
    	
    });
   
</script>
</body>
</html>
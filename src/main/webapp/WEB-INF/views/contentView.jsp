<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>	
	<div align="center">
		<h1>Upload</h1>
        <table border="0" cellpadding="5">
            <tr>
                <th>File Name</th>
                <th></th>
                <th>Optimal</th>
            </tr>
            <c:forEach items="${lists}" var="map" >
            	<c:forEach items="${map}" var="entry">
        			<tr>
                    	<td><c:out value="${entry.key}" /></td>
                    	<td><button type="button">Browser</button></td>
                    	<td>
            				<c:if test = "${entry.value == '1'}">
         						<c:out value="(*)"/>
      						</c:if>
                    	</td>
                </tr>
    			</c:forEach>
            </c:forEach>
        </table>
        <br>
        <button type="button">OK</button>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="lbl.title"/></title>
</head>
<body>
	<h2>Bank Account Details</h2>

	<%-- <table>
			<tr>
				<td><spring:message code="lbl.accountNo"/></td>
				<td>${param.accountNo}</td>
			</tr>


			<tr>
				<td><spring:message code="lbl.accountHolderName"/></td>
				<td>${param.accountHolderName}</td>
			</tr>


			<tr>
				<td><spring:message code="lbl.balance"/></td>
				<td>${param.balance}</td>
			</tr>
		</table> --%>

	<!-- 		no need of param if using model -->


	<%-- <table>
			<tr>
				<td>Account# :</td>
				<td>${accountNumber}</td>
			</tr>


			<tr>
				<td>Account Holder name :</td>
				<td>${accountHolderName}</td>
			</tr>


			<tr>
				<td>Account balance:</td>
				<td>${balance}</td>
			</tr>
		</table>  --%>

	<!-- 		using model to sisplay data -->
	<table>
		<tr>
			<td>Account# :</td>
			<td>${account.accountNo}</td>
		</tr>


		<tr>
			<td>Account Holder name :</td>
			<td>${account.accountHolderName}</td>
		</tr>


		<tr>
			<td>Account balance:</td>
			<td>${account.balance}</td>
		</tr>
	</table>



</body>
</html>
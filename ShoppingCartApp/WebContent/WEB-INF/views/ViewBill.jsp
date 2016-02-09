<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Bill</title>
</head>
<body>
<form method="post" action="/shoppingcartapp/bill/paybill.do">
<table>
<tr>
<td>Bill No.:${bill.id}</td>
</tr>
<tr>
<td>Customer Name:${bill.customer.name}</td>
</tr>
<tr>
<td></td>
</tr>
<tr>
<td>Item List:<br>${bill.itemList}</td>
</tr>
<tr>
<td>Bill Amount:${bill.totalAmount}</td>
</tr> 
</table>
<input type="submit" value="Pay Bill"/>
<input type="reset" value="Clear"/>
<br> 
</form>
</body>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thank you for your paymnt!</title>
</head>
<body>
<h1>Thank You for your paymnt!</h1>
<h3>Receipt:</h3>
<table>
<tr><td>Receipt No.:${receipt.id}</td></tr>
<tr><td>Bill No.:${receipt.bill.id}</td></tr>
<tr><td>Amount:${receipt.bill.totalAmount}</td></tr>
</table>
</body>
</html>
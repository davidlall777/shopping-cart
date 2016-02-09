<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
<h1>Create or Modify PaymntMethod</h1>
<form method="post" action="/shoppingcartapp/shoppingcart/modify.do">
<input type="text" size="5" name="id"/><br>
<table>
<tr>
<select multiple="multiple" name="items">
	<option>Bread</option>
	<option>Cheese</option>
	<option>Cake</option>
</select>
</tr>
<tr>
<select multiple="multiple" name="quantities">
	<option>1</option>
	<option>2</option>
	<option>3</option>
</select>
</tr>
</table>
<input type="text" size="30" name="name"/><br>
<input type="submit" value="Submit"/>
<input type="reset" value="Clear"/>
<br> 
</form>
</body>
</html>
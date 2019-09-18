<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.fdmgroup.groceryitems.*" import="javax.persistence.*"
	import="java.util.List" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
		ServletContext applicationContext = getServletContext();

		List<Item> items = (List<Item>) applicationContext.getAttribute("itemlist");
		if (items.isEmpty()){
			out.println("no items yet");
		}else{
			for(Item item: items){
				
				out.println(item.getId());
				out.println(item.getItemName());
				out.println(item.getCategory());
			}
		}
%>




<form class="form-inline" action="additem" method= "get">
<div>Add Item</div>

  <div class="form-group">
     <input type="text" placeholder="Item Name" name="itemname" required>
      
  </div>
  <div class="form-group">
    
    <input type="text" placeholder="Item Category" name="itemcat" required>
  </div>
  <button type="submit" class="btn btn-default">Add</button>
</form> 

<form class="form-inline" action="deleteitem" method= "get">
<div>Remove Item</div>

  <div class="form-group">
     <input type="text" placeholder="Item Id" name="itemid" required>
  </div>
  <button type="submit" class="btn btn-default">Remove</button>
</form> 

<% if (items.isEmpty()){
		out.println("no item to update");
	}
%>

<form class="form-inline" action="update" method= "get">
<div>Update Item</div>

  <div class="form-group">
     <input type="text" placeholder="Item ID" name="itemid" required>
  </div>
  <div class="form-group">
     <input type="text" placeholder="New Item Name" name="itemname" required>
  </div>
  <div class="form-group">
    
    <input type="text" placeholder="New Item Category" name="itemcat" required>
  </div>
  <button type="submit" class="btn btn-default">Update</button>
</form> 


<form class="form-inline" action="search" method= "get">
<div>Search By Category</div>
  <div class="form-group">
     <input type="text" placeholder="Category" name="category" required>
  </div>
  <button type="submit" class="btn btn-default">Seach</button>
</form> 

<%

		List<Item> catitems = (List<Item>) applicationContext.getAttribute("catList");
		if (catitems.isEmpty()){
			out.println("no items found");
		}else{
			for(Item item: catitems){
				out.println(item.getId());
				out.println(item.getItemName());
				out.println(item.getCategory());
			}
		}
%>



</body>
</html>
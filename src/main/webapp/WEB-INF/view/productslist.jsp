    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@include file="/WEB-INF/view/template/header.jsp" %>
    <div class="container wrapper">
    <div class ="container">
    <h1>All Products</h1>
    
    <p>check out the new awesome products</p>
    
 
    
<table class = "table table-striped">
  <tr class = "success">
   
   
      <th>Product Thumb</th>
         <th>Name</th>
         <th>Category</th>
         <th>Condition</th>
         <th>Price</th>
         <th>Description</th>
        
      </tr>
   
  

      
       <c:forEach var="tempprodlist" items="${product}">
       <tr>
      <td><img alt="image" src="#"></td>
        <td>${tempprodlist.productName}</td>
          <td>${tempprodlist.productCategory}</td>
            <td>${tempprodlist.productCondition}</td>
              <td>${tempprodlist.productPrice} USD</td>
              
              
              <td> 
        <a href="<spring:url value="/music/productdescription/${tempprodlist.id}"/>"
        >
        
          <span class="glyphicon glyphicon-info-sign"></span>
        </a>
      </td>
              </tr>
              
               </c:forEach>
     
  
   
</table>

     

    <%@include file="/WEB-INF/view/template/footer.jsp" %>
  </body>
</html>
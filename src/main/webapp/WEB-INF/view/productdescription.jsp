    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/view/template/header.jsp" %>
    <div class="container wrapper">
    <div class ="container">
    <h1>Product description</h1>
    
    <p>check out the new awesome products description</p>


      <div class="container">
      
      <div class="row">
   <div class="col-md-5">
   
   <img alt="image" src="#" style="height:300px; width:100%"/>
   
   </div>
   <div>
    <div class="col-md-5">
    <h1>your product description</h1>
    <p>Product Name is  ${product.productName}</p>
    <p>product category is ${product.productCategory}</p>
    <p>product condition is ${product.productCondition}</p>
    <p>product price is ${product.productPrice} USD</p>
    </div>
    </div>
   </div>
   </div>
   
   </div>  
     
   </div>  
</div>
    <%@include file="/WEB-INF/view/template/footer.jsp" %>
  </body>
</html>
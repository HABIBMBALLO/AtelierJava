<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../../../header.jsp"></jsp:include>
	<div class="row">
		<div class="col-md-4">
		<div class="card">
		<div class="card-header">AJOUT CATEGORIE</div>
		<div class="card-body">
		
		<form action="Categorie" methode="Post">
		  <div class="mb-3">
		    <label  class="form-label">Nom Categoreie</label>
		    <input type="text" class="form-control"  name="nomCategoreie" required="required">
		  </div>
		  <div class="mb-6">
		    <button type="submit" class="btn btn-primary">Ajouter</button>
		   <button type="reset" class="btn btn-danger">Annuler</button>
		  </div>
		
		</form>
			
			</div>
			</div>
			</div>
			<!-- liste des categorie -->
			<div class="col-md-8">
			<div class="card">
		<div class="card-header">LISTE CATEGORIE</div>
		<div class="card-body bg-succes">
		<table class="table table-primary table-striped">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NomCategorie</th>
    </tr>
  		<c:forEach items="${Liste_Categorie}" var="cat">	
    <tr>
      <th scope="row">1</th>
      <td>${cat.id }</td>
      <td>${cat.nomCatgorie}</td>
    </tr>
  </c:forEach>
</table>
		</div>
		</div>
		</div>
			</div>
	<jsp:include page="../../../footer.jsp"></jsp:include>

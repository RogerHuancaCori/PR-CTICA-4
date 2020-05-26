<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 <%@page import="com.emergentes.modelo.Blog"%> 
 <%@page  import="java.util.List"%> 
  <% 
      Blog libro = (Blog)request.getAttribute("libro"); 
  %> 
 <%@page contentType="text/html" pageEncoding="UTF-8"%> 
 <!DOCTYPE html> 
 <html> 
     <head> 
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
         <link rel="stylesheet" type="text/css" href="css/bootstrap.css"> 
         <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> 
         <link rel="stylesheet" type="text/css" href="css/icomoon.css"> 
         <script languaje="JavaScript" type="text/javascript" src="js/bootstrap.js"></script> 
         <title>EDITAR ENTRADA</title> 
     </head> 
     <body bgcolor = "blak"> 
         <h1> 
         <c:if test="${libro.id}==0">Nuevo Libro</c:if> 
         <c:if test="${libro.id}==0">Editar Libro</c:if> 
        </h1> 
        <h1 align ="center">EDITAR NUEVA ENTRADA</h1> 
     <center> 
           <form action="MainControlador" method="post"> 
             <table> 
                 <input type="hidden" name="id" value="${libro.id}"> 
                 <tr> 
                     <td>FECHA</td> 
                     <td><input   type="date" name="fecha" value="${libro.fecha}"><span style="float: right;"class="icon-calendar"></span></td> 
                 </tr> 
                 <tr> 
                     <td>TITULO</td> 
                     <td><input   style="width: 300%;"class="form-control "type="text" name="titulo" value="${libro.titulo}"></td> 
                 </tr> 
                 <tr> 
                     <td>CONTENIDO</td> 
                     <td><textarea   style="width: 300%;height: 300px;" class="form-control"type="text" name="contenido" value="${libro.contenido}">${libro.contenido}</textarea></td> 
                 </tr> 
                 <tr> 
                     <td><!-- AUTOR --></td> 
                     <td><input  class="form-control "type="hidden" name="autor" value="${libro.autor}"></td> 
                 </tr> 
                 <tr> 
                     <td> </td> 
                     <td><input type="submit"  value="PUBLICAR"></td> 
                 </tr> 
             </table> 
              
         </form> 
     </center> 
        
     </body> 
 </html> 

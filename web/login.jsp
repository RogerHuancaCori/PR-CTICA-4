<%@page contentType="text/html" pageEncoding="UTF-8"%> 
 <!DOCTYPE html> 
 <html> 
     <head> 
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
         <link rel="stylesheet" type="text/css" href="css/bootstrap.css"> 
         <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> 
         <script languaje="JavaScript" type="text/javascript" src="js/bootstrap.js"></script> 
         <title>LOGIN</title> 
     </head> 
     <body bgcolor="red"> 
          
   
         <center> 
                  <table> 
                     <tr> 
                        <td></td> 
                        <td><h1>VERIFICACIÓN DE USUARIO INGRESE SUS DATOS </h1> </td> 
                    </tr>  
                    <form action="LoginControlador" method="post"> 
                    <tr> 
                        <td><label>Usuario</label></td> 
                        <td><input type="text" name="usuario"> </td> 
                    </tr> 
                    <tr> 
                        <td><label>Password</label></td> 
                        <td><input type="password" name="password"></td> 
                    </tr> 
                    <tr> 
                        <td></td> 
                        <td><input class="btn btn-primary"type="submit" value="INGRESAR"></td> 
                    </tr>              
                      </form> 
                </table> 
         </center> 
         
         
     </body> 
</html>
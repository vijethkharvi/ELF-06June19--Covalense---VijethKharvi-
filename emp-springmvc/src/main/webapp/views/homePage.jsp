<%@ page session="true" %>
<!DOCTYPE html>
<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.covalense.emp.util.HibernateUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.dao.EmployeeDAOFactory"%>
<%@page import="com.covalense.emp.dao.EmployeeDAO"%>
<html>
<head>
    <meta charset="utf-8" />
    <title>Search</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="/css/style3.css" />

    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-4">


<!-- Search Navbar - START -->
<nav class="navbar navbar-default" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">EMP</span>
            <span class="icon-bar">
            </span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <form method="GET"><a class="navbar-brand" href="./validate/profile"><i class="fa fa-user" aria-hidden="true"><button name="id">profile</button></i></a></form>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <!-- <ul class="nav navbar-nav">
            <li class="active"><a href="./logout">Logout</a></li>
        </ul> -->
        <a text-align:right; href="./logout">Logout</a>
        <div class="col-sm-3 col-md-3 pull-right">
            <form class="navbar-form" role="search" action="../validator/validate/employee/search" >
                <div class="input-group">
                    <input  type="text" class="form-control" placeholder="Search with id..." name="id">
                    <div class="input-group-btn">
                    <!-- <input hidden type="text" class="form-control" placeholder="Search with id..." name="url" value="search"> -->
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search">Search</i></button>
                    </div>
                </div>
            </form>
        </div>        
    </div>
</nav>

<!-- Search Navbar - END -->

</div>
	<div class="container" style="margin:50px 500px 50px 500px">
	<table style="align:center">
	<tr style="align:center;background-color:grey"><th colspan="2">Employee Details</th></tr>
   <tr>  <td>   id     		</td>   <td>  ${empInfo.id}               </td>
   <tr>  <td>	name			</td>   <td>  ${empInfo.name }            </td>
   <tr>  <td>	age				</td>   <td>  ${empInfo.age }             </td>
   <tr>  <td>	gender			</td>   <td>  ${empInfo.gender }          </td>
   <tr>  <td>	salary			</td>   <td>  ${empInfo.salary }          </td>
   <tr>  <td>	phone			</td>   <td>  ${empInfo.phone }           </td>
   <tr>  <td>	joiningDate		</td>   <td>  ${empInfo.joiningDate }     </td>
   <tr>  <td>	accountNumber	</td>   <td>  ${empInfo.accountNumber }   </td>
   <tr>  <td>	designation		</td>   <td>  ${empInfo.designation }     </td>
   <tr>  <td>	dob				</td>   <td>  ${empInfo.dob }             </td>
   <tr>  <td>	departmentId	</td>   <td>  ${empInfo.departmentId }    </td>
   <tr>  <td>	managerId		</td>   <td>  ${empInfo.managerId }       </td>
   <tr>  <td>	Password		</td>   <td>  ${empInfo.password }       </td>
	</table>
	
	
</div>
		 


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Employee Information</title>
    <!-- Bootstrap CSS -->
    <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container{
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
    <div class="container myrow-container">
        <div class="panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">
                    Give details
                </h3>
            </div>
            <div class="panel-body">
                <form:form id="employeeRegisterForm" cssClass="form-horizontal" modelAttribute="employee" method="post" action="saveEmployee">
    
                    
    
                    <div class="form-group">
                        <form:label path="leadid" cssClass="control-label col-xs-3">Lead id</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="leadid" value="${aObject.leadid}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="leadname">Lead name</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="leadname" value="${aObject.leadname}"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="trackid">Track id</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="trackid" value="${aObject.trackid}"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="trackname">track name</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="trackname" value="${aObject.trackname}"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="mindid">Mind Id</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="mindid" value="${aObject.mindid}"/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="mindname">Mind name</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="mindname" value="${aObject.mindname}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="row">
                            <div class="col-xs-4">
                            </div>
                            <div class="col-xs-4">
                                <input type="submit" id="saveEmployee" class="btn btn-primary" value="Save"/>
                            </div>
                            <div class="col-xs-4">
                            </div>
                        </div>
                    </div>
    
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
</body>
</html>
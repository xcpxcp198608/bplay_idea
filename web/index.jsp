<%--
  Created by IntelliJ IDEA.
  User: xuchengpeng
  Date: 19/04/2017
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <s:form>
          <s:textfield name="manager.userName"/>
          <s:textfield name="manager.password"/>
          <s:submit value="Login"/>

      </s:form>
  </body>
</html>

<%-- 
    Document   : index
    Created on : 2017/11/28, 15:47:46
    Author     : tasheng
--%>

<%@page import="oracle.com.bean.Infomation"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="width: 500px;margin: 0 auto;">


            <h4 style="text-align: center">登録されたデータ一覧</h4>

            <table style="width:100%" border="1">
                <tr style="background-color: bisque"><th>自動車ナンバー</th><th>名前</th><th>住所</th></tr>
                <%
                    List<Infomation> infomationList = (List<Infomation>) request.getAttribute("infomationList");
                    if (infomationList != null) {
                        for (int i = 0; i < infomationList.size(); i++) {
                %>
                <tr>
                    <td><%=infomationList.get(i).getBikeNumber()%></td>
                    <td><%=infomationList.get(i).getName()%></td>
                    <td><%=infomationList.get(i).getAdress()%></td>
                </tr>
                <%  }
                }%>
          
            </table>
            <p style="text-align: right;margin-top: 100px"><a href="add" >登録画面へ</a></br></p>
        </div>
    </body>
</html>

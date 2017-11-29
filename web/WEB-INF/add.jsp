<%-- 
    Document   : index
    Created on : 2017/11/28, 15:47:46
    Author     : tasheng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>自転車登録</title>
    </head>
    <body>
        <div style="width: 500px;margin: 0 auto;">
            <h2 style="text-align: center">登録画面 </h2>
            <form action="add" method="post"> 
                <table width="100%">
                    <tr><td>自転車登録ナンバー:</td><td> <input type="text" name="bikeNumber" style=""></td></tr>
                    <tr><td>名前: </td><td><input type="text" name="name"></td></tr>
                    <tr><td>住所: </td><td><input type="text" name="adress"></td></tr>
                </table>
                <p style="text-align: right;margin-top: 100px;"><input type="submit" value="登録" /> </p>
            </form>
        </div>
    </body>
</html>

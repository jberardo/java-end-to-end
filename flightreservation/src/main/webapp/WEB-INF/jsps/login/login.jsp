<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login</title>
    </head>
    <body>
        <h2>Login</h2>
        <pre>
            <form action="login" method="POST">
                Email: <input type="text" name="email"/>
                Password: <input type="password" name="password"/>
                <input type="submit" value="Login">
            </form>
        </pre>
    </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
    </head>
    <body>
        <pre>
            <form action="registerUser" method="POST">
                First Name: <input type="text" name="firstName"/>
                Last Name: <input type="text" name="lastName"/>
                Email: <input type="text" name="email"/>
                Password: <input type="password" name="password"/>
                Confirm Password: <input type="password" name="confirmPassword"/>
                <input type="submit" value="Register">
            </form>
        </pre>
    </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Check In</title>
    </head>
    <body>
        <h2>Start Check In</h2>
        <form action="startCheckIn" method="POST"/>
            <pre>
                Enter the Reservation id: <input type="text" name="reservationId"/>
                <input type="submit" value="Start Check In"/>
            </pre>
        </form>
    </body>
</html>
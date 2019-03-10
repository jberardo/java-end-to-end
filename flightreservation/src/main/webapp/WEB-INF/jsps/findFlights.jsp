<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Flights</title>
    </head>
    <body>
        <h2>Search a flight</h2>
        <pre>
            <form action="findFlight" method="POST">
                From: <input type="text" name="from"/>
                To: <input type="text" name="to"/>
                Departure Date <input type="text" name="departureDate"/>
                <input type="submit" value="Search">
            </form>
        </pre>
    </body>
</html>
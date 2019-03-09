#!/bin/sh

# For better security, set environment variables for all variables used in docker run below
# Example: export LOCATION_MYSQL_USER=mysql_user
# Or uncomment for testing purposes
LOCATION_MYSQL_ROOT_PASSWORD=projectdb
LOCATION_MYSQL_USER=projectdb
LOCATION_MYSQL_PASSWORD=projectdb
LOCATION_MYSQL_DB=projectdb

SQL_DIR="$(pwd)/sql-scripts"
DOCKER_IMAGE_NAME=locationdb

echo "Cleaning..."
docker stop $DOCKER_IMAGE_NAME 2> /dev/null
docker rm $DOCKER_IMAGE_NAME 2> /dev/null

docker run -d -p 3306:3306 --name $DOCKER_IMAGE_NAME \
-v "$SQL_DIR":/docker-entrypoint-initdb.d/ \
-e MYSQL_ROOT_PASSWORD=$LOCATION_MYSQL_ROOT_PASSWORD \
-e MYSQL_USER=$LOCATION_MYSQL_USER \
-e MYSQL_PASSWORD=$LOCATION_MYSQL_PASSWORD \
-e MYSQL_DATABASE=$LOCATION_MYSQL_DB \
mysql
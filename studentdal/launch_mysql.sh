#!/bin/sh

# For better security, set environment variables for all variables used in docker run below
# Example: export STUDENTLAB_MYSQL_USER=mysql_user
# Or uncomment for testing purposes
STUDENTLAB_MYSQL_ROOT_PASSWORD=projectdb
STUDENTLAB_MYSQL_USER=projectdb
STUDENTLAB_MYSQL_PASSWORD=projectdb
STUDENTLAB_MYSQL_DB=projectdb

SQL_DIR="$(pwd)/sql-scripts"
DOCKER_IMAGE_NAME=studentlabdb

echo "Cleaning..."
docker stop $DOCKER_IMAGE_NAME 2> /dev/null
docker rm $DOCKER_IMAGE_NAME 2> /dev/null

docker run -d -p 3306:3306 --name $DOCKER_IMAGE_NAME \
-v "$SQL_DIR":/docker-entrypoint-initdb.d/ \
-e MYSQL_ROOT_PASSWORD=$STUDENTLAB_MYSQL_ROOT_PASSWORD \
-e MYSQL_USER=$STUDENTLAB_MYSQL_USER \
-e MYSQL_PASSWORD=$STUDENTLAB_MYSQL_PASSWORD \
-e MYSQL_DATABASE=$STUDENTLAB_MYSQL_DB \
mysql
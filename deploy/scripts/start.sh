#!/bin/bash
echo "Starting application..."
nohup java -jar /home/ec2-user/app/app.jar --spring.config.location=/home/ec2-user/app/application.properties --server.port=8080 > /dev/null 2>&1 &
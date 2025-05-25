#!/bin/bash
echo "Starting application..."
cd /home/ec2-user/app
ls /home/ec2-user/app
nohup java -jar /home/ec2-user/app/app.jar --spring.config.location=/home/ec2-user/app/application.properties > /home/ec2-user/app/app.log 2>&1 &
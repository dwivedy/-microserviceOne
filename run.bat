ECHO OFF

ECHO springboot-microservice-one image

REM creating nodejs-appp image, dot .  cause one d Dockerfile located outside of this file, - t for .tag given name for image
docker build -t springboot-microservice-one-app .

REM run springboot-microservice-one-app image
docker run --rm -p 5657:9967 -d springboot-microservice-one-app

REM for network id
REM docker run --rm -p 5656:3000 -it nodejs-app ifconfig

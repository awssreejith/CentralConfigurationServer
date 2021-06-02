# CentralConfigurationServer
This repository contains implementation of a Central configuration server and client in springboot. Through this sample implementation the client services can
store their respective configurations for different profiles (prod, test, dev, sanity etc) in this server configuration and simply fetch those whenever necessary.
This also has implementation of auto refresh where any chnages in central configuration will be propogated back.

A detailed implementation logic and steps can be found in Notes file.

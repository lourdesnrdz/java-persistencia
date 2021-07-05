# Persistence Java
Java SE Data Persistence Course 

## Table of contents

* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
<!-- * [Concepts](#concepts) -->

## General info

On this course I learned about data persistence, which is the residual representation of data that has been nominally erased or removed. The professor explained that data persistance can be done in two ways: in RAM or the hard drive using files or databases.

We also reviewed the difference between relational and non-relational databases. We applied CRUD methods on SQL queries for our Message project. 

Also, I learned how to apply CRUD methods when working with an API ([The CAt API](https://docs.thecatapi.com/)) and HTTP methods on Cat App project. Here we created a token to be able to make requests to the API. We accessed the cat images and showed them in our app, also suing our api-key we were able to add and remove images as favorites.

## Technologies

On this course I used the following development technologies:
 <!-- - Visual Studio Code -->
 - Git
 - Github
 - IntelliJ IDEA 2021 1.2
 - OpenJDK 11
 - XAMPP
 - Postman

## Setup

The setup for this project was made on a Windows 10 OS.

### IntelliJ IDEA

1. Go to [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Download the Community version (Free, built on open source)

### OpenJDK
For this course we used 2 versions of OpenJDK.

1. Go to [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
2. Download the following versions:
    - OpenJDK 8
    - OpenJDK 11

### XAMPP and MySQL Connector
We needed a phpmyadmin server for the project. To access this we installed XAMPP, following:
1. Go to [https://www.apachefriends.org/es/index.html](https://www.apachefriends.org/es/index.html) 
2. Once installes open XAMPP and start the MySQL server and Apache Web Server.
3. One both services are inicialized, go to [http://localhost/phpmyadmin/](http://localhost/phpmyadmin/)
4. Create a new DB 'mensajes'
<!-- 5. Import the following [database](https://drive.google.com/file/d/1uneLZrRZ0y1ASOUkVzzw7qRQwrS0Ui-d/view?usp=sharing) -->
<!-- 6. After this download the [MySQL Connector](https://dev.mysql.com/downloads/connector/j/5.1.html) -->

### MySQL Connector
1. Go to [MySQL Connector](https://dev.mysql.com/downloads/connector/j/5.1.html)
2. Select the Installer and click download
3. Click on  'No thanks, just start my download' and install the software.
4. Copy the mysql-connector-java.jar to your project's directory.

### Project Message App
Once all of the above is installed, go to IntelliJ Idea and create a project using Maven.

Then go to File > Project Structure > Libraries > Add > From Java > select the  mysql-connector-java.jar and add it to the project.

### Postman
1. Go to [https://www.postman.com/](https://www.postman.com/)
2. Click on 'Download the App' button


### The Cat API
1. Go to [The Cat API](https://docs.thecatapi.com/)
2. Register for a free account
3. On your email, you will receive a unique token to be able to access and make requests to the API
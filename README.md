# GameRepo
To start the application let's run as "Java Application" the point start of the application which is "KataprojectApplication.java" [click right on the file
to see the command]
![image](https://user-images.githubusercontent.com/34302775/161648160-044c8f95-85b6-4102-819e-9497bb2dea79.png)
You can test all the api existed using swagger too, by following this link after running the application of course (you will see the next view bellow) :
http://localhost:8080/swagger-ui.html
![image](https://user-images.githubusercontent.com/34302775/161648468-5e08af1f-b2b5-40a0-90eb-bcfda1a3cacf.png)
The Database Model
Let’s first inspect the database behind the game. Below, you will find the model that the application will use:
![image](https://user-images.githubusercontent.com/34302775/161719091-ece1b94d-5522-404c-95b2-d984dd5bd83d.png)

For the application’s purposes, we need three tables. The game table stores game details, the move table contains 
a list of all player moves for each particular game, and the player table stores all the player-specific data.
The different API that we have, and we will need to consume from the front-end are :
 1- For player Object we will found :
   1-1 add new player 
   1-2 get specific player by id
 1- For game Object we have :
   1-1 create new game
   1-2 update existing game
   1-3 get List of game existed
 3- For move Object we have :
   3-1 add new move
   3-2 get List of move done in specific game

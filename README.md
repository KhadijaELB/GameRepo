# GameRepo
To start the application let's run as "Java Application" the point start of the application which is "KataprojectApplication.java" [click right on the file
to see the command]
![image](https://user-images.githubusercontent.com/34302775/161648160-044c8f95-85b6-4102-819e-9497bb2dea79.png)
You can test all the api existed using swagger too, by following this link after running the application of course (you will see the next view bellow) :
http://localhost:8080/swagger-ui.html
![image](https://user-images.githubusercontent.com/34302775/161648468-5e08af1f-b2b5-40a0-90eb-bcfda1a3cacf.png)
The Database Model
Let’s first inspect the database behind the game. Below, you will find the model that the application will use:
For the application’s purposes, we need three tables. The game table stores game details, the move table contains 
a list of all player moves for each particular game, and the player table stores all the player-specific data.

# Java_project_LUT
My Java project for the Object-oriented programming course in LUT. The project was done only by me.


*INSTRUCTIONS FOR THE PROJECT*

Introduction
The aim is to build a program that mimics the world of Pokémons – or similar. In this case the program has 5 different “Lutemons” (white, green, pink, orange and black) and the player can create them, train them and fight with them.

The project is a command line based program and it is graded by CodeGrade. If you wish to build additional features, such as a graphical user interface with Android Studio or JavaFX, you can do that, but it is not required. You will get bonus points from such features.

You can do the project alone or with a pair (1 or 2 students in total).

The example solution has around 450 lines of code.

Deadline for the project is 22th of April, 16:00 Finnish time.


Guidelines

The program enables users to create Lutemons, which are then stored home. User has then an option to move those Lutemons to a training area or to a battle field.

When a Lutemon is trained it gains experience, which affects other features. If experience is 2 then in fighting attack will get that +2 points.


Battle is turn based where one Lutemon attacks to another, which then uses its defenses and then attacks back. When one of them has health 0 or less the other one wins and gains an experience point. The other one dies and gets removed from the program. The winner gains one point of experience.

As an algorithm the fight could be defined as following:
Get Lutemons from data structure from the BattleField object
While loop
Print the stats of both Lutemons (let’s call them A and B)
Do the fight [B.defense(A.attack())]
If B is still alive 
Print text telling B manages to escape death
Switch A and B objects
Else
Print text telling B gets killed
Add experience to A
Add Lutemon A back to BattleField data structure
Break while loop


Once Lutemon is moved back to home it gains full health.


Data structure
You can decide what kind of data structures you are using in Storage class, but HashMap is quite handy as you can then get the correct Lutemon based on its ID:

HashMap<Integer, Lutemon>

With ArrayList it would be required to do additional loops.


Requirements
The program needs to follow object-oriented programming paradigm
There needs to be at least five classes (You can create White…Black classes or just define them as attributes for Lutemon)
Inheritance needs to be used


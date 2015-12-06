# CandianService


The Canadian Forest Service wants to do a simple simulation of the growth and pruning of forests.
Each forest has a name and exactly 10 trees. The trees are planted when they are 1' to 5' tall, and each
tree has a individual growth rate of 50%-100% per year. For the simulation new trees are constructed
randomly within these bounds. A forest is reaped (by lumberjacks) on demand - all trees above a
specifed height are cut down and replaced with new trees.
The user interface to the simulation must allow the user to:
Display the current forest (with tree heights to 2 decimal places)
Discard the current forest and create a new forest
Simulate a year's growth in the current forest
Reap the current forest
Save the information about the current forest to file (named after the forest)
Discard the current forest and load the information about a forest from a file.
The user interface must deal with invalid user input in a graceful way.
Here what a sample run should look like (with the keyboard input shown in italics) ...
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : d
No forest
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : n
What is the forest name : Sherwood
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : d
Sherwood
1 : 4.40 (59% pa)
2 : 4.62 (69% pa)
3 : 4.99 (76% pa)
4 : 1.18 (67% pa)
5 : 2.59 (72% pa)
6 : 2.61 (91% pa)
7 : 1.14 (89% pa)
8 : 1.42 (77% pa)
9 : 1.91 (90% pa)
10 : 3.58 (53% pa)
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : y
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : y
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : y
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : y
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : y
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : d
Sherwood
1 : 44.68 (59% pa)
2 : 63.66 (69% pa)
3 : 84.35 (76% pa)
4 : 15.37 (67% pa)
5 : 38.93 (72% pa)
6 : 66.24 (91% pa)
7 : 27.40 (89% pa)
8 : 24.68 (77% pa)
9 : 47.20 (90% pa)
10 : 29.99 (53% pa)
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : r
What height to reap at : twenty seven
ERROR: Invalid height
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : r
What height to reap at : 60
Cut 2 : 63.66 (69% pa)
New 2 : 3.51 (76% pa)
Cut 3 : 84.35 (76% pa)
New 3 : 3.49 (54% pa)
Cut 6 : 66.24 (91% pa)
New 6 : 3.11 (65% pa)
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : d
Sherwood
1 : 44.68 (59% pa)
2 : 3.51 (76% pa)
3 : 3.49 (54% pa)
4 : 15.37 (67% pa)
5 : 38.93 (72% pa)
6 : 3.11 (65% pa)
7 : 27.40 (89% pa)
8 : 24.68 (77% pa)
9 : 47.20 (90% pa)
10 : 29.99 (53% pa)
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : s
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : n
What is the forest name : Chippewa
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : d
Chippewa
1 : 2.90 (84% pa)
2 : 3.13 (93% pa)
3 : 4.39 (60% pa)
4 : 2.92 (53% pa)
5 : 3.90 (68% pa)
6 : 3.19 (91% pa)
7 : 3.19 (71% pa)
8 : 1.47 (90% pa)
9 : 3.92 (56% pa)
10 : 4.54 (73% pa)
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : s
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : l
What is the forest name : Sherwood
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : d
Sherwood
1 : 44.68 (59% pa)
2 : 3.51 (76% pa)
3 : 3.49 (54% pa)
4 : 15.37 (67% pa)
5 : 38.93 (72% pa)
6 : 3.11 (65% pa)
7 : 27.40 (89% pa)
8 : 24.68 (77% pa)
9 : 47.20 (90% pa)
10 : 29.99 (53% pa)
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : q
ERROR: Invalid option
(D)isplay, (N)ew, (Y)ear, (R)eap, (S)ave, (L)oad, e(X)it : x
Goodbye
You must ...
Do an object oriented analysis and design
Implement the program in Java. Restriction: Only the class containing the main method may
have a Scanner object (the keyboard variable).
The assignment is optional and it is due on 27th July. Your must submit:
Analysis and design documents
Printout of the code
Your program will be assessed on:
Analysis and Design - 15%
Performance to specification - 50%
Use of classes and files 15%
Programming style - 20%
Good luck!!!

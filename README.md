# N-queens problem

Place N queens on an NxN chess board so that none of them attack each other (the classic n-queens problem). Additionally, please make sure that no three queens are in a straight line at ANY angle, so queens on A1, C2 and E3, despite not attacking each other, form a straight line at some angle.

## Dependencies

 *  java 1.8
 *  gradle 

## Build

Run `gradle jar` in the root directory

It generates `build/libs/nq.jar` 

## Run

`nq.jar` accepts a single parameter with the size of the board (N in the description). If a solution is found, a board is shown. If not, nothing is shown.

### Sample run


```
# java -jar build/libs/nq.jar 8
. . . . o . . . 
. . . . . . o . 
o . . . . . . . 
. . . o . . . . 
. o . . . . . . 
. . . . . . . o 
. . . . . o . . 
. . o . . . . . 
```


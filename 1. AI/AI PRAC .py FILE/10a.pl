batsman(sachin,batsman).
cricketer(batsman,cricketer).
batsman(X,Y).
cricketer(X,Y).

profile(X,Y) :-batsman(X,Z),cricketer(Z,Y).

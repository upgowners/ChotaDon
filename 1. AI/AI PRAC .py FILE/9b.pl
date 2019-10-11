male(raj).
male(aayush).

doctor(raj).
engineer(aayush).

nondetermmale(X).
nondetermengineer(X).
nondetermdoctor(X).

ltobehusband(X) :-male(X),(doctor(X);engineer(X)).
rtobehusband(X) :-(male(X),doctor(X));(male(X),engineer(X)).

student(p).
student(q).
hscstudent(p).
sscstudent(p).
sscstudent(q).
nondetermhscstudent(X).
nondetermsscstudent(X).
nondetermstudent(X).
lbscitadmission(X) :-((student(X),hscstudent(X)),sscstudent(X)).
rbscitadmission(X) :-(student(X),(hscstudent(X),sscstudent(X))).

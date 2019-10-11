#write program to shuffle deck of cards
#import modules
import itertools,random
#make a deck of cards
deck=list(itertools.product(range(1,14),['Spade','Heart','Diamond','Club']))
#shuffle cards
random.shuffle(deck)
#draw 5 cards
print("you got : ")
for i in range(5):
    print(deck[i][0],"of",deck[i][1])

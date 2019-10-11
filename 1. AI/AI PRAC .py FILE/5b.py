def tic_tac_toe():
      #board=b
      b=[1,2,3,4,5,6,7,8,9]
      end=False
      win_combinations=((0,1,2),(3,4,5),(6,7,8),(0,3,6),(1,4,7),(2,5,8),(0,4,8),(2,4,6))
      def draw():
            print(b[0],b[1],b[2])
            print(b[3],b[4],b[5])
            print(b[6],b[7],b[8])
      def p1():
            n=choose_number()
            if b[n]=="X" or b[n]=="O":
                  print("\nYou cant go there.Try again")
                  p1()
            else:
                  b[n]="X"
      def p2():
            n=choose_number()
            if b[n]=="X" or b[n]=="O":
                  print("\nYou cant go there.Try again")
                  p2()
            else:
                  b[n]="O"
      def choose_number():
            while True:
                  while True:
                        a=input()
                        try:
                              a=int( a)
                              a-=1
                              if a in range(0,9):
                                    return a
                              else:
                                    print("\nThat is not on board. Try again")
                                    continue
                        except ValueError:
                              print("\nThat is not a number.Try again")
                              continue
      def check_board():
            count=0
            for a in win_combinations:
                  if b[a[0]]==b[a[1]]==b[a[2]]=="X":
                        print("Player 1 wins!")
                        print("\nCongratulations!\n")
                        return True
                  if b[a[0]]==b[a[1]]==b[a[2]]=="O":
                        print("Player 2 wins!")
                        print("\nCongratulations!\n")
                        return True
            for a in range(9):
                  if b[a]=="X" or b[a]=="O":
                        count+=1
                  if count==9:
                        print("The game ends in a tie\n")
                        return True
      while not end:
            draw()
            end=check_board()
            if end==True:
                  break
            print("Player 1 choose where to place X")
            p1()
            print()
            draw()
            end=check_board()
            if end==True:
                  break
            print("Player 2 choose where to place O")
            p2()
            print()
      if input("Play again(y/n) \n")=="y":
            print()
            tic_tac_toe()
tic_tac_toe()

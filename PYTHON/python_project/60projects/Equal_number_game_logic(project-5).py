from random import randint

print('\n...................................................')
print('             If You Want To Exit. Please Enter 10 And Lifes: 5 ')
print('             Enter Your Number for win')
game = True
s = 0


def Number():
    global game, s
    player1 = randint(0, 9)
    player2 = int(input('             player - 1 : '))
    print('...................................................')

    if player1 == player2:
        s = s + 1
        print('             Your Win')
        print('             Points: ', s)
        print('...................................................')

    elif player2 == 10:
        game = False

    elif s == -5:
        print('              GAME OVER             ')
        game = False

    else:
        s = s - 1
        print('             Your Loss')
        print('             Points: ', s)
        print('             player-2: ', player1)
        print('...................................................')


while game:
    Number()

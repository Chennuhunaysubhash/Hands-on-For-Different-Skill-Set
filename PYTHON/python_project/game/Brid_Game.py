import pygame
from random import randint

pygame.init()
display = pygame.display.set_mode((320, 568))
print('')
print('Quit Game Press Q\n')
# title and icon
text = pygame.font.Font(None, 50)
game_over_font = pygame.font.Font('resource/Aldrich-Regular.ttf', 32)
game_over_font1 = pygame.font.Font('resource/Aldrich-Regular.ttf', 24)
game_over_font2 = pygame.font.Font('resource/Aldrich-Regular.ttf', 20)
title = 'Bird Fly'
icon = pygame.image.load('data/bird.png')
pygame.display.set_caption(title)
pygame.display.set_icon(icon)
# background and bird image
bg = pygame.image.load('data/bg.png')
bird = pygame.image.load('data/bird.png')
pygame.mixer.music.load('data/bgm.mp3')
pygame.mixer.music.play(-1)
bird_sound = pygame.mixer.Sound('data/bird1.wav')
bird_sound1 = pygame.mixer.Sound('data/bird2.wav')
game_life = pygame.image.load('data/heart.png')
# poles and its variable
pole_width = 40
pole_x = 320
pole_gap = 90
top_pole_height = randint(100, 400)
pole_color = (220, 85, 57)
# bird and its variable
bird_x = 20
# bird_Y = top_pole_height + 20
bird_Y = 150
score = 0
clock = pygame.time.Clock()
game_no = True


def end_game():
    global game_no, bird_x, bird_Y, score
    game_no = False
    game_no1 = True
    while game_no1:
        pygame.event.get()
        keys1 = pygame.key.get_pressed()
        display.blit(bg, (0, 0))
        display.blit(bird, (bird_x, bird_Y))
        over_img = game_over_font.render('GAME OVER', True, (255, 0, 0))
        over_img1 = game_over_font1.render('Restart Game Press R', True, (0, 255, 0))
        over_img2 = game_over_font1.render('Quit Game Press Q', True, (0, 0, 255))
        display.blit(over_img, (70, 90))
        display.blit(over_img1, (35, 120))
        display.blit(over_img2, (50, 150))
        pygame.mixer.music.stop()
        if keys1[pygame.QUIT] or keys1[pygame.K_q]:
            game_no1 = False
        pygame.display.update()
        clock.tick(60)
        if keys1[pygame.K_r]:
            score = 0
            bird_x = 20
            bird_Y = 150
            game_no = True
            return game_no


count = 0

while game_no:

    pygame.event.get()
    keys = pygame.key.get_pressed()
    if keys[pygame.QUIT] or keys[pygame.K_q]:
        game_no = False
    elif keys[pygame.K_UP]:
        bird_Y = bird_Y - 3
    elif keys[pygame.K_DOWN]:
        bird_Y = bird_Y + 5
    display.blit(bg, (0, 0))
    display.blit(bird, (bird_x, bird_Y))

    pole_x = pole_x - 2

    if bird_Y <= 0 or bird_Y >= 510:
        end_game()
        pygame.mixer.music.load('data/bgm.mp3')
        pygame.mixer.music.play(-1)

    elif pole_x <= -pole_width:
        pole_x = 320
        top_pole_height = randint(50, 400)
        # bird_y = top_pole_height + 20

        if score <= -1000:
            end_game()
            pygame.mixer.music.load('data/bgm.mp3')
            pygame.mixer.music.play(-1)

        score = score + 20
        bird_sound.play()
    pygame.draw.rect(display, pole_color, (pole_x, 0, pole_width, top_pole_height))
    pygame.draw.rect(display, pole_color, (pole_x,  top_pole_height + pole_gap, pole_width, 568))
    # collision
    if pole_x <= bird_x + 50 and bird_x <= pole_x + pole_width:
        # In the video you will see the line below
        # if bird_y <= top_pole_height or bird_y >= top_pole_height + pole_gap:
        # However, the bird bottom has to more than the top pole height and gap to
        # hit the bottom pole.
        if bird_Y <= top_pole_height or bird_Y + 50 >= top_pole_height + pole_gap:
            score = score - 5
            bird_sound1.play()


    score_text = text.render(f'Score: {score}', True, (255, 255, 255))
    display.blit(score_text, (0, 0))
    pygame.display.update()
    clock.tick(60)

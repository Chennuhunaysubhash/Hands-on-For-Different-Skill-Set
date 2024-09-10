import pygame
from random import randint
import math
pygame.init()


display = pygame.display.set_mode((799, 293))
text = pygame.font.Font(None, 50)
title = 'Car Racing'
icon = pygame.image.load('data/racing.png')
pygame.display.set_caption(title)
pygame.display.set_icon(icon)
track = pygame.image.load('data/track2.jpg')
car = pygame.image.load('data/racing-car.png')
car1 = pygame.image.load('data/car.png')
car1 = pygame.transform.rotate(car1, -90)
car3 = pygame.image.load('data/tesla.png')
car3 = pygame.transform.scale(car3, (30, 60))
car3 = pygame.transform.rotate(car3, 90)
car2 = pygame.image.load('data/car-top-view (1).png')
car2 = pygame.transform.rotate(car2, -90)
pygame.mixer.music.load('data/bgm1.mp3')
pygame.mixer.music.play(-1)
car_crash = pygame.mixer.Sound('data/bgm.mp3')
car_crash1 = pygame.mixer.Sound('data/bgm4.mp3')

game_over_font = pygame.font.Font('data/Aldrich-Regular.ttf', 64)
game_overX = 185
game_overY = 60

restart_font = pygame.font.Font('data/Aldrich-Regular.ttf', 32)
restartX = 150
restartY = 110

car_x = 0
car_y = 10
car_x1 = randint(740, 810)
car_y1 = randint(20, 210)
car_x2 = randint(810, 900)
car_y2 = randint(20, 210)
car_x3 = randint(910, 930)
car_y3 = randint(20, 210)
score = 0
score_x = 0
score_y = 0
speed = 4
speed1 = 3
clock = pygame.time.Clock()
game_status = 'running'
game_on = True

def restart_show(x, y):
    restart_img = restart_font.render('To Restart The Game press R', True, (255, 0, 0))
    display.blit(restart_img, (x, y))


def game_show_over(x, y):
    global game_status

    over_img = game_over_font.render('GAME OVER', True, (0, 0, 255))
    display.blit(over_img, (x, y))
    pygame.mixer.music.stop()
    game_status = 'end'


def show_score(x, y):
    score_text = text.render(f'Score: {score}', True, (255, 255, 255))
    display.blit(score_text, (x, y))

def iscollistion(x1, y1, x2, y2):
    distance = math.sqrt(math.pow((x2-x1), 2) + math.pow((y2-y1), 2))
    if distance < 52:
        return True
    else:
        return False


while game_on:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_on = False
    pygame.event.get()
    keys = pygame.key.get_pressed()
    if keys[pygame.K_DOWN]:
        car_y = car_y + speed
    elif keys[pygame.K_UP]:
        car_y = car_y - speed
    elif keys[pygame.K_RIGHT]:
        car_x = car_x + speed
    elif keys[pygame.K_LEFT]:
        car_x = car_x - speed
    elif keys[pygame.K_r]:
        if game_status == 'end':
            game_status = 'running'
            score = 0
            car_x = 0
            car_y = 20
            # pygame.mixer.music.play(-1)
            car_x1 = randint(740, 810)
            car_y1 = randint(20, 210)
            car_x2 = randint(810, 900)
            car_y2 = randint(20, 210)
            car_x3 = randint(910, 930)
            car_y3 = randint(20, 210)
    display.blit(track, (0, 0))
    car_x1 = car_x1 - speed1
    car_x2 = car_x2 - speed1
    car_x3 = car_x3 - speed1
    display.blit(car, (car_x, car_y))
    display.blit(car1, (car_x1, car_y1))
    display.blit(car2, (car_x2, car_y2))
    display.blit(car3, (car_x3, car_y3))
    if car_x > car_x1:
        score = score + 1
    show_score(score_x, score_y)
    if car_y <= 10:
        car_y = 20
    elif car_y >= 210:
        car_y = 205
    elif car_x >= 730 or score <= -100:
        game_show_over(game_overX, game_overY)
        restart_show(restartX, restartY)
        car_x1 = 1500
        car_x2 = 1500
        car_x3 = 1500
    elif car_x <= 0:
        car_x = 0
    if car_x1 <= 0:
        car_x1 = randint(740, 810)
        car_y1 = randint(20, 210)
    if car_x2 <= 0:
        car_x2 = randint(810, 900)
        car_y2 = randint(20, 210)
    if car_x3 <= 0:
        car_x3 = randint(910, 930)
        car_y3 = randint(20, 210)
    collision = iscollistion(car_x1, car_y1, car_x, car_y)
    collision1 = iscollistion(car_x2, car_y2, car_x, car_y)
    collision2 = iscollistion(car_x3, car_y3, car_x, car_y)
    if collision or collision1 or collision2:
        score = score - 1
        show_score(score_x, score_y)
        car_crash.play()
        # car_crash1.play()

    pygame.display.update()
    clock.tick(60)


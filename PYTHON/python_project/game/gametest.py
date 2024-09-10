import pygame
import random
import math

pygame.init()

# Creating Game Window
screen = pygame.display.set_mode((821, 600))

# Title & icon
title = "Shooter Game"
icon = pygame.image.load('resource/alien.png')
pygame.display.set_caption(title)
pygame.display.set_icon(icon)

# Background
bg = pygame.image.load('resource/background.jpg')
pygame.mixer.music.load('resource/bensound-house.mp3')
pygame.mixer.music.play(-1)

bullet_sound = pygame.mixer.Sound('resource/biglaser.wav')
explosion_sound = pygame.mixer.Sound('resource/GUNFIGHT.wav')

# player
player_img = pygame.image.load('resource/sp1.png')
playerX = 346
playerY = 462
player_change = 0
# enemy
num_of_enemies = 4
enemy_img = []
enemyX = []
enemyY = []
enemyX_change = []
enemyY_change = []

for i in range(num_of_enemies):
    enemy_img.append(pygame.image.load('resource/sp2.png'))
    enemyX.append(random.randint(0, 714))
    enemyY.append(random.randint(20, 120))
    enemyX_change.append(0.6)
    enemyY_change.append(35)

# bullet
bullet_img = pygame.image.load('resource/fire_64.png')
bulletX = 0
bulletY = 516
bullet_change = -1.5
bullet_state = 'ready'

score = 0
score_font = pygame.font.Font('resource/Aldrich-Regular.ttf', 32)
scoreX = 10
scoreY = 10

game_over_font = pygame.font.Font('resource/Aldrich-Regular.ttf', 64)
game_overX = 225
game_overY = 250

restart_font = pygame.font.Font('resource/Aldrich-Regular.ttf', 32)
restartX = 180
restartY = 310

game_status = 'running'


def restart_show(x, y):
    restart_img = restart_font.render('To Restart The Game press R', True, (255, 255, 255))
    screen.blit(restart_img, (x, y))


def game_show_over(x, y):
    global game_status
    over_img = game_over_font.render('GAME OVER', True, (0, 0, 255))
    screen.blit(over_img, (x, y))
    pygame.mixer.music.stop()
    game_status = 'end'


def show_score(x, y):
    score_img = score_font.render('Score: ' + str(score), True, (255, 255, 255))
    screen.blit(score_img, (x, y))


def iscollistion(x1, y1, x2, y2):
    distance = math.sqrt(math.pow((x2-x1), 2) + math.pow((y2-y1), 2))
    if distance < 25:
        return True
    else:
        return False


def bullet(x, y):
    screen.blit(bullet_img, (x+22, y+5))


def enemy(x, y, i):
    screen.blit(enemy_img[i], (x, y))


def player(x, y):
    screen.blit(player_img, (x, y))


game_on = True
while game_on:
    # Background RGB
    screen.fill((255, 0, 0))
    screen.blit(bg, (0, 0))
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_on = False
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                player_change = -0.7
            if event.key == pygame.K_RIGHT:
                player_change = 0.7
            if event.key == pygame.K_SPACE:
                if bullet_state == 'ready':
                    bullet_state = 'fire'
                    bulletX = playerX
                    bullet(bulletX, bulletY)
                    bullet_sound.play()
            if event.key == pygame.K_r:
                if game_status == 'end':
                    game_status = 'running'
                    score = 0
                    playerX = 346
                    pygame.mixer.music.play(-1)
                    for i in range(num_of_enemies):
                        enemyX[i] = random.randint(0, 714)
                        enemyY[i] = random.randint(20, 120)

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                player_change = 0

    if bullet_state == 'fire':
        if bulletY < 10:
            bulletY = 516
            bullet_state = 'ready'
        bulletY += bullet_change
        bullet(bulletX, bulletY)
    # Enemy Movement
    for i in range(num_of_enemies):
        # Game Over
        if enemyY[i] > 350:
            game_show_over(game_overX, game_overY)
            restart_show(restartX, restartY)
            for j in range(num_of_enemies):
                enemyY[j] = 1200
        enemyX[i] += enemyX_change[i]
        if enemyX[i] <= 0:
            enemyX[i] = 0
            enemyX_change[i] = 0.6
            enemyY[i] += enemyY_change[i]
        elif enemyX[i] >= 700:
            enemyX[i] = 700
            enemyX_change[i] = -0.6
            enemyY[i] += enemyY_change[i]
        enemy(enemyX[i], enemyY[i], i)
        collision = iscollistion(enemyX[i], enemyY[i], bulletX, bulletY)
        if collision:
            bulletY = 516
            bullet_state = 'ready'
            enemyX[i] = random.randint(0, 714)
            enemyY[i] = random.randint(20, 120)
            score += 1
            explosion_sound.play()
            # print(score)
    show_score(scoreX, scoreY)

    playerX += player_change
    if playerX <= -10:
        playerX = -10
    elif playerX >= 714:
        playerX = 714
    player(playerX, playerY)
    pygame.display.update()


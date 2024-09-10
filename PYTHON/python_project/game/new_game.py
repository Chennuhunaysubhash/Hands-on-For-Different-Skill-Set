import pygame

pygame.init()

display = pygame.display.set_mode((700, 400))
background = pygame.image.load('bg.png')
text = pygame.font.Font(None, 50)
title = 'Ball Bouncing'
icon = pygame.image.load('ball.png')
pygame.display.set_caption(title)
pygame.display.set_icon(icon)
pole_x = 10
pole_y = 1
pole_width = 20
pole_height = 70
game_on = True
while game_on:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_on = False
    pygame.event.get()
    keys = pygame.key.get_pressed()
    if keys[pygame.K_DOWN]:
        pole_y = pole_y + 1
    elif keys[pygame.K_UP]:
        pole_y = pole_y - 1
    display.blit(background, (0, 0))
    pygame.draw.rect(display, (255, 0, 0), (pole_x, pole_y, pole_width, pole_height))
    pygame.draw.rect(display, (255, 0, 0), (680, 0, pole_width, 428))
    pygame.draw.circle(display, (255, 255, 255), (50, 130), 10)
    # cv2.circle(img, (150, 400), 150, (255, 0, 0), 1)
    if pole_y <= 1:
        pole_y = 1
    elif pole_y >= 328:
        pole_y = 328
    pygame.display.update()



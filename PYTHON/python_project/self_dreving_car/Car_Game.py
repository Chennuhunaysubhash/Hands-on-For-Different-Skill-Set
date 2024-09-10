import pygame
pygame.init()
window = pygame.display.set_mode((1200, 400))
track = pygame.image.load('data/track6.png')
car = pygame.image.load('data/tesla.png')
car = pygame.transform.scale(car, (30, 60))
car_x = 150
car_y = 300
focal_dis = 25
cam_x_offset = 0
cam_y_offset = 0
direction = 'up'
clock = pygame.time.Clock()
self = True
while self:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            self = False
    clock.tick(60)
    cam_x = car_x + cam_x_offset + 15
    cam_y = car_y + cam_y_offset + 15
    up_px = window.get_at((cam_x, cam_y-focal_dis))[0]
    right_px = window.get_at((cam_x + focal_dis, cam_y))[0]
    down_px = window.get_at((cam_x, cam_y + focal_dis))[0]
    # print(up_px, right_px, down_px)
    # change direction (take turn)
    if direction == 'up' and up_px != 255 and right_px == 255:
        direction = 'right'
        cam_x_offset = 30
        car = pygame.transform.rotate(car, -90)
    elif direction == 'right' and right_px != 255 and down_px == 255:
        direction = 'down'
        car_x = car_x + 30
        cam_x_offset = 0
        cam_y_offset = 30
        car = pygame.transform.rotate(car, -90)
    elif direction == 'down' and down_px != 255 and right_px == 255:
        direction = 'right'
        car_y = car_y + 30
        cam_x_offset = 30
        cam_y_offset = 0
        car = pygame.transform.rotate(car, 90)
    elif direction == 'right' and right_px != 255 and up_px == 255:
        direction = 'up'
        car_x = car_x + 30
        car_y = car_y - 20
        cam_x_offset = 0

        car = pygame.transform.rotate(car, 90)
    # drive
    pygame.event.get()
    keys = pygame.key.get_pressed()
    if keys[pygame.K_UP]:
        if direction == 'up' and up_px == 255:
            car_y = car_y - 2
    elif keys[pygame.K_RIGHT]:
        if direction == 'right' and right_px == 255:
            car_x = car_x + 2
    elif keys[pygame.K_DOWN]:
        if direction == 'down' and down_px == 255:
            car_y = car_y + 2
    window.blit(track, (0, 0))
    window.blit(car, (car_x, car_y))
    pygame.draw.circle(window, (0,255,0),(cam_x,cam_y),5,5)
    pygame.display.update()

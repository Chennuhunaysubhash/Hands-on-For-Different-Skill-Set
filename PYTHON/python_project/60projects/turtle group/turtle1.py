import turtle

painter = turtle.Turtle()
wn = turtle.Screen()
wn.bgcolor('black')
painter.pencolor("blue")
painter.speed(100)

for i in range(41):
    painter.forward(50)
    painter.left(123)  # Let's go counterclockwise this time

painter.pencolor("red")
for i in range(41):
    painter.forward(100)
    painter.left(123)

painter.pencolor("green")
for i in range(41):
    painter.forward(150)
    painter.left(123)

painter.pencolor("yellow")
for i in range(41):
    painter.forward(200)
    painter.left(123)

painter.pencolor("orange")
for i in range(41):
    painter.forward(250)
    painter.left(123)
col = ('cyan', 'red', 'blue', 'purple')
turtle.speed(0)
for i in range(100):
    painter.pencolor(col[i % 4])
    painter.width(2)
    painter.forward(i)
    painter.circle(90, steps=5)
    painter.forward(i)
    painter.right(45)
turtle.done()

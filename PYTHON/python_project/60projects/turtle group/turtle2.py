import turtle
t = turtle.Turtle()
wn = turtle.Screen()
wn.bgcolor('black')
col = ('cyan', 'red', 'blue', 'purple')
t.speed(0)
for i in range(100):
    t.pencolor(col[i % 4])
    t.width(2)
    t.forward(i)
    t.circle(90, steps=5)
    t.forward(i)
    t.right(45)
turtle.done()
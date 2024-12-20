import turtle as t

def draw_fivestars (leng):
    count = 1
    while count <= 5:
        t.forward(leng)
        t.right(144)
        count += 1
    leng += 10
    if leng <= 100:
        draw_fivestars(leng)

def main():
    t.penup()
    t.backward(100)
    t.pendown()
    t.pensize(2)
    t.pencolor('red')
    segment = 50
    draw_fivestars(segment)
    t.exitonclick()

if __name__ == '__main__':
    main()
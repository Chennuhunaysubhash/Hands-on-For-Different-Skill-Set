def substring(st):
    n = len(st)
    l1 = []
    for i in range(n):
        for le in range(i + 1, n + 1):
            l1.append(st[i: le])
    print(l1)
    count = 0
    for j in l1:
        a = l1.count(j)
        if a >= 2:
            l1.remove(j)
            count = count+1
        # print(a)
    print(count)
    print(l1)


s = input('String : ')
substring(s)

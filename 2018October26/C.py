#Do not understand why this code works and why mine does not

num_tests = int(input())
for _ in range(num_tests):
    cities, pilots = map(int, input().split())
    print(cities-1)
    for _ in range(pilots):
        input()

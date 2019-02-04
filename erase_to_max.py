// https://www.hackerearth.com/challenge/hiring/adessa-backend-hiring-challenge/algorithm/erase-to-max-7b8c0ca3/

def getResult(Arr):
    # Write your code here
    dic = {}
    total = 0
    for i in Arr:
        if i in dic:
            dic[i] += i
        else:
            dic[i] = i
        total += i
    sorted_byValue = sorted(dic.items(), key=lambda kv: kv[1])
    total -= sorted_byValue[0][1]
    return total
 
 
T = int(raw_input())
for _ in range(T):
    N = int(raw_input())
    Arr = map(int, raw_input().split())
 
    out_ = getResult(Arr)
    print(out_)

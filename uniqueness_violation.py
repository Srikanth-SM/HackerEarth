// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/
// algorithm/uniqueness-violation-b78b51ee/


def solve(A, U, N):
    sum = 0
    i = 0
    j = 0
    size = len(A)
    while i < size:
        maxval = A[i]
        while j < size:
            if (U[i] == U[j]):
                maxval = max(maxval, A[j])
                j += 1
            else:
                break
        i = j
        sum += maxval
    return sum
 
T = input()
for _ in xrange(T):
    N = input()
    U = map(int, raw_input().split())
    A = map(int, raw_input().split())
 
    out_ = solve(A, U, N)
    print out_

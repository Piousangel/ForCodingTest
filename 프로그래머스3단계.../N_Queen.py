N = int(input())

Totalcnt = 0                 
col = []
def isPossible(col, row):           #row+1행에서 들어갈 수 있는자리 찾을꺼야
    for i in range(row):     #지금까지 추가한 행까지 다 봐야하니까
        if col[i] == col[row]:  #같은 열
            return False
        if abs(i-row) == abs(col[i] - col[row]):   #대각선에 위치하면 abs(행 - 행) == abs(열 - 열)
            return False
    return True

def dfs(col, row):
    global Totalcnt
    if row == len(col)-1:
        Totalcnt += 1      
    else:
        for i in range(len(col)):    #다음행의 몇번째 열에 추가할지 (0,1,2,3)
            col[row+1] = i                 
            if(isPossible(col, row+1)):
                dfs(col, row+1)
    return

for i in range(N):
    col = [0] * N
    col[0] = i      # 1행에 몇번 째 열에 추가할지
    dfs(col, 0)

print(Totalcnt)
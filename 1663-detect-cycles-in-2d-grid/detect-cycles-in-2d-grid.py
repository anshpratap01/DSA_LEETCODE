class Solution:
    def containsCycle(self, grid: List[List[str]]) -> bool:
        m,n,v = len(grid), len(grid[0]),set()

        def f(r,c,pr,pc):
            if(r,c) in v: return True
            v.add((r,c))
            for nr , nc in ((r+1,c) , (r-1 , c) , (r,c+1) , (r , c-1)):
                if 0<= nr <m and 0<=nc<n and grid[nr][nc] == grid[r][c] and (nr,nc) !=(pr,pc):
                    if f(nr,nc,r,c): return True
            return False
        for i in range(m):
            for j in range(n):
                if(i,j) not in v and f(i,j,-1,-1): return True
        return False        
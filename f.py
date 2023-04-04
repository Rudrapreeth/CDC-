def bfs(graph,start):
    q=[start]
    visited=[start]
    while len(q)!=0:
        ele=q.pop(0)
        print(ele)
        for i in graph[ele]:
            if i not in visited:
                q.append(i)
                visited.append(i)
graph={10:[20,40,50],20:[10,40],50:[10,40,30],40:[10,20,30,50],30:[40,50]}
bfs(graph,20)



'''graph = {
    'A': ['B', 'D','C'],'B': ['A','D', 'H'],'C': ['A','D','E'],'D': ['K','A','B','C','E'],'E': ['C','D'],'H': ['B'],'K':['D']}

visited = set() 

def dfs(node):
    visited.add(node)
    print(node)

    for neighbor in graph[node]:
        if neighbor not in visited:
            dfs(neighbor)
dfs('B')'''


def dfs(graph, start, visited = None):
    if visited == None:
        visited = []
    visited.append(start)
    print(start)
    for i in graph[start]:
        if i not in visited:
            visited.append(i)
            dfs(graph, i, visited)



graph = {
    10: [20,40,50],
    20: [10,40],
    30: [40,50],
    40: [10,20,30,50],
    50: [10,40,30]
}
dfs(graph, 20)

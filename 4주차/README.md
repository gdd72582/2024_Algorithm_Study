# 4. DFS & BFS

# 주제 : 깊이 우선 탐색과 너비 우선 탐색
기한: 2024.02.02 ~2024.02.07

[복습 문제] 저번 주제 였던 DP 문제 최소 한문제 이상 풀어오기

[필수 문제]

| DFS |  | BFS |  |
| --- | --- | --- | --- |
| 11724 | https://www.acmicpc.net/problem/11724 | 1260 | https://www.acmicpc.net/problem/1260 |
| 2023 | https://www.acmicpc.net/problem/2023 | 2178 | https://www.acmicpc.net/problem/2178 |
| 13023 | https://www.acmicpc.net/problem/13023 |  |  |

[추가 문제]

필수문제를 제외하고 추천 문제 혹은 백준 카테고리 [DFS, BFS]를 참고하여 더 많은 문제를 풀어보세요!

[문제집: DFS, BFS 추천문제 (c3171700)](https://www.acmicpc.net/workbook/view/1833)

[[알고리즘] 깊이 우선 탐색(DFS) 과 너비 우선 탐색(BFS)](https://devuna.tistory.com/32)

---

## 깊이 우선 탐색 (DFS)

: 깊이 우선 탐색은 그래프의 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정하여 최대 깊이까지 탐색을 마친 후 다른 쪽 분기로 이동하여 다시 탐색을 수행하는 알고리즘입니다.

| 기능 | 특징 | 시간 복잡도 |
| --- | --- | --- |
| 그래프 완전 탐색 | - 재귀 함수로 호출
- 스택 자료구조 이용 | O(V+E) - 인접 리스트일 경우
(V : 노드 수, E: 엣지 수) |

### 알고리즘 과정

      **① 시작 정점 v를 결정하여 방문**

**② 정점 v에 인접한 정점 중**

1. 방문하지 않은 정점 w가 있으면, 정점 v를 스택에 push 하고 w를 방문하고 w를 v에 대입하여 ②과정 반복 수행

2. 방문하지 않은 정점이 없으면, 탐색의 방향을 바꾸기 위해 마지막 방문 정점을 스택을 pop 하여 받은 정점 v로 하여 다시 ②과정 반복 수행

**③ 스택이 공백이 될 때까지 ②반복 수행**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/b3a032c5-430f-4337-84e1-1112d70b3e98/67ce1d20-6ef0-42b3-b2c7-45c63977f2c2/Untitled.png)

- pseudo code

```java
DFS(v)
    for (i ← 0; i<n; i ← i+1) do {
        visited[i] ← false;
    }
    stack ← createStack();
    visited[v] ← true;
    while (not isEmpty(stack)) do {
        if (visited[v의 인접정점 w] = false) then {
            push(stack, v);
            visited[w] ← true;
            w 방문;
            v ← w;
        }
        else v ← pop(stack);
    }
end DFS()
```

- 재귀 호출 사용

```java
static Stack<Integer> stack = new Stack<>();
static StringBuilder sb = new StringBuilder();
static boolean node[][] = new boolean[n+1][n+1], visited[] = new boolean[n+1];
static void dfs(int v) {
    if(visited[v])
        return;
    sb.append(v+" ");
    for(int i=1; i<=n; i++)
        if(node[v][i] && !visited[i]) {
            visited[i] = true;
            dfs(i);
        }
}
```

- 스택 사용

```java
public static String dfs(int v, boolean node[][]) {
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    boolean visited[] = new boolean[n+1];
    stack.add(v);
    int idx;
    while(!stack.isEmpty()) {
        idx = stack.pop();
        if(visited[idx])
            continue;
        visited[idx] = true;
        sb.append(idx+" ");
        for(int i=0; i<n; i++)
            if(node[idx][i] && !visited[i])
                stack.add(i);
    }
    return sb.toString();
}
```

---

## 너비 우선 탐색 (BFS)

: 완전탐색하는 방법 중 하나로, 시작 노드에서 출발해 시작 노드를 기준으로 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘

| 기능 | 특징 | 시간 복잡도 |
| --- | --- | --- |
| 그래프 완전 탐색 | - FIFO 탐색
- Queue 자료구조 이용 | O(V+E) - 인접 리스트일 경우
(V : 노드 수, E: 엣지 수) |

### 알고리즘 과정

      **① BFS에 시작할 노드를 정한 후 사용할 자료구조(큐) 초기화**

**② 큐에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 큐에 삽입하기 (방문 배열 체크)**

**③ 큐에 값이 없을 때까지 반복**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/b3a032c5-430f-4337-84e1-1112d70b3e98/25c0a485-68e2-4091-9832-3fc79fb35aee/Untitled.png)

```java
static void bfs(int start) {
        visited[start] = 1; // 0은 방문 처리
        queue.add(start); // 0을 큐에 저장

        while(!queue.isEmpty()){ // 큐에 아무것도 없을때까지 동작
            int cur = queue.poll(); // 큐에서 제일 먼저 넣은 정점을 꺼냄
            for(int next : nodeList[cur]) {
                if(visited[next] == 0) { // 이어진 점이 방문한 곳이 아니면
                    visited[next] = 1; // 방문 처리하고
                    queue.add(next); // 큐에 방문한 정점을 저장
                }
            }
        }
    }
```

---

DFS와 BFS는 앞으로 진행할 주제에 필요한 기초입니다. 자료구조 강의 내용을 복습해보면서 문제 풀이에 도전해보세요!

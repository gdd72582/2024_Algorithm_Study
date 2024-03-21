# 6. BackTracking & Branch and Bound
- 2024.02.26 ~ 2024.03.05

[복습 문제]

[필수 문제]

| 15649 ~ 15652 | [N과 M 시리즈](https://www.acmicpc.net/problem/15649) |
| --- | --- |
| 9663 | [N-Queen](https://www.acmicpc.net/problem/9663) |
| 14888 | [연산자 끼워넣기](https://www.acmicpc.net/problem/14888) |

[추가 문제]

[백트래킹 단계](https://www.acmicpc.net/step/34)

## BackTracking & Branch and Bound

[Backtracking Algorithm Design Method (백트래킹 알고리즘)](https://sepang2.tistory.com/38)

[[알고리즘] 분기한정법 -  0-1 배낭 채우기, 외판원 순회](https://kimmessi.tistory.com/100)

### 백트래킹 BackTracking

: DFS의 수정된 버전으로 재귀적으로 문제를 하나씩 풀어가면서 현재 재귀를 통해 확인 중인 노드(상태)가 제한된 조건에 위배되는지 판단하고, 만약 해당 노드가 제한된 조건을 위배한다면 그 노드를 제외하고 다음 단계로 나아가는 방식이다.

백트래킹은 현재 상태에서 다음상태로 가는 모든 경우의 수를 찾아서 이 모든 경우의수가 더 이상 유망하지 않다고 판단되면 이전의 상태로 돌아가는 것을 말한다.

여기서 더 이상 탐색할 필요가 없는 상태를 제외하는 것을 **가지치기(pruning)**라고도 한다.

### 분기 한정법 Branch and Bound

**: 백트래킹**에서 부가적으로 발생한 알고리즘 설계 기법

: BFS를 사용하여 더 빠르게 최적해를 구한다.

### Backtracking과의 공통점 및 차이점

- 공통점
    - 경우들을 차례로 나열하는 방법 필요
- 차이점
    - Backtracking: 가보고 더 이상 진행이 되지 않으면 돌아온다.
    - Branch&Bound: 최적해를 찾을 가능성이 없으면 분기를 하지 않는다.
    

분기 한정법은 특정 마디가 유망한지를 결정하기 위해서 그 마디에서의 수, 한계값(Bound)을 계산한다.
그리고 최적의 한계값을 가진 노드의 자식을 방문한다.

[[알고리즘 - 이론] 0-1 KnapSack Problem and Fractional KnapSack Problem (0-1 배낭 문제, 분할 가능한 배낭 문제)](https://hi-guten-tag.tistory.com/160)

---

이번주 주제인 백트래킹과 분기한정법은 DFS, BFS관련된 주제들이에요. 저번에 스터디했던 것을 바탕으로 재밌게 공부해봐요🤓

 분기 한정법은 필수 문제에서 제외했기 때문에 인터넷에 검색하여 관련한 예시 문제들을 살펴보면서 그 방법을 익히시길 권장드립니다. 분기 한정법의 KnapSack 문제는 강의에서도 소개되니 꼭 풀이 과정을 공부해주세요!

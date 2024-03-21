# 2. Divide and Conquer Algorithm

## 주제 : 분할 정복 알고리즘
- 기한 : 2023/01/06 ~ 2023/01/12

[복습 문제]

| 9663 | [N-Queen](https://www.acmicpc.net/problem/9663) |
| --- |-------------------------------------------------|

`백트래킹` 을 검색해보세요. 나중에 진행할 주제를 미리 학습해봅시다. 완전탐색 복습 겸 도전해볼만한 문제를 가져와봤습니다. 어려운 문제일 수 있으니 다른 사람의 설명을 참고하여 공부하셔도 괜찮습니다.

[필수 문제]

| 이진 탐색 |                                                 | 정렬 알고리즘 |                                                  |
| --- |-------------------------------------------------| --- |--------------------------------------------------|
| 10815 | [숫자카드](https://www.acmicpc.net/problem/10815)   | 2751 | [수 정렬하기 2](https://www.acmicpc.net/problem/2751) |
| 10816 | [숫자 카드2](https://www.acmicpc.net/problem/10816) | 11004 | [K번째 수](https://www.acmicpc.net/problem/11004)   |
| 2805 | [나무 자르기](https://www.acmicpc.net/problem/2805)  | 11650 | [좌표 정렬하기](https://www.acmicpc.net/problem/11650) |

[추가 문제]

각 소 주제에 대한 밑의 설명 참조.

---

여러분 방학 첫주 수고 많으셨어요😉 본격적인 알고리즘 스터디가 진행될 2-3주차 주제는 분할 정복과 동적 계획법(DP)입니다. 저번 주에 진행했던 완전탐색과 재귀는 효율이 좋지 않다고 했었는데요. 그것을 해결할 방법 두 가지를 소개하겠습니다. 

### 1. 분할 정복

**주어진 문제를 작은 부분 문제들로 분할하고, 각 부분 문제를 해결하여 전체 문제를 해결하는 알고리즘입니다.** 각 부분 문제의 해결 과정이 서로 영향을 미치지 않아야 하며, 이를 "서로 disjoint"하다고 합니다.

분할정복 알고리즘은 일반적으로 아래와 같은 세 단계로 구성이 됩니다.

1. **분할(Divide)** : 해결하고자 하는 문제를 작은 부분 문제들로 분할한다. 이 단계에서는 주로 문제의 크기를 절반으로 중리거나, 부분 문제들로 분할하는 등의 작업을 수행한다.
2. **정복(Conquer)** : 분할된 부분 문제들을 재귀적으로 해결한다. 부분 문제들이 충분히 작아지면, 직접적인 해결이 가능해진다.
3. **합병(Merge)** : 부분 문제들의 해답을 결합하여 전체 문제의 해답을 만든다. 이 단계에서는 정복된 부분 문제들의 결과를 합치는 작업을 수행한다.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/b3a032c5-430f-4337-84e1-1112d70b3e98/c4a5d459-5088-4817-b397-28b9ced0c3d7/Untitled.png)

장점 : 문제를 분할하는 과정이 병렬적으로 수행되고, 해결방법이 독립적이기 때문에 복잡한 문제를 해결하는 다양한 알고리즘에 적용가능합니다. 또한, 재귀적인 코드로써 가독성이 좋고, 디버깅이 쉽다는 장점이 있습니다.

단점 : 분할과 병합을 수행하는 과정에서 추가적인 메모리를 사용해야 합니다. 재귀호출에 따른 오버헤드가 발생할 수 있습니다.

<aside>
<img src="/icons/checkmark-line_gray.svg" alt="/icons/checkmark-line_gray.svg" width="40px" /> 분할 정복 디자인 패턴이 적용된 알고리즘 (이번주 문제 목록)

- 이진탐색 Binary Search
- 합병 정렬 Merge Sort
- 퀵 정렬 Quick Sort
- 두 큰 수를 곱하는 알고리즘
- Strassen’s algorithm

(자세한 설명은 밑에)

</aside>

---

### 다이나믹 프로그래밍 (Dynamic Programming)

다음 주에 진행할 주제인 다이나믹 프로그래밍은 복잡한 문제를 간단한 하위 문제로 나누어 푸는 알고리즘 설계 기법 중 하나입니다. 분할 정복과 비슷한 개념을 가지고 있지만, 계산을 한 번만 진행하고 그 결과를 재활용하여 효율적인 계산을 수행한다는 차이점이 있습니다. **분할정복과는 달리 DP는 부분 문제의 해가 서로 disjoint하지 않을 수 있습니다.** (자세한 설명은 다음주에 하도록 하겠습니다.)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/b3a032c5-430f-4337-84e1-1112d70b3e98/22bad02c-9e29-4d3b-bbea-18af31d9e01f/Untitled.png)

---

### 이진탐색 :

[이진탐색 백준 문제 추천](https://won-percent.tistory.com/25)

블로그에 적혀있는 설명과 문제를 참고하여 과제 문제를 풀기 전 기초 문제를 풀어보시는 것을 추천드립니다.

| 1920 | https://www.acmicpc.net/problem/1920 |
| --- | --- |
| 10816 | https://www.acmicpc.net/problem/10816 |
| 2805 | https://www.acmicpc.net/problem/2805 |
| 1654 | https://www.acmicpc.net/problem/1654 |
| 10815 | https://www.acmicpc.net/problem/10815 |

### 정렬 알고리즘:

[합병 정렬(=병합 정렬) 이란?](https://todaycode.tistory.com/54)

[자바 [JAVA] - 퀵 정렬 (Quick Sort)](https://st-lab.tistory.com/250)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/b3a032c5-430f-4337-84e1-1112d70b3e98/6767fcc8-b752-4c2d-8121-8738cd7a4783/Untitled.png)

사실 정렬문제는 Java 내장함수인 sort를 쓰면 쉬울 일입니다. sort함수는 내부적으로 quick sort를 수행합니다. 그러나 c언어로 진행하는 알고리즘 수업을 위해서는 직접 구현해보는 것도 좋겠습니다. 그리고, 공부를 위해서 MergeSort등 여러가지 알고리즘을 구현하여 사용해보세요. 문제를 맞추는 것도 중요하지만, 어떤 코드로 썼느냐가 중요한 문제에요. 여러 정렬 알고리즘을 사용하여 시간복잡도와 공간복잡도를 비교하여 보세요. 컴파일 타임이 오버된다면 다른 알고리즘을 사용해보셔도 됩니다.

| 2751 | https://www.acmicpc.net/problem/2751 |
| --- | --- |
| 11004 | https://www.acmicpc.net/problem/11004 |
| 11650 | https://www.acmicpc.net/problem/11650 |
| 1940 |  https://www.acmicpc.net/problem/1940 |

### 큰 수의 곱셈 (Strassen Algorithm)

[[분할 정복] Strassen algorithm](https://izmirprogramming.tistory.com/13)

| 2740 | https://www.acmicpc.net/problem/2740 |
| --- | --- |

기본적인 행렬곱셈으로 문제를 풀어도 문제가 풀리지만, 슈트라센 알고리즘으로 풀어보면 좋을 것 같아요. 큰 수의 곱셈은 문제로 풀어보기 보단 어렵지만 개념을 익혀보는 것이 좋을 것 같습니다. 인터넷으로 큰 수의 곱셈을 분할정복법으로 해결하는 풀이를 찾아보세요.



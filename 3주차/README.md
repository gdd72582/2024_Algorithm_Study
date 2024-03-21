# 3. Dynamic Programming

## 주제: 동적계획법
- 기한 : 2024.01.23 ~ 2024.01.30

[복습 문제]

지난 스터디 과제 중에 풀지 못한 문제 풀기. 특히 merge sort와 quick sort를 직접 구현하여 문제를 풀어주세요.

[필수 문제]

난이도 순으로 DP 문제에 도전하세요! ❤️‍🔥 문제를 위주로 풀지만, 잘 풀린다면 더 어려운 문제까지 풀어봅시다. 계절학기가 끝난 만큼 더 많은 문제를 풀어보면 좋을 것 같아요😉 이번 주도 화이팅입니다.

[추가 문제]
|  |  |
| ---- | ---- |
[문제집: 좋은 DP문제들 (khanjhy)](https://www.acmicpc.net/workbook/view/7836)

| 난이도 | 문제 | 문제 제목                                                    | 필수문제 |
| --- | --- |----------------------------------------------------------| --- |
| Beginner | 2748 | [피보나치 수 2](https://www.acmicpc.net/problem/2748)         |  |
|  | 1463 | [1로 만들기](https://www.acmicpc.net/problem/1463)           | ❤️‍🔥 |
|  | 9095 | [1, 2, 3 더하기](https://www.acmicpc.net/problem/9095)      |  |
|  | 2579 | [계단 오르기](https://www.acmicpc.net/problem/2579)           |  |
|  | 14501 | [퇴사](https://www.acmicpc.net/problem/14501)              | ❤️‍🔥 |
|  | 2793 | [이친수](https://www.acmicpc.net/problem/2193)              | ❤️‍🔥 |
|  | 11726 | [2×n 타일링](https://www.acmicpc.net/problem/11726)         |  |
| Intermediate | 11722 | [가장 긴 감소하는 부분 수열](https://www.acmicpc.net/problem/11722) |  |
|  | 15486 | [퇴사 2](https://www.acmicpc.net/problem/15486)            |  |
|  | 1520 | [내리막 길](https://www.acmicpc.net/problem/1520)            ||  |
|  | 11066 | [파일 합치기](https://www.acmicpc.net/problem/11066)          | ❤️‍🔥 |
|  | 11049 | [행렬 곱셈 순서](https://www.acmicpc.net/problem/11049)        | ❤️‍🔥 |
|  | 9252 | [LCS 2](https://www.acmicpc.net/problem/9252)            | ❤️‍🔥 |
| Advanced | 1562 | [계단 수](https://www.acmicpc.net/problem/1562)             |  |
|  | 11570 | [환상의 듀엣](https://www.acmicpc.net/problem/11570)          |  |
|  | 2618 | [경찰차](https://www.acmicpc.net/problem/2618)              |  |
|  | 6989 | [채점](https://www.acmicpc.net/problem/6989)               |  |
|  | 2315 | [가로등 끄기](https://www.acmicpc.net/problem/2315)           |  |
|  | 1126 | [같은 탑](https://www.acmicpc.net/problem/1126)             |  |
|  | 1315 | [RPG](https://www.acmicpc.net/problem/1315)                     |  |
|  | 2419 | [사수아탕](https://www.acmicpc.net/problem/2419)                  |  |
|  | 12766 | [지사 배정](https://www.acmicpc.net/problem/12766)                    |  |
|  | 5466 | [상인](https://www.acmicpc.net/problem/5466)                     |  |

---

여러분, 힘들었던 겨울 계절학기가 끝났습니다. 이제부터는 알고리즘에 더욱 몰입할 수 있을 것 같아요! 이번주는 예고했던 대로 동적 계획법에 대해 알아보겠습니다.

### 동적 계획법이란?

동적계획법은 복잡한 문제를 여러 개의 간단한 문제로 분리하여 부분의 문제들을 해결함으로써 최종적으로 복잡한 문제의 답을 구하는 방법을 뜻합니다. 

네, 저번주에 진행했던 분할정복과 비슷하지만 차이점이 있습니다. 동적계획법은 작은 문제들이 반복돼 나타난다는 것입니다.

![스크린샷 2024-01-23 오전 6.03.24.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/b3a032c5-430f-4337-84e1-1112d70b3e98/2df9aed3-cb06-4104-8f13-68f1f96e1d59/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2024-01-23_%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB_6.03.24.png)

### 동적 계획법의 원리와 구현 방식

1. 큰 문제를 작은 문제로 나눌 수 있어야 한다.
2. 작은 문제들이 반복돼 나타나고 사용되며 이작은 문제들의 결과값은 항상 같아야한다.
3. 모든 작은 문제들은 한 번만 계산해 DP 테이블에 저장하며 추후 재사용할 때는 이 DP 테이블을 이용한다. 이를 메모이제이션 memoization 기법이라고 한다.
4. 동적 계획법은 top-down 방식과 bottom-up 방식으로 구현할 수 있다.

### 예시 - 피보나치 수열

피보나치 수열을 재귀적으로 구현할 때 return f(n) = f(n-1) + f(n-2) 코드를 작성한다.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/b3a032c5-430f-4337-84e1-1112d70b3e98/27be3434-89f8-4371-84e0-6559a18e25f5/Untitled.png)

이때 **f(3), f(2), f(1)과 같이 동일한 부분 문제가 중복**되어 나타나는데, 이때 DP 테이블에 값이 저장되어 있다면 문제를 재계산하지 않고 리턴하도록 한다.

```java
//main 함수에서//
D = new int[n+1];

D[0] = 0;
D[1] = 1;

fibo(n);
```

아래는 이를 **Top-Down** 방식으로 구현한 코드이다.

```java
static int fibo(int n){
    if(D[n] != -1) //기존에 계산한 적이 있는 값은 DP 테이블에서 리턴
        return D[n];
    return D[n] = fibo(n-2) + fibo(n-1); 
//구한 값을 바로 리턴하지 않고 DP 테이블에 저장한 후 리턴

```

**Bottom-Up** 방식으로 구현하면 보통 반복문의 형태이다.

```java
for(int i = 2; i <= n ; i++){
    D[i] = D[i-2] + D[i-1];
}
```

간단하게 동적 계획법에 대해 설명하였는데요. 추가로 DP 와 관련하여 강의노트에 첨부되어 있는 내용도 추가학습하면 좋을 것 같습니다.

- Floyd’s Algorithm
- Optimal Binary Search Tree using DP

https://www.notion.so/3-Dynamic-Programming-686689cefdef4ff987596d291ed6b852?pvs=4#bc1f42e56c1844f6a99c8d6a9a410982
https://doorbw.tistory.com/65
https://velog.io/@tg-96/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Optimal-Binary-Search-TreeOBST

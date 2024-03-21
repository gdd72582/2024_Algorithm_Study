# 5. Greedy

# 주제: 그리디 알고리즘
- 기간: (2024.02.07 ~2024.02.18)
[복습 문제] 자신이 부족하다고 생각하는 주제의 문제를 하나 이상 풀어보세요

[필수 문제]

|11047|[동전 0](https://www.acmicpc.net/problem/11047) |
|---|---|
|1715|[카드정렬하기](https://www.acmicpc.net/problem/1715) |
|1744|[수묶기](https://www.acmicpc.net/problem/1744) |
|1931|[회의실배정](https://www.acmicpc.net/problem/1931) |
|1541|[잃어버린 괄호](https://www.acmicpc.net/problem/1541) |

[추가 문제]

그리디 문제도 앞으로 한 주에 하나씩 더 풀어보면 좋을 것 같아요😗

[13458번 시험감독](https://www.acmicpc.net/problem/13458)

[4796번 캠핑](https://www.acmicpc.net/problem/4796)

[10610번 30](https://www.acmicpc.net/problem/10610)

[1783번 병든 나이트](https://www.acmicpc.net/problem/1783)

[11000번 강의실 배정](https://www.acmicpc.net/problem/11000)

[11399번 ATM](https://www.acmicpc.net/problem/11399)

[2217번 로프](https://www.acmicpc.net/problem/2217)

[1946번 신입 사원](https://www.acmicpc.net/problem/1946)

[12845번 모두의 마블](https://www.acmicpc.net/problem/12845)

[1969번 DNA](https://www.acmicpc.net/problem/1969)

---

## 그리디 알고리즘 이란?

그리디 알고리즘(탐욕법, 탐욕 알고리즘)그리디 알고리즘은 Greedy(탐욕,욕심쟁이)라는 이름처럼 **지금 당장 최적인 답을 선택**하는 과정을 반복하여 결과를 도출하는 알고리즘이다.

그리디 알고리즘은 말 그대로 각 단계에서 미래를 생각하지 않고, 그 순간 가장 최선의 선택을 하는 기법이기 때문에 종합적인 결과에 대해서는 최적의 해를 보장할 수 없다. (지역적(local)으로는 최적의 선택이지만 이를 반복하더라도 전체적(global)으로는 최적의 해가 아닐 수 있음)

계산이 매우 빠르다는 장점이 있다.

그리디 알고리즘을 적용하여 최적해를 구할 수 있는 문제는 다음 두 조건을 만족한다.

1. greedy choice property: 현재 선택이 이 후의 선택에 영향을 주지 않음
2. optimal substructure: 매 순간의 최적의 해가 문제 전체에 대한 최적의 해여야 함

## 추가 학습 내용

---

- 다익스트라
- 프림
- 크루스칼
- 허프만

### **다익스트라**

[[필수 알고리즘] 다익스트라 알고리즘(Dijkstra Algorithm) 이해](https://cobi-98.tistory.com/46)

[백준 1753번 - 최단경로](https://www.acmicpc.net/problem/1753)

[백준 1504번 - 특정한 최단 경로](https://www.acmicpc.net/problem/1504)

[백준 1446번 - 지름길](https://www.acmicpc.net/problem/1446)

[백준 1916번 - 최소비용 구하기](https://www.acmicpc.net/problem/1916)

[백준 5972번 - 택배 배송](https://www.acmicpc.net/problem/5972)

[백준 17396번 - 백도어](https://www.acmicpc.net/problem/17396)

[백준 1238번 - 파티](https://www.acmicpc.net/problem/1238)

### **프림**

[[알고리즘 기본]PRIM 알고리즘](https://jinniepark.tistory.com/46)

### **크루스칼**

[크루스칼 알고리즘(Kruskal Algorithm)](https://ip99202.github.io/posts/%ED%81%AC%EB%A3%A8%EC%8A%A4%EC%B9%BC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98/)

|1922|[네트워크 연결](https://www.acmicpc.net/problem/1922) |
|---|---|
|1647|[도시 분할 계획](https://www.acmicpc.net/problem/1647) |
|6497|[전력난](https://www.acmicpc.net/problem/6497) |
|2887|[행성 터널](https://www.acmicpc.net/problem/2887) |

### **허프만**
https://mirrorofcode.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Huffman-code-%ED%97%88%ED%94%84%EB%A7%8C%EC%BD%94%EB%93%9C

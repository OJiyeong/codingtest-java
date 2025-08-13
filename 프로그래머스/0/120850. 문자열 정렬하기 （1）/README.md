# [level 0] 문자열 정렬하기 (1) - 120850 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120850) 

### 성능 요약

메모리: 88.1 MB, 시간: 0.06 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 08월 13일 17:33:23

### 문제 설명

<p>문자열 <code>my_string</code>이 매개변수로 주어질 때, <code>my_string</code> 안에 있는 숫자만 골라 오름차순 정렬한 리스트를&nbsp;return 하도록 solution 함수를 작성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 100</li>
<li><code>my_string</code>에는 숫자가 한 개 이상 포함되어 있습니다.</li>
<li><code>my_string</code>은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.
- - -</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"hi12392"</td>
<td>[1, 2, 2, 3, 9]</td>
</tr>
<tr>
<td>"p2o4i8gj2"</td>
<td>[2, 2, 4, 8]</td>
</tr>
<tr>
<td>"abcde0"</td>
<td>[0]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"p2o4i8gj2"에 있는 숫자 2, 4, 8, 2를 오름차순 정렬한 [2, 2, 4, 8]을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>"abcde0"에 있는 숫자 0을 오름차순 정렬한 [0]을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

<br>

---

<br>

<h3>아스키코드 - 문자-숫자 변환<br></h3>
<img width="431" height="893" alt="image" src="https://github.com/user-attachments/assets/939facb8-6382-43d6-8b00-3f82a5c72cd3" />
<br>

<ul>
<li>숫자 0은 48, 숫자 9는 57</li>
<li>A는 65, Z는 90</li>
<li>a는 97, z는 122</li>
</ul>

<br>

<p>
<b>char c = my_string.charAt(i);<br>
int n = c - '0';</b>

c는 문자값이기 때문에 정수 값(0, 2, ...)이 아니라 아스키코드 값(48, 50, ...)이다.<br>
그래서 문자 '0'의 아스키코드 값을 빼서 나온 값이 실제 정수 값이 된다.

<b>int n = c - '0';</b><br>
이 과정이 가능한 이유는 자바의 문자(char)와 정수(int)간의 암묵적인 타입 변환을 지원하기 때문이다.<br>
정수형에 문자를 넣으면 내부적으로는 해당 문자의 아스키코드값이 저장된다. 반대로 문자형에 정수를 넣으면 자동으로 해당 숫자의 아스키코드값이 저장돼 출력을 하게 되면 char형으로 출력이 된다  
</p>

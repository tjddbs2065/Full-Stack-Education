##### SELECT란?
- 데이터 조회
- 문법) 
``` SQL
SELECT [DISTINCT] 컬럼명1, 컬럼명2, ...
FROM 테이블명
[WHERE 조건]
[GROUP BY 컬럼명1, 컬럼명2, ...]
[HAVING 그룹조건]
[ORDER BY 컬럼명 [ASC|DESC]]
[LIMIT 숫자];
```
##### SELECT의 하위 문법
- FROM: 어떤 테이블에서 데이터를 가져올 지 지정
	- [[JOIN]]: 테이블 연결
- [[WHERE]]: 행을 필터링하는 조건 지정
- [[DISTINCT]]: 중복제거
- [[ORDER BY]]: 결과 행을 정렬한다(기본으로 오름차순)
- [[GROUP BY]]: 데이터 그룹화 및 집계
- [[HAVING]]: 그룹 조건 필터링
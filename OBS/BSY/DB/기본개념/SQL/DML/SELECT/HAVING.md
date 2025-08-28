##### HAVING이란?
- `GROUP BY`와 함께 사용하고, 그룹을 필터링한다.
``` SQL
SELECT department, AVG(salary) AS 평균급여
FROM employees
GROUP BY department
HAVING AVG(salary) >= 5000;
```
- `GROUP BY`를 통해 얻은 그룹 결과에 대해서 필터링을 적용한다.
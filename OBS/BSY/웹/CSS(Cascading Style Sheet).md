##### CSS
- HTML 문서를 예쁘게 꾸며주는 기법
- 보여주는 방식 = 디자인

##### CSS 적용 방법
1. 인라인 스타일(비추천)
``` html
<p style="color:red;">hi</p>`
```
2. 내부 스타일시트
``` html
<style>
	p { color: red;}
</style>
```
3. ==외부 스타일시트(권장)==
```html
<link rel="stylesheet" href="style.css">
```
> `.css` 파일을 따로 만들어 관리한다.


##### 선택자(Selector)
- 요소(element) 선택자: `p {}`
- 클래스 선택자: `.box {}`
- 아이디 선택자: `#box {}`
- 그룹 선택자: `h1, h2, p {}`

##### 우선순위
- 인라인 > ID > Class > Element
 

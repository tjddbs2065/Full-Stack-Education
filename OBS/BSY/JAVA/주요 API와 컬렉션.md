##### Object 클래스
- `hashCode()`, `toString()`, `equals(Object obj)`
- VO/DTO에서는 오버라이딩 권장

##### String/StringBuffer
- String: 불변(Immutable)
- StringBuffer: 가변, 문자열 조작 효율적

##### Collection API
- Collection 인터페이스: List, Set
- List: 순서 O, 중복 O(`ArrayList`, `LinkedList`)
- Set: 순서 X, 중복 X(`HashSet`, `TreeSet`)
- Map: Key-Value 관리, Key는 중복 불가(Set으로 관리)

##### 제네릭
- 타입 안정성 확보, 형변환 불필요

##### 오토박싱/언박싱
- 기본형 ↔ Wrapper 자동 변환

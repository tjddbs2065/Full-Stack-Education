##### Garbage Collector란?
Java에서 JVM 메모리를 관리하는 방법이다.
Heap 영역에서 동적으로 할당했던 객체의 메모리는 ==참조가 끊기면 메모리 해제 대상==이 된다.
참조가 끊겨 메모리 해제 대상이 된 객체를 모아 ==주기적으로 제거==한다.

##### 어떤 객체가 GC 대상인가?
더 이상 참조(reference)가 되지 않는 객체가 정리의 대상이 된다.
``` java
public class Main {
    public static void main(String[] args) {
        String s = new String("Hello");
        s = null;  // "Hello" 객체는 더 이상 참조되지 않음 → GC 대상
    }
}
```
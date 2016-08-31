## Summary

### Context Configuration 방법들
* XML 설정
* Annotation 설정
* Java Bean 설정
* Groovy DSL 설정

위 설정들을 섞어서 사용 할 수도 있음 (관련 Document 는 Spring.io 의 Reference Document 를 참조하기)

### Annotations

|*Marker*|*설명*|
|------|----|
|@Component|@Component 스프링 관리 컴포넌트로 인식하는 마커. 범용으로 많이 쓰인다.|
|@Repository|@Component Annotation 을 특화 한 것. 데이터 접근 객체의 역할을 수행한다. 다른 도구나 Spring 컨테이너 내부에서도 이 Annotation 을 붙인 클래스를 특별하게 인식할 수 있다|
|@Service|@Component Annotation 을 특화 한 것. 서비스 계층의 역할을 수행한다|
|@Controller|@Component Annotation 을 특화한 것, Web Context 에서 사용됨|

* *3장* 서로 다른 설정 적용하기
	- [04 자바 빈 설정 사용하기](com/apress/isf/spring/config/04.md)

* *4장* Bean Scope 사용하기
 

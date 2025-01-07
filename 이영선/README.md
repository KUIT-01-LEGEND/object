# 오브젝트 정리

## 1️⃣ 객체, 설계

> 객체지향 프로그램을 설계하고 유지보수 하기 위해서 실무, 즉 코드 자체에 초점을 맞출 것이다.
> 직접 만들어 보며 배우기!

- 애플리케이션의 핵심 클래스
  ![](image/13p.png)
  ![](image/13p_class_diagram.png)
    - 이 코드의 문제점
        - Theater가 Audience의 Bag와 TicketSeller의 TicketOffice에 직접 접근한다.

          = Theater가 Audience와 TicketSeller에 결합된다.

          = 객체가 자율적이지 않고 수동적이다.
          → Audience와 TicketSeller가 스스로 자신의 데이터를 관리하도록 한다. 자율적인 존재로 만들자.

          외부에는 메서드라는 API (인터페이스)만 제공하고, 내부의 구현은 숨기자.
          - TicketSeller는 sellTo() 메서드만 제공
          - Audience는 buy() 메서드만 제공



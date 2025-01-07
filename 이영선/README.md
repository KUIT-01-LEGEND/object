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

- 🌟 **캡슐화** : 외부에는 메서드라는 API (인터페이스)만 제공하고, 내부의 구현은 숨기자.
  - TicketSeller는 sellTo() 메서드만 제공
  - Audience는 buy() 메서드만 제공

  장점
  - TicketSeller.sellTo(), Audience.buy()의 내부 구현을 변경해도 Theater에는 아무 지장이 없다.
  - TicketSeller, Audience 객체의 자율성을 높였다. 유연한 설계 & 객체의 응집도 향상
  > 응집도가 높다 
  > 
  > = 밀접하게 연관된 작업만 수행하고 연관성 없는 작업은 다른 객체에게 위임한다.
  >              
  > = 자신의 데이터를 스스로 책임진다. (처리한다.)
- 
![](image/24p_class_diagram.png)

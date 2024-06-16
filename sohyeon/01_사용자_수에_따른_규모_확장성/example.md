1. 기본 개념 이해
    - MSA 기본 개념
    : msa 는 microservice Architecture 의 줄임말로 어플리케이션을 서비스 모음모음으로 구성하는 아키텍처 스타일입니다.
      서비스들은 각각 독립적으로 배포가 가능하며, 느슨한 결합으로 이루어져있습니다.

    - 나온 이유(= 목적)
    - 모놀리식 아키텍처 vs 마이크로서비스 비교 및 장단점

2. MSA 사용하면서 필요한 보완 기술 이해
   - 메시지 브로커 
     - 정의
     - 종류 ex) RabbitMQ, Apache Kafka > 추가로 둘도 비교 
   - 로드 밸런서 
     - 정의
     - 종류
   - API gateway
     - 정의
     - 주요 도구 ex) NGINX, Kong, Zuul 알아보기
   - DB 
     - 마이크로서비스에서의 DB 설계
     - Polyglot Persistence 및 분산 데이터 관리 공부

3. MSA 의 핵심 개념 및 패턴
   - 서비스 디스커버리
     - 서비스 레지스트리 
     - 서비스 디스커버리 패턴 ex) Eureka, Consul 등
   - API 통신
     - Restful
     - gRPC
     - GraphQL
   - 데이터 관리
     - 분산 트랜젝션
     - SAGA 패턴
     - CQRS 
     - Event Sourcing


[실전]
- 기술 스택과 도구 선택
   언어 및 프레임워크: Java(Spring Boot), Node.js(Express), Python(Django/Flask), .NET Core 등 주요 언어와 프레임워크를 선택하세요.
   API 게이트웨이: API 게이트웨이 패턴과 주요 도구(NGINX, Kong, Zuul 등)에 대해 알아보세요.
   데이터베이스: 마이크로서비스와 데이터베이스 설계, 특히 Polyglot Persistence 및 분산 데이터 관리에 대해 공부하세요.
   메시징 시스템: RabbitMQ, Apache Kafka 등 메시징 시스템의 역할과 사용법을 이해하세요.
- 핵심 개념 및 패턴
   서비스 디스커버리: 서비스 레지스트리 및 서비스 디스커버리 패턴(Eureka, Consul 등)에 대해 공부하세요.
   API 통신: RESTful API와 gRPC, GraphQL 등 통신 방법에 대해 알아보세요.
   데이터 관리: 분산 트랜잭션, SAGA 패턴, CQRS, Event Sourcing 등을 공부하세요.
   분산 로깅 및 모니터링: ELK Stack(Elasticsearch, Logstash, Kibana), Prometheus, Grafana 등 도구를 활용한 로깅 및 모니터링 방법을 익히세요.
   오토메이션 및 CI/CD: Jenkins, GitLab CI/CD, GitHub Actions 등을 사용한 지속적 통합과 배포 방법을 익히세요. 
- 실습 프로젝트
   단계별 프로젝트: 간단한 프로젝트를 시작으로 점차 복잡한 마이크로서비스 프로젝트를 만들어 보세요.
   샘플 코드: GitHub에서 다양한 마이크로서비스 샘플 프로젝트를 찾아보세요. 예를 들어, Spring Boot를 사용한 Spring Cloud Sample 프로젝트를 참고하세요. 
- 리소스 및 커뮤니티 참여
   온라인 코스: Coursera, Udemy, Pluralsight 등의 플랫폼에서 MSA 관련 강의를 수강하세요.
   서적: "Building Microservices" by Sam Newman, "Microservice Architecture" by Irakli Nadareishvili 등 추천 도서를 읽어보세요.
   블로그 및 포럼: 관련 블로그, Stack Overflow, Reddit, Hacker News 등의 커뮤니티에 참여하여 질문하고 경험을 공유하세요. 
- 클라우드 플랫폼
   클라우드 제공자: AWS, Azure, Google Cloud Platform 등의 클라우드 서비스에서 제공하는 MSA 관련 서비스(ECS, EKS, Lambda 등)에 대해 공부하세요.
   Kubernetes: 컨테이너 오케스트레이션 도구인 Kubernetes와 관련 생태계 도구(Helm, Istio 등)에 대해 익히세요.

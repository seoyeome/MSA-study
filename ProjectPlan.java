public class ProjectPlan {
    /* [프로젝트]
    - 이커머스 플랫폼 (반려동물)
        1. 프로젝트 기획
            요구사항 정의 : 잠깐 생략

            [서비스1 - 회원 서비스]
            *사용자 등록 및 인증 (회원가입, 로그인)
                - 사용자 : 일반사용자(업자 포함), 관리자
                - 인증
                - Oauth 인증방식(카카오톡 or 구글 로그인)

            [서비스2 - 상품 서비스]
            *상품 관리 (상품 등록, 수정, 삭제, 조회)
                - 사람들(업자, 일반사용자)끼리 애완동물 안쓰는거 올려서(당근마냥) 그걸 구매/판매 하는것

            [서비스3 - 장바구니 서비스]
            *장바구니 기능(후에 보고 해보기)
                - 쿠폰이 있으면 가장 효율적인 쿠폰 추천해주는 알고리즘?? want (알아보자)

            [서비스4 - 결제 서비스]
            *결제 처리
                - 카드 결제, 토스페이?, 나이스페이 같은 것 ㅇㅇ

            [서비스5 - 평점 서비스]
            *사용자 리뷰 및 평점

        2. 기술 스택 선택
            프론트엔드: React, GraphQL (깔짝)
            백엔드: Java21(Spring Boot3.0), Node.js(Express) -> 일단 보류
            데이터베이스: MySQL, PostgreSQL, MongoDB(NoSql) 중 선택
                - MySQL, PostgreSQL(시도해보기 안되면 MySQL) : 회원, 결제
                - MongoDB : 상품, 장바구니, 평점 서비스
            API 게이트웨이: NGINX
                - NGINX : 일단 파악 및 무료 ㄱㄱ >> 좀 해볼만하다 싶으면 Amazone API gateway 써보기(100만건 API 호출 무료)
            서비스 디스커버리: Eureka, Consul
                - Server-Side Discovery 로 해서 ELB, Kubernetes 사용? 무료인것 잇을듯
            메시지 브로커: RabbitMQ, Apache Kafka
                - RabbitMQ 무료임 : https://www.rabbitmq.com/docs/download
            모니터링: Prometheus, Grafana, ELK 스택, AWS CloudWatching
                - ELK 스택(무료임)
                - DataDog 은 돈 내야되서 일단 보류


        4. 개발 환경 설정
            도커 및 도커 컴포즈 설정
            각 마이크로서비스를 Docker 컨테이너로 배포할 수 있도록 Dockerfile을 작성합니다. Docker Compose를 사용하여 여러 서비스를 동시에 실행할 수 있도록 설정합니다.

        5. 데이터베이스 설계
            각 서비스에 필요한 데이터베이스를 설계합니다. 예를 들어, 사용자 서비스는 사용자 테이블을, 상품 서비스는 상품 테이블을 관리합니다.

        6. API 설계
            RESTful API를 설계하여 각 마이크로서비스가 어떤 엔드포인트를 제공할지 정의합니다. Swagger와 같은 도구를 사용하여 API 문서를 작성할 수 있습니다.

        7. 개발 및 테스트
            각 마이크로서비스를 독립적으로 개발하고, 필요한 경우 모킹(mocking) 라이브러리를 사용하여 다른 서비스와의 상호작용을 테스트합니다.
            Postman 등의 도구를 사용하여 API 테스트를 진행합니다.
        8. CI/CD 설정
            GitHub Actions, Jenkins, GitLab CI 등 CI/CD 도구를 사용하여 자동화된 빌드, 테스트, 배포 파이프라인을 설정합니다.
        9. 모니터링 및 로깅
            Prometheus와 Grafana를 사용하여 서비스 상태를 모니터링하고, ELK 스택을 사용하여 로그를 중앙에서 관리합니다.
        10. 배포
            초기 개발 및 테스트는 로컬 환경에서 진행하고, 준비가 되면 AWS, GCP, Azure 등의 클라우드 플랫폼에 배포합니다.
            비용 절감을 위해 AWS 프리 티어를 적극 활용합니다.
        11. 학습 및 개선
            초기 버전의 플랫폼을 완성한 후 피드백을 받아 기능을 개선하고, 성능 최적화 및 보안 강화 작업을 진행합니다.
            새로운 기술과 패턴을 학습하여 프로젝트에 적용해 나갑니다.
            이 가이드를 따라 차근차근 프로젝트를 진행하면 이커머스 플랫폼을 성공적으로 구축하고 MSA의 핵심 개념과 실무 경험을 쌓을 수 있을 것입니다.

     */


    // [aws ec2 인스턴스 ssh 접근 명령어]
    // : ssh -i meowbow_key.pem ec2-user@13.125.75.12 // 이떄, meowbow_key.pem 은 개인이 만든 키페어명
}

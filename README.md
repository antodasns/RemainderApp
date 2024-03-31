# RemainderApp
The project aims to implement a **microservices architecture** leveraging **Docker containerization** for seamless deployment and scalability, alongside a **Eureka naming server** for service registration, discovery, and load balancing. <br>The system will consist of two microservices, each encapsulating specific business functionalities. Load balancing mechanisms integrated with the Eureka server will ensure efficient distribution of incoming requests across multiple instances of microservices.
<br>The project will utilize **Docker Compose** to orchestrate the deployment of the microservices and the Eureka naming server, simplifying the management of the multi-container environment.
<br> Overall, the project will serve as a practical example of building distributed systems using modern architectural patterns and containerization technologies.

# Technologies used
    Microservices architecture
    Docker containerization
    Docker Compose
    Eureka naming server
    MYSQL DB

# Docker Images

*Naming Server:* antodasns/remainderapp-naming-server:0.0.1-SNAPSHOT <br>
*Remainder Service:* antodasns/remainderapp-remainder:0.0.1-SNAPSHOT <br>
*Notification Service:* antodasns/remainderapp-notification:0.0.1-SNAPSHOT 

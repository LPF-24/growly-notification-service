# Notification Service

`notification-service` is responsible for sending habit-related notifications to users in the **Growly** microservices system. It can handle scheduled reminders, immediate alerts, or future integrations like email and push messages.

## 📌 Responsibilities

- Send notifications related to user habits
- Handle scheduled or triggered notification logic
- Receive events from other services (planned: via Kafka or REST)
- Provide endpoints for testing and managing notifications (planned)

## 🔔 Notification Channels (planned)

- Email (SMTP)
- Push (via WebSockets or FCM)
- In-app (optional)
- Integration with notification scheduler

## 🧰 Technologies

- Java 17
- Spring Boot
- Docker
- Kafka

## 🐳 Docker

To build and run the service:

```bash
docker compose up --build notification-service
```

## 📚 Notes
- Runs behind gateway-service
- Integrates with habit-service to schedule habit reminders (planned)
- Can be extended with Kafka consumers or WebSocket push system

## 🔗 Related
Part of the [growly-infra](https://github.com/LPF-24/growly-infra) project.

---

> 🔔 **notification-service** — helps users stay on track with timely reminders.
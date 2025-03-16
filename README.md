# brightsparks
monorepo for bright sparks
## Inspiration
Bright Sparks – Elevator Pitch

Education in Jamaica shouldn't depend on which school you attend or who your teacher is. Bright Sparks is a real-time academic social platform that connects students, teachers, and institutions to bridge the education gap. With progress tracking, competitive leaderboards, peer-reviewed assignments, and open tutoring, Bright Sparks empowers every student to reach their full potential—no matter where they are. Whether you need help, want to tutor, or just love to learn, Bright Sparks is the community that makes education accessible, engaging, and competitive. Let’s ignite the future of learning—together.

## What it does
📌 Solution Overview: Academic Social Platform

A real-time, cloud-based education hub where students, teachers, and institutions collaborate to track progress, engage in peer learning, and offer mentorship/tutoring opportunities.

🔹 Key Features & Real-Time Capabilities

1️⃣ Track Student Progress

✅ Personalized dashboards – Students can see their performance, strengths, and areas for improvement.
✅ Live progress tracking – Teachers and parents can monitor grades, attendance, and participation.
✅ AI-based recommendations – Suggests extra materials or tutors based on weak areas.

📌 Real-Time Tech: Kafka streams data updates to UI, ensuring live score tracking.

2️⃣ Leadership Boards & Healthy Competition

✅ Institution-based leaderboards – Ranks students based on academics, participation, and peer feedback.
✅ Badges & rewards – Gamified learning encourages positive study habits.
✅ User ratings – Teachers and tutors earn credibility based on student reviews.

📌 Real-Time Tech: Leaderboards update instantly with new scores via WebSockets/Kafka.

3️⃣ Assignment Help & Peer Reviews

✅ Students submit assignments for peer feedback before teacher review.
✅ Real-time commenting & discussion threads for collaborative learning.
✅ Plagiarism detection & AI suggestions to guide improvements.

📌 Real-Time Tech: WebSockets enable live collaboration & notifications when feedback is received.

4️⃣ Open Tutoring for All

✅ Anyone (students, teachers, professionals) can tutor in real time.
✅ Dynamic tutor matchmaking – AI recommends tutors based on subject, availability, and ratings.
✅ Live virtual classrooms & one-on-one tutoring via video + whiteboard integration.

📌 Real-Time Tech: Kafka processes tutor requests instantly, AWS Lambda + WebRTC for video.

## How we built it

🔹 Tech Stack Implementation

💻 Frontend (React + TypeScript)

Real-time UI updates via WebSockets.

Mobile-first design for accessibility.


🔧 Backend (Java + Spring Boot)

Kafka for event-driven real-time updates.

Postgres for structured user/tutor/assignment data.

Snowflake for deep analytics & recommendations.


☁️ Cloud & Infra (AWS + Terraform)

AWS Lambda + API Gateway for scalability.

EKS (Kubernetes) for containerized backend.


🔄 CI/CD & Deployment

GitHub Actions + AWS CodePipeline for automated rollouts.

## Challenges we ran into

## Accomplishments that we're proud of

## What we learned

## What's next for Bright Sparks

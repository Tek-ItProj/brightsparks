# brightsparks

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

🔹 Projected Tech Stack Implementation

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

We projected to use GitHub Actions + AWS CodePipeline for automated rollouts, but we ended up using Github Actions with Digital Ocean, Kubernetes, and Docker.

## Challenges we ran into
Resource Issues and Hanging Processes

System resources were frequently strained, leading to slow performance and unresponsive applications.
Some processes would hang unexpectedly, requiring manual intervention or restarts, which disrupted workflows.
Limited availability of processing power and memory created bottlenecks, especially when running resource-intensive tasks.
Connectivity Issues Delaying Productivity

Frequent interruptions required multiple package reinstalls due to prior failures, consuming valuable time.
Dependencies failed to resolve correctly, forcing repeated troubleshooting efforts.
Some team members experienced difficulty accessing essential services, further delaying progress.
Network Instabilities Lowering Productivity

Unreliable network conditions resulted in slow downloads and frequent disconnections.
Real-time collaboration was impacted, causing delays in team communication and task completion.
Debugging and testing that relied on stable connections became inefficient, adding unnecessary roadblocks to development.

## Accomplishments that we're proud of
The backend efficiently handled limited data processing, authentication, and core functionalities through bottlenecks.
The frontend provided a smooth and user-friendly experience, ensuring usability and responsiveness.

## What we learned
Deeper Understanding of Required Technologies

We gained insights into the technologies essential for meeting the application’s requirements, both within and beyond the MVP scope.
This included understanding trade-offs between different solutions and their long-term impact on scalability and maintainability.
Balancing Complexity and Efficiency

We recognized the importance of leveraging existing services to streamline development and reduce unnecessary complexity.
For instance, using UploadThing for file uploads provided a quick, out-of-the-box solution, saving time and effort.
In contrast, setting up Amazon S3 buckets would have added unnecessary overhead for the MVP, highlighting the need for pragmatic decision-making based on project scope and timeline.

## What's next for Bright Sparks
Solidifying Value Proposition

Refining and clearly defining the core value that Bright Sparks offers to users and businesses.
Ensuring that our product addresses real pain points and delivers tangible benefits.
Enhancing Real-World Applicability

Gathering feedback from early users to improve functionality and user experience.
Identifying key industries and use cases where Bright Sparks can provide the most impact.
Scaling and Business Viability

Exploring monetization strategies to ensure long-term sustainability.
Building partnerships and collaborations to expand our reach and adoption.

<div align="center">

# eCourse

A remote learning platform for a school. Managers run the courses and enrolments, teachers write exams that grade themselves, and everyone can plan meetings and work together on shared boards of post-its.

![Java](https://img.shields.io/badge/Java-11-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![ANTLR](https://img.shields.io/badge/ANTLR-4-EF3E36?style=for-the-badge&logoColor=white)
![C](https://img.shields.io/badge/C-A8B9CC?style=for-the-badge&logo=c&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-tests-25A162?style=for-the-badge&logo=junit5&logoColor=white)

[Objectives](#objectives) · [Features](#features) · [Architecture](#architecture) · [Exams and boards](#exams-and-boards) · [Team](#team)

<sub>4th-semester integrative project · Informatics Engineering · <a href="https://www.isep.ipp.pt">ISEP</a>, Porto · 2022–23</sub>

</div>


## Objectives

The brief imagined a school asking for its own remote learning platform, built as a minimum viable product. These were the goals:

- [x] Let managers run courses, teachers and enrolments, and let students join courses and follow them
- [x] Give teachers a simple text language for questions and exams, checked when it's written and graded automatically when a student hands in
- [x] Build shared boards that several people can edit at once over the network, with a live view in the browser
- [x] Work as a team of five over three Scrum sprints, with requirements, analysis, design, code and tests for each user story
- [x] Bring four courses together in one project: application engineering with domain-driven design (EAPLI), languages and grammars (LPROG), computer networks (RCOMP) and operating systems (SCOMP)


## Features

Everyone logs in and gets the app for their role.

| | Role | What they can do |
|:-:| --- | --- |
| 🛠️ | **Manager** | Create courses, open and close them and their enrolments, set each course's teachers, accept or reject enrolment requests, enrol students in bulk from a CSV file; add, list and deactivate users and accept sign-up requests |
| 🧑‍🏫 | **Teacher** | Schedule classes, reschedule them or add extra ones; create and update exams and questions; build formative exams; see the grades for their courses |
| 🎓 | **Student** | Ask to join a course, see upcoming exams, take exams and formative practice exams, see their grades |
| 📌 | **Shared boards** (everyone) | Create a board of rows and columns, share it with read or write access, add, edit and move post-its, undo the last change, see the history and notifications, archive a board, and watch it update live in the browser |
| 📅 | **Meetings** (everyone) | Schedule and cancel meetings, invite people, accept or reject invitations |

## Architecture

The main apps follow the layered design of the EAPLI framework our teachers gave us, and the shared boards add a client and a server on top:

```
Console apps (manager, teacher, student)  →  Controllers and services  →  Domain  →  JPA repositories (H2)
Shared Board App  ⇄  Shared Board Server   (TCP)
Browser  ←  Shared Board App   (HTTP + AJAX)
```

Each role has its own console app, and they all share one core module. The UI only reaches the domain through a controller per user story. The domain holds the aggregates (courses, enrolments, exams, questions, boards, meetings) and their rules, and repositories save them with JPA (EclipseLink) to an H2 database. Because the domain only sees repository interfaces, it never has to know about the database, and the same core runs in every app and in the board server.

The EAPLI framework handles login, roles and the base classes for entities and repositories. ANTLR generates the parsers for the exam language.

## Exams and boards

Teachers write questions and exams as plain text. A question looks like this:

```
#Multiple Choice
#Points: 20

#Question: Here's an introduction
Options:
-option1
-option2
-option3

#Answer:
#Solution: option1
#Feedback: Here's your feedback
```

Three ANTLR grammars cover single questions, full exams (title, grading and feedback settings, sections) and formative exams. There are six question types: multiple choice, matching, true or false, missing words, short answer and numerical. A file that doesn't fit the grammar is rejected when the teacher saves it. When a student hands in, a visitor walks through the parsed answers, compares each one with the solution and adds up the grade. Questions with several parts split their points evenly, so a half-right matching question gets half the marks. Formative exams pick random questions of the requested types from the course's question bank.

The shared boards talk over our own small protocol on TCP. Every message starts with four bytes (version, message code and two bytes for the data length) followed by the data, and there are codes for login, listing and sharing boards, post-it changes, history and notifications. Each client keeps one connection open while it runs, the server gives each client its own thread, and a shared lock applies changes one at a time so two users never overwrite each other. For the live view, the client app runs a small HTTP server and the browser page asks it for the board every couple of seconds with AJAX.

For SCOMP we also wrote a C version of a board in shared memory, where several processes read, write and change cells at once and semaphores keep them in order.

We tested the domain and the grammars with JUnit (about 260 tests), using the sample questions, exams and answers in `base.core/files/testfiles`, and GitHub Actions built and tested every push.

## Project structure

```
base.core/                       domain, controllers, services and the board protocol
├── src/main/antlr4/             question, exam and formative exam grammars
└── files/testfiles/             sample questions, exams and answers for the tests
base.persistence.impl/           JPA repositories and database settings
base.app.backoffice.console/     manager app
base.app.other.console/          teacher app
base.app.user.console/           student app
base.app.common.console/         login and menus shared by the apps
base.app.sharedboardServer/      shared board server
base.app.sharedboardClient/      shared board app and its live view server
base.app.bootstrap/              loads sample users, courses and boards
www/                             web page for the live board view
SCOMP/                           C shared-memory board
docs/                            domain model, and requirements, analysis and design per sprint (A–C)
```

## Team

<table align="center">
  <tr>
    <td align="center" width="150">
      <a href="https://github.com/Marco-Nobrega-Andrade"><img src="https://github.com/Marco-Nobrega-Andrade.png?size=200" width="100" alt="Marco Andrade"/></a><br>
      <b>Marco Andrade</b><br>
      <a href="https://github.com/Marco-Nobrega-Andrade">@Marco-Nobrega-Andrade</a>
      <br><br>
      <a href="https://github.com/Joao-Batista-Isep"><img src="https://github.com/Joao-Batista-Isep.png?size=200" width="100" alt="João Batista"/></a><br>
      <b>João Batista</b><br>
      <a href="https://github.com/Joao-Batista-Isep">@Joao-Batista-Isep</a>
    </td>
    <td align="center" width="150">
      <a href="https://github.com/SrMasterAD"><img src="https://github.com/SrMasterAD.png?size=200" width="100" alt="David Dias"/></a><br>
      <b>David Dias</b><br>
      <a href="https://github.com/SrMasterAD">@SrMasterAD</a>
      <br><br>
      <a href="https://github.com/DiogoAraujo-ISEP"><img src="https://github.com/DiogoAraujo-ISEP.png?size=200" width="100" alt="Diogo Araújo"/></a><br>
      <b>Diogo Araújo</b><br>
      <a href="https://github.com/DiogoAraujo-ISEP">@DiogoAraujo-ISEP</a>
    </td>
    <td align="center" width="150">
      <a href="https://github.com/EzequielEstima-ISEP"><img src="https://github.com/EzequielEstima-ISEP.png?size=200" width="100" alt="Ezequiel Estima"/></a><br>
      <b>Ezequiel Estima</b><br>
      <a href="https://github.com/EzequielEstima-ISEP">@EzequielEstima-ISEP</a>
    </td>
  </tr>
</table>

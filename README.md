# Camunda Series

---

## Camunda Setup

Before you begin, ensure you have **JDK 21, 22, or 23** installed.  


### Step 1: Install Camunda Modeler

Download the latest **Camunda Desktop Modeler** from the official Camunda site:

[https://developers.camunda.com/install-camunda-8/](https://developers.camunda.com/install-camunda-8/)

Use the modeler to design BPMN workflows, DMN decisions, and forms.

---

### Step 2: Install and Start Camunda 8 Run

Download Camunda 8 Run (self-managed):

[Documentation and Download Link](https://docs.camunda.io/docs/self-managed/quickstart/developer-quickstart/c8run/#install-and-start-camunda-8-run)

[Direct Link to c8run 8.8 ](https://downloads.camunda.cloud/release/camunda/c8run/8.8/)
>Download 8.7.17, 8.8 has swagger related issue

Once downloaded:

1. Extract the ZIP file.
2. Navigate to the extracted `c8run` folder.
3. Open a terminal in that directory.

For macOS/Linux:

`./c8run start`


To stop the service:

`./c8run stop`


*(For Windows or other OS, refer to the official documentation linked above.)*

---

## Endpoints

Once started, you can access the following interfaces:

- Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- Operate Dashboard: [http://localhost:8080/operate](http://localhost:8080/operate)
- Zeebe gRPC(this is for connecting from spring boot): [http://127.0.0.1:26500](http://127.0.0.1:26500)

---

## Resources

- **Official Camunda 8 Documentation:** [https://developers.camunda.com/install-camunda-8/](https://developers.camunda.com/install-camunda-8/)
- **C8 Run Quickstart Guide:** [https://docs.camunda.io/docs/self-managed/quickstart/developer-quickstart/c8run/](https://docs.camunda.io/docs/self-managed/quickstart/developer-quickstart/c8run/)

---

## Happy Learning!

Stay tuned for more lessons in this Camunda series.  
YouTube Playlist: *(Add your YouTube link here once available.)*
## Simulate Simple Reddit

To try to implement a simple website like Reddit sharing contents by posting text.<br>
The architecture is designed by separating Front-End and Back-End service.

Folder <b>reddit-backend</b> represents a stateless Back-End service with REST API.

Folder <b>reddit-frontend</b> represents UI presentation layer.


### Tech Stack
Front-End : ReactJS, Bootstrap, axios, npm

Back-End : Springboot, JPA, JWT(JSON Web Tokens)

DB : MongoDB

### Test Enviroment
For local test, Executing below docker command can lauch a MongoDB container.
``` bash
docker run --name my-mongo -p 27017:27017 -d mongo
```

To start Back-End
``` bash
cd reddit-backend
gradle bootRun
```

To start Front-End
``` bash
cd reddit-frontend
npm init
npm start
```
note : execute <b>npm init</b> for the first time. 

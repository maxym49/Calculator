# API for admin-panel 

### 1. Clone the repository
### 2. Type in the console in the project directory:
a) To install all dependencies:
```
npm i 
```
b) To run tests type:

```
 npm test 
```

c) To run application on localhost type:
```
 npm start
```
### 3. Now you can use the API routes:

#### I Visit

| Method        | URL             |       
| ------------- | :-------------: | 
| GET           | /visit          | 
| POST          | /visit          |  
| DELETE        | /visit          |  
| PUT           | /visit          |  
| POST          | /visit/create   |  

#### a) GET /visit:
   Should fetch list of all visit events that are already present in application database.
   There is no need to send any params. If you are unable to reach this endpoint, please see logs, if error will exist,   
   you will be informed. 
   
#### b) POST /visit:
  Request body should contain ID of the visit already present in database. 
  Visit should be returned as JSON response. 
  [Important] If you want to test it beyond the app, 
  please make sure, that event still exists in the database. 
  Visit has unique and auto-increment ID.   

  ##### To POST the visit, add to the body the JSON object: 
  {
    "visitID": "event_ID_example" 
  }
  
#### c) DELETE /visit:
   Should delete specific visit by previously defined ID. After that, you should receive message which is saved as JSON.  
   
   ##### To DELETE the visit, add to the body the JSON object: 
   {
     "visitID": "event_ID_example" 
   }

#### d) PUT /visit:
  This method allows user to update the specific visit. 
  Request body should contain all visit model params which are present in database. 
  As the response you should receive update status which is boolean. 

  ##### To PUT the visit, add to the body the JSON object: 
  {
  data: {
    visitID, 
    registerNumber, 
    date, 
    timeValue, 
    phoneNumber, 
    clientName, 
    comments, 
    vinNumber,
    description: {
      activities, 
      workHours, 
      cost
     },
    invoice {
      invoiceName,
      address,
      zipCode,
      city,
      amount,
      nip
    }
  }
 }
 
#### e) POST /visit/create:
  This method allows user to create visit. To make it work, you will need to pass most of params which are placed   
  in PUT /visit. After that, you should receive message if the procedure succeed.   
  
***

#### II Calendar

| Method        | URL                       |       
| ------------- | :----------------------:  | 
| GET           | /calendar                 | 
| POST          | /calendar                 |  
| POST          | /calendar/find-events     |  

#### a) GET /calendar:
  Should fetch list of all calendar events already present in application database.
  No need to send any type of params. 
  
#### b) POST /calendar:
  It allows user to create the calendar event, which is saved and stored in the calendar events list. 
  After saving it to the database, you should receive if the event has been added or not. 
  
  ##### To POST the calendar, add to the body the JSON object: 
   {date, phoneNumber, description, time, title}

#### c) POST /calendar/find-events:
  It allows user to find the the calendar events by previously defined date. 
  Then you should receive filtered events. 
  
  ##### To POST the calendar/find-events, add to the body the JSON object: 
   {data: "some_example_date"} 
  
 ***

#### III Export

| Method        | URL                       |       
| ------------- | :----------------------:  | 
| GET           | /export                   | 
| POST          | /export                   |  

#### a) GET /export:
  Should send the previously created PDF file. It's recommended to use this method after POST /export.
  No need to send any type of params.
  
#### b) POST /export:
  It creates HTML file and fill it with passed data. Then another method is invoked, which creates the PDF file 
  from previously generated HTML.  
  
  ##### To POST the /export, add to the body the JSON object: 
   same data as Visit point B

 ***

#### IV Login

| Method        | URL                       |       
| ------------- | :----------------------:  | 
| POST          | /login                    | 
| POST          | /login/token              | 

#### a) POST /login:
  This method at first check if passed user's data exists, then if succeed, it creates unique token 
  for user session which is stored in the database. Next step is receiving status (boolean) and token.   
  [Info] If you will invoke this method twice on the same user the new token will override old token. 
  
  ##### To POST the /login, add to the body the JSON object: 
   {
    "username": "some_username"
    "password": "some_password"
   }
  
#### b) POST /login/token:
  Method allows to validate if the user is still logged in or not. As the response client is receiving the 
  boolean status. 
  [Info] Method required a token. 
  
  ##### To POST the /login/token, add to the body the JSON object: 
   {
   "data": "token"
   }
   
 ***

#### V User Settings

| Method        | URL                       |       
| ------------- | :----------------------:  | 
| POST          | /user-settings            | 
| POST          | /user-settings/password   |  

#### a) POST /user-settings:
  It should check if the defined user exists, if yes it receives the user's data.
  [Info] Method required a token. 
  
  ##### To POST the /user-settings add to the body the JSON object: 
   {
    "data": "token"
   }
  
#### b) POST /user-settings/password:
   It checks if the user exists and then allows to change the password of 
   defined user's account. As the response it sending boolean status. 
  
  ##### To POST the /user-settings/password add to the body the JSON object: 
   {
    "login": "some_login"
    "password": "some_password"
   }
   
***

### What did I use?
- Express - it helps you in creating server-side web applications faster and smarter
- Eslint - to write a readable code and stick to the rules 
- Nodemon - it allows to reload the server every time when you will change something in your code
- Jest - to write some tests
- Knex & Bookshelf - easy creating Schemas and and saving data in MySQL
- MySQL - as the database 
- Dotenv - to store env variables
- Html-pdf - to converting purpose
- Uuid - to generate unique strings

*** 




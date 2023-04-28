# LightFeather

Endpoints
The Supervisor Management Notification Module provides the following RESTful endpoints:

GET /api/supervisors: Returns a JSON array of all supervisors, dynamically loaded from https://o3m5qixdng.execute-api.us-east-1.amazonaws.com/api/managers. The supervisors are sorted in alphabetical order by jurisdiction, last name, and first name.

POST /api/submit: Accepts a request for a new notification request for a supervisor. The following data is required in the payload:

firstName
lastName
email
phoneNumber
supervisor
If the request is successful, all the associated information will be printed to the console of the backend service. If the request omits the first name, last name, or supervisor field, an error response with an appropriate message will be returned.

Validation Requirements
The following validation requirements apply to the POST /api/submit endpoint:

Name fields are required and must only contain letters, no numbers.
Standard validation against phone number and/or email must be applied.
Any invalid requests must send back an error response.
The phoneNumber and email fields are optional fields and not required. Omitting these fields does not indicate an error condition.
Documentation
For more information on the Supervisor Management Notification Module, please refer to the README.md file in the root of the repository. This file provides additional instructions on how to build and run the Docker container to access the module.



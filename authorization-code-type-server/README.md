
Step:1 : hit the URL : http://localhost:12345/myapi/bookPrice/105

The Error will occuer like below :

This XML file does not appear to have any style information associated with it. The document tree is shown below.
<oauth>
<error_description>Full authentication is required to access this resource</error_description>
<error>unauthorized</error>
</oauth>

Step2:
Send the Request to Authorizarion Server with the following URL to Get
the User’s Permission
A) Eendpoint - /oauth/authorize
B) Query Parameters
 - client_id,
 - redirect_uri,
 - response_type,
 - scope
http://localhost:12345/oauth/authorize?client_id=satishapp&redirect_uri=http://localhost:5000/callback&response_type=code&scope=read_profile

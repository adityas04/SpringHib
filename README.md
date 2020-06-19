# SpringHib
Description - This project retrieves the user details stored in the database using the hibernate orm tool and then process the web page using spring mvc.
Users can provide their login credentials in the page and then the from the view the application will be redirected to the controller.
In the controller the data accessed from pojo class(hibernate retrieved mysql data) and the data recieved from login credentials of user will be checked and then if both matches then sessions are provided.
in the next module user can enter any keyword which he want to search and then, the user will be directed to google search page with the results he want to search.
All the configurations for spring and hibernate integration are provided in the xml files like applicationcontext.xml and spring-servlet.xml etc.

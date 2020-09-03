Student Name : Jaspreet Singh
Student ID : 014638390
Email ID : jaspreet.singh03@sjsu.edu

Instructions: just run the App.class as java application. ( keep the Beans.xml file in src/main/resources )

The Project contains following files :
1> Greeter : it is the interface with a setName and getGreeting method.
2> HelloSpringWorld : it is the class which implements the Greeter interface, it has the setter and getter method defined in interface for the attritube named name ( and we construct the object using the bean and setter injection)
3> App : it is the class with main method, it uses the ApplicationContext to get the beans defined in the Beans.xml ,  and then construct the object from the bean and use the getGreeting method to display the output onto the console.
4> Beans.xml : it contains the configuration for defining the bean , the bean name and its value which is read in App class through ApplicationContext.
5> pom.xml : it contains the spring dependencies. 

The Project is build through Maven ( version 3.6.3 ) , Spring ( version 5.2.8.RELEASE ) and Eclipse IDE ( version 4.14.0 )
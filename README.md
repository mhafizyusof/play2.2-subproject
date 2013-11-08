This is an Play!Framework 2.2.0 example project containing a really simple sub project.

This simple project aims to help new [Play!Framework](http://www.playframework.com/) developers understand and split their [2.2.x projects in sub projects](http://www.playframework.com/documentation/2.2.0/SBTSubProjects).

In this example, we provide a main project, with three sub projects :

 * **Common** : Containing Models, and a Utils package (really simple one)
 * **API** : The supposed API section of your project if you like to split your web app in two main sections (api/frontend)
 * **Manager** : The manager side of your web application

Each sub projects does really simple things.

### Regarding API & Manager

The API and Manager only display a simple text via one URL, but this is the basis for bootstraping your project.
Both API and Manager have the same class name for the controller, showing that having two different controller name (`controllers.api` & `controllers.frontend`) won't make collisions for identical class names.

You can also have two different classes names in the root package `controllers`, but in that case, you must ensure that their names are different.

Hope this helps! :)
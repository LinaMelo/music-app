# Music API 

El backend de la aplicación para la encuesta de generos musicales.

## Gestor de paquetes
Se uso Maven como gestor de paquetes.

##Spring Boot

El proyecto fue construido con Spring Tool Suite 4 y Java 1.8. Se uso la Base de datos MongoDb, la cual se ambiento en la nube en Mongo Atlas, por lo cual no es necesario ambientarla. En los recursos del proyecto se encuentra el archivo *aplication.properties* en donde se encuentran los datos de conexión a la Base de datos.

##Puesta en marcha

Para correr el backend es necesario importar el proyecto en Spring Tool Suite o Eclipse, luego darle Maven -> Update Project, para que se instalen las dependencias del proyecto, una vez actualizadas las dependencias, luego solo se debe correr el proyecto como Spring Boot App. 

##API
En la API se encuentran tres servicios. 
 * Obtener las respuestas de la encuesta por genero musical.
 * Obtener todas las respeusta de la encuesta.
 * Guardar una encuesta.


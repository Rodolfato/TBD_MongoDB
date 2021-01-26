# Proyecto Taller de Base de Datos
## Aplicación de Voluntariado

### Teconlogías
Las siguientes tecnologías fueron utilizadas:
* [Spring] - Back end framework
* [MongoDB] - Base de datos de documentos

### Requerimientos

Este proyecto requiere de las siguientes dependencias para su funcionamiento:

* [Java 11] - Base para Spring 
* [Gradle] - Herramienta para realizar el build del proyecto

## Instalación
Descargar los contenidos del repositorio en un directorio a elección con el siguiente comando:

```sh
$ git clone https://github.com/Rodolfato/TBD_MongoDB.git
```
### Carga de  datos
Entrar a la carpeta llamada *Backup* del repositorio descargado.

![alt text](https://i.imgur.com/Y5iLdMY.png)

Dentro realizar la restauración de los datos de esta forma:

![alt text](https://i.imgur.com/8QssB3c.png)



### Back end

Primero es editar el archivo *application.properties* encontrado en *.../TBD_MongoDB/src/main/resources*, cambiando los datos según corresponda:

![alt text](https://i.imgur.com/n58WTn4.png)

Para hacer el *build* y correr el back end es necesario navegar al siguiente directorio *.../voluntariado-spring/* y ejecutar el siguiente comando en el terminal:

```sh
$ gradle build
```

Seguido de:

```sh
$ gradle bootRun
```

Ahora es posible ingresar a través de un navegador de internet a la dirección *localhost:8080/hello* y recibir un mensaje de *Hello World*:

![alt text](https://i.imgur.com/DOjpOyu.png)




[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [Java 11]: <https://openjdk.java.net/projects/jdk/11/>
   [Gradle]: <https://gradle.org/>
   [Spring]: <https://spring.io/>


   [MongoDB]: <https://docs.mongodb.com/manual/installation/>

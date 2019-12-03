# Les problèmes d’accès au BDD, erreurs: 

Pour me connecter a la BDD j'ai ajouter dans application.properties de cette Facon : 

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/tpmicroservices?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC
spring.datasource.username=microserv
spring.datasource.password=P@ssw0rd

```

- j'ai du rajouter les paramètres à ma datasource.url car j'ai eu une erreur avec la time zone!

Pour ce qui est de la connexion MySQL tout c'est bien déroulé par la suite.


# Tutoriel Utilisé: 

J'ai commencé par créer un JAR avec un lien qu'un de mes collègue a donné : https://start.spring.io/



Puis pour importé Log4j j'ai suivi un tuto ici : https://www.mkyong.com/logging/log4j-hello-world-example/



ensuit plus que Swagger  qui a été installer avec : 

# micro-serviceTP01
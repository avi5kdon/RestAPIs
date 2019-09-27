# Camel Rest on Red Hat Fuse
To build the project run: 

mvn clean install

To deploy the project on fuse:

1. Prerequisites

> feature:install camel-servlet
> feature:install camel-swagger-java

2. Installation

> install -s  mvn:camel.rest/camel-rest/1.0

To access the Swagger API JSON:

http://localhost:8181/camel-rest/rest/api-doc

This will list all the available APIs in this bundle
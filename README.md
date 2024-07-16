# Challenge - ForoHub💻

Este es un reto por parte de Oracle + Alura Latma del programa ONE

## Objetivo🎯
Desarrollar una API Rest que replique a nivel back-end el proceso del manejo de tópicos del ForoHub con Spring Boot 3. Como objetivo se plante desarrollar las siguientes funcionalidades:

1. API con rutas(endpoins) implementadas siguiendo las mejores prácticas del modelo REST;
2. Validaciones realizadas según las reglas de negocio;
3. Implementación de una base de datos relacional para la persistencia de la información;
4. Servicio de autenticación/autorización para restringir el acceso a la información.


Nuestra API se centrará específicamente en los tópicos, y debe permitir a los usuarios:

- Crear un nuevo tópico;
- Mostrar todos los tópicos creados;
- Mostrar un tópico específico;
- Actualizar un tópico;
- Eliminar un tópico.

Además de estas características, se hace la implementación de la autenticacion y autorización del acceso a las rutas.
Para consegir acceso el usuario debe iniciar sesión en la api y esta le generará un token que usará para poder acceder a los endpoins.

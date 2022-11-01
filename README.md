## AREP-TallerAllSecureAppSpark

Construir una aplicación web segura usando certificados digitales

### Pasos

- Crear una aplicación web no segura
- Crear un par de llaves y generar los certificados
- Modificar la aplicación para que use los certificados
- Explicar la esencia del la Arquitectura (Metáfora del sistema)
- Asignar un reto de arquitectura

## Arquitectura

![image](https://github.com/Nataorjuela/AREP-TallerAllSecureAppSpark/blob/master/Images/arquitectura.jpg)

---

## APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES

Desarrolle una aplicación Web segura con los siguientes requerimientos:

1. Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
2. Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
3. Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

## Entregables:

1. Código en github, bien documentado.
2. Informe que describe la arquitectura de seguridad de su prototipo. (en el README)
3. Video de experimento en AWS

## Arquitectura

![image](https://github.com/Nataorjuela/AREP-TallerAllSecureAppSpark/blob/master/Images/arquitectura.jpg)

En esta arquitectura se manejan dos servidores los cuales estaran conectados entre si para darse respuesta de uno a otro, se utilizara Spark en ambos servicios, esta aplicación es segura y se manejaran certificados los cuales solo permitiran el acceso del puerto de ambos servidores.

## Video

[TallerArep](https://youtu.be/cM_S2QvM0kw "TallerArep")

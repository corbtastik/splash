# Splash

A splash of this and a splash of that.


## Static Content

1. Served from ``/static``
1. Used [ResourceHttpRequestHandler](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/resource/ResourceHttpRequestHandler.html) from SpringMVC
1. Customize behavior by implementing [WebMvcConfigurer](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/config/annotation/WebMvcConfigurer.html) and overriding ``addResourceHandlers``.
1. By default, resources are mapped on ``/**`` but can be customized with ``spring.mvc.static-path-pattern`` property.
1. Static resource location can be configured with ``spring.resources.static-locations`` property.

## Webjars

1. Resources with ``/webjars/**`` are served from Webjars jars.
1. Don't use ``src/main/webapp`` directory if you're building a ``jar``

## Templates

1.  Templates are picked up by default from ``src/main/resources/templates``

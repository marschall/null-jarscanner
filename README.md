NULL JarScanner [![Build Status](https://travis-ci.org/marschall/null-jarscanner.svg?branch=master)](https://travis-ci.org/marschall/null-jarscanner) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/cz.jirutka.rsql/rsql-parser/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.marschall/null-jarscanner)
===============

Disables all ClassPath scanning by Tomcat. This can disable This improves Tomcat startup time but makes it no longer Servlet API Spec compliant since TLDs and `@HandlesTypes` are no longer picked up.

Usage
-----

```xml
<dependency>
    <groupId>com.github.marschall</groupId>
    <artifactId>null-jarscanner</artifactId>
    <version>1.0.0</version>
</dependency>
```

Copy the JAR to `$CATALINA_BASE/lib` the JAR *must not* be in your web application.

Use the following `META-INF/context.xml`

```xml
<Context>

  <JarScanner className="com.github.marschall.nulljarscanner.NullJarScanner" />

</Context>
```

Documentation
-------------
See the official [Jar Scanner](http://tomcat.apache.org/tomcat-8.0-doc/config/jar-scanner.html) documentation.

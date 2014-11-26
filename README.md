NULL JarScanner
===============

Disables all ClassPath scanning by Tomcat. This can disable This improves Tomcat startup time but makes it no longer Servlet API Spec compliant since TLDs and `@HandlesTypes` are no longer picked up.

Usage
-----

```xml
<Context>

  <JarScanner className="com.github.marschall.nulljarscanner.NullJarScanner" />

</Context>
```

Documentation
-------------
See the official [Jar Scanner](http://tomcat.apache.org/tomcat-8.0-doc/config/jar-scanner.html) documentation.

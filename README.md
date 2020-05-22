If I create a `Java with Maven | NetBeans Application` for `RELEASE113` I just
can't add an implementation dependency to org-netbeans-core-network.

I'm using

```xml
        <dependency>
            <groupId>org.netbeans.modules</groupId>
            <artifactId>org-netbeans-core-network</artifactId>
            <version>${netbeans.version}</version>
            <scope>provided</scope>
        </dependency>
```

which apparently does not do the trick as I'm getting:

```
java.lang.ClassNotFoundException:
org.netbeans.core.network.utils.NativeException
at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:471)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:588)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
at org.netbeans.ProxyClassLoader.doFindClass(ProxyClassLoader.java:209)
Caused: java.lang.ClassNotFoundException:
org.netbeans.core.network.utils.NativeException starting from
ModuleCL@5a5698e7[com.mycompany.bugnbapp.sample] with possible defining
loaders [ModuleCL@19189c17[org.netbeans.core.network]] and declared parents
[ModuleCL@28b49e17[org.netbeans.api.annotations.common],
org.netbeans.JarClassLoader@54659dcf]
at org.netbeans.ProxyClassLoader.doFindClass(ProxyClassLoader.java:211)
at org.netbeans.ProxyClassLoader.loadClass(ProxyClassLoader.java:125)
at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
Caused: java.lang.NoClassDefFoundError:
org/netbeans/core/network/utils/NativeException
```

Any help greatly appreciated.

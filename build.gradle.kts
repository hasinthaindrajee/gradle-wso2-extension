plugins {
    java
    id("biz.aQute.bnd.builder") version "7.1.0"
}

group = "com.organization"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.wso2.org/nexus/content/repositories/releases/")
    maven("https://maven.wso2.org/nexus/content/repositories/snapshots/")
    maven("https://maven.wso2.org/nexus/content/groups/wso2-public/")
}

dependencies {

    compileOnly("org.wso2.carbon.identity.framework:org.wso2.carbon.identity.event:7.0.110")
    compileOnly("org.apache.felix:org.apache.felix.scr.ds-annotations:1.2.10")
    compileOnly("org.osgi:org.osgi.service.component.annotations:1.4.0")
}

tasks.jar {
    manifest {
        attributes(
            "Bundle-SymbolicName" to "com.organization.custom.handler",
            "Bundle-Version" to "1.0.0",
            "Bundle-ManifestVersion" to "2",
            "Export-Package" to "com.organization.custom.handler",
            "Private-Package" to "com.organization.custom.handler.internal",
            "Import-Package" to "org.osgi.framework; version=\"[1.7.0, 2.0.0)\", org.osgi.service.component; version=\"[1.2.0, 2.0.0)\"",
            "-removeheaders" to "Require-Capability",
            "DynamicImport-Package" to "*",
            "-dsannotations" to "",
            "Service-Component" to "OSGI-INF/*.xml"

        )
    }
}

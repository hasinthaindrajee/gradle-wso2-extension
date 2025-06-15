# Identity Event Handler extension.

Steps 

1. Build the source using `./gradlew clean build` command.
2. Copy /com-organization-1.0-SNAPSHOT.jar file into <IS_HOME>/repository/components/dropins/ folder.
3. Add the following configurations to <IS_HOME>/repository/conf/deployement.toml file
4. Restart the server. 
```

[[event_handler]]
name= "customUserRegistration"
subscriptions =["PRE_ADD_USER"]

```

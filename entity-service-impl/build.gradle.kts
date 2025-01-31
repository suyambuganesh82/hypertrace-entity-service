plugins {
  `java-library`
  jacoco
  id("org.hypertrace.jacoco-report-plugin")
}

dependencies {
  api(project(":entity-service-api"))
  api(project(":entity-service-attribute-translator"))
  api("org.hypertrace.core.serviceframework:service-framework-spi:0.1.52")

  annotationProcessor("org.projectlombok:lombok:1.18.22")
  compileOnly("org.projectlombok:lombok:1.18.18")

  implementation("org.hypertrace.core.documentstore:document-store:0.7.32")
  implementation("org.hypertrace.core.grpcutils:grpc-context-utils:0.12.1")
  implementation("org.hypertrace.core.grpcutils:grpc-client-utils:0.12.1")
  implementation("org.hypertrace.core.attribute.service:caching-attribute-service-client:0.14.15")
  implementation("org.hypertrace.core.serviceframework:platform-metrics:0.1.52")
  implementation("com.google.inject:guice:5.0.1")

  implementation(project(":entity-type-service-rx-client"))
  implementation(project(":entity-service-change-event-generator"))

  implementation("com.google.protobuf:protobuf-java-util:3.21.12")
  implementation("com.github.f4b6a3:uuid-creator:3.5.0")
  implementation("io.reactivex.rxjava3:rxjava:3.0.11")
  implementation("com.google.guava:guava:32.1.2-jre")

  implementation("org.slf4j:slf4j-api:1.7.30")
  implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")

  testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
  testImplementation("org.mockito:mockito-core:3.8.0")
  testImplementation("org.mockito:mockito-junit-jupiter:3.8.0")
  testRuntimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:2.17.1")
}

tasks.test {
  useJUnitPlatform()
}

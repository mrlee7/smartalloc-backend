plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "smartalloc-backend"

include("smartalloc-api")
include("smartalloc-app")
include("smartalloc-batch")
include("smartalloc-consumer")

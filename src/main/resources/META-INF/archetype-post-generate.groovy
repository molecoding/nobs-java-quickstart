// Check java release version
String javaVersion = request.getProperties().get("javaVersion")
def pattern = "^(8|11|17)\$"
final match = javaVersion.matches(pattern)
if (!match) {
  println "Warning: $javaVersion is not valid javaVersion (8/11/17), will use 17 instead."
}

// fix mvnw exec mode
// not working in verify phase.
if (!System.properties['os.name'].toLowerCase().contains('windows')) {
  String projectDir = request.getProperties().get("artifactId")
  "chmod +x $projectDir/mvnw".execute()
}

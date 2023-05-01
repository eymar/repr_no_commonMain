

Syncing the project with kotlin.version=1.9.0-dev-6976:

```
Caused by: java.lang.IllegalStateException: Unexpected source set 'commonMain'
at org.jetbrains.kotlin.gradle.plugin.mpp.ProjectMetadataProviderImpl.getSourceSetCompiledMetadata(ProjectMetadataProviderImpl.kt:42)
at org.jetbrains.kotlin.gradle.plugin.mpp.TransformMetadataLibrariesKt.transformMetadataLibrariesForIde(transformMetadataLibraries.kt:26)
at org.jetbrains.kotlin.gradle.plugin.sources.DefaultKotlinSourceSet.getDependenciesTransformation$kotlin_gradle_plugin_common(DefaultKotlinSourceSet.kt:178)
at org.jetbrains.kotlin.gradle.plugin.sources.DefaultKotlinSourceSet.getDependenciesTransformation(DefaultKotlinSourceSet.kt:151)
```

Syncs fine when using kotlin 1.8.20
_____


Already reported: https://youtrack.jetbrains.com/issue/KT-58319/kotlin.git-ProjectMetadataProviderImpl-Unexpected-source-set-commonMain

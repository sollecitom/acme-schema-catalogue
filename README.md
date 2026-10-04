# acme-schema-catalogue

Reusable Avro and JSON schema definitions for the "Acme" organization, published as libraries.

## Requirements

1. Java 25 (neither below nor above).

## How to

### Build the project (incrementally)

```bash
just build

```

### Rebuild the project (without caches)

```bash
just rebuild

```

### Upgrade the Gradle wrapper to the latest available version

```bash
just update-gradle

```

### Update all dependencies if more recent versions exist, and remove unused ones (it will update `gradle/libs.versions.toml`)

```bash
just update-dependencies

```

### Publish the libraries to the local Maven repository (only when their artifacts changed)

```bash
just publish

```
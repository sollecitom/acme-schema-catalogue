# acme-schema-catalogue

## Overview
Centralized schema repository housing reusable Avro and JSON schema definitions for the "Acme" organization. Contains common schemas (identity, correlation, authentication, events) plus domain-specific examples.

## Scorecard

| Dimension | Rating | Notes |
|-----------|--------|-------|
| Build system | A | Gradle 9.4.0, version catalog, convention plugins |
| Code quality | B | Well-organized schemas, clear naming |
| Test coverage | F | No schema validation tests |
| Documentation | C | READMEs per module, but no architecture guide |
| Dependency freshness | A | All current |
| Modularity | A | 4 modules with clear hierarchy |
| Maintainability | B+ | Pure schemas, no code — simple to maintain |

## Structure
- 4 modules: `avro/common` (77 schemas), `avro/modulith-example`, `avro/element-example`, `json/common` (79 schemas)
- 150+ schema files total, zero Kotlin source files

## Issues
- No schema validation tests (invalid schemas won't be caught at build time)
- No schema versioning policy documented
- No backward compatibility checks between schema versions
- No schema documentation generation

## Potential Improvements
1. Add Avro schema validation build task (parse all `.avsc` files, fail on invalid)
2. Add JSON schema validation task
3. Implement backward compatibility checks (e.g., Confluent Schema Registry compatibility mode)
4. Document schema organization philosophy and domain model
5. Add schema documentation generator (schema → HTML/Markdown)
6. Create naming convention linting for schemas

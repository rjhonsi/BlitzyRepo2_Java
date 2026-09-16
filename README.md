# Hello

## Summary of Changes

*Modified 2026-09-16.*

- *Added four explanatory comments to `Hello.java`: class Javadoc, `main` Javadoc with an `@param args` tag, and line comments on the output statement and the termination path.*
- *Replaced the placeholder line in `README.md` with this project guide: a summary of changes followed by overview, requirements, build, run, output, layout and licence sections.*

## Overview

`Hello` is a minimal single-class Java console application. It writes one fixed greeting to standard output and then terminates; it reads no input, opens no resource and keeps no state. The class is declared in the default package and imports nothing outside `java.lang`, which is why it is launched by the bare class name `Hello` rather than by a package-qualified name.

Source: Hello.java (class Hello)

## Requirements

A JDK is all that is required. This repository pins no Java version: it carries no `pom.xml`, `build.gradle`, `.java-version`, `.sdkmanrc`, CI descriptor or `module-info.java` in which a version could be recorded, and it has no dependency manifest, so nothing has to be resolved or downloaded before building.

One prerequisite is specific to a single launch path. The direct source launch `java Hello.java` shown under Run is single-file source-code launch, which needs JDK 11 or later. The compile-then-run path carries no such floor and works on considerably older releases.

## Build

Compile from the repository root:

```bash
javac Hello.java
```

The compiler exits with status 0 and emits no diagnostics. Compiling this way leaves a `Hello.class` file next to the source, and the repository has no `.gitignore`, so that file shows up as untracked content in `git status`. To keep the working tree clean, direct the class output elsewhere with an output directory, as in `javac -d /tmp/hello-build Hello.java`. Do not commit the class file either way.

## Run

Launch the compiled class by its bare name, from the repository root:

```bash
java Hello
```

Alternatively, run the source file directly without compiling it first. This path needs JDK 11 or later and leaves no class file behind:

```bash
java Hello.java
```

Both paths produce byte-identical standard output. Command-line arguments are accepted but never consulted:

| Aspect | Contract |
| --- | --- |
| `String[] args` parameter | Accepted only to satisfy the entry-point signature that the JVM requires of a launchable class. |
| Arguments supplied at launch | Never read. The array is not dereferenced anywhere, so the output is identical whether or not arguments are passed. |

Source: Hello.java (Hello.main)

## Expected Output

Either launch path writes the literal `Hello from Java!` followed by the platform line separator to standard output:

```text
Hello from Java!
```

The separator is the one the host defines, so the exact byte count varies between platforms; the literal and its single trailing separator do not. Standard error stays empty and the process exits with status 0. There is no `System.exit` call: `main` returns normally and the JVM then shuts down of its own accord, which is a deliberate property of the program rather than an omission.

## Project Layout

The repository is flat: three tracked files at the root, and no subdirectories.

| File | Purpose |
| --- | --- |
| [Hello.java](Hello.java) | The single source file: class `Hello` and its `main` entry point. |
| `README.md` | This project guide. |
| `LICENSE` | The full text of the GNU General Public License, Version 3. |

## Licence

This project is licensed under the GNU General Public License, Version 3, 29 June 2007 (GPLv3). The full text is in [LICENSE](LICENSE).

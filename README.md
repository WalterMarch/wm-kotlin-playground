# Kotlin

**Kotlin** is a general purpose, high-level language that uses the JVM. It is said to be 100% compatible with Java. It can also compile to JavaScript.

## File Extension

`.kt` - these are Kotlin script files.

## Compile

```bash
cd <implementation/folder>
kotlinc <filename>.kt -include-runtime -d <filename>.jar
```

## Execute

```bash
java -jar <filename>.jar
```

## configit.sh

This repository's *devcontainer.json* uses a `postCreateCommand` to run `configit.sh`.

This script uses information particular to the user of the repository.

```shell
#!/bin/bash

git config --global user.email "yourEmail@mail.com"
git config --global user.name "yourGitUserName"
git config --global push.autoSetupRemote true
git config --global push.default current
git config --global init.defaultBranch main
git config --global --add safe.directory $1
```

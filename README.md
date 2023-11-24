# External declarations for Kotlin/JS

This repository contains sources of external declarations for Kotlin/JS.
The repository is no longer supported and signatures are no longer updated.

## How to use?

### Bintray

All libraries are available in the maven repository https://jcenter.bintray.com/
with group id `kotlin.js.externals` and artifact id `kotlin-js-<library-name>`.

To use declarations from a library `foo`, you need to add
this repository to your repository list for your build tool, and then add a dependency to `kotlin-js-foo`.

Gradle:
```gradle
repositories {
    jcenter()
}

dependencies {
    compile "kotlin.js.externals:kotlin-js-foo:$foo_version"
}
```

Maven:
```maven
<repositories>
    <repository>
        <id>kotlin-js-externals</id>
        <name>Kotlin/JS externals</name>
        <url>https://jcenter.bintray.com</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>kotlin.js.externals</groupId>
        <artifactId>kotlin-js-foo</artifactId>
        <version>$foo_version</version>
    </dependency>
</dependencies>
```

### NPM

All libraries are available on npmjs.com under `@kotlin-externals` scope with the original name.
To install declarations for the library `foo` you must use `@kotlin-externals/foo`:

```
npm install --save-dev @kotlin-externals/foo
```

### How to choose version number?

For a JavaScript library of version `X.Y.Z`, use an external declarations library with latest `X.Y` version.


> Sidenote:
>
> This version scheme is required in order to:
> * Obtain simple mapping to/from original library version.
> * Have the ability to update external declarations
> (a version of external declarations library must have some part independent of a version of the original library).
> * Not use pre-release versions by default (see https://docs.npmjs.com/misc/semver#prerelease-tags).
> * Follow the three number Semver/NPM restriction.

## How to contribute?
* [Report](https://github.com/Kotlin/js-externals/issues) any issues you find in existing declarations.
* Or fix them and send a Pull Request.
* [Request](https://github.com/Kotlin/js-externals/issues) declarations that are missing.
* Or create them yourself and send a Pull Request. 

Please feel free to ask any questions in [#javascript](https://kotlinlang.slack.com/messages/C0B8L3U69/) channel of [kotl.in/slack](https://kotl.in/slack)

## How to write declarations?

To write declarations from scratch or to improve existing declarations
you have to read about [external modifier](https://kotlinlang.org/docs/reference/js-interop.html#external-modifier) and [JS interop annotations](https://kotlinlang.org/docs/reference/js-modules.html#jsmodule-annotation).

The simplest way to get external declarations is converting TypeScript declarations (d.ts) to Kotlin [using Dukat](https://kotlinlang.org/docs/js-external-declarations-with-dukat.html).

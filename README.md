# External declarations for Kotlin/JS

This repository contains sources of external declarations for Kotlin/JS.

## How to use?

### Bintray
All libraries available in the maven repository https://bintray.com/kotlin/js-externals/
with group id `kotlin.js.externals` and artifact id `kotlin-js-<library-name>`.

So, to use declarations for some library `foo` you need to add
this repository to your repository list for your build tool and add a dependency to `kotlin-js-foo`.

Gradle:
```gradle
repositories {
    maven { url "https://kotlin.bintray.com/js-externals" }
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
        <url>https://kotlin.bintray.com/js-externals</url>
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

All libraries also available on npmjs.com under `@kotlin-externals` scope with the original name.
I.e. to install declarations for the library `foo` you must use `@kotlin-externals/foo`:

```
npm install --save-dev @kotlin-externals/foo
```

### How to choose version number?
For a JS library version `X.Y.Z` use an external declarations library with latest `X.Y` version.


> Sidenote:
>
> We have to use such version scheme to achieve next goals:
> * Get simple mapping to/from original library version.
> * Get an ability to update external declarations
> (a version of external declarations library must have some part independent of a version of the original library).
> * Don't use pre-release version by default (see https://docs.npmjs.com/misc/semver#prerelease-tags).
> * Fit into three numbers (Semver/NPM's restriction).

## How to contribute?
* [Report](https://github.com/Kotlin/js-externals/issues) any issue that you found in existing declarations.
* Feel free to fix them by yourself and send PR.
* [Request](https://github.com/Kotlin/js-externals/issues) declarations that you missed.
* Feel free to create them by yourself and send PR. (Don't hesitate to ask any question in [#javascript](https://kotlinlang.slack.com/messages/C0B8L3U69/) channel of [kotl.in/slack](https://kotl.in/slack))

## How to write declarations?

To write declarations from scratch or to improve existing declarations
you have to read about [external modifier](https://kotlinlang.org/docs/reference/js-interop.html#external-modifier) and [JS interop annotations](https://kotlinlang.org/docs/reference/js-modules.html#jsmodule-annotation).

But the simplest way to get external declarations is converting TypeScript declarations (d.ts) to Kotlin [using ts2kt](https://kotlinlang.org/docs/tutorials/javascript/working-with-javascript.html#using-ts2kt-to-generate-header-files-for-kotlin).

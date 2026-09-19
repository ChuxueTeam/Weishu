package com.sevensoft.weishu.highlight.languages

import com.sevensoft.weishu.highlight.core.Language
import com.sevensoft.weishu.highlight.languages.bash.bash
import com.sevensoft.weishu.highlight.languages.c.c
import com.sevensoft.weishu.highlight.languages.cmake.cmake
import com.sevensoft.weishu.highlight.languages.cpp.cpp
import com.sevensoft.weishu.highlight.languages.csharp.csharp
import com.sevensoft.weishu.highlight.languages.css.css
import com.sevensoft.weishu.highlight.languages.dart.dart
import com.sevensoft.weishu.highlight.languages.diff.diff
import com.sevensoft.weishu.highlight.languages.dockerfile.dockerfile
import com.sevensoft.weishu.highlight.languages.go.go
import com.sevensoft.weishu.highlight.languages.glsl.glsl
import com.sevensoft.weishu.highlight.languages.ini.ini
import com.sevensoft.weishu.highlight.languages.java.java
import com.sevensoft.weishu.highlight.languages.javascript.javascript
import com.sevensoft.weishu.highlight.languages.json.json
import com.sevensoft.weishu.highlight.languages.kotlin.kotlin
import com.sevensoft.weishu.highlight.languages.latex.latex
import com.sevensoft.weishu.highlight.languages.lua.lua
import com.sevensoft.weishu.highlight.languages.markdown.markdown
import com.sevensoft.weishu.highlight.languages.php.php
import com.sevensoft.weishu.highlight.languages.powershell.powershell
import com.sevensoft.weishu.highlight.languages.properties.properties
import com.sevensoft.weishu.highlight.languages.python.python
import com.sevensoft.weishu.highlight.languages.rust.rust
import com.sevensoft.weishu.highlight.languages.ruby.ruby
import com.sevensoft.weishu.highlight.languages.sql.sql
import com.sevensoft.weishu.highlight.languages.swift.swift
import com.sevensoft.weishu.highlight.languages.typescript.typescript
import com.sevensoft.weishu.highlight.languages.xml.xml
import com.sevensoft.weishu.highlight.languages.yaml.yaml

/**
 * Every grammar bundled with the highlighter.
 *
 * Each entry builds a fresh mode tree: compilation mutates modes in place, mirroring `highlight.js`.
 */
internal fun builtinLanguages(): List<Language> = listOf(
    json(),
    ini(),
    cmake(),
    go(),
    glsl(),
    yaml(),
    bash(),
    dockerfile(),
    javascript(),
    typescript(),
    xml(),
    css(),
    dart(),
    java(),
    kotlin(),
    latex(),
    lua(),
    powershell(),
    properties(),
    python(),
    c(),
    cpp(),
    csharp(),
    sql(),
    diff(),
    markdown(),
    rust(),
    ruby(),
    php(),
    swift(),
)

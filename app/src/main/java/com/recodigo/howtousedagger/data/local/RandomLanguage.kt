package com.recodigo.howtousedagger.data.local

/**
 * Created by SAUL on 29/12/2020.
 */
object RandomLanguage {
    fun getLanguage(): LanguageEntity = randomLanguage()

    private fun randomLanguage(): LanguageEntity {
        return when((1..10).random()) {
            1 -> kotlin
            2 -> java
            3 -> javaScript
            4 -> swift
            5 -> python
            6 -> rust
            7 -> go
            8 -> cSharp
            9 -> dart
            10 -> cPlusPlus
            else -> kotlin
        }
    }

    private val kotlin by lazy {
        LanguageEntity(
            language = "Kotlin",
            desc = "Kotlin es un lenguaje de programación de tipado estático que corre sobre la máquina virtual de Java y que también puede ser compilado a código fuente de JavaScript. Es desarrollado principalmente por JetBrains en sus oficinas de San Petersburgo (Rusia). El nombre proviene de la isla de Kotlin, situada cerca de San Petersburgo.2\\n\\nKotlin fue nombrado lenguaje del mes por la revista Dr. Dobb' Journal en su edición de enero de 2016.3\u200B Aunque no tiene una sintaxis compatible con Java, Kotlin está diseñado para interoperar con código Java y es dependiente del código Java de su biblioteca de clases, tal como pueda ser el entorno de colecciones de Java",
            year = "2016",
            company = "JetBrains"
        )
    }

    private val java by lazy {
        LanguageEntity(
            language = "Java",
            desc = "La plataforma Java es el nombre de un entorno o plataforma de computación originaria de Sun Microsystems, capaz de ejecutar aplicaciones desarrolladas usando el lenguaje de programación Java u otros lenguajes que compilen a bytecode y un conjunto de herramientas de desarrollo. En este caso, la plataforma no es un hardware específico o un sistema operativo, sino más bien una máquina virtual encargada de la ejecución de las aplicaciones, y un conjunto de bibliotecas estándar que ofrecen una funcionalidad común",
            year = "1996",
            company = "Oracle"
        )
    }

    private val javaScript by lazy {
        LanguageEntity(
            language = "JavaScript",
            desc = "JavaScript (abreviado comúnmente JS) es un lenguaje de programación interpretado, dialecto del estándar ECMAScript. Se define como orientado a objetos,2\u200B basado en prototipos, imperativo, débilmente tipado y dinámico.\n" +
                    "\n" +
                    "Se utiliza principalmente del lado del cliente, implementado como parte de un navegador web permitiendo mejoras en la interfaz de usuario y páginas web dinámicas3\u200B y JavaScript del lado del servidor (Server-side JavaScript o SSJS). Su uso en aplicaciones externas a la web, por ejemplo en documentos PDF, aplicaciones de escritorio (mayoritariamente widgets) es también significativo.",
            year = "1995",
            company = "Netscape"
        )
    }

    private val swift by lazy {
        LanguageEntity(
            language = "Swift",
            desc = "Swift es un lenguaje de programación multiparadigma creado por Apple enfocado en el desarrollo de aplicaciones para iOS y macOS. Fue presentado en la WWDC 20147\u200B y está diseñado para integrarse con los Frameworks Cocoa y Cocoa Touch; puede usar cualquier biblioteca programada en Objective-C y llamar a funciones de C. También es posible desarrollar código en Swift compatible con Objective-C bajo ciertas condiciones. Swift tiene la intención de ser un lenguaje seguro, de desarrollo rápido y conciso. Usa el compilador LLVM incluido en Xcode 6. Fue presentado como un lenguaje propietario, pero en el año 2015, con la versión 2.2, pasó a ser de código abierto8\u200B con la Licencia Apache 2.0.",
            year = "2014",
            company = "Apple"
        )
    }

    private val python by lazy {
        LanguageEntity(
            language = "Python",
            desc = "Python es un lenguaje de programación interpretado cuya filosofía hace hincapié en la legibilidad de su código.2\u200B Se trata de un lenguaje de programación multiparadigma, ya que soporta orientación a objetos, programación imperativa y, en menor medida, programación funcional. Es un lenguaje interpretado, dinámico y multiplataforma.",
            year = "1991",
            company = "Guido van Rossum"
        )
    }

    private val rust by lazy {
        LanguageEntity(
            language = "Rust",
            desc = "Rust es un lenguaje de programación compilado, de propósito general y multiparadigma que está siendo desarrollado por Mozilla.5\u200B Ha sido diseñado para ser \"un lenguaje seguro, concurrente y práctico\".6\u200B7\u200B Es un lenguaje de programación multiparadigma que soporta programación funcional pura, por procedimientos, imperativa y orientada a objetos.",
            year = "2010",
            company = "Graydon Hoare"
        )
    }

    private val go by lazy {
        LanguageEntity(
            language = "Go",
            desc = "Go es un lenguaje de programación concurrente y compilado inspirado en la sintaxis de C, que intenta ser dinámico como Python y con el rendimiento de C o C++. Ha sido desarrollado por Google9\u200B y sus diseñadores iniciales fueron Robert Griesemer, Rob Pike y Ken Thompson. 10\u200B Actualmente está disponible en formato binario para los sistemas operativos Windows, GNU/Linux, FreeBSD y Mac OS X, pudiendo también ser instalado en estos y en otros sistemas mediante el código fuente.11\u200B12\u200B Go es un lenguaje de programación compilado, concurrente, imperativo, estructurado, orientado a objetos y con recolector de basura que de momento es soportado en diferentes tipos de sistemas UNIX, incluidos Linux, FreeBSD, Mac OS X y Plan 9 (puesto que parte del compilador está basado en un trabajo previo sobre el sistema operativo Inferno). Las arquitecturas soportadas son i386, amd64 y ARM.",
            year = "2009",
            company = "Robert Griesemer, Rob Pike y Ken Thompson"
        )
    }

    private val cSharp by lazy {
        LanguageEntity(
            language = "C#",
            desc = "\"C#\" (pronunciado si sharp en inglés) es un lenguaje de programación multiparadigma desarrollado y estandarizado por la empresa Microsoft como parte de su plataforma .NET, que después fue aprobado como un estándar por la ECMA (ECMA-334) e ISO (ISO/IEC 23270). C# es uno de los lenguajes de programación diseñados para la infraestructura de lenguaje común.\n" +
                    "\n" +
                    "Su sintaxis básica deriva de C/C++ y utiliza el modelo de objetos de la plataforma .NET, similar al de Java, aunque incluye mejoras derivadas de otros lenguajes.",
            year = "2000",
            company = "Microsoft"
        )
    }

    private val dart by lazy {
        LanguageEntity(
            language = "Dart",
            desc = "Dart (originalmente llamado Dash) es un lenguaje de programación de código abierto, desarrollado por Google. Fue revelado en la conferencia goto; en Aarhus, Dinamarca el 10 de octubre de 2011.3\u200B El objetivo de Dart no es reemplazar JavaScript como el principal lenguaje de programación web en los navegadores web, sino ofrecer una alternativa más moderna. El espíritu del lenguaje puede verse reflejado en las declaraciones de Lars Bak, ingeniero de software de Google, que define a Dart como un “lenguaje estructurado pero flexible para programación Web”.",
            year = "2011",
            company = "Google"
        )
    }

    private val cPlusPlus by lazy {
        LanguageEntity(
            language = "C++",
            desc = "C++ es un lenguaje de programación diseñado en 1979 por Bjarne Stroustrup. La intención de su creación fue extender al lenguaje de programación C mecanismos que permiten la manipulación de objetos. En ese sentido, desde el punto de vista de los lenguajes orientados a objetos, C++ es un lenguaje híbrido.\n" +
                    "\n" +
                    "Posteriormente se añadieron facilidades de programación genérica, que se sumaron a los paradigmas de programación estructurada y programación orientada a objetos. Por esto se suele decir que el C++ es un lenguaje de programación multiparadigma.",
            year = "1983",
            company = "Bjarne Stroustrup"
        )
    }
}
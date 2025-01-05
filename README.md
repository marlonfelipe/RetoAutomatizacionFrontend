Proyecto de Automatización con Selenium, Cucumber, Serenity y Screenplay BDD
Descripción

Este proyecto utiliza Java 17 y varias herramientas de automatización para realizar pruebas en el sitio web SauceDemo. Se emplean tecnologías como Selenium WebDriver, Cucumber, Serenity BDD y el patrón Screenplay BDD para mejorar la estructura y legibilidad del código de automatización, así como para generar reportes detallados de las pruebas realizadas.
Requisitos

    Java 17: El lenguaje de programación utilizado para desarrollar las pruebas de automatización.

    Selenium WebDriver: Selenium WebDriver se utiliza para automatizar las interacciones con el sitio web SauceDemo. Se emplea la versión de Chrome más reciente y estable.

    Versión de Chrome: 119.0.6045.105 (r1204232)
    Chromedriver: Asegúrate de usar la versión de Chromedriver adecuada para la versión de Chrome instalada. Puedes descargarla desde este enlace:
    Chromedriver para pruebas

    Maven: Para gestionar las dependencias del proyecto. En el archivo pom.xml se encuentran todas las dependencias necesarias para ejecutar el proyecto correctamente.

    Cucumber: Se utiliza para la escritura de pruebas en lenguaje natural (Gherkin), permitiendo definir escenarios de prueba de forma clara y comprensible.

    Serenity BDD: Se integra Serenity BDD para obtener reportes detallados y estructurados sobre el estado de las pruebas automatizadas.

    Screenplay BDD: Se implementa el patrón Screenplay BDD para mejorar la estructura y legibilidad del código de automatización, siguiendo las mejores prácticas para escribir pruebas más mantenibles y comprensibles.

Ejecución de las Pruebas

Para ejecutar los test puedes hacerlo de las siguientes maneras:

    Desde la terminal de IntelliJ IDEA:

        Ejecuta el siguiente comando para limpiar el proyecto y descargar las dependencias:

mvn clean

Luego ejecuta el siguiente comando para instalar las dependencias y ejecutar los tests:

        mvn install

    Desde IntelliJ IDEA (Clic derecho):
        Puedes hacer clic derecho sobre la clase Runner (que contiene todos los tests) y seleccionar la opción Run para ejecutar los tests directamente desde la IDE.

Reportes

Los reportes generados por Serenity BDD se encuentran en el directorio target/site/serenity/ del proyecto. Dentro de esa carpeta, podrás encontrar el archivo index.html, que es el informe de las pruebas ejecutadas.

    Ubicación de los reportes:

    target/site/serenity/index.html

Al ejecutar los tests correctamente, Serenity BDD también te brindará la opción de acceder al informe generado directamente desde la terminal de IntelliJ IDEA.
Conclusión

Este proyecto de automatización está basado en las tecnologías más modernas y mantiene una estructura clara utilizando el patrón Screenplay BDD y herramientas como Cucumber y Serenity BDD para facilitar el desarrollo y mantenimiento de las pruebas automatizadas.

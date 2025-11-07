# 💻 Laboratorio 4: Sistema de Gestión de Contenidos (CMS) - Polimorfismo

## 🎯 Objetivo del Proyecto
Implementar un **Sistema de Gestión de Contenidos (CMS)** para la **Estudio de Grabación Audiovisual (EGA)** de la UVG. [cite_start]El sistema debe permitir gestionar, publicar y organizar diferentes tipos de contenidos (Artículos, Videos, Imágenes) desde una única plataforma[cite: 134].

El enfoque principal del laboratorio es aplicar los principios de la **Programación Orientada a Objetos (POO)**, específicamente:
* [cite_start]El patrón de arquitectura **Modelo-Vista-Controlador (MVC)**[cite: 140, 146].
* [cite_start]El **Polimorfismo** a través de **Herencia** e **Interfaces** para manejar los distintos tipos de contenido[cite: 130, 135].

---

## 📋 Requisitos Funcionales del CMS

El sistema implementado en Java debe cumplir con los siguientes requisitos:

1.  [cite_start]**Gestión Básica:** El usuario puede **crear, editar y eliminar** contenidos (Artículos, Videos, Imágenes)[cite: 134].
2.  [cite_start]**Polimorfismo en Publicación:** El sistema debe permitir a cada contenido tener un **comportamiento único** al publicarse, aprovechando el polimorfismo mediante la interfaz `IPublicable`[cite: 135, 141].
3.  [cite_start]**Clasificación:** El usuario puede clasificar contenidos en **categorías o etiquetas**[cite: 136].
4.  [cite_start]**Búsqueda y Filtrado:** El usuario puede buscar y **filtrar contenidos** según su tipo o categoría[cite: 137, 181].
5.  [cite_start]**Roles:** El sistema debe gestionar dos roles: **Administradores** (pueden publicar y eliminar) y **Editores** (solo pueden crear y editar)[cite: 138, 141].
6.  [cite_start]**Reportes:** El sistema puede **generar reportes o resúmenes** de los contenidos publicados[cite: 139, 181].

---

## 🏛️ Diseño del Sistema: MVC y POO

El sistema está estructurado bajo el patrón **Modelo-Vista-Controlador (MVC)** para garantizar una correcta separación de responsabilidades:

### 1. Modelo (Data & Logic)
El corazón de la lógica de negocio y la gestión de datos.

| Clase / Interfaz | Propósito Clave | Relación POO |
| :--- | :--- | :--- |
| **`Contenido`** | Clase abstracta base de la jerarquía. | [cite_start]**Herencia** [cite: 141] |
| **`IPublicable`** | Define el método `publicar()` para el polimorfismo. | [cite_start]**Interfaz** [cite: 141] |
| **`Articulo`, `Video`, `Imagen`** | Tipos concretos de contenido. | [cite_start]Heredan de `Contenido` e implementan `IPublicable`[cite: 141]. |
| **`Usuario`** | Clase abstracta base para roles. | [cite_start]**Herencia** [cite: 141] |
| **`Administrador`, `Editor`** | Roles específicos con distintos permisos. | [cite_start]Heredan de `Usuario`[cite: 141]. |
| **`CMSModel`** | [cite_start]Clase que maneja las colecciones (`List<Contenido>`) y la lógica CRUD (crear, editar, eliminar, publicar)[cite: 146, 178]. | **Asociación** con todas las clases de datos. |

### 2. Controlador (`CMSController`)
Coordina las peticiones de la vista, invoca la lógica del modelo y prepara la respuesta.

* [cite_start]Maneja la creación polimórfica de contenidos (`Articulo`, `Video`, `Imagen`)[cite: 178].
* [cite_start]Aplica el polimorfismo al llamar a `model.publicarContenido()`, que a su vez llama a `IPublicable.publicar()` en el objeto concreto[cite: 178, 181].

### 3. Vista (`CMSView`)
[cite_start]Maneja la interacción con el usuario mediante un menú de consola[cite: 146].

---

## 🚀 Estructura del Proyecto y Ejecución

### Estructura de Carpetas

La implementación en Java sigue la estructura estándar de paquetes del patrón MVC:



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=--==-=-=-=-=-=-=--=-=--=-==-=-=-=--=-=-=-=-=-=-=-=--=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=


### Menú del Driver Program (CMSController)

El sistema se inicia con un Driver Program que debe implementar el siguiente menú interactivo[cite: 193]:

1.  **Login** (como Administrador o Editor) [cite: 194]
2.  **Nuevo Contenido** (Articulo, Video, Imagen) [cite: 195]
3.  **Editar Contenido** [cite: 196]
4.  **Publicar Contenido** [cite: 197]
5.  **Eliminar Contenido** [cite: 201]
6.  **Buscar Contenido** por Tipo [cite: 202]
7.  **Filtrar Contenido** por Categoría [cite: 203]
8.  **Generar Reporte** [cite: 204]
9.  **Salir** [cite: 205]

---

## 🛠️ Instrucciones de Uso

1.  **Clonar el Repositorio:**
    ```bash
    git clone [https://github.com/](https://github.com/)_____________________
    ```
2.  **Compilación:** Compilar todos los archivos `.java` en el IDE de su preferencia (Eclipse, IntelliJ, VS Code) o usando el terminal:
    ```bash
    javac src/controller/CMSController.java src/model/*.java src/view/*.java
    ```
3.  **Ejecución:** Ejecutar el controlador principal (asumiendo que contiene el `main`):
    ```bash
    java src.controller.CMSController
    ```

---

*Desarrollado por: [Tu Nombre / Nombres del Grupo]*
*Curso: CC2008 - Programación Orientada a Objetos*
*Semestre: II, 2025*

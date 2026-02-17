# **<center>Parte Teórica - GIT**

## ¿Qué es Markdown?
Markdown es un lenguaje de marcado ligero y versátil que permite dar formato a texto plano usando caracteres especiales (como #, *, _) para crear encabezados, negritas, listas y enlaces. Creado para ser fácil de leer y escribir, convierte archivos de texto simple en HTML estructurado, siendo popular en documentación, blogs y notas.

## 1. ¿Qué es un repositorio en GIT y cómo se diferencia de un proyecto "normal"?
Un repositorio en Git es una carpeta que contiene un proyecto junto con todo su historial de cambios. Incluye una carpeta oculta llamada `.git`, donde Git guarda versiones, commits, ramas y configuraciones.

* Un proyecto normal solamente contiene archivos.
* Un repositorio Git contiene archivos más el sistema de control de versiones.

## 2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?
Git trabaja con tres áreas principales:

### **Working Directory**
Es la carpeta donde el desarrollador edita los archivos normalmente.

### **Staging Area (Index)**
Es una zona intermedia donde se preparan los archivos antes de realizar un commit utilizando `git add`.

### **Repository**
Es el área donde se guardan oficialmente los cambios mediante `git commit`.

## 3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).
Git utiliza objetos internos para almacenar la información:

* **blob**: almacena el contenido de los archivos.
* **tree**: representa la estructura de directorios.
* **commit**: guarda un snapshot del proyecto en un momento específico.
* **tag**: marca un commit específico, normalmente usado para versiones.

## 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?
Para crear un commit necesitamos los siguientes comandos:

* git add nombre_archivo
* git commit -m "Mensaje descriptivo"

Un commit almacena:

* Snapshot del proyecto.
* Autor.
* Fecha.
* Mensaje descriptivo.
* Referencia al commit anterior.

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

* El comando `git fetch` descarga los cambios del repositorio remoto pero no los fusiona automáticamente.
* El comando `git pull` descarga los cambios y los fusiona automáticamente con la rama actual.

## 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
Un branch es un puntero móvil que apunta a un commit específico. Permite trabajar en diferentes líneas de desarrollo.

### Gestion de punteros a commits:

* **Puntero móvil**: Una rama no es una copia del proyecto, sino un simple archivo de texto que guarda el hash (40 caracteres) del commit más reciente.

* **HEAD**: Git usa un puntero especial llamado `HEAD` para saber en qué rama estás trabajando actualmente. `HEAD` apunta a la rama local, y la rama apunta a su último commit.

* **Creación de ramas**: Al crear una rama (ej. `git branch testing`), Git solo crea un nuevo archivo de texto (puntero) apuntando al mismo commit donde estás parado.

* **Cambio de rama (`git checkout`)**: Git actualiza `HEAD` para apuntar a la nueva rama y restaura los archivos en tu directorio de trabajo para que coincidan con el commit de esa rama.

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
Un merge se realiza con el comando `git merge rama`.

Puede haber conflictos si dos ramas modifican la misma línea del mismo archivo. Se resuelven editando el archivo manualmente.

## 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
Staging prepara los cambios para el commit. Si lo omites con `git commit -a`, se agregan automáticamente todos los archivos rastreados modificados, pero **NO** los archivos nuevos.

## 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
Es un archivo que especifica qué archivos/carpetas Git debe ignorar (no rastrear). Útil para archivos temporales, configuraciones locales, dependencias, etc. Ejemplos: `node_modules/`, `*.log`, `.env`

## 10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

* **--amend**: Modifica el último commit (cambia mensaje o agrega archivos olvidados).
* **Nuevo commit**: Crea un commit completamente nuevo en el historial.

## 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?
`git stash` guarda temporalmente cambios sin hacer commit. Útil cuando:

* Necesitas cambiar de branch pero no quieres hacer commit.
* Quieres probar algo rápido sin perder tu trabajo actual.
* Recuperas con `git stash pop` o `git stash apply`.

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

* `git reset`: Mueve HEAD a otro commit (--soft, --mixed, --hard).
* `git revert`: Crea un nuevo commit que deshace cambios.
* `git checkout`: Restaura archivos desde commits anteriores.

### 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
Remotos son versiones del repositorio alojadas en servidores (GitHub, GitLab, Bitbucket) que permiten la colaboración y respaldo.

**origin**
* Nombre por defecto del repositorio remoto principal.
* Se crea automáticamente cuando haces git clone.
* Apunta al repositorio del que clonaste.
* Es una convención, no una regla (puedes renombrarlo).

**upstream**
* Usado cuando trabajas con forks.
* Apunta al repositorio original (del cual hiciste el fork).
* Permite sincronizar tu fork con el proyecto original.
* Debes agregarlo manualmente.

**Comandos para la gestion de forks**
* `git remote add origin URL`
* `git remote -v`

## 14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

* El comando `git log` muestra la lista de commits con autor, fecha y mensaje.
* El comando `git diff` compara cambios entre commits o ramas.
* El comando `git show` muestra detalles de un commit en específico.
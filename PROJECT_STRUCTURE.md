# KMPDemo Project Structure

This project is a **Kotlin Multiplatform (KMP)** project using **Compose Multiplatform** for a shared UI.

## 1. Root Structure
- **`composeApp/`**: The core of the project. Contains shared UI (Compose) and business logic for all platforms (Android, Desktop, Web, etc.).
- **`androidApp/`**: A thin Android-specific wrapper that launches the `composeApp`.
- **`build.gradle.kts` (root)**: Root build configuration and dependency management.

## 2. composeApp Source Sets (`composeApp/src`)
Kotlin Multiplatform uses source sets to separate shared and platform-specific code:

- **`commonMain/`**: **Core Shared Code.**
  - Contains shared Compose UI, ViewModels, and business logic.
  - Examples: `BookEntity.kt`, `Modules.kt` (Koin).
- **`androidMain/`**: Android-specific implementations.
  - Example: `DatabaseFactory.android.kt`, `Platform.android.kt`.
- **`jvmMain/`**: Desktop (JVM) specific implementations.
  - Example: `main.kt` (Desktop entry point), `DatabaseFactory.jvm.kt`, `Platform.jvm.kt`.
- **`wasmJsMain/`, `jsMain/`, `webMain/`**: Entry points and platform logic for Web targets.
- **`commonTest/`**: Unit tests that run across all supported platforms.

## 3. Key Architectural Components
- **Database (`book/data/database`)**:
  - Uses a database (like Room) with the `expect`/`actual` pattern.
  - `DatabaseFactory` defines the interface in `commonMain`, with specific drivers implemented in `androidMain` and `jvmMain`.
- **Dependency Injection (`di/`)**:
  - Uses **Koin** to manage dependencies.
  - Modules are defined in `Modules.kt` and initialized with platform-specific configurations (`Platform.android.kt`, `Platform.jvm.kt`).
- **Resources**:
  - Managed in `commonMain` (via Compose Resources) to share images and strings across all platforms.

## 4. Execution Flow
- **Android**: `androidApp` starts -> calls shared UI in `composeApp`.
- **Desktop**: `jvmMain/main.kt` starts -> calls shared UI in `composeApp`.

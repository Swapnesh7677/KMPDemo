
![Screenshot_2026-03-18-06-11-28-72_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/2a598312-002b-4f61-8204-869b2d04ac04)
![Screenshot_2026-03-18-06-11-35-72_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/fabf158f-7570-4bfe-b527-18059fad8f45)
![Screenshot_2026-03-18-06-11-44-68_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/48c3c160-b15e-466a-9daa-1dcc4cf26cc5)
![Screenshot_2026-03-18-06-11-49-60_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/6ecf78f8-cd1b-45c6-9064-f0f7e8d13320)
![Screenshot_2026-03-18-06-11-53-14_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/faea4102-a49d-4c2b-a665-216917c24eb1)
![Screenshot_2026-03-18-06-11-57-54_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/d2901d19-9093-484b-84ae-3efe1f6ff040)
![Screenshot_2026-03-18-06-12-17-06_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/c52f412d-d841-4682-97d9-a3d5645a9e0d)
![Screenshot_2026-03-18-06-12-20-30_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/93330921-84ce-4c26-a565-34fac86f5b14)

![Screenshot_2026-03-18-06-12-01-54_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/c29ac093-e61b-4886-bbc8-a61d56bf9507)
![Screenshot_2026-03-18-06-42-38-49_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/60beaa49-9f1e-4ca2-8bd3-2edf8a844783)
![Screenshot_2026-03-18-06-42-52-31_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/a9c59ddb-2f81-45f4-91cf-57568b31d442)


This is a Kotlin Multiplatform project targeting Android, Web.

* [/composeApp](./composeApp/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - [commonMain](./composeApp/src/commonMain/kotlin) is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    the [iosMain](./composeApp/src/iosMain/kotlin) folder would be the right place for such calls.
    Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./composeApp/src/jvmMain/kotlin)
    folder is the appropriate location.

### Build and Run Android Application

To build and run the development version of the Android app, use the run configuration from the run widget
in your IDE’s toolbar or build it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```

### Build and Run Web Application

To build and run the development version of the web app, use the run configuration from the run widget
in your IDE's toolbar or run it directly from the terminal:
- for the Wasm target (faster, modern browsers):
  - on macOS/Linux
    ```shell
    ./gradlew :composeApp:wasmJsBrowserDevelopmentRun
    ```
  - on Windows
    ```shell
    .\gradlew.bat :composeApp:wasmJsBrowserDevelopmentRun
    ```
- for the JS target (slower, supports older browsers):
  - on macOS/Linux
    ```shell
    ./gradlew :composeApp:jsBrowserDevelopmentRun
    ```
  - on Windows
    ```shell
    .\gradlew.bat :composeApp:jsBrowserDevelopmentRun
    ```

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [YouTrack](https://youtrack.jetbrains.com/newIssue?project=CMP).


https://filekit.mintlify.app/installation

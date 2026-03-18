
![Screenshot_2026-03-18-06-11-28-72_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/44d4018f-a4cd-4e23-804a-0622e0154074)
![Screenshot_2026-03-18-06-11-35-72_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/4e1e8389-2a00-4038-96d4-dbb598032e5a)
![Screenshot_2026-03-18-06-11-44-68_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/33829fa1-d883-450e-9b86-6b50eaf28607)
![Screenshot_2026-03-18-06-11-49-60_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/67ba240f-fcf8-4a11-baba-3bb3645852ca)
![Screenshot_2026-03-18-06-11-53-14_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/97dd14d7-6d7e-4653-9a6e-44a3c1e42087)
![Screenshot_2026-03-18-06-11-57-54_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/f35faeb7-0c42-47b5-88b7-9946e68e624f)
![Screenshot_2026-03-18-06-12-01-54_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/dd781d52-ecd2-4228-b9c0-948a8919ad87)
![Screenshot_2026-03-18-06-12-17-06_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/088ef06b-8793-4056-ad84-e75f4a062592)
![Screenshot_2026-03-18-06-12-20-30_4e64205ad3614b3735f5e8c329696b0e](https://github.com/user-attachments/assets/d6bcc3e8-03b9-4e67-9123-c85c50b3f0a6)



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

# No-Break Space Minimum Working Example

My `SmsManager.sendTextMessage()` implementation seems to have a problem with sending a text message
to any recipient with a No-Break Space (Unicode `U+00A0`) in it.  This is a simple app that will
test that.  You specify a number you can verify receiving a message at (just 10 digits, no format),
and then hit either button to send with or without NBSP.

To build, you need Android SDK, Gradle, and to create `local.properties` with the content:

    sdk.dir=/path/to/your/android/sdk

Then run:

```bash
./gradlew build
```

Or just open this in Android Studio and everything should work nicely.

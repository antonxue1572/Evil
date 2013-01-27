@ECHO OFF
E:
CD \AlmostDangerous
"C:\Program Files\Java\jdk1.6.0_06\bin\jar.exe" cvfm MouseMove.jar MouseMoveManifest.txt MouseMove.class
"C:\Program Files\Java\jdk1.6.0_06\bin\jar.exe" cvfm MouseClick.jar MouseClickManifest.txt MouseClick.class
"C:\Program Files\Java\jdk1.6.0_06\bin\jar.exe" cvfm RandomType.jar RandomTypeManifest.txt RandomType.class
PAUSE

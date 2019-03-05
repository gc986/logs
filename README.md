# logs

<h1>logs - helper for send logs in Logcat</h1>

How to use?
1 - Add dependence in <b>build.gradle</b>
<i>implementation 'ru.gc986:logs:0.0.2'</i>

2 - Set your TAG
<i>Logs.TAG = "text..."</i>

3 - Called function and put text
<i>Logs.i("some text...")</i>

4* - setup active
<i>Logs.enable = true</i>

Fuctions:
Logs.enable - on/off logs
Logs.i("text...") - send info log (if Logs.enable == true)
Logs.i("text...", Array<String>) - send array info log (if Logs.enable == true)
Logs.e("text...") - send err log (if Logs.enable == true)
Logs.showAlways("text...") - send info log
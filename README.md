# logs

<h1>logs - helper for send logs in Logcat</h1><br>
<br>
How to use?<br>
1 - Add dependence in <b>build.gradle</b><br>
<i>implementation 'ru.gc986:logs:0.0.2'</i><br>
<br>
2 - Set your TAG<br>
<i>Logs.TAG = "text..."</i><br>
<br>
3 - Called function and put text<br>
<i>Logs.i("some text...")</i><br>
<br>
4* - setup active<br>
<i>Logs.enable = true</i><br>
<br>
Fuctions:<br>
Logs.enable - on/off logs<br>
Logs.i("text...") - send info log (if Logs.enable == true)<br>
Logs.i("text...", Array<String>) - send array info log (if Logs.enable == true)<br>
Logs.e("text...") - send err log (if Logs.enable == true)<br>
Logs.showAlways("text...") - send info log<br>
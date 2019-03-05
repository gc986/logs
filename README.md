
<h1>logs - helper for send logs in Logcat</h1><br>
<br>
How to use?<br>
1 - Add dependence in <b>build.gradle</b><br>
<i><b>implementation 'ru.gc986:logs:0.0.2'</b></i><br>
<br>
2 - Set your TAG<br>
<i><b>Logs.TAG = "text..."</b></i><br>
<br>
3 - Called function and put text<br>
<i><b>Logs.i("some text...")</b></i><br>
<br>
4* - setup active<br>
<i><b>Logs.enable = true</b></i><br>
<br>
<u>Fuctions and properties:</u><br>
<i><b>Logs.enable<i><b> - on/off logs<br>
<i><b>Logs.i("text...")</b></i> - send info log <i>(if Logs.enable == true)</i><br>
<i><b>Logs.i("text...", Array<String>)</i></b> - send array info log <i>(if Logs.enable == true)</i><br>
<i><b>Logs.e("text...")</i></b> - send err log <i>(if Logs.enable == true)</i><br>
<i><b>Logs.showAlways("text...")</i></b> - send info log<br>
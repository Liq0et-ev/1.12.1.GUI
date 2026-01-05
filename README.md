# 1.12.1.GUI
# Spēle “Uzmini skaitli” 

Šī programma realizē spēli “Uzmini skaitli” . Lietotāja saskarnē ir teksta lauks (textField), poga “New Game”, poga “OK” un paziņojumu lauks (label), kur tiek attēlota spēles gaita.<br>
<br>
Nospiežot “New Game”, tiek inicializēta jauna spēle: tiek notīrīts textField, label parāda ziņu “you have 3 attempts to guess a number”, un ar `Random` tiek ģenerēts nejaušs skaitlis `number` diapazonā no 1 līdz 10.<br>
Nospiežot “OK”, programma nolasa un pārbauda ievadi: ja ievadīts teksts vai skaitlis nav intervālā 1..10, label izvada “error”.<br>
<br>
Ja ievadītais skaitlis sakrīt ar `number`, label izvada “You win!”.<br>
Ja skaitlis nesakrīt un mēģinājumu skaits jau pārsniedz 3, label izvada “You lose!”. Pretējā gadījumā (mēģinājumi vēl ir), programma dod norādi: ja ievade ir mazāka par `number`, izvada “my number is greater than yours”, ja lielāka — “my number is less than yours”, un palielina mēģinājumu skaitu par 1.<br>

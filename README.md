# Code-Diplomarbeit
Hier liegt der Code für die Diplomarbeit mit dem Titel: Prototypische Entwicklung eines Softwarearchitekturansatzes zur Funktionserweiterung einer SAP Cloud-Lösung

# Verwendetes Setup:

### Java-Prototyp:
> **Java SE Development Kit 17.0.4.1 (64 bit)**: Kann über https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html heruntergeladen werden. Folgend muss noch eine neue Umgebungsvariable angelegt werden.
> 
> - Neue Umgebungsvariable anlegen: 
>
>    Name: JAVA_HOME <br>
>    Wert: "Pfad zum installierten JDK"
>
> - Variable zu "Path" hinzufügen

> **Maven 3.9.5**: Befindet sich im Ordner "Setup Tools" und muss als Umgebungsvarible hinzugefügt werden.
>
> - Ordner als neue Umgebungsvariable anlegen
>
>   Name: MAVEN_HOME <br>
>   Wert: "Pfad zum Verzeichnis"
> 
>
> - Variable zu "Path" hinzufügen

### CAP-Prototyp: <br>
(https://cap.cloud.sap/docs/get-started/jumpstart)

> **Node.js 18.20.4(LTS):** Hierfür wurde Chocolatey benutzt.
>
> Alternative:
>
> **Node.js 18.20.4(LTS):** https://nodejs.org/en/download/prebuilt-installer

> **CAP cds-dk:** <br>
> 
> Im Terminal: `npm add -g @sap/cds-dk`

> **SQLite:** 
>
> Installationsguide: https://www.tutorialspoint.com/sqlite/sqlite_installation.htm
> - Ordner sqlite aus den "Setup Tools" in C:\ verschieben
> - Pfad zur Umgebungsvaribale "Path" hinzufügen
>
> **REST Client Extension für VSC:** https://marketplace.visualstudio.com/items?itemName=humao.rest-client

# Testen der Prototypen:

Für das Testen der Prototypen und deren Endpunkte gibt es jeweils 2 Möglichkeiten. Zum einen eine Swagger-UI und ein test.http-File im Projektverzeichnis.
Um das test.http-File zu verwenden, muss die REST-Client Extension installiert sein.

## Java-Prototyp:

### Nutzen des test.http-Files:

Um die Anfragen an die Endpunkte zu stellen, muss lediglich auf den Send Request über dem Bezeichner für die Methode und der URL geklickt werden. Die Antwort wird durch die Extension
automatisch in einem neuen Fenster angezeigt.

> ![](/graphics/test_http_file_Java.PNG)

Bei CAP sind bei Start der Anwendung schon 4 Datensätze hinterlegt, diese lassen sich bei dem Java-Prototyp
schnell über die 4 Requests am Anfang des test.http-Files anlegen.

### Nutzen der Swagger-UI:


URL zum öffnen der Swagger-UI im Browser:

> http://localhost:8080/swagger-ui/index.html

Für das Nutzen der Swagger-UI können die einzelnen Endpunkte einfach getestet werden.

![](/graphics/Swagger_Überblick_Java.PNG)

Über die Pfeile an der rechten Seite lassen sich die einzelnen Endpunkte genauer betrachten. Folgend kann dann auf "Try it out" geklickt werden, um
den Endpunkt zu testen. Hierfür müssen dann nur noch die Parameter eingegeben werden.

![](/graphics/Swagger_Beispiel_Create.PNG)


## CAP-Prototyp:

### Nutzen des test.http-Files:

Um die Anfragen an die Endpunkte zu stellen, muss lediglich auf den Send Request über dem Bezeichner für die Methode und der URL geklickt werden. Die Antwort wird durch die Extension
automatisch in einem neuen Fenster angezeigt.

> ![](/graphics/test_http_file_cap.PNG)

### Nutzen der Swagger UI:

URL zum Öffnen der Swagger-UI im Browser:

> http://localhost:4004/docs/index.html

Für das Nutzen der Swagger-UI können die einzelnen Endpunkte einfach getestet werden. Allerdings muss hier dafür zwischen den definitons gewechselt werden, diese Auswahl
befindet sich oben rechts.

![](/graphics/Swagger_wechsel_definitions.PNG)

Damit können dann die einzelnen Use Cases auch hier wie oben im Java-Abschnitt getestet werden.

![](/graphics/Swagger_Beispiel_Create_CAP.PNG)

Zur Übersicht nochmal die Endpunkte für die Functions und Actions:

**/createSfcData**

**/changeSfcData**

**/readAllSfcData**

/readSfcData  | Edit: Diese Function wird bei der Generierung der Swagger-Doku durch CAP nicht richtig abgebildet und funktioniert nicht mehr richtig. Allerdings lässt sich die
Function im test.http-File immer noch ohne Probleme ausführen und bietet die gewünschte Funktionalität, daher liegt es nicht an dem eigentlichen Code. Bis zur Abgabe dieser Arbeit
wurde kein Fix dafür gefunden, wenn dieses Problem gelöst wurde, kommt ein weiterer Vermerk. Ein Anhaltspunkt ist, dass die Function durch Swagger falsch aufgerufen wird.
# 08 - 12 May 2023

## Programmazione Java
- In tutti i linguaggi esistono le variabili e le costanti
Posso dichiarare una variabile specificando il tipo ed impostandone il nome
```
int a;
```

Posso anche assegnare loro un valore
```
int a = 1;
```

- Esistono diverse tipologie di dati in Java. Alcune sono uguali anche nella dichiarazione ad altri linguaggi orientati agli oggetti.
```
int myNum = 5;
Double myDoubleNum = 2,37;
float = myFloatNum = 5.24;
char myLetter = 'D';
boolean myBool = true;
String myString = "Hello World!";
```

- In Java il nome della classe principale del software deve avere lo stesso nome del file .java
```
public class test { 
       
}
```

- Un software in java ha due parti fisse, la classe ed il metodo principale che si chiama sempre main
```
public class software {
    public static void main(String[] args) {

    }
}
```

- I software Java devono essere compilati prima di essere eseguiti. I passaggi sono quindi:
```
javac nomeFile.java
java nomeFile
```

- Posso usare le literal expression, per ora mi sembra di capire solo così:
```
System.out.print("Stringa di codice %s".formatted(variabile));
```
Posso trovare l'elenco di come sostituire le variabili nel testo su (https://www.javatpoint.com/java-string-format).

- Per consentire all'utente di inserire dei dati posso utilizzare la classe Scanner.

Il comando next(), e derivati, serve per leggere e gestire l'input inserito dall'utente. Questa classe ha bisogno però di sapere quale tipo di data verrà inserito.
```
next();
nextLine();
nextString();
nextDouble();
```

- Per l'amor di Arceus, chiudere sempre i cicli While, quantomeno con un:
```
break;
```

Utile mettere la condizione di chiusura di un ciclo While con un If che contiene un break, come di seguito:
```
while (true) {
    if(condition = something)
    break;
}
```

## Utilizzo di GitHub
Di segito i passaggi per la creazione e sincronizzazione di una repository su GitHub:

- Prima di utilizzare la sincronizzazione in locale ho dovuto installare [Git](https://git-scm.com/) e [GitHub](https://desktop.github.com/) in locale.

- Creazione del repository

- Generazione del token di autorizzazione per connettere la mia macchina con il server di GitHub
> Settings > Developer settings > Personal access tokens

- Inserimento delle proprie credenziali di accesso a GitHub su VS Code tramite:
```
git config --global user.email "nome@email.com"
git config --global user.name nome
```

Per controllare quali sono inserite su VS Code posso richiamarle tramite:
```
git config --global user.email
git config --global user.name
```

- Per effettuare l'autenticazione della macchina con i server di GitHub uso il comando:
```
gh auth login
```
...poi rispondo a ciò mi chiede in terminale

Posso inoltre fare il logout eliminandole da Windows tramite
> Pannello di controllo > Accoun utente > Gestione credenziali > Credenziali Windows

...oppure direttamente da terminale tramite:
```
git config --global --unset user.name
git config --global --unset user.email
```

- Per permettere la sincronizzazione è necessario creare in locale una cartella in cui inserire i file, possibilmente con lo stesso nome di quella remota. Poi va inizializzata alla sincronizzazione con:
```
git init
```

- La procedura successiva è guidata da GitHub sulla pagina di creazione della nuova repository. Da notare l'obbligo di specificare il nome della branch principale come __main__:
```
git branch -M main
```

- Importante è agguingere l'origine remota, ovvero dove si trova la cartella remota
```
git remote add origin https://github.com/nomeutente/nomerepository.git/
```

Di seguito appunti vari sui comandi Git:

- Le tre parole magiche per caricare un file su GitHub sono:
```
git add
git commit
git push
```

- I file marcati con una lettera U sono da sincronizzare con la repository remota

- I file  marcati con una lettera M sono stati modificati e sono da sincronizzare con la repository remota

- Posso controllare lo stato dell'avanzamento dell'aggiornamento dei file tramite i comandi:
```
git status
git log
```

## Utilizzo del terminale
- Accesso alla cartella
```
cd nomeCartella
```

- Accesso alla cartella del livello superiore
```
cd..
```

- Elenco contenuto della cartella
```
ls oppure dir
```

- Creazione della cartella
```
mkdir nomeCartella
```

- Eliminazione della cartella
```
rm nomeCartella
```

- Creazione di nuovo file
```
touch nomeFile.ext
```
...tuttavia non funziona da terminale Windows. Usare quindi la shell unix GitBash (teoricamente dovrebbe funzionare il comando __code__, ma mi odia).

## Area di lavoro
- Gli IDE da soli non sanno gestire i linguaggi di programmazione. Per cui ho dovuto installare l'ambiente di sviluppo Java, tramite il JDK che trovo sul sito di [Oracle](https://www.oracle.com/it/java/technologies/downloads/).

- Posso usare il comando
```
java -version
```
per sapere che versione di Java il terminale sta utilizzando al momento.

## Varie
- Utilizzo del linguaggio di markup "Markdown", i cui file hanno estensione .md
- Su [JetBrains](https://www.jetbrains.com/lp/devecosystem-2022/) posso trovare lo stato dell'apprezzamento, dell'utilizzo e delle previsioni di utilizzo dei vari linguaggi di programmazione aggiornato al 2022
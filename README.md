### README for Giant Leap prosjekt

#### Hvordan kjøre prosjektet
Prosjektet kan kjøres fra en IDE ved å kjøre main i
RestServiceApplication.java, og gå til
http://localhost:8080/takst

sone, dag, antal minutter og klokkeslettet bilen parkerte kan spesifiseres
med sone, uke, min og klokke, for eksempel slik: http://localhost:8080/takst?sone=m3&uke=mandag&min=130&klokke=1559


#### Oppgavene
Oppgave 1, 2 og 4 ligger i Oppgaver.java
Oppgave 3 er RestServiceApplication 
Oppgave 5 ligger i Oppgave5.txt

#### Litt refleksjoner
Jeg syns oppgaven var veldig morsom og utfordrende. Jeg merket spesielt i oppgave 4
at det var mye rom for større løsninger. Jeg vurderte for eksempel å hente dato og tid fra maskinen,
men tenkte at dersom noen skulle ønske å bruke API-en til å se hva prisen for parkering på en gitt dag
er det bedre å ta inn tiden som en parameter. Jeg vurderte også å ta høyde for tilfellet der
noen parkerer på tvers av flere dager, men valgte i første omgang å regne med at en parkering kun gjelder
for én dag.

# java_beadando-K5BPCA-
Komponensalapú webalkalmazás készítés - Java nyelven: Beadandó munka (Németh Máté, K5BPCA)

A postgre a Room-nál valamiért nem generál megfelelően Id-ket, se int-el, se Integer wrapperrel. A módosítás, törlés működik.
(Integernél null-on hagyja az Id-t, int-nél meg megragad 0-nál.)

A Course-nál nem használtam wrappert, mert ott is valami baja volt a null-os id-vel. (Ezért csináltam 10+-os idkkel a for ciklust is)
De ott minden működik. 

Sajnos idő híján a többi feladattal nem volt időm küzdeni.

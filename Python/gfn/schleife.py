# Schreibe den Programmcode so um, dass die Zahlenliste in umgekehrter
# Reihenfolge verarbeitet wird

zahlenListe = [15, 67, 2, 45, 22]
print("Zahlenliste: ", zahlenListe)
position = (len(zahlenListe)-1)
while True:
    if position == 0:
        print("breche Schleife ab")
        break
    else:
        element = zahlenListe[position - 1]
        position = position - 1
        if element % 2 == 0:
            continue
        print("Wert: ", element)

print("ich bin eine Anweisung nach der Schleife")



for i in reversed(zahlenListe):

    if i % 2 == 0:
        continue

    print("Wert: ", i)

departement = ["Doubs", "Territoire de Belfort", "Jura"]
city = ["Besançon", "Belfort", "Dole"]
number = [25, 90, 39]
for i in (range(len(departement))):
    print (departement[i], city[i], number[i])

dice=dict(zip(departement,city))
y=zip(dice.items(),number)
print (list(y))

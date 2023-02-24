from geopy.geocoders import Nominatim
import ssl
import certifi
import geopy.geocoders
class ShoppingCart:
    items = []

    def addItem(self, artikel):
        """fügt einen Artikel zum Einkauswagen hinzu"""
        self.items.append(artikel)

    def sortieren(self):
        for i in sorted(self.items):
           print (i)




    # Aufgabe:
    # schreibe eine Methode, die die Artikel im Einkaufswagen in alphabetisch
    # sortierter Abfolge nacheinander ausgibt


kleinerEinkaufswagen = ShoppingCart()
kleinerEinkaufswagen.addItem("Kaffee")
kleinerEinkaufswagen.addItem("Käse")
kleinerEinkaufswagen.addItem("Spaghetti")
kleinerEinkaufswagen.addItem("Apfel")
kleinerEinkaufswagen.addItem("Aubergine")
print (ShoppingCart.items)



print (kleinerEinkaufswagen.sortieren())


geolocator = Nominatim(user_agent="myGeocoder")


location = geolocator.reverse("52.509669, 13.376294")

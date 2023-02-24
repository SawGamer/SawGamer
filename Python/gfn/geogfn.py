#!/Library/Frameworks/Python.framework/Versions/3.9/bin/python3
import re
from geopy.geocoders import Nominatim

geolocator = Nominatim(user_agent="myGeocoder")

KatzeBO=['-34.0442621, 18.35802276217555', '-34.0448962, 18.360283550000005', '-34.04555785, 18.358371566764475', '-34.047159, 18.36175221525095']

print("           ---------------- Die Orte ,die die Katze laut GPS-Sensor besucht hat ----------------")
KatzeBOA=[geolocator.reverse(i).address for i in KatzeBO]
[print (i+1,": " ,KatzeBOA[i],"\n") for i in range(len(KatzeBOA))]

unklaretext=["30. August 2021  : -------- (-33.2125451, 18.0933123)","31. August 2021  : Jacobsbaai, Saldanha (-32.966667, 17.890278)","1. September 2021: Chapman's Peak Beach Hotel, Hout Bay (l,l)"]

match = [m for i in unklaretext for m in re.findall(r'\((.*?)\)', i)]

print ("           ---------------- der Autor am 30. August 2021 war am ----------------")

print (geolocator.reverse(match[0]).address,"\n")

Henning=[]
for i in range(len(match)):
    try:
        Henning.append(geolocator.reverse(match[i]).address)
    except:
        Henning.append(str(geolocator.geocode(re.findall(r': (.*?) \(', unklaretext[i]))))

print ("-"*100)
print ("-"*50,"\nHenning Mankell und die Katze aus a) sind sich begegnet in :","\n"+"-"*50,"\n",set(Henning)&set(KatzeBOA),"\n")

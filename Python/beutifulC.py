import urllib.request,urllib.error,urllib.parse
from bs4 import BeautifulSoup
import ssl

def solution(url,counter,position):
    ctx=ssl.create_default_context()
    ctx.check_hostname=False
    ctx.verify_mode=ssl.CERT_NONE


    count=0
    html=urllib.request.urlopen(url,context=ctx).read()
    soup=BeautifulSoup(html,'html.parser')

    global l
    tags=soup('a')
    for i in tags:
        count+=1
        if count==position:
            l=i.get('href', None)
            name=i.contents[0]
            break
    counter-=1
    if (counter!=0):
        solution(l,counter,position)
    elif(counter==0):
        print(name)

url=input('Enter URL: ')  #http://py4e-data.dr-chuck.net/known_by_Wasif.html , http://py4e-data.dr-chuck.net/known_by_Fikret.html
counter=int(input('Enter Counter: ')) #4,7
position=int(input('Enter Position: '))#3,18


solution(url,counter,position)

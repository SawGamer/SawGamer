import urllib.request,urllib.error,urllib.parse
from bs4 import BeautifulSoup
fhand = urllib.request.urlopen('http://www.dr-chuck.com/page1.htm').read()
# counts=dict()
# for line in fhand:
#     words = line.decode().split()
#     for word in words:
#         counts[word]=counts.get(word,0)+1
# print(counts)
#url=input('Enter -')
soup = BeautifulSoup(fhand,'html.parser')

tags=soup('a')
for tag in tags:
    print(tag.get('href',0))
print(tag)
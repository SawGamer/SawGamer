import re
import urllibC.request


file= (urllibC.request.urlopen('http://py4e-data.dr-chuck.net/regex_sum_1734638.txt')).read().decode('utf-8')
file.rstrip()
file = file.split()
L=list()
for line in file:
    s=re.findall('[0-9]+', line)
    if (s):
        L.append(s)
q=0
'''for w in L:
    for z in w:
        try:
            z=int(z)
            q+=z
        except:
            continue'''
print (sum(int(num) for num in re.findall('[0-9]+', open('regEx.txt').read())))

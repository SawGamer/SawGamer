# Learning Regular Expression here

import re

palm= open("mbox-short.txt")
'''for l in palm:
    l=l.rstrip()
    if re.search('^From:*', l):
        print (l)
        y = re.findall('[0-9]+', l)
        print(y)'''
datelist = list()

for x in palm:
    x=x.rstrip()
    g= re.findall('\b*;.*(\s .*)',x)
    if len(g) !=1: continue
    date=(g[0])
    datelist.append(date)
for o in datelist:
    print (o)

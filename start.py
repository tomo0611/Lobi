# -*- coding: utf-8 -*-
import json
import sys
import datetime
from LobiAPI import LobiAPI
from pprint import pprint #Debugの為
import time,codecs,sys

def sendConsole(message,level="情報"):#コンソールに出力
  print(datetime.datetime.today().strftime('%H:%M:%S')+" "+level+">> "+str(message))

client = LobiAPI()
if client.tokenlogin("YOUR_TOKEN_HERE"):
    print "Login成功"
    print ''
    client.printloginresult()
else:
    print "Login失敗"

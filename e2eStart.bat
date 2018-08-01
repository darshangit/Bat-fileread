@echo off
cd "D:\dev\script2\"
rd /s /q "Angular-Elements"
git clone https://xxxx:XXXX@github.com/xxxx/Angular-Elements.git
cd ".\Angular-Elements\"
npm install
ng e2e --port 4445
:end
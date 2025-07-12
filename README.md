requires/export approach

`
java -p "main.api.jar;main.labor.market.jar;main.enterprise.jar;main.university.jar" -m main.enterprise/main.enterprise.Main****
`

with uses/provide we can not include some modules because of ServiceLoader

`
java -p "main.api.jar;main.labor.market.jar;main.enterprise.jar;" -m main.enterprise/main.enterprise.Main****
`


todo: open modules with reflective access
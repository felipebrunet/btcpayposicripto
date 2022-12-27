# Icripto POS
Esta es una aplicacion para poder usar un terminal de pago en dispositivos android, ya sean telefonos celulares, terminales tipo impresora de boleta android, tablets, etc. 
Se configura al indicarle la direccion URL de una instancia de servidor BTCPAY Server que posea una tienda habilitada. 
En otras palabras, la aplicacion implementa un terminal de pago bitcoin, que puede estar conectado a cualquier infraestructura.

El caso ideal es que un locatario que quiera aceptar bitcoin lo que debe hacer es iniciar un nodo de bitcoin usando alguno de los sistemas plug and play, con Umbrel, Raspiblitz, Mynode, etc. 
Luego carga algo de bitcoin en la wallet asociada al nodo, y abre 1 o 2 canales de lightning con algun nodo de preferencia.
Luego instala uno de los managers de nodo lightning como LND, o Core Lightning.
Luego instala el programa BTCPAY server (usualmente ofrecido por los sistemas umbrel, mynode, etc) y dentro de este, crea y habilita una tienda (store). 
Luego descarga e instala la app Icripto POS en algun dispositivo de su preferencia, y luego configura el dispositivo indicandole la direccion URL de la tienda asociada.
La direccion URL de la tienda puede ser tanto clearnet (tipica) como una direccion TOR. Ambas funcionan, la diferencia radica en el tipo de browser que se abrira al dar la instruccion de pagar.

Al tener ya conectada la aplicacion a la instancia deseada, el terminal de pago ya puede funcionar. 
Este terminal lo que hace es definir los parametros (ingresados por el operador) para realizar el cobro en una ventana nueva de Google Chrome o del navegador deseado.. 
Esta ventana muestra las opciones de pago que ofrece BTCPAY:
- Bitcoin onchain (sobre un cierto monto que el locatario puede configurar)
- Bitcoin Lightning invoice
- Bitcoin Lightning bolt card NFC (no disponible con servidores BTCPAY en TOR)
- Bitcoin Lightning LNURL withdraw NFC (no disponible con servidores BTCPAY en TOR)
- Altcoins via 3rd party Fixed Float.

De esta forma el locatario ya puede operar su terminal de pago directamente con su propio nodo de bitcoin, sin la necesidad de pagarle a operadores de tarjetas de credito, operadores de terminales de pago, bancos, etc.


El proyecto es 100% abierto. Cualquiera lo puede clonar, mejorar, hacer PRs, instalar en su dispositivo, subir a play store, criticar, basurear, etc. 

Gracias a todos los que han hecho posible que esta aplicacion funcione: 
- Muchos youtubers que muestran como hacer apps en android studio con Kotlin.
- Desarrolladores de BTCPAY Server.
- Desarrolladores de LNBITS.
- Desarrolladores de Umbrel.
- Desarrolladores de LND de Lightning Labs.
- Desarrolladores de Bitcoin.
Gracias totales!!!

Y obviamente 21 millones de gracias a Satoshi Nakamoto

felipebrunet


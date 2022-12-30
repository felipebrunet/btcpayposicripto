# Icripto POS (Readme in Español and English)

ESPAÑOL:
Esta es una aplicación para poder usar un terminal de pago en dispositivos android, ya sean teléfonos celulares Android, terminales tipo impresora de boleta Android, tablets, etc.
Se configura al indicarle la direccion URL de una instancia de servidor BTCPAY Server que posea una tienda habilitada.
En otras palabras, la aplicacion implementa un terminal de pago bitcoin, que puede estar conectado a cualquier infraestructura.

El caso ideal es que un locatario/a que quiera aceptar bitcoin lo que debe hacer es iniciar un nodo de bitcoin usando alguno de los sistemas plug and play, con Umbrel, Raspiblitz, Mynode, etc.
Luego carga algo de bitcoin en la wallet asociada al nodo, y abre 1 o 2 canales de lightning con algun nodo de preferencia.
Luego instala uno de los managers de nodo lightning como LND, o Core Lightning.
Luego instala el programa BTCPAY server (usualmente ofrecido por los sistemas umbrel, mynode, etc) y dentro de este, crea y habilita una tienda (store).
Luego descarga e instala la app Icripto POS en algún dispositivo de su preferencia, y luego configura el dispositivo indicandole la direccion URL de la tienda asociada.
La dirección URL de la tienda puede ser tanto clearnet (típica) como una dirección TOR. Ambas funcionan, la diferencia radica en el tipo de browser que se abrira al dar la instrucción de pagar.

Al tener ya conectada la aplicacion a la instancia deseada, el terminal de pago ya puede funcionar.

Este terminal lo que hace es definir los parametros (ingresados por el vendedor) para realizar el cobro en una ventana nueva de Google Chrome o del navegador deseado..
Esta ventana muestra las opciones de pago que ofrece BTCPAY:
- Bitcoin onchain (sobre un cierto monto que el locatario puede configurar)
- Bitcoin Lightning invoice
- Bitcoin Lightning bolt card NFC (no disponible con servidores BTCPAY en Tor)
- Bitcoin Lightning LNURL withdraw NFC (no disponible con servidores BTCPAY en Tor)
- Altcoins via 3rd party Fixed Float.

De esta forma el locatario ya puede operar su terminal de pago directamente con su propio nodo de bitcoin, sin la necesidad de pagarle a operadores de tarjetas de crédito, operadores de terminales de pago, bancos, etc.

El proyecto es 100% abierto. Cualquiera lo puede clonar, mejorar, hacer PRs, instalar en su dispositivo, criticar, etc.

Gracias a todos los que han hecho posible que esta aplicación funcione:
- Muchos youtubers que muestran cómo hacer apps en Android Studio con Kotlin.
- Muchas preguntas ya contestadas en StackOverflow.
- Desarrolladores de BTCPAY Server.
- Desarrolladores de LNBITS.
- Desarrolladores de Umbrel.
- Desarrolladores de LND de Lightning Labs.
- Desarrolladores de Bitcoin Core.
- Satoshi Nakamoto

felipebrunet



ENGLISH: 
Point of Sale App for BTCPay server stores. 
Any merchant running his/her own bitcoin node can start up a BTCPay server (via clearnet or Tor) and use this app to start receiving payments on any android device.
This removes any third party. Merchants can now accept:
- Bitcoin onchain (above certain value, can be configured)
- Bitcoin Lightning invoice
- Bitcoin Lightning bolt card NFC (not available when using a Tor URL for the BTCPay server)
- Bitcoin Lightning LNURL withdraw NFC (not available when using a Tor URL for the BTCPay server)
- Altcoins via 3rd party FixedFloat embedded in BTCPay interface.

Bottom line, this app only simplifies the set up of the parameters for the BTCPay button. The payment screen is then opened in the browser of choice.

The app is 100% free and open source. You can clone it, fork it, generate your own version of it, PR it, thrash it, etc. 
Thank you for everyone that made this possible:
- Countless android/kotlin youtubers.
- Countless StackOverflow android/kotlin questions already answered.
- BTCPay Server team.
- LNBits team.
- Lightning Labs LND developers.
- Umbrel developers.
- Bitcoin Core developers.
- Satoshi Nakamoto

felipebrunet


# Icripto POS (Readme in Español and English)

Play Store URL:
https://play.google.com/store/apps/details?id=com.felipebrunet.btcpayposicripto


ENGLISH: 
Point of Sale App for BTCPay server stores. 
Any merchant running his/her own bitcoin node (with Umbrel, Raspiblitz, MyNode, etc) with some lightning channels can start up a BTCPay server (URL can be clearnet or even Onion address) and use this app to start receiving payments on any android device.
This removes any third party in the process. Self custody is preserved.
Merchants can now accept payments of:
- Bitcoin onchain. (above certain value, can be configured)
- Bitcoin Lightning.
- Bitcoin Lightning bolt card NFC. (Only for clearnet servers)
- Bitcoin Lightning LNURL withdraw NFC. (Only for clearnet servers)
- Stablecoins and other altcoins via 3rd party FixedFloat embedded in BTCPay interface. (Only for clearnet servers).
Merchant will only receive bitcoin in every scenario.

Bottom line, this app only simplifies the set up of the parameters for the BTCPay button. The payment screen is then opened in the predetermined internet browser app (Chrome, Tor Browser, etc).

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

felipebrunet (LNAddress for tips: ⚡tips@btcpay.icripto.cl)


ESPAÑOL:
Esta es una aplicación para poder usar un terminal de pago en dispositivos android, ya sean teléfonos celulares Android, terminales tipo impresora de boleta Android, tablets, etc.
Se configura al indicarle la direccion URL de una instancia de servidor BTCPAY Server que posea una tienda habilitada. 
La URL puede ser tradicional o inclusive una dirección en Tor (Onion address).
En otras palabras, la aplicación implementa un terminal de pago bitcoin, que puede estar conectado a cualquier infraestructura.

El caso ideal es que un locatario/a que quiera aceptar bitcoin lo que debe hacer es iniciar un nodo de bitcoin con Umbrel, Raspiblitz, MyNode, etc.
Luego instala uno de los managers de nodo lightning como LND, o Core Lightning.
Luego carga algo de bitcoin en la wallet asociada al nodo, y abre 1 o 2 canales de lightning con algún nodo de preferencia.
Luego instala el programa BTCPAY server y dentro de este, crea y habilita una tienda (store).
Luego descarga e instala la app Icripto POS en algún dispositivo de su preferencia, y luego configura el dispositivo indicándole la direccion URL de la tienda asociada.
La dirección URL de la tienda puede ser tanto clearnet (típica) como una dirección Tor. Ambas funcionan, la diferencia radica en el tipo de browser que se abrirá al dar la instrucción de pagar.

Al tener ya conectada la aplicación a la instancia deseada, el terminal de pago ya puede funcionar.

Este terminal es una simple interfaz que facilita el ingreso de los parámetros (monto, moneda) para realizar el cobro en una ventana nueva de Google Chrome o del navegador deseado.
Esta ventana muestra las opciones de pago que ofrece BTCPAY:
- Bitcoin onchain. (sobre un cierto monto que el locatario puede configurar)
- Bitcoin Lightning invoice.
- Bitcoin Lightning bolt card NFC. (no disponible con servidores BTCPAY en Tor)
- Bitcoin Lightning LNURL withdraw NFC. (no disponible con servidores BTCPAY en Tor)
- Alt-coins via 3rd party FixedFloat. (no disponible con servidores BTCPAY en Tor).

De esta forma el locatario ya puede operar su terminal de pago directamente con su propio nodo de bitcoin, sin la necesidad de depender de terceras partes.
Así, todos los bitcoin quedan en poder de su dueño. Además, es gratis.
La aplicación es 100% abierta y gratuita. Cualquier persona lo puede clonar, mejorar, hacer PRs, instalar en su dispositivo, criticar, etc.

Gracias a todos los que han hecho posible que esta aplicación funcione:
- Muchos youtubers que muestran cómo hacer apps en Android Studio con Kotlin.
- Muchas preguntas ya contestant en StackOverflow.
- Desarrolladores de BTCPAY Server.
- Desarrolladores de LNBits.
- Desarrolladores de Umbrel.
- Desarrolladores de LND de Lightning Labs.
- Desarrolladores de Bitcoin Core.
- Satoshi Nakamoto

felipebrunet (LNAddress: ⚡tips@btcpay.icripto.cl)


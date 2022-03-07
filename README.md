Enunciado
Se nos pide desarrollar un sistema para el “Bingo Almagro”, del cual sabemos que cuenta con un
bolillero y con un listado de participantes. Por cuestiones de espacio y del juego, la participación a
cada una de las rondas, está limitada a un mínimo de 5 jugadores y un máximo de 100.
A su vez, sabemos que el bolillero tiene una serie de números, los cuales van de 1 a 90 (siendo 90,
el número mayor).
Cada participante, para poder jugar, cuenta con un id (número correlativo que lo identifica) y un único
cartón, que cuenta internamente con 15 números generados al azar.
A la hora de simular una ronda, cada participante sabe en principio, que le faltan marcar la totalidad
de los números de su cartón, y a medida que los números van saliendo del bolillero del bingo, en
caso de cuente con los mismos, cada participante modifica los números restantes que tiene, antes de
cantar Bingo.

Tener en consideración que en este diagrama, solo se visualizan los métodos públicos.
A continuación, se define el detalle de los métodos más importantes a desarrollar:

● sacarNumero: si hay números en el bolillero, toma uno al azar y lo retorna como resultado.
Tener en cuenta que los números no pueden ser sacados dos veces del bolillero.

● getNumerosEmitidos: retorna la cantidad de números que salieron del bolillero.

● buscarNumero: verifica si el cartón tiene el número que salió del bolillero. Retorna un
booleano indicando si el cartón está lleno (o sea, si el participante logró el bingo).

● simularRonda: este método recibe la cantidad de participantes para simular una ronda y
debe:

1. Inicializar los elementos del juego (participantes y bolillero).

2. Generar el listado de participantes con la cantidad recibida como parámetro (validarla
para que esté en el rango permitido), cada uno con su cartón. Los cartones tienen 15
números generados aleatoriamente, entre los 90 números que están en el bolillero.

3. Simular toda la ronda del bingo. Para esto, se van sacando números del bolillero y se
va verificando para cada jugador su cartón. La simulación debe seguir hasta que
algún participante tenga bingo, o bien hayan salido todos los números del bolillero.

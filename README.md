# N1EXERCICI2

He inicialitzat dins el constructor nomes l'atribut power ja que es l'únic
que no es static i, per tant, depèn de crear una instància de la classe.

Tant l'atribut model com l'atribut brand son atributs statics, per tant son atributs de classe
i no depenen de una instancia de la classe, i en el cas del brand es també una constant que no es pot modificar.

### Resumint:
  -Tenim un atribut power que passem al constructor per definir la poténcia de cada instància, que no es podrà modificar 
   després de crear-se la instància ja que es final.
   
  -Tenim l'atribut model, que es un atribut static ( per tant afecta totes les instàncies de la classe), per tant es atribut de clase, no depen de les instàncies
   i és comú per totes elles. Ara bé, es pot modificar amb un un setter i qualsevol canvi afecta a totes les instàncies.
  
  -Per últim tenim l'atribut brand que es static ( per tant afecta totes les instàncies de la classe) i també final, per lo que  no es pot modificar mai.



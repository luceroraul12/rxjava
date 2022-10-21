# rxjava

Tiene la finalidad de hacer pruebas con extensiones reactivas en java.<br>
La primer prueba que estoy haciendo es relacionado a una clase abstracta Zapateria, tiene 4 clases heredadas (Banio, Deporte, Elegancia, Escolar).
Mi idea es poder realizar llamados a todas las clases por medio de un unico metodo que se encuentra en la clase Comunicador.
Esto me va a servir para entender cual es la diferencia de syntax respecto a rxjs como tambien como poder mandar informacion desde varios lugares(clases) por medio de un unico Subject.
Este objetivo me surge por la necesidad de no tener que estar generando una clase auxiliar donde tenga que ir metiendo cada llamado de cada clase que herede de Zapateri.
De esa forma, toda clase que herede de Zapateria siempre va a usar su subject (usando un observable) y en cuando se emita un valor devolvera el contenido del atributo marcas (un ejemplo de atributo en lista).

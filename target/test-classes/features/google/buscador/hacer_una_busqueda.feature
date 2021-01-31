#language:es
#Author: sgcoronado12@gmail.com
@Buscador
Característica: Realización de búsquedas

  @Exitoso
  Escenario: Búsqueda exitosa
    Cómo usuario de internet, 
    quiero buscar una palabra 
    para verificar que traiga resultados diferentes de cero
    
    Dado que he ingresado al portal google
    Cuando ingreso la palabra "Simetrik" al buscador
    Entonces verifico que la cantidad de resultados de la búsqueda sea diferente de cero


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backtracking;

/**
 * Interfície per resoldre la variant de la motxilla del projecte. Donat un 
 * conjunt d'elements, cadascun tendrà 2 pesos i un profit. La variant del 
 * nostre problema de la Motxilla ha de determinar quins elements 
 * ha d'incloure una col·lecció de forma que cada pes sigui inferior o 
 * igual a un límit determinat i el profit sigui el més gran possible.
 * @author antoni
 */
public interface Motxilla {
    /**
     * Resol la variant de la motxilla de l'enunciat de forma recursiva
     * @pre (W1 >= 0&&W2 >= 0&&a!=null&&(∀i a.length>i>=0 )->(a[i].element!=null&&a[i].w1>=0&&a[i].w2>=0&&a[i].profit>=0))
     * @post La postcondicion es que el resultat donat pel subprograma ha de tornar un array no nul que contindra la combinacio d'elements
     * maxims que no superen cap dels dos pesos maxims i la qual  el  seu profit  conjunt
     * sigui el  maxim dins les combinacions possibles d'elments que no superin els pesos maxims.
     * 
     * *<br> <br>Cas base:  El cas base és dona quan ja no queden possibles combinacions que no superin algun dels pesos de la 
     * motxilla en aquest cas s'acaba la recursio es retorna la solució possibles amb mayor profit.<br><br>
     * Cas General:  En el cas general miram si el element actual se ha d'incluir o no ,aixo es mira comprovant si al incluir 
     * el objecte algun dels dos pesos supera la capacitat maxima de la motxilla per el pes en especific.Tambe miram si el profit de la 
     * combinació actual es millor a l'anterior si es aixi copiam la solució temporal sobre l'array que usarem per retornar de solució.En el cas de que  algun dels pesos actuals
     * ya sigui igual al seu pes maxim aixo vol dir que ya no es poden incloure mes per tant retrocedirem en el array de elements <br>
     * 
     * 
     * 
     * @ord El algoritme es de complexitat  O(2**n) aixo es deu a que per cada element del array tenim dos possibles camins 
     * ,agafar o no agafar el element per lo tant en el pitjor dels casos tendrem 2**n combinacions.Si ho miram per 
     * el teorema de la substració arribarem a la mateixa conclusió ja que a cada iteració en el pitjor dels casos feriem dos cridades 
     * recursives una amb l'element a 0 i una amb l'element a 1 per lo tant a=2 per lo tant ens troberem en el cas de a>1,despres podem 
     * veure que c=1 ya que anam avançant de un en un sobre el array de elements finalment com podem veure n es igual al nombre de elements a provar.
     * Per lo tant si substituim per la formula corresponent que en aquest cas es O(a**n/c) obtenim com ha resultat O(2**n).
     * on n es el numero de elements possibles.
     * 
     * @param a conjunt d'elements
     * @param W1 >= 0, límit per al weight1
     * @param W2 >= 0, límit per al weight2
     * @return conjunt de forma que cada pes sigui inferior o 
     * igual a un límit determinat i el profit sigui el més gran possible
     */
    public ElementMotxilla[] recursiu(ElementMotxilla  a[], double W1, double W2);
    
    /**
     * Resol la variant de la motxilla de l'enunciat de forma iterativa<br>
     * 
     * 
     * *<br> <br>Cas base:  El cas base és dona quan ja no queden possibles combinacions que no superin algun dels pesos de la 
     * motxilla en aquest cas s'acaba la recursio es retorna la solució possibles amb mayor profit.<br><br>
     * Cas General:  En el cas general miram si el element actual se ha d'incluir o no ,aixo es mira comprovant si al incluir 
     * el objecte algun dels dos pesos supera la capacitat maxima de la motxilla per el pes en especific.Tambe miram si el profit de la 
     * combinació actual es millor a l'anterior si es aixi copiam la solució temporal sobre l'array que usarem per retornar de solució.En el cas de que  algun dels pesos actuals
     * ya sigui igual al seu pes maxim aixo vol dir que ya no es poden incloure mes per tant retrocedirem en el array de elements <br>
     * 
     * 
     * @param a conjunt d'elements
     * @param W1 >= 0, límit per al weight1
     * @param W2 >= 0, límit per al weight2
     * @return conjunt de forma que cada pes sigui inferior o 
     * igual a un límit determinat i el profit sigui el més gran possible
     */
    public ElementMotxilla[] iteratiu(ElementMotxilla a[], double W1, double W2);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backtracking;

/**
 * Interfície per resoldre la variant de la motxilla del projecte. Donat un
 * conjunt d'elements, cadascun tendrà 2 pesos i un profit. La variant del
 * nostre problema de la Motxilla ha de determinar quins elements ha d'incloure
 * una col·lecció de forma que cada pes sigui inferior o igual a un límit
 * determinat i el profit sigui el més gran possible.
 *
 * @author antoni
 */
public interface Motxilla {

    /**
     * Resol la variant de la motxilla de l'enunciat de forma recursiva
     *
     * @pre (W1 &ge; 0&amp;&amp;W2 &ge; 0 &amp;&amp;; a&ne;null&amp;&amp;(∀i a.length&gt;i&ge;0
     * )-&gt;(a[i].element&ne;null&amp;&amp;;a[i].w1&ge;0&amp;&amp;;a[i].w2&ge;0&amp;&amp;;a[i].profit&ge;0))
     * @post La postcondicion és que el resultat donat pel subprograma ha de
     * tornar un array no nul que contindrà la combinació d'elements màxims que
     * no superen cap dels dos pesos màxims i la qual el seu profit conjunt
     * sigui el maxim dins les combinacions possibles d'elments que no superin
     * els pesos maxims.
     *
     * 
     *
     * <br>Cas base: El cas base és dona quan ja no queden possibles combinacions
     * que no superin algun dels pesos de la motxilla en aquest cas s'acaba la
     * recursió es retorna la solució possible amb major profit.<br>
     *
     *
     * <br>Cas General: En el cas general miram si l'element actual s'ha d'incloure
     * o no ,això es mira comprovant si al incloure l'objecte algun dels dos
     * pesos supera la capacitat màxima de la motxilla pel pes n'especific.També
     * miram si el profit de la combinació actual és millor a l'anterior si es
     *així copiam la solució temporal sobre l'array que usarem per retornar de
     * solució. En el cas que algun dels pesos actuals ja sigui igual al seu pes
     * màxim això vol dir que ja no es poden incloure més, per tant,
     * retrocedirem en l'array d'elements<br>
     *
     *
     *
     *
     * @ord El algoritme es de complexitat O(2**n) aixo es deu a que per cada
     * element del array tenim dos possibles camins , agafar o no agafar
     * l'element per tant en el pitjor dels casos tendrem 2**n combinacions. Si
     * ho miram per el teorema de la substració arribarem a la mateixa
     * conclusió, ja que a cada iteració en el pitjor dels casos feríem dues
     * cridades recursives una amb l'element a 0 i una amb l'element a 1 per
     * tant a=2 per tant ens trobarem en el cas de a&gt;1,després podem veure que
     * c=1 ja que anam avançant d'un en un sobre l'array d'elements finalment
     * com podem veure n és igual al nombre d'elements a provar. Per tant si
     * substituïm per la fórmula corresponent que en aquest cas és O(a**n/c)
     * obtenim com ha resultat O(2**n). on n se'l número d'elements possibles.
     *
     * @param a conjunt d'elements
     * @param W1 >= 0, límit per al weight1
     * @param W2 >= 0, límit per al weight2
     * @return conjunt de forma que cada pes sigui inferior o igual a un límit
     * determinat i el profit sigui el més gran possible
     */
    public ElementMotxilla[] recursiu(ElementMotxilla a[], double W1, double W2);

    /**
     * Resol la variant de la motxilla de l'enunciat de forma iterativa<br>
     *
     * @pre (W1 &ge; 0&amp;&amp;;W2 &ge; 0&amp;&amp;;a&ne;null&amp;&amp;;(∀i a.length&gt;i&ge;0
     * )-&gt;(a[i].element&ne;null&amp;&amp;;a[i].w1&ge;0&amp;&amp;;a[i].w2&ge;0&amp;&amp;;a[i].profit&ge;0))
     * @post La postcondicion es que el resultat donat pel subprograma ha de
     * tornar un array no nul que contindra la combinacio d'elements maxims que
     * no superen cap dels dos pesos maxims i la qual el seu profit conjunt
     * sigui el maxim dins les combinacions possibles d'elments que no superin
     * els pesos maxims.
     *
     * @ord El algoritme es de complexitat O(2**n) aixo es deu a que per cada
     * element del array tenim dos possibles camins , agafar o no agafar
     * l'element per tant en el pitjor dels casos tendrem 2**n combinacions. 
     *
     *
     * @param a conjunt d'elements
     * @param W1 >= 0, límit per al weight1
     * @param W2 >= 0, límit per al weight2
     * @return conjunt de forma que cada pes sigui inferior o igual a un límit
     * determinat i el profit sigui el més gran possible
     */
    public ElementMotxilla[] iteratiu(ElementMotxilla a[], double W1, double W2);
}

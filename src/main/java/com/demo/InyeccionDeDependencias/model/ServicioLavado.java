/*===============================================================================*/
/*============================SERVICIO DE LAVADO DE AUTOS========================*/
/*===============(Donde existen 2 tipos de servicios para lavado)================*/
/*===============================================================================*/



package com.demo.InyeccionDeDependencias.model;

public class ServicioLavado {

    /*Generamos la reclacion de los tipos de servicio -
    * Normal y Premium con El servicio de lavado*/

    /*Creamos los Objetos NO Instanciados Sino Declarados!
    * Ya que para una Inyeccion de dependencia no tienen
    * que estar Instanciados.*/
    private ServicioNormal serviNorm;
    private ServicioPremium serviPrem;

    /*Ahora con esas 2 declaraciones ya el servicio Normal
    * como el Premium Dependen de El ServicioLavado*/


    /*====================================================*/
    /*===EXISTEN 3 TIPOS DE INYECCIONES DE DEPENDENCIAS===
    * Mediante CONSTRUCTOR
    * Mediante Setters
    * Mediante @Autowired*/
    /*====================================================*/


//__1__
    /*===============Inyeccion mediante Constructor==============
      * ==========con los Atajos de Teclado Alt+Insert==========*/
    public ServicioLavado(ServicioNormal serviNorm, ServicioPremium serviPrem) {
        this.serviNorm = serviNorm;
        this.serviPrem = serviPrem;
    }
/*========================================================================================================*/


//__2__
    /*===============Inyeccion mediante Setters==============
     * ==========con los Atajos de Teclado Alt+Insert==========*/

    public void setServiNorm(ServicioNormal serviNorm) {
        this.serviNorm = serviNorm;
    }

    public void setServiPrem(ServicioPremium serviPrem) {
        this.serviPrem = serviPrem;
    }
/*========================================================================================================*/



}

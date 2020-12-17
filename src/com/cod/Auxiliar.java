package com.cod;
public class Auxiliar
{
    String e = "";
    String h = "127.0.0.2";

    private static Auxiliar instance = null;

    /**
     * Constructor bloqueado con private
     */

    Auxiliar()

    {
        e="anonymous@danielcastelao.org";
    }
    Auxiliar(String param1)
    {
        this.e = param1;
    }

    public static Auxiliar getInstance() {

        if (instance == null) {

            instance = new Auxiliar();
        }

        return instance;
    }



    public boolean con()
    {
    if (e!="anonymous@danielcastelao.org")
    {
        return true;
    }
        else
            {
                return false;
            }
    }




}

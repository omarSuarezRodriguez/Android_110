package cursos.omar.android_1_10;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

//Establecemos OnClickListener en el MainActivity
//Importamos la clase e implementamos el método (Solución a errores con Alt + intro
//en View.OnClickListener
public class App1Fragment extends Fragment implements View.OnClickListener {


    //Inicializamos los componentes
    //Importamos clase EditText, Button, TextView, con Alt+intro o con enter al mostrar la opción
    //en autocompletado
    EditText et_1, et_2;
    Button btn_1;
    TextView tv_1;


    //Metodo para cambiar entre fragments, donde inflamos el layout del fragment
    //Método donde referenciamos los objetos visuales
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        //Para inflar el layout de este fragment

        //Separamos la vista
        View view = inflater.inflate(R.layout.fragment_app_1, container, false);


        //Referenciamos los componentes mediante su ID
        et_1 = (EditText) view.findViewById(R.id.et_1); //Primero va la vista view. luego buscamos id
        et_2 = (EditText) view.findViewById(R.id.et_2);
        tv_1 = (TextView) view.findViewById(R.id.tv_1);
        btn_1 = (Button) view.findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this); //El boton escuchará cuando se haga click en este

        //Retornamos la vista
        return view;


    }


    //Evento/Metodo en el cual realizamos la operación, al dar click en el btn_1
    @Override
    public void onClick(View v) {

        //Convertimos los valores String a numérico
        int valor_1 = Integer.parseInt(et_1.getText().toString());
        int valor_2 = Integer.parseInt(et_2.getText().toString());

        //Sumamos los valores
        int resultado = valor_1 + valor_2;

        //Mostramos el resultado en el TextView
        tv_1.setText("Resultado: " + resultado);


    }


}

package cursos.omar.android_1_10;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Establecemos OnClickListener en el MainActivity
//Importamos la clase e implementamos el método (Solución a errores con Alt + intro
//en View.OnClickListener
public class App2Fragment extends Fragment implements View.OnClickListener {


    //Inicializamos los componentes
    //Importamos clase EditText, Button, TextView, con Alt+intro o con enter al mostrar la opción
    //en autocompletado

    EditText et_1, et_2;
    Button btn_1;
    TextView tv_1, tv_2;


    //Metodo para cambiar entre fragments, donde inflamos el layout del fragment
    //Método donde referenciamos los objetos visuales
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.fragment_app_2, container, false);


        // Inflate the layout for this fragment
        //Para inflar el layout de este fragment

        //Separamos la vista
        View view = inflater.inflate(R.layout.fragment_app_2, container, false);


        //Referenciamos los componentes mediante su ID
        et_1 = (EditText) view.findViewById(R.id.et_1);
        et_2 = (EditText) view.findViewById(R.id.et_2);
        tv_1 = (TextView) view.findViewById(R.id.tv_1);
        tv_2 = (TextView) view.findViewById(R.id.tv_2);
        btn_1 = (Button) view.findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);     //El botón escuchará cuando se haga clic en el mismo

        //Retornamos la vista
        return view;


    }


    @Override
    public void onClick(View v) {

        //Obtenemos los datos ingresados en el teléfono
        float producto = Float.parseFloat(et_1.getText().toString());
        float iva = (Float.parseFloat(et_2.getText().toString())) / 100;


        //Efectuamos las operaciones
        float productoConIva = (producto * iva) + producto;
        float precioIva = producto * iva;


        //Mostramos en el teléfono los resultados
        tv_1.setText("Precio Producto con Iva: " + productoConIva);
        tv_2.setText("Precio Iva del Producto: " + precioIva);


    }
}

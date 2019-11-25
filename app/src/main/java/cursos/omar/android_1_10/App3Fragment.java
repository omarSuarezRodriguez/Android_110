package cursos.omar.android_1_10;

import android.app.AlertDialog;
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
public class App3Fragment extends Fragment implements View.OnClickListener {


    //Inicializamos los componentes
    //Importamos clase EditText, Button, TextView, con Alt+intro o con enter al mostrar la opción
    //en autocompletado

    EditText et_1, et_2;
    Button btn_1;
    TextView tv_1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.fragment_app_2, container, false);


        // Inflate the layout for this fragment
        //Para inflar el layout de este fragment

        //Separamos la vista
        View view = inflater.inflate(R.layout.fragment_app_3, container, false);


        //Referenciamos los componentes mediante su ID

        et_1 = (EditText) view.findViewById(R.id.et_1);
        et_2 = (EditText) view.findViewById(R.id.et_2);
        tv_1 = (TextView) view.findViewById(R.id.tv_1);
        btn_1 = (Button) view.findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);     //El botón escuchará cuando se haga clic en el mismo

        //Retornamos la vista
        return view;


    }


    @Override
    public void onClick(View v) {


        //Obtenemos los valores del teléfono

        int num_1 = Integer.parseInt(et_1.getText().toString());
        int num_2 = Integer.parseInt(et_2.getText().toString());

        if (num_1 > num_2) {
            showMessage("Número mayor:", "El número mayor es: " + num_1);
            tv_1.setText("Número mayor: " + num_1);
        } else {
            showMessage("Número mayor:", "El número mayor es: " + num_2);
            tv_1.setText("Número mayor: " + num_2);
        }


//        showMessage("Prueba", "Esto es una prueba");


    }


    //Mostrar un mensaje con alertdialog
    //Es como una tarjeta blanca de alert
    private void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}

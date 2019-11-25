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
public class App4Fragment extends Fragment implements View.OnClickListener {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.fragment_app_2, container, false);


        // Inflate the layout for this fragment
        //Para inflar el layout de este fragment

        //Separamos la vista
        View view = inflater.inflate(R.layout.fragment_app_4, container, false);


        //Referenciamos los componentes mediante su ID




        //Retornamos la vista
        return view;


    }


    @Override
    public void onClick(View v) {





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

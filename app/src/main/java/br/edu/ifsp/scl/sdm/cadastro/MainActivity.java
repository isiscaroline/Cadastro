package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText textNomeEdt;
    private EditText textTelEdt;
    private EditText textEmailEdt;
    private CheckBox selecionadoCb;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;
    private EditText textCidadeEdt;
    private Spinner estadoSp;
    private Button limparBt;
    private Button salvarBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNomeEdt = findViewById(R.id.textNomeEdt);
        textTelEdt = findViewById(R.id.textTelEdt);
        textEmailEdt = findViewById(R.id.textEmailEdt);
        selecionadoCb = findViewById(R.id.selecionadoCb);
        masculinoRb = findViewById(R.id.masculinoRb);
        femininoRb = findViewById(R.id.femininoRb);

        salvarBt = findViewById(R.id.salvarBt);
        salvarBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();

        sb.append(textNomeEdt.getText());
        sb.append('\n');
        sb.append(textTelEdt.getText().toString());
        sb.append('\n');
        sb.append(textEmailEdt.getText().toString());
        sb.append('\n');

        sb.append(selecionadoCb.isChecked()? "Ingressou na lista" : "Não ingressou na lista");
        sb.append('\n');

        sb.append(masculinoRb.isChecked()? "Masculino" : "Feminino");
        sb.append('\n');

        Toast.makeText(this,sb.toString(), Toast.LENGTH_SHORT).show();

    }
}
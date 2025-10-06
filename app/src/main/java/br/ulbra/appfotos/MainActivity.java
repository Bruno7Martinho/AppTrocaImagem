package br.ulbra.appfotos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imgFoto;
    Button btfoto1, btfoto2;
    TextView txtInfo;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imgFoto = (ImageView) findViewById(R.id.imgFoto);

        btfoto1 = (Button) findViewById(R.id.btfoto1);
        btfoto2 = (Button) findViewById(R.id.btfoto2);
        txtInfo = (TextView) findViewById(R.id.txtInfo);
        btfoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgFoto.setImageResource(R.drawable.foto1);
                txtInfo.setText("O tigre Bibi é um dos moradores mais queridos do Parque Zoológico de Sapucaia do Sul, no Rio Grande do Sul. Com seu porte imponente e pelagem listrada marcante, ele encanta visitantes de todas as idades. Bibi é um símbolo da beleza e da força da vida selvagem, além de representar a importância da preservação das espécies ameaçadas.");
            } });
        btfoto2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgFoto.setImageResource(R.drawable.foto2);
                txtInfo.setText("Bomber é o majestoso leão do Parque Zoológico de Sapucaia do Sul e, como todo bom rei da selva, ele sabe ser imponente e tranquilo ao mesmo tempo. Com sua juba dourada e olhar atento, Bomber reina absoluto em seu espaço, conquistando o carinho e o respeito de todos que o visitam.");

            } }); } }


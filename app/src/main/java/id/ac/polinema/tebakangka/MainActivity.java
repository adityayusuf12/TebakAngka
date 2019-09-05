package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText input_number;
	private TextView output_text;
	private int number =(int)(Math.random()*100);


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		input_number = findViewById(R.id.number_input);
		output_text= findViewById(R.id.text_output);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		this.number = (int)(Math.random()*100);

	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		int input = Integer.parseInt(input_number.getText().toString());

		if (input == number){
			output_text.setText("Tebakan Benar");
		}
		if (input > number){
			output_text.setText("Terlalu Besar");
		}
		if (input < number){
			output_text.setText("Telalu Kecil");
		}

	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		output_text.setText("");
		input_number.setText("");
		number = (int)(Math.random()*100);

	}
}

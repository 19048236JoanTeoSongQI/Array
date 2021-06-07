package sg.edu.rp.c346.id19048236.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv,tv2;
    String[] fruits;
    ArrayList<String> fruits2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Array");
        fruits=new String[3];
        fruits[0]="apple";
        fruits[1]="banana";
        fruits[2]="cherry" ;

        tv=findViewById(R.id.textViewfruit);

        String text="Fruits \n";
        text +="====== \n";

        for (int i=0;i<fruits.length;i++){
            text+= fruits[i]+"\n";
        }
        tv.setText(text);

        //-----------ArrayList
        tv2=findViewById(R.id.textViewfruits2);

        fruits2=new ArrayList<String>();
        fruits2.add("apple");
        fruits2.add("banana");
        fruits2.add("cherry" );
        fruits2.add(3,"durian");
        fruits2.remove(0);
        fruits2.set(fruits2.size()-1,"dragon fruit");

        String theFruit=fruits2.get(1);

        String text2="Fruits \n";
        text2 +="====== \n";

        for (int i=0;i<fruits2.size();i++){
            text2 += fruits2.get(i)+"\n";

        }
        tv2.setText(text2);

         /*for (int i=0;i<fruits2.size();i++){
            theFruit += fruits2.get(i)+"\n";

        }
        tv2.setText(theFruit);

         */




    }
}

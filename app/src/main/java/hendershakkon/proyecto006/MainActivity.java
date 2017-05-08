package hendershakkon.proyecto006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] paises = {"Argentina","Chile","Paraguay","Bolivia","Perú","Ecuador","Brasil","Colombia","Venezuela","Uruguay"};
    private String[] habitantes = {"40000000","170000000","65000000","10000000","30000000","140000000","183000000","44000000","29000000","35000000"};
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.list1);
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La poblaciòn de "+ lv1.getItemAtPosition(position) + " es "+ habitantes[position]);
            }
        });

    }
}

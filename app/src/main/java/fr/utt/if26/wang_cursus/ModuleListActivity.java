package fr.utt.if26.wang_cursus;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ModuleListActivity extends Activity {
    ArrayList<Module> moduleArrayList = new ArrayList<Module>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_list);

        ListView listView = findViewById(R.id.listModule);

        Cursus cursus = new Cursus();
        moduleArrayList = cursus.getModules();
        CursusAdapter cursusAdapter = new CursusAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, moduleArrayList);
        listView.setAdapter(cursusAdapter);
    }
}

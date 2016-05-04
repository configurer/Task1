package app.soeyannaing.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import app.soeyannaing.task1.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // todo
        getSupportFragmentManager().beginTransaction().add(R.id.itemlist, ItemFragment.newInstance(1)).commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        System.out.println("++++++++++++++++++++++++ output " + item.id);

    }
}

package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  List<NBA> nbaList=new ArrayList<>();

    //private String[] data={"老鹰","凯尔特人","公牛","黄蜂","篮网","骑士",
    //        "热火","尼克斯", "活塞","魔术","76人", "步行者", "奇才","猛龙",
    //       "雄鹿", "独行侠","掘金","勇士", "火箭","森林狼","快船","灰熊",
    //        "雷霆","湖人","鹈鹕","开拓者","太阳","马刺","爵士", "国王"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNBAs();
        NbaAdapter adapter=new NbaAdapter(MainActivity.this,R.layout.nba_team,nbaList);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view,int position,long id){
                NBA nba=nbaList.get(position);
                Toast.makeText(MainActivity.this,nba.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initNBAs() {
        for(int i=0;i<2;i++){
            NBA blazers=new NBA("开拓者",R.drawable.blazers);
            nbaList.add(blazers);
            NBA bucks=new NBA("雄鹿",R.drawable.bucks);
            nbaList.add(bucks);
            NBA bulls=new NBA("公牛",R.drawable.bulls);
            nbaList.add(bulls);
            NBA cavaliers=new NBA("骑士",R.drawable.cavaliers);
            nbaList.add(cavaliers);
            NBA celtics=new NBA("凯尔特人",R.drawable.celtics);
            nbaList.add(celtics);
            NBA clippers=new NBA("快船",R.drawable.clippers);
            nbaList.add(clippers);
            NBA grizzlies=new NBA("灰熊",R.drawable.grizzlies);
            nbaList.add(grizzlies);
            NBA hawks=new NBA("老鹰",R.drawable.hawks);
            nbaList.add(hawks);
            NBA heat=new NBA("热火",R.drawable.heat);
            nbaList.add(heat);
            NBA hornets=new NBA("黄蜂",R.drawable.hornets);
            nbaList.add(hornets);
            NBA jazz=new NBA("爵士",R.drawable.jazz);
            nbaList.add(jazz);
            NBA kings=new NBA("国王",R.drawable.kings);
            nbaList.add(kings);
            NBA knicks=new NBA("尼克斯",R.drawable.knicks);
            nbaList.add(knicks);
            NBA lakers=new NBA("湖人",R.drawable.lakers);
            nbaList.add(lakers);
            NBA magic=new NBA("魔术",R.drawable.magic);
            nbaList.add(magic);
            NBA mavericks=new NBA("独行侠",R.drawable.mavericks);
            nbaList.add(mavericks);
            NBA nets=new NBA("篮网",R.drawable.nets);
            nbaList.add(nets);
            NBA nuggets=new NBA("掘金",R.drawable.nuggets);
            nbaList.add(nuggets);
            NBA pacers=new NBA("步行者",R.drawable.pacers);
            nbaList.add(pacers);
            NBA pelicans=new NBA("鹈鹕",R.drawable.pelicans);
            nbaList.add(pelicans);
            NBA pistons=new NBA("活塞",R.drawable.pistons);
            nbaList.add(pistons);
            NBA raptors=new NBA("猛龙",R.drawable.raptors);
            nbaList.add(raptors);
            NBA rockets=new NBA("火箭",R.drawable.rockets);
            nbaList.add(rockets);
            NBA sevensixers=new NBA("76人",R.drawable.sevensixers);
            nbaList.add(sevensixers);
            NBA spurs=new NBA("马刺",R.drawable.spurs);
            nbaList.add(spurs);
            NBA suns=new NBA("太阳",R.drawable.suns);
            nbaList.add(suns);
            NBA thunder=new NBA("雷霆",R.drawable.thunder);
            nbaList.add(thunder);
            NBA timberwolves=new NBA("森林狼",R.drawable.timberwolves);
            nbaList.add(timberwolves);
            NBA warriors=new NBA("勇士",R.drawable.warriors);
            nbaList.add(warriors);
            NBA wizards=new NBA("奇才",R.drawable.wizards);
            nbaList.add(wizards);
        }
    }
}

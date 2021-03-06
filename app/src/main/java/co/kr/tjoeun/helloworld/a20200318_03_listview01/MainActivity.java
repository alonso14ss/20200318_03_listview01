package co.kr.tjoeun.helloworld.a20200318_03_listview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import co.kr.tjoeun.helloworld.a20200318_03_listview01.Adapters.StoreAdapter;
import co.kr.tjoeun.helloworld.a20200318_03_listview01.databinding.ActivityMainBinding;
import co.kr.tjoeun.helloworld.a20200318_03_listview01.datas.Store;

public class MainActivity extends BaseActivity {

//    가게 목록이 담길 리스트
    List<Store> storeDatas = new ArrayList<>();
//    목록을 뿌려줄 스토어어댑터 변수
    StoreAdapter storeAdapter = null;

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }



    @Override
    public void setValues() {


//        어댑터를 객체화 (우리가 작성한 생성자 활용)
        storeAdapter = new StoreAdapter(mContext, R.layout.store_list_item, storeDatas);
//        리스트뷰와 어댑터를 연결
        binding.storeListView.setAdapter(storeAdapter);
        addStores();

    }

    void addStores() {
        storeDatas.add(new Store("삼겹살더하기 본점", 4));
        storeDatas.add(new Store("밥해주는 남자", 3));
        storeDatas.add(new Store("굽네치킨", 5));
        storeDatas.add(new Store("BBQ", 1));
        storeDatas.add(new Store("도미노피자", 3));
        storeDatas.add(new Store("월할머니", 2));
        storeDatas.add(new Store("밥잘알", 5));
        storeDatas.add(new Store("배고파", 5));
        storeDatas.add(new Store("ㅇㅋ", 3));
        storeAdapter.notifyDataSetChanged();

    }
}

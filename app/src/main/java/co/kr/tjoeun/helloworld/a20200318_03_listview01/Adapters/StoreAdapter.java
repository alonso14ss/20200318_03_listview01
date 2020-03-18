package co.kr.tjoeun.helloworld.a20200318_03_listview01.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

import co.kr.tjoeun.helloworld.a20200318_03_listview01.datas.Store;

// ALT + ENTER => 에러 해결 제안
public class StoreAdapter extends ArrayAdapter<Store> {

//    어댑터에서 종종 사용하는 변수 세가지 정의
    Context mContext; // 화면과 연결하는 연결고리
    List<Store> mList; //뿌려줄 목록을 담고있는 변수
    LayoutInflater inf; // xml을 객체화 시켜주는 역할 클래스

    public StoreAdapter(@NonNull Context context, int resource, @NonNull List<Store> objects) {
        super(context, resource, objects);

//        생성자가 실행될 때 세개의 변수를 채워줌
        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);

    }
}

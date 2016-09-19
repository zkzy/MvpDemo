package cn.cook.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.cook.mvpdemo.model.Memoto;
import cn.cook.mvpdemo.precenter.ImplEdtPresenter;
import cn.cook.mvpdemo.view.NoteEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,IEdtView {

    private NoteEditText mEdtContent;//输入框
    private Button mBtnPre;//上一步
    private Button mBtnNext;//下一步
    private Button mBtnSave;//保存

    private ImplEdtPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEdtContent = (NoteEditText) findViewById(R.id.edt_content);
        mBtnPre = (Button) findViewById(R.id.btn_pre);
        mBtnNext = (Button) findViewById(R.id.btn_next);
        mBtnSave = (Button) findViewById(R.id.btn_save);

        mBtnPre.setOnClickListener(this);
        mBtnNext.setOnClickListener(this);
        mBtnSave.setOnClickListener(this);

        mPresenter=new ImplEdtPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pre:
                mPresenter.onPre();
                break;
            case R.id.btn_next:
                mPresenter.onNext();
                break;
            case R.id.btn_save:
                mPresenter.onSave(mEdtContent.onSave());
                break;
        }
    }

    @Override
    public void preEdt(Memoto memoto) {
        mEdtContent.restore(memoto);
    }

    @Override
    public void nextEdt(Memoto memoto) {
        mEdtContent.restore(memoto);
    }

    @Override
    public void save() {
        Toast.makeText(MainActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
    }
}

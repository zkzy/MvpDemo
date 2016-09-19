package cn.cook.mvpdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import cn.cook.mvpdemo.model.Memoto;

/**
 * Created by ${zhangkai} on 2016/9/19.
 * 简介：
 * 版本：
 */
public class NoteEditText extends EditText {
    public NoteEditText(Context context) {
        super(context);
    }

    public NoteEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoteEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Memoto onSave(){
        return new Memoto(getText().toString(),getSelectionStart());
    }

    public void restore(Memoto memoto){
        setText(memoto.content);
        setSelection(memoto.cursor);
    }
}

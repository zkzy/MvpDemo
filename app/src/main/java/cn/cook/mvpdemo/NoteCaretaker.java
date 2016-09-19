package cn.cook.mvpdemo;

import java.util.ArrayList;

import cn.cook.mvpdemo.model.Memoto;

/**
 * Created by ${zhangkai} on 2016/9/19.
 * 简介：
 * 版本：
 */
public class NoteCaretaker {
    private ArrayList<Memoto> memotos = new ArrayList<>();
    private int mIndex;
    public void save(Memoto memoto) {
        if (memoto == null) {
            throw new NullPointerException();
        }
        if (!memotos.contains(memoto)) {
            memotos.add(memoto);
            mIndex = memotos.size() - 1;
        }
    }

    public Memoto onPre() {
        mIndex = mIndex > 0 ? --mIndex : mIndex;
        return memotos.get(mIndex);
    }

    public Memoto onNext() {
        mIndex = mIndex < memotos.size() - 1 ? ++mIndex : mIndex;
        return memotos.get(mIndex);
    }
}

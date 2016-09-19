package cn.cook.mvpdemo.precenter;

import cn.cook.mvpdemo.IEdtView;
import cn.cook.mvpdemo.model.Memoto;
import cn.cook.mvpdemo.NoteCaretaker;

/**
 * Created by ${zhangkai} on 2016/9/19.
 * 简介：
 * 版本：
 */
public class ImplEdtPresenter implements IEdtPresenter {

    private IEdtView iEdtView;
    private NoteCaretaker noteCaretaker;

    public ImplEdtPresenter(IEdtView iEdtView) {
        this.iEdtView = iEdtView;
        noteCaretaker = new NoteCaretaker();
    }

    @Override
    public void onSave(Memoto memoto) {
        noteCaretaker.save(memoto);
        iEdtView.save();
    }

    @Override
    public void onPre() {
        iEdtView.preEdt(noteCaretaker.onPre());
    }

    @Override
    public void onNext() {
        iEdtView.nextEdt(noteCaretaker.onNext());
    }
}

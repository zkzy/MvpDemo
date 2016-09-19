package cn.cook.mvpdemo.precenter;

import cn.cook.mvpdemo.model.Memoto;

/**
 * Created by ${zhangkai} on 2016/9/19.
 * 简介：
 * 版本：
 */
public interface IEdtPresenter {
    void onSave(Memoto memoto);
    void onPre();
    void onNext();
}

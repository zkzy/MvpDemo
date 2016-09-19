package cn.cook.mvpdemo;

import cn.cook.mvpdemo.model.Memoto;

/**
 * Created by ${zhangkai} on 2016/9/19.
 * 简介：
 * 版本：
 */
public interface IEdtView {
    void preEdt(Memoto memoto);
    void nextEdt(Memoto memoto);
    void save();
}

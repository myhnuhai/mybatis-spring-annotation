package com.jsjty.provider;

/**
 * Created by Administrator on 2015/2/6.
 */
public abstract class BaseProvider {
    /**
     * 保存一条对象
     * @param obj
     * @return
     */
    public abstract String insert(Object obj);

    /**
     * 更新一条对象
     * @param obj
     * @return
     */
    public abstract String update(Object obj);

    /**
     * 查询所有对象
     * @return
     */
    public abstract String selectAll();

    /**
     * 查询一条对象
     * @return
     */
    public abstract String selectById();

    /**
     * 删除一条对象
     * @return
     */
    public abstract String deleteById();
}

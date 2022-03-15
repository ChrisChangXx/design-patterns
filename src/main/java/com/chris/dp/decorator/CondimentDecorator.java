package com.chris.dp.decorator;

/**
 * 调味品装饰
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/23
 * @描述
 * @date 2021/05/23
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 得到描述
     *
     * @return {@link String}
     */
    @Override
    public abstract String getDescription();
}

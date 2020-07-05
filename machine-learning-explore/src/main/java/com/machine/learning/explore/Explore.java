package com.machine.learning.explore;

import java.util.List;

/**
 * 信息收集者抽象
 * 抽象设计干两件事件情
 * 1.在页面中找有用的信息
 * 2.在页面中找下一个需要搜索的路劲
 */
public interface Explore {

    /**
     * 找页面的其他路径以备下一次搜索
     *
     * @return 其他需要搜索的URL
     */
    List<String> findExploreUrl();

    /**
     * 找页面中对自己有用的信息
     *
     * @return 有用信息对象
     */
    Object findUseInfo();

}

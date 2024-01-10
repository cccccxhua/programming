package com.cxh.utils;

import java.util.List;

/**
 * @author CXH
 * @description
 * @create 2023-12-21 13:48
 */
public class NNode {
    public int val;
    public List<NNode> children;

    public NNode() {}

    public NNode(int _val) {
        val = _val;
    }

    public NNode(int _val, List<NNode> _children) {
        val = _val;
        children = _children;
    }
}

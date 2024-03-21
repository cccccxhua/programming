package com.cxh.routine.programmer;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.nio.file.Path;
import java.util.*;

/**
 * @author CXH
 * @description
 * @create 2024-03-06 10:09
 */
public class ReconstructItinerary {
    public static void main(String[] args) {
        ReconstructItinerary r = new ReconstructItinerary();
        List<List<String>> tickets = new LinkedList<>();
        List<String> one = new LinkedList<>();
        one.add("JFK");
        one.add("SFO");
        List<String> two = new LinkedList<>();
        two.add("JFK");
        two.add("ATL");
        List<String> three = new LinkedList<>();
        three.add("SFO");
        three.add("ATL");
        List<String> four = new LinkedList<>();
        four.add("ATL");
        four.add("JFK");
        List<String> five = new LinkedList<>();
        five.add("ATL");
        five.add("SFO");
        tickets.add(one);
        tickets.add(two);
        tickets.add(three);
        tickets.add(four);
        tickets.add(five);
        System.out.println(r.findItinerary(tickets));
    }
    List<String> ans;
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> path = new LinkedList<>();
        ans = new LinkedList<>();
        //将ticket中终点站按字典序排序
        Collections.sort(tickets,(a,b)->a.get(1).compareTo(b.get(1)));
        boolean[] used = new boolean[tickets.size()];
        path.add("JFK");
        backtracking(tickets, used, path);
        return ans;
    }
    public boolean backtracking(List<List<String>> tickets,boolean[] used,List<String> path){
        if (path.size() == tickets.size()+1){
            //机场都到过了
            ans = new LinkedList<>(path);
            return true;
        }
        for (int i=0;i<tickets.size();i++){
            //去重剪枝，如果有多张相同的票，会得到同一个结果，直接剪枝
            if (i>0 && !used[i-1] && tickets.get(i-1).get(0).equals(tickets.get(i).get(0)) && tickets.get(i-1).get(1).equals(tickets.get(i).get(1))){
                continue;
            }
            if (!used[i] && path.get(path.size()-1).equals(tickets.get(i).get(0))){
                //找到下一个可以到达的机票
                path.add(tickets.get(i).get(1));
                used[i] = true;
                if (backtracking(tickets, used, path)){
                    //有一个结果后直接就不找了
                    return true;
                }
                path.remove(path.size()-1);
                used[i] = false;
            }

        }
        return false;
    }
}

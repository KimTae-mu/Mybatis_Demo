package com.tae.old;

import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/10/15.
 */
public class QueryVo {
    private User user;

    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

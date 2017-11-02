package com.pkk.base;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionSupport;
import com.pkk.utils.commons.PageCondition;

/**
 * @author peikunkun
 * @version V1.0
 * @Title: love
 * @Package com.pkk.base
 * @Description: <>
 * @date 11/1 0001 20:00
 */
@Controller
public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, SessionAware {

    public HttpServletRequest  servletRequest;// request对象
    public HttpServletResponse servletResponse;// response对象
    public int                 page;//第几页
    public int                 rows;//每页显示的总条数
    public String              sort;//排序字段
    public String              order;//排序顺序
    public PageCondition       pageCondition;//分页封装类
    public Map                 session;//session对象


    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

    public HttpServletResponse getServletResponse() {
        return servletResponse;
    }

    @Override
    public void setServletResponse(HttpServletResponse servletResponse) {
        this.servletResponse = servletResponse;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setPageCondition(PageCondition pageCondition) {
        this.pageCondition = pageCondition;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }


    public PageCondition getPageCondition() {
        if (pageCondition == null) {
            pageCondition = new PageCondition();
        }
        pageCondition.setPage(page);
        pageCondition.setPagesize(rows);
        pageCondition.setSortname(sort);
        pageCondition.setSortorder(order);
        return pageCondition;
    }
}

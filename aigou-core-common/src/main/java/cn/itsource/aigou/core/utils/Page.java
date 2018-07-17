package cn.itsource.aigou.core.utils;

import java.io.Serializable;
import java.util.List;

import cn.itsource.aigou.core.query.BaseQuery;

public class Page<T> implements Serializable{

	private static final long serialVersionUID = 1158843335947858339L;
	//当前页的数据
	private List<T> rows;
	//总的记录数
	private int total = 0;
	//当前第几页
	private int curPage = 1;
	//每页多少条数据，分页大小
	private int pageSize = 10;

	public Page(){
	}
	
	public Page(List<T> rows, int total, BaseQuery query) {
		this.rows = rows;
		this.total = total;
		this.curPage = query.getPage();
		this.pageSize = query.getRows();
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}

/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long pj_rate_rw;
	public long pj_rate_clr;
	public String paper_wgt;

	public MT_PAPINOUT_2210_LDataSet(){}
	public MT_PAPINOUT_2210_LDataSet(String errcode, String errmsg, long pj_rate_rw, long pj_rate_clr, String paper_wgt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pj_rate_rw = pj_rate_rw;
		this.pj_rate_clr = pj_rate_clr;
		this.paper_wgt = paper_wgt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPj_rate_rw(long pj_rate_rw){
		this.pj_rate_rw = pj_rate_rw;
	}

	public void setPj_rate_clr(long pj_rate_clr){
		this.pj_rate_clr = pj_rate_clr;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getPj_rate_rw(){
		return this.pj_rate_rw;
	}

	public long getPj_rate_clr(){
		return this.pj_rate_clr;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.pj_rate_rw = cstmt.getLong(5);
		this.pj_rate_clr = cstmt.getLong(6);
		this.paper_wgt = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_2210_LDataSet ds = (MT_PAPINOUT_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPj_rate_rw()%>
<%= ds.getPj_rate_clr()%>
<%= ds.getPaper_wgt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 07 11:54:52 KST 2009 */
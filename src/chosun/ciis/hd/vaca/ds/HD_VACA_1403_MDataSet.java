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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1403_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_emp_no_010;
	public String xx_qq_month_010;
	public String xx_qq_month_020;
	public String xx_qq_month_030;
	public String xx_qq_month_040;
	public String xx_proc_stat_010;
	public String xx_proc_stat_020;
	public String xx_proc_stat_030;

	public HD_VACA_1403_MDataSet(){}
	public HD_VACA_1403_MDataSet(String errcode, String errmsg, String xx_emp_no_010, String xx_qq_month_010, String xx_qq_month_020, String xx_qq_month_030, String xx_qq_month_040, String xx_proc_stat_010, String xx_proc_stat_020, String xx_proc_stat_030){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_qq_month_010 = xx_qq_month_010;
		this.xx_qq_month_020 = xx_qq_month_020;
		this.xx_qq_month_030 = xx_qq_month_030;
		this.xx_qq_month_040 = xx_qq_month_040;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_proc_stat_020 = xx_proc_stat_020;
		this.xx_proc_stat_030 = xx_proc_stat_030;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setXx_qq_month_010(String xx_qq_month_010){
		this.xx_qq_month_010 = xx_qq_month_010;
	}

	public void setXx_qq_month_020(String xx_qq_month_020){
		this.xx_qq_month_020 = xx_qq_month_020;
	}

	public void setXx_qq_month_030(String xx_qq_month_030){
		this.xx_qq_month_030 = xx_qq_month_030;
	}

	public void setXx_qq_month_040(String xx_qq_month_040){
		this.xx_qq_month_040 = xx_qq_month_040;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_proc_stat_020(String xx_proc_stat_020){
		this.xx_proc_stat_020 = xx_proc_stat_020;
	}

	public void setXx_proc_stat_030(String xx_proc_stat_030){
		this.xx_proc_stat_030 = xx_proc_stat_030;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_qq_month_010(){
		return this.xx_qq_month_010;
	}

	public String getXx_qq_month_020(){
		return this.xx_qq_month_020;
	}

	public String getXx_qq_month_030(){
		return this.xx_qq_month_030;
	}

	public String getXx_qq_month_040(){
		return this.xx_qq_month_040;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_proc_stat_020(){
		return this.xx_proc_stat_020;
	}

	public String getXx_proc_stat_030(){
		return this.xx_proc_stat_030;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_emp_no_010 = Util.checkString(cstmt.getString(5));
		this.xx_qq_month_010 = Util.checkString(cstmt.getString(6));
		this.xx_qq_month_020 = Util.checkString(cstmt.getString(7));
		this.xx_qq_month_030 = Util.checkString(cstmt.getString(8));
		this.xx_qq_month_040 = Util.checkString(cstmt.getString(9));
		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(10));
		this.xx_proc_stat_020 = Util.checkString(cstmt.getString(11));
		this.xx_proc_stat_030 = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_VACA_1403_MDataSet ds = (HD_VACA_1403_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_qq_month_010()%>
<%= ds.getXx_qq_month_020()%>
<%= ds.getXx_qq_month_030()%>
<%= ds.getXx_qq_month_040()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_proc_stat_020()%>
<%= ds.getXx_proc_stat_030()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 02 19:28:39 KST 2012 */
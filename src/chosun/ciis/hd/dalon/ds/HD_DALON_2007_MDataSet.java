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


package chosun.ciis.hd.dalon.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_2007_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_proc_stat_010;
	public String xx_proc_stat_020;
	public String xx_proc_stat_030;
	public String xx_proc_stat_040;
	public String xx_proc_stat_050;
	public String xx_proc_stat_060;

	public HD_DALON_2007_MDataSet(){}
	public HD_DALON_2007_MDataSet(String errcode, String errmsg, String xx_proc_stat_010, String xx_proc_stat_020, String xx_proc_stat_030, String xx_proc_stat_040, String xx_proc_stat_050, String xx_proc_stat_060){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_proc_stat_020 = xx_proc_stat_020;
		this.xx_proc_stat_030 = xx_proc_stat_030;
		this.xx_proc_stat_040 = xx_proc_stat_040;
		this.xx_proc_stat_050 = xx_proc_stat_050;
		this.xx_proc_stat_060 = xx_proc_stat_060;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setXx_proc_stat_040(String xx_proc_stat_040){
		this.xx_proc_stat_040 = xx_proc_stat_040;
	}

	public void setXx_proc_stat_050(String xx_proc_stat_050){
		this.xx_proc_stat_050 = xx_proc_stat_050;
	}

	public void setXx_proc_stat_060(String xx_proc_stat_060){
		this.xx_proc_stat_060 = xx_proc_stat_060;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

	public String getXx_proc_stat_040(){
		return this.xx_proc_stat_040;
	}

	public String getXx_proc_stat_050(){
		return this.xx_proc_stat_050;
	}

	public String getXx_proc_stat_060(){
		return this.xx_proc_stat_060;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(5));
		this.xx_proc_stat_020 = Util.checkString(cstmt.getString(6));
		this.xx_proc_stat_030 = Util.checkString(cstmt.getString(7));
		this.xx_proc_stat_040 = Util.checkString(cstmt.getString(8));
		this.xx_proc_stat_050 = Util.checkString(cstmt.getString(9));
		this.xx_proc_stat_060 = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_DALON_2007_MDataSet ds = (HD_DALON_2007_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_proc_stat_020()%>
<%= ds.getXx_proc_stat_030()%>
<%= ds.getXx_proc_stat_040()%>
<%= ds.getXx_proc_stat_050()%>
<%= ds.getXx_proc_stat_060()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 01 13:21:14 KST 2012 */
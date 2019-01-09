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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1210_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_g_ymgbcd_010;
	public String xx_g_cdgb_010;

	public FC_ACCT_1210_MDataSet(){}
	public FC_ACCT_1210_MDataSet(String errcode, String errmsg, String xx_g_ymgbcd_010, String xx_g_cdgb_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_g_ymgbcd_010 = xx_g_ymgbcd_010;
		this.xx_g_cdgb_010 = xx_g_cdgb_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_g_ymgbcd_010(String xx_g_ymgbcd_010){
		this.xx_g_ymgbcd_010 = xx_g_ymgbcd_010;
	}

	public void setXx_g_cdgb_010(String xx_g_cdgb_010){
		this.xx_g_cdgb_010 = xx_g_cdgb_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_g_ymgbcd_010(){
		return this.xx_g_ymgbcd_010;
	}

	public String getXx_g_cdgb_010(){
		return this.xx_g_cdgb_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_g_ymgbcd_010 = Util.checkString(cstmt.getString(5));
		this.xx_g_cdgb_010 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_1210_MDataSet ds = (FC_ACCT_1210_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_g_ymgbcd_010()%>
<%= ds.getXx_g_cdgb_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Dec 29 13:53:40 KST 2011 */
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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1070_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_acct_drcr_no_010;
	public String xx_acct_drcr_no_020;
	public String xx_acct_drcr_no_030;
	public String xx_acct_drcr_no_040;

	public FC_FUNC_1070_MDataSet(){}
	public FC_FUNC_1070_MDataSet(String errcode, String errmsg, String xx_acct_drcr_no_010, String xx_acct_drcr_no_020, String xx_acct_drcr_no_030, String xx_acct_drcr_no_040){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_acct_drcr_no_010 = xx_acct_drcr_no_010;
		this.xx_acct_drcr_no_020 = xx_acct_drcr_no_020;
		this.xx_acct_drcr_no_030 = xx_acct_drcr_no_030;
		this.xx_acct_drcr_no_040 = xx_acct_drcr_no_040;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_acct_drcr_no_010(String xx_acct_drcr_no_010){
		this.xx_acct_drcr_no_010 = xx_acct_drcr_no_010;
	}

	public void setXx_acct_drcr_no_020(String xx_acct_drcr_no_020){
		this.xx_acct_drcr_no_020 = xx_acct_drcr_no_020;
	}

	public void setXx_acct_drcr_no_030(String xx_acct_drcr_no_030){
		this.xx_acct_drcr_no_030 = xx_acct_drcr_no_030;
	}

	public void setXx_acct_drcr_no_040(String xx_acct_drcr_no_040){
		this.xx_acct_drcr_no_040 = xx_acct_drcr_no_040;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_acct_drcr_no_010(){
		return this.xx_acct_drcr_no_010;
	}

	public String getXx_acct_drcr_no_020(){
		return this.xx_acct_drcr_no_020;
	}

	public String getXx_acct_drcr_no_030(){
		return this.xx_acct_drcr_no_030;
	}

	public String getXx_acct_drcr_no_040(){
		return this.xx_acct_drcr_no_040;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_acct_drcr_no_010 = Util.checkString(cstmt.getString(5));
		this.xx_acct_drcr_no_020 = Util.checkString(cstmt.getString(6));
		this.xx_acct_drcr_no_030 = Util.checkString(cstmt.getString(7));
		this.xx_acct_drcr_no_040 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1070_MDataSet ds = (FC_FUNC_1070_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_acct_drcr_no_010()%>
<%= ds.getXx_acct_drcr_no_020()%>
<%= ds.getXx_acct_drcr_no_030()%>
<%= ds.getXx_acct_drcr_no_040()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 03 17:40:18 KST 2012 */
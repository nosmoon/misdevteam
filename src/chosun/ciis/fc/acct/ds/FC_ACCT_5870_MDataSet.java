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


public class FC_ACCT_5870_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_slip_clsf_cd_010;
	public String xx_slip_clsf_cd_020;
	public String xx_slip_clsf_cd_030;
	public String xx_slip_clsf_cd_040;

	public FC_ACCT_5870_MDataSet(){}
	public FC_ACCT_5870_MDataSet(String errcode, String errmsg, String xx_slip_clsf_cd_010, String xx_slip_clsf_cd_020, String xx_slip_clsf_cd_030, String xx_slip_clsf_cd_040){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_slip_clsf_cd_010 = xx_slip_clsf_cd_010;
		this.xx_slip_clsf_cd_020 = xx_slip_clsf_cd_020;
		this.xx_slip_clsf_cd_030 = xx_slip_clsf_cd_030;
		this.xx_slip_clsf_cd_040 = xx_slip_clsf_cd_040;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_slip_clsf_cd_010(String xx_slip_clsf_cd_010){
		this.xx_slip_clsf_cd_010 = xx_slip_clsf_cd_010;
	}

	public void setXx_slip_clsf_cd_020(String xx_slip_clsf_cd_020){
		this.xx_slip_clsf_cd_020 = xx_slip_clsf_cd_020;
	}

	public void setXx_slip_clsf_cd_030(String xx_slip_clsf_cd_030){
		this.xx_slip_clsf_cd_030 = xx_slip_clsf_cd_030;
	}

	public void setXx_slip_clsf_cd_040(String xx_slip_clsf_cd_040){
		this.xx_slip_clsf_cd_040 = xx_slip_clsf_cd_040;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_slip_clsf_cd_010(){
		return this.xx_slip_clsf_cd_010;
	}

	public String getXx_slip_clsf_cd_020(){
		return this.xx_slip_clsf_cd_020;
	}

	public String getXx_slip_clsf_cd_030(){
		return this.xx_slip_clsf_cd_030;
	}

	public String getXx_slip_clsf_cd_040(){
		return this.xx_slip_clsf_cd_040;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_slip_clsf_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_slip_clsf_cd_020 = Util.checkString(cstmt.getString(6));
		this.xx_slip_clsf_cd_030 = Util.checkString(cstmt.getString(7));
		this.xx_slip_clsf_cd_040 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5870_MDataSet ds = (FC_ACCT_5870_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_slip_clsf_cd_010()%>
<%= ds.getXx_slip_clsf_cd_020()%>
<%= ds.getXx_slip_clsf_cd_030()%>
<%= ds.getXx_slip_clsf_cd_040()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 06 14:56:41 KST 2012 */
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


public class FC_ACCT_5850_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_slip_clsf_cd1;
	public String xx_slip_clsf_cd2;

	public FC_ACCT_5850_MDataSet(){}
	public FC_ACCT_5850_MDataSet(String errcode, String errmsg, String xx_slip_clsf_cd1, String xx_slip_clsf_cd2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_slip_clsf_cd1 = xx_slip_clsf_cd1;
		this.xx_slip_clsf_cd2 = xx_slip_clsf_cd2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_slip_clsf_cd1(String xx_slip_clsf_cd1){
		this.xx_slip_clsf_cd1 = xx_slip_clsf_cd1;
	}

	public void setXx_slip_clsf_cd2(String xx_slip_clsf_cd2){
		this.xx_slip_clsf_cd2 = xx_slip_clsf_cd2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_slip_clsf_cd1(){
		return this.xx_slip_clsf_cd1;
	}

	public String getXx_slip_clsf_cd2(){
		return this.xx_slip_clsf_cd2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_slip_clsf_cd1 = Util.checkString(cstmt.getString(5));
		this.xx_slip_clsf_cd2 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5850_MDataSet ds = (FC_ACCT_5850_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_slip_clsf_cd1()%>
<%= ds.getXx_slip_clsf_cd2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 06 13:28:03 KST 2012 */
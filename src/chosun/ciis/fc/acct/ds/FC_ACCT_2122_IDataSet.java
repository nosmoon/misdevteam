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


public class FC_ACCT_2122_IDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String slip_seq;
	public String rcpm_slip_no;
	public String alert_check;

	public FC_ACCT_2122_IDataSet(){}
	public FC_ACCT_2122_IDataSet(String errcode, String errmsg, String slip_seq, String rcpm_slip_no, String alert_check){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.slip_seq = slip_seq;
		this.rcpm_slip_no = rcpm_slip_no;
		this.alert_check = alert_check;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setAlert_check(String alert_check){
		this.alert_check = alert_check;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getAlert_check(){
		return this.alert_check;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.slip_seq = Util.checkString(cstmt.getString(3));
		this.rcpm_slip_no = Util.checkString(cstmt.getString(4));
		this.alert_check = Util.checkString(cstmt.getString(5));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2122_IDataSet ds = (FC_ACCT_2122_IDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_seq()%>
<%= ds.getRcpm_slip_no()%>
<%= ds.getAlert_check()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 19 15:12:07 KST 2014 */
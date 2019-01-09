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


public class FC_ACCT_2470_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList slip_clsf_cd2 = new ArrayList();
	public ArrayList slip_clsf_cd1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2470_MDataSet(){}
	public FC_ACCT_2470_MDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			FC_ACCT_2470_MSLIP_CLSF_CD1Record rec = new FC_ACCT_2470_MSLIP_CLSF_CD1Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.slip_clsf_cd1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_ACCT_2470_MSLIP_CLSF_CD2Record rec = new FC_ACCT_2470_MSLIP_CLSF_CD2Record();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.slip_clsf_cd2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2470_MDataSet ds = (FC_ACCT_2470_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.slip_clsf_cd1.size(); i++){
		FC_ACCT_2470_MSLIP_CLSF_CD1Record slip_clsf_cd1Rec = (FC_ACCT_2470_MSLIP_CLSF_CD1Record)ds.slip_clsf_cd1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.slip_clsf_cd2.size(); i++){
		FC_ACCT_2470_MSLIP_CLSF_CD2Record slip_clsf_cd2Rec = (FC_ACCT_2470_MSLIP_CLSF_CD2Record)ds.slip_clsf_cd2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_clsf_cd1()%>
<%= ds.getSlip_clsf_cd2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= slip_clsf_cd1Rec.cd_nm%>
<%= slip_clsf_cd1Rec.cd%>
<%= slip_clsf_cd2Rec.cd_nm%>
<%= slip_clsf_cd2Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 23 19:58:24 KST 2009 */
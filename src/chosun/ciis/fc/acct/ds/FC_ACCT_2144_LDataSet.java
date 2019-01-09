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


public class FC_ACCT_2144_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2144_LDataSet(){}
	public FC_ACCT_2144_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_2144_LCURLISTRecord rec = new FC_ACCT_2144_LCURLISTRecord();
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.tax_slip_no = Util.checkString(rset0.getString("tax_slip_no"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.gtiysnm = Util.checkString(rset0.getString("gtiysnm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.rcpm_kind = Util.checkString(rset0.getString("rcpm_kind"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.occr_slip_no = Util.checkString(rset0.getString("occr_slip_no"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2144_LDataSet ds = (FC_ACCT_2144_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2144_LCURLISTRecord curlistRec = (FC_ACCT_2144_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.slip_sub_seq%>
<%= curlistRec.tax_slip_no%>
<%= curlistRec.budg_cd%>
<%= curlistRec.gtiysnm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.rcpm_kind%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.coms%>
<%= curlistRec.occr_slip_no%>
<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.make_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 16:44:00 KST 2009 */
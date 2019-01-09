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


public class FC_ACCT_3151_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3151_LDataSet(){}
	public FC_ACCT_3151_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_3151_LCURLISTRecord rec = new FC_ACCT_3151_LCURLISTRecord();
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.occr_amt = Util.checkString(rset0.getString("occr_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.bal_amt = Util.checkString(rset0.getString("bal_amt"));
			rec.extnc_amt = Util.checkString(rset0.getString("extnc_amt"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.obj_budg_cd = Util.checkString(rset0.getString("obj_budg_cd"));
			rec.slip_no1 = Util.checkString(rset0.getString("slip_no1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_3151_LDataSet ds = (FC_ACCT_3151_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_3151_LCURLISTRecord curlistRec = (FC_ACCT_3151_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.slip_no%>
<%= curlistRec.occr_amt%>
<%= curlistRec.rmks%>
<%= curlistRec.bal_amt%>
<%= curlistRec.extnc_amt%>
<%= curlistRec.obj_amt%>
<%= curlistRec.obj_budg_cd%>
<%= curlistRec.slip_no1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 09 17:23:07 KST 2014 */
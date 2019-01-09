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


public class FC_ACCT_2905_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2905_LDataSet(){}
	public FC_ACCT_2905_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2905_LCURLISTRecord rec = new FC_ACCT_2905_LCURLISTRecord();
			rec.chk = Util.checkString(rset0.getString("chk"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2905_LDataSet ds = (FC_ACCT_2905_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2905_LCURLISTRecord curlistRec = (FC_ACCT_2905_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.rmks2%>
<%= curlistRec.cnt%>
<%= curlistRec.dr_amt%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.boks_dlco_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 06 17:15:41 KST 2009 */
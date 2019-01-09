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


public class FC_ACCT_3025_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3025_ADataSet(){}
	public FC_ACCT_3025_ADataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_ACCT_3025_ACURLISTRecord rec = new FC_ACCT_3025_ACURLISTRecord();
			rec.x = Util.checkString(rset1.getString("x"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset1.getString("prelae_pay_clsf_cd"));
			rec.mang_clsf_cd = Util.checkString(rset1.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset1.getString("mang_no"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.face_val_amt = Util.checkString(rset1.getString("face_val_amt"));
			rec.dds = Util.checkString(rset1.getString("dds"));
			rec.int_rate = Util.checkString(rset1.getString("int_rate"));
			rec.prvmm_bal = Util.checkString(rset1.getString("prvmm_bal"));
			rec.thmm_dr = Util.checkString(rset1.getString("thmm_dr"));
			rec.thmm_crdt = Util.checkString(rset1.getString("thmm_crdt"));
			rec.thmm_bal = Util.checkString(rset1.getString("thmm_bal"));
			rec.prelae_pay_clsf_cd1 = Util.checkString(rset1.getString("prelae_pay_clsf_cd1"));
			rec.mang_clsf_cd1 = Util.checkString(rset1.getString("mang_clsf_cd1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_3025_ADataSet ds = (FC_ACCT_3025_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_3025_ACURLISTRecord curlistRec = (FC_ACCT_3025_ACURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.x%>
<%= curlistRec.prelae_pay_clsf_cd%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.face_val_amt%>
<%= curlistRec.dds%>
<%= curlistRec.int_rate%>
<%= curlistRec.prvmm_bal%>
<%= curlistRec.thmm_dr%>
<%= curlistRec.thmm_crdt%>
<%= curlistRec.thmm_bal%>
<%= curlistRec.prelae_pay_clsf_cd1%>
<%= curlistRec.mang_clsf_cd1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 17 11:25:55 KST 2009 */
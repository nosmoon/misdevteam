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


public class FC_ACCT_6151_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6151_LDataSet(){}
	public FC_ACCT_6151_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_6151_LCURLIST1Record rec = new FC_ACCT_6151_LCURLIST1Record();
			rec.jpgbcdnm = Util.checkString(rset2.getString("jpgbcdnm"));
			rec.dsacctcd = Util.checkString(rset2.getString("dsacctcd"));
			rec.dsamt = Util.checkString(rset2.getString("dsamt"));
			rec.dbamt = Util.checkString(rset2.getString("dbamt"));
			rec.ggamt = Util.checkString(rset2.getString("ggamt"));
			rec.vat = Util.checkString(rset2.getString("vat"));
			rec.diff_amt = Util.checkString(rset2.getString("diff_amt"));
			rec.dr_amt = Util.checkString(rset2.getString("dr_amt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.acct_cd = Util.checkString(rset2.getString("acct_cd"));
			rec.from_fisc_dt = Util.checkString(rset2.getString("from_fisc_dt"));
			rec.to_fisc_dt = Util.checkString(rset2.getString("to_fisc_dt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_6151_LDataSet ds = (FC_ACCT_6151_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_6151_LCURLIST1Record curlist1Rec = (FC_ACCT_6151_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.jpgbcdnm%>
<%= curlist1Rec.dsacctcd%>
<%= curlist1Rec.dsamt%>
<%= curlist1Rec.dbamt%>
<%= curlist1Rec.ggamt%>
<%= curlist1Rec.vat%>
<%= curlist1Rec.diff_amt%>
<%= curlist1Rec.dr_amt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.acct_cd%>
<%= curlist1Rec.from_fisc_dt%>
<%= curlist1Rec.to_fisc_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 15 15:49:28 KST 2009 */
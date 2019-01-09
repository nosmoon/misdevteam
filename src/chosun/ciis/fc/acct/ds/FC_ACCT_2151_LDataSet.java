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


public class FC_ACCT_2151_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2151_LDataSet(){}
	public FC_ACCT_2151_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2151_LCURLISTRecord rec = new FC_ACCT_2151_LCURLISTRecord();
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip = Util.checkString(rset0.getString("slip"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.occr_slip = Util.checkString(rset0.getString("occr_slip"));
			rec.occr_slip_occr_dt = Util.checkString(rset0.getString("occr_slip_occr_dt"));
			rec.occr_slip_clsf_cd = Util.checkString(rset0.getString("occr_slip_clsf_cd"));
			rec.occr_slip_seq = Util.checkString(rset0.getString("occr_slip_seq"));
			rec.occr_slip_sub_seq = Util.checkString(rset0.getString("occr_slip_sub_seq"));
			rec.sgamt = Util.checkString(rset0.getString("sgamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2151_LDataSet ds = (FC_ACCT_2151_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2151_LCURLISTRecord curlistRec = (FC_ACCT_2151_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.make_dt%>
<%= curlistRec.item%>
<%= curlistRec.occr_slip%>
<%= curlistRec.occr_slip_occr_dt%>
<%= curlistRec.occr_slip_clsf_cd%>
<%= curlistRec.occr_slip_seq%>
<%= curlistRec.occr_slip_sub_seq%>
<%= curlistRec.sgamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 28 16:45:03 KST 2009 */
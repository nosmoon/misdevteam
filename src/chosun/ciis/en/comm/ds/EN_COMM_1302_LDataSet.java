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


package chosun.ciis.en.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1302_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_COMM_1302_LDataSet(){}
	public EN_COMM_1302_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			EN_COMM_1302_LCURLISTRecord rec = new EN_COMM_1302_LCURLISTRecord();
			rec.occr_slip = Util.checkString(rset0.getString("occr_slip"));
			rec.occr_slip_clsf = Util.checkString(rset0.getString("occr_slip_clsf"));
			rec.occr_amt = Util.checkString(rset0.getString("occr_amt"));
			rec.extnc_amt = Util.checkString(rset0.getString("extnc_amt"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.extnc_slip_clsf = Util.checkString(rset0.getString("extnc_slip_clsf"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.occr_dlco_nm = Util.checkString(rset0.getString("occr_dlco_nm"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.extnc_dlco_nm = Util.checkString(rset0.getString("extnc_dlco_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_COMM_1302_LDataSet ds = (EN_COMM_1302_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_COMM_1302_LCURLISTRecord curlistRec = (EN_COMM_1302_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_slip%>
<%= curlistRec.occr_slip_clsf%>
<%= curlistRec.occr_amt%>
<%= curlistRec.extnc_amt%>
<%= curlistRec.amt1%>
<%= curlistRec.extnc_slip_clsf%>
<%= curlistRec.budg_cd%>
<%= curlistRec.occr_dlco_nm%>
<%= curlistRec.proc_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.extnc_dlco_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 01 13:36:42 KST 2009 */
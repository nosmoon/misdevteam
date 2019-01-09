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


package chosun.ciis.mt.papmeda.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.rec.*;

/**
 * 
 */


public class MT_PAPMEDA_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPMEDA_1102_LDataSet(){}
	public MT_PAPMEDA_1102_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPMEDA_1102_LCURLISTRecord rec = new MT_PAPMEDA_1102_LCURLISTRecord();
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.eps_no = Util.checkString(rset0.getString("eps_no"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.cnsm_wgt = Util.checkString(rset0.getString("cnsm_wgt"));
			rec.basi_amt = Util.checkString(rset0.getString("basi_amt"));
			rec.hdqt_paper_uprc = Util.checkString(rset0.getString("hdqt_paper_uprc"));
			rec.hdqt_amt = Util.checkString(rset0.getString("hdqt_amt"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			rec.meda_vat = Util.checkString(rset0.getString("meda_vat"));
			rec.meda_dt = Util.checkString(rset0.getString("meda_dt"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.tax_stmt_seq = Util.checkString(rset0.getString("tax_stmt_seq"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_proc_occr_dt = Util.checkString(rset0.getString("slip_proc_occr_dt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPMEDA_1102_LDataSet ds = (MT_PAPMEDA_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPMEDA_1102_LCURLISTRecord curlistRec = (MT_PAPMEDA_1102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.papcmpy_cd%>
<%= curlistRec.eps_no%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.cnsm_wgt%>
<%= curlistRec.basi_amt%>
<%= curlistRec.hdqt_paper_uprc%>
<%= curlistRec.hdqt_amt%>
<%= curlistRec.meda_amt%>
<%= curlistRec.meda_vat%>
<%= curlistRec.meda_dt%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.tax_stmt_seq%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_proc_occr_dt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Sep 04 14:20:42 KST 2009 */
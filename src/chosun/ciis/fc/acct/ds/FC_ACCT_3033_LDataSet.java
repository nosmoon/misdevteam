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


public class FC_ACCT_3033_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curinsrfeelist = new ArrayList();
	public ArrayList curtotallist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3033_LDataSet(){}
	public FC_ACCT_3033_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_3033_LCURINSRFEELISTRecord rec = new FC_ACCT_3033_LCURINSRFEELISTRecord();
			rec.x = Util.checkString(rset0.getString("x"));
			rec.pch_shggbnm = Util.checkString(rset0.getString("pch_shggbnm"));
			rec.pch_gwgbnm = Util.checkString(rset0.getString("pch_gwgbnm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.insr_nm = Util.checkString(rset0.getString("insr_nm"));
			rec.mang_no2 = Util.checkString(rset0.getString("mang_no2"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.dds = Util.checkString(rset0.getString("dds"));
			rec.pch_totilsu = Util.checkString(rset0.getString("pch_totilsu"));
			rec.prvmm_bal = Util.checkString(rset0.getString("prvmm_bal"));
			rec.thmm_dr = Util.checkString(rset0.getString("thmm_dr"));
			rec.thmm_crdt = Util.checkString(rset0.getString("thmm_crdt"));
			rec.thmm_bal = Util.checkString(rset0.getString("thmm_bal"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			this.curinsrfeelist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_3033_LCURTOTALLISTRecord rec = new FC_ACCT_3033_LCURTOTALLISTRecord();
			rec.tot_prvmm_bal = Util.checkString(rset1.getString("tot_prvmm_bal"));
			rec.tot_thmm_dr = Util.checkString(rset1.getString("tot_thmm_dr"));
			rec.tot_thmm_crdt = Util.checkString(rset1.getString("tot_thmm_crdt"));
			rec.tot_thmm_bal = Util.checkString(rset1.getString("tot_thmm_bal"));
			this.curtotallist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_3033_LDataSet ds = (FC_ACCT_3033_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curinsrfeelist.size(); i++){
		FC_ACCT_3033_LCURINSRFEELISTRecord curinsrfeelistRec = (FC_ACCT_3033_LCURINSRFEELISTRecord)ds.curinsrfeelist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curtotallist.size(); i++){
		FC_ACCT_3033_LCURTOTALLISTRecord curtotallistRec = (FC_ACCT_3033_LCURTOTALLISTRecord)ds.curtotallist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurinsrfeelist()%>
<%= ds.getCurtotallist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curinsrfeelistRec.x%>
<%= curinsrfeelistRec.pch_shggbnm%>
<%= curinsrfeelistRec.pch_gwgbnm%>
<%= curinsrfeelistRec.mang_no%>
<%= curinsrfeelistRec.insr_nm%>
<%= curinsrfeelistRec.mang_no2%>
<%= curinsrfeelistRec.mtry_dt%>
<%= curinsrfeelistRec.won_amt%>
<%= curinsrfeelistRec.dds%>
<%= curinsrfeelistRec.pch_totilsu%>
<%= curinsrfeelistRec.prvmm_bal%>
<%= curinsrfeelistRec.thmm_dr%>
<%= curinsrfeelistRec.thmm_crdt%>
<%= curinsrfeelistRec.thmm_bal%>
<%= curinsrfeelistRec.slip_no%>
<%= curinsrfeelistRec.slip_sub_seq%>
<%= curinsrfeelistRec.slip_arow_no%>
<%= curinsrfeelistRec.mang_clsf_cd%>
<%= curtotallistRec.tot_prvmm_bal%>
<%= curtotallistRec.tot_thmm_dr%>
<%= curtotallistRec.tot_thmm_crdt%>
<%= curtotallistRec.tot_thmm_bal%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 05 10:37:49 KST 2009 */
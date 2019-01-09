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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_5011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_5011_LDataSet(){}
	public FC_FUNC_5011_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_5011_LCURLISTRecord rec = new FC_FUNC_5011_LCURLISTRecord();
			rec.cctr_dt = Util.checkString(rset0.getString("cctr_dt"));
			rec.cctr_amt = Util.checkString(rset0.getString("cctr_amt"));
			rec.cctr_rmks = Util.checkString(rset0.getString("cctr_rmks"));
			rec.nomach_adpay_bal = Util.checkString(rset0.getString("nomach_adpay_bal"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.bhbijanamt = Util.checkString(rset0.getString("bhbijanamt"));
			rec.bhshggbcdnm = Util.checkString(rset0.getString("bhshggbcdnm"));
			rec.insr_nm = Util.checkString(rset0.getString("insr_nm"));
			rec.bhwhncdnm = Util.checkString(rset0.getString("bhwhncdnm"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.bhcompgbcdnm = Util.checkString(rset0.getString("bhcompgbcdnm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.bhcompnm = Util.checkString(rset0.getString("bhcompnm"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.bhmcnm = Util.checkString(rset0.getString("bhmcnm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.bhusebuseocdnm = Util.checkString(rset0.getString("bhusebuseocdnm"));
			rec.bhstcdnm = Util.checkString(rset0.getString("bhstcdnm"));
			rec.fisc_aprv_nm = Util.checkString(rset0.getString("fisc_aprv_nm"));
			rec.cctr_slip_occr_dt = Util.checkString(rset0.getString("cctr_slip_occr_dt"));
			rec.cctr_slip_clsf_cd = Util.checkString(rset0.getString("cctr_slip_clsf_cd"));
			rec.cctr_slip_seq = Util.checkString(rset0.getString("cctr_slip_seq"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.frex_cd = Util.checkString(rset0.getString("frex_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.fisc_aprv_stat = Util.checkString(rset0.getString("fisc_aprv_stat"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_5011_LDataSet ds = (FC_FUNC_5011_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_5011_LCURLISTRecord curlistRec = (FC_FUNC_5011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cctr_dt%>
<%= curlistRec.cctr_amt%>
<%= curlistRec.cctr_rmks%>
<%= curlistRec.nomach_adpay_bal%>
<%= curlistRec.slip_no%>
<%= curlistRec.cost_gain_stot%>
<%= curlistRec.rcpay_amt_stot%>
<%= curlistRec.bhbijanamt%>
<%= curlistRec.bhshggbcdnm%>
<%= curlistRec.insr_nm%>
<%= curlistRec.bhwhncdnm%>
<%= curlistRec.frcr_amt%>
<%= curlistRec.won_amt%>
<%= curlistRec.bhcompgbcdnm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.bhcompnm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.bhmcnm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.bhusebuseocdnm%>
<%= curlistRec.bhstcdnm%>
<%= curlistRec.fisc_aprv_nm%>
<%= curlistRec.cctr_slip_occr_dt%>
<%= curlistRec.cctr_slip_clsf_cd%>
<%= curlistRec.cctr_slip_seq%>
<%= curlistRec.prelae_pay_clsf_cd%>
<%= curlistRec.frex_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.fisc_aprv_stat%>
<%= curlistRec.use_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 31 19:57:10 KST 2009 */
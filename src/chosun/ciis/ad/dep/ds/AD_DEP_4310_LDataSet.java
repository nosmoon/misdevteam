/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ھ��� ���ε�
* �ۼ����� : 2011.07.05
* �ۼ��� : KBS
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_4310_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_4310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_4310_LDataSet(){}
	public AD_DEP_4310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_DEP_4310_LCURLISTRecord rec = new AD_DEP_4310_LCURLISTRecord();
			rec.reg_yn 			= Util.checkString(rset0.getString("reg_yn"));
			rec.bank_cd			= Util.checkString(rset0.getString("bank_cd"));
			rec.occr_dt			= Util.checkString(rset0.getString("occr_dt"));
			rec.note_clsf_cd 	= Util.checkString(rset0.getString("note_clsf_cd"));
			rec.occr_seq		= Util.checkString(rset0.getString("occr_seq"));
			
			rec.bank_nm				= Util.checkString(rset0.getString("bank_nm"));
			rec.note_clsf_nm		= Util.checkString(rset0.getString("note_clsf_nm"));
			rec.issu_cmpy_clsf_cd	= Util.checkString(rset0.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm		= Util.checkString(rset0.getString("issu_pers_nm"));
			rec.endorser_nm			= Util.checkString(rset0.getString("endorser_nm"));
			
			rec.note_amt			= Util.checkString(rset0.getString("note_amt"));
			rec.comp_dt		 		= Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt 			= Util.checkString(rset0.getString("mtry_dt"));
			rec.rcpm_acct 			= Util.checkString(rset0.getString("rcpm_acct"));
			rec.sale_aprv_no		= Util.checkString(rset0.getString("sale_aprv_no"));
			rec.note_no 			= Util.checkString(rset0.getString("note_no"));
			rec.note_seq			= Util.checkString(rset0.getString("note_seq"));
			rec.rcpm_slip_no		= Util.checkString(rset0.getString("rcpm_slip_no"));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_TAX_1610_LDataSet ds = (AD_TAX_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_1610_LCURLISTRecord curlistRec = (AD_TAX_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.agn_nm%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.notaxrate_clsf%>
<%= curlistRec.notaxrate_dt%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.clos_stat%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 27 13:48:46 KST 2009 */
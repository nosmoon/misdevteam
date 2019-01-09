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


package chosun.ciis.ad.tax.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.tax.rec.AD_TAX_2110_LCURLISTRecord;

/**
 * 
 */


public class AD_TAX_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String fee_pay_stat;
	public String bank;

	public AD_TAX_2110_LDataSet(){}
	public AD_TAX_2110_LDataSet(String errcode, String errmsg, String fee_pay_stat, String bank){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.fee_pay_stat = fee_pay_stat;
		this.bank = bank;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFee_pay_stat(String fee_pay_stat){
		this.fee_pay_stat = fee_pay_stat;
	}

	public void setBank(String bank){
		this.bank = bank;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFee_pay_stat(){
		return this.fee_pay_stat;
	}

	public String getBank(){
		return this.bank;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.fee_pay_stat = Util.checkString(cstmt.getString(11));
		this.bank = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_TAX_2110_LCURLISTRecord rec = new AD_TAX_2110_LCURLISTRecord();
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.pay_clsf = Util.checkString(rset0.getString("pay_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_TAX_2110_LDataSet ds = (AD_TAX_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_2110_LCURLISTRecord curlistRec = (AD_TAX_2110_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFee_pay_stat()%>
<%= ds.getBank()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.prof_type_cd%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.make_dt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.pay_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.pay_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 02 09:25:54 KST 2009 */
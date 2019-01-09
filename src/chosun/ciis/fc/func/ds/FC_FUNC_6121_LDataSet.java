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


public class FC_FUNC_6121_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6121_LDataSet(){}
	public FC_FUNC_6121_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_6121_LCURLISTRecord rec = new FC_FUNC_6121_LCURLISTRecord();
			rec.cost_gain_stot = Util.checkString(rset0.getString("cost_gain_stot"));
			rec.rcpay_amt_stot = Util.checkString(rset0.getString("rcpay_amt_stot"));
			rec.ijajanamt = Util.checkString(rset0.getString("ijajanamt"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.deps_isav_nm = Util.checkString(rset0.getString("deps_isav_nm"));
			rec.tot_pymt_amt = Util.checkString(rset0.getString("tot_pymt_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.mm_int = Util.checkString(rset0.getString("mm_int"));
			rec.sum_pymt_amt = Util.checkString(rset0.getString("sum_pymt_amt"));
			rec.tot_int = Util.checkString(rset0.getString("tot_int"));
			rec.deps_isav_stat_cdnm = Util.checkString(rset0.getString("deps_isav_stat_cdnm"));
			rec.hy_cctr_dt = Util.checkString(rset0.getString("hy_cctr_dt"));
			rec.hy_impt_amt = Util.checkString(rset0.getString("hy_impt_amt"));
			rec.hy_corp_tax_amt = Util.checkString(rset0.getString("hy_corp_tax_amt"));
			rec.hy_patr_budg_cd = Util.checkString(rset0.getString("hy_patr_budg_cd"));
			rec.hy_deps_clsf_cd = Util.checkString(rset0.getString("hy_deps_clsf_cd"));
			rec.hy_rmks = Util.checkString(rset0.getString("hy_rmks"));
			rec.hy_yejpno = Util.checkString(rset0.getString("hy_yejpno"));
			rec.hy_tot_int_amt = Util.checkString(rset0.getString("hy_tot_int_amt"));
			rec.hy_unrcp_precpt_bal = Util.checkString(rset0.getString("hy_unrcp_precpt_bal"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_6121_LDataSet ds = (FC_FUNC_6121_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_6121_LCURLISTRecord curlistRec = (FC_FUNC_6121_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cost_gain_stot%>
<%= curlistRec.rcpay_amt_stot%>
<%= curlistRec.ijajanamt%>
<%= curlistRec.prelae_pay_clsf_cd%>
<%= curlistRec.deps_isav_nm%>
<%= curlistRec.tot_pymt_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.compnm%>
<%= curlistRec.mm_int%>
<%= curlistRec.sum_pymt_amt%>
<%= curlistRec.tot_int%>
<%= curlistRec.deps_isav_stat_cdnm%>
<%= curlistRec.hy_cctr_dt%>
<%= curlistRec.hy_impt_amt%>
<%= curlistRec.hy_corp_tax_amt%>
<%= curlistRec.hy_patr_budg_cd%>
<%= curlistRec.hy_deps_clsf_cd%>
<%= curlistRec.hy_rmks%>
<%= curlistRec.hy_yejpno%>
<%= curlistRec.hy_tot_int_amt%>
<%= curlistRec.hy_unrcp_precpt_bal%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 11 15:09:24 KST 2009 */
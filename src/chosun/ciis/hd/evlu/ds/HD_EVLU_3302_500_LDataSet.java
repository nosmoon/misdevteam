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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3302_500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String s_nops_2tms;
	public String a_pls_nops_2tms;

	public HD_EVLU_3302_500_LDataSet(){}
	public HD_EVLU_3302_500_LDataSet(String errcode, String errmsg, String s_nops_2tms, String a_pls_nops_2tms){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.s_nops_2tms = s_nops_2tms;
		this.a_pls_nops_2tms = a_pls_nops_2tms;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setS_nops_2tms(String s_nops_2tms){
		this.s_nops_2tms = s_nops_2tms;
	}

	public void setA_pls_nops_2tms(String a_pls_nops_2tms){
		this.a_pls_nops_2tms = a_pls_nops_2tms;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getS_nops_2tms(){
		return this.s_nops_2tms;
	}

	public String getA_pls_nops_2tms(){
		return this.a_pls_nops_2tms;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset7 = (ResultSet) cstmt.getObject(8);
		while(rset7.next()){
			HD_EVLU_3302_500_LCURLISTRecord rec = new HD_EVLU_3302_500_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset7.getString("sel_chk"));
			rec.dept_nm = Util.checkString(rset7.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset7.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset7.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset7.getString("dty_nm"));
			rec.asst_pnt = Util.checkString(rset7.getString("asst_pnt"));
			rec.spc_psdo_redu_scorcnt = Util.checkString(rset7.getString("spc_psdo_redu_scorcnt"));
			rec.tmp_grad = Util.checkString(rset7.getString("tmp_grad"));
			rec.evlu_pers_meda_grad_1tms = Util.checkString(rset7.getString("evlu_pers_meda_grad_1tms"));
			rec.evlu_pers_deci_grad_2tms = Util.checkString(rset7.getString("evlu_pers_deci_grad_2tms"));
			rec.evlu_pers_meda_opn_2tms = Util.checkString(rset7.getString("evlu_pers_meda_opn_2tms"));
			rec.busn_rslt_scor = Util.checkString(rset7.getString("busn_rslt_scor"));
			rec.evlu_grad_cd_01 = Util.checkString(rset7.getString("evlu_grad_cd_01"));
			rec.evlu_grad_cd_02 = Util.checkString(rset7.getString("evlu_grad_cd_02"));
			rec.evlu_grad_cd_03 = Util.checkString(rset7.getString("evlu_grad_cd_03"));
			rec.evlu_grad_cd_04 = Util.checkString(rset7.getString("evlu_grad_cd_04"));
			rec.evlu_grad_cd_05 = Util.checkString(rset7.getString("evlu_grad_cd_05"));
			rec.evlu_grad_cd_06 = Util.checkString(rset7.getString("evlu_grad_cd_06"));
			rec.evlu_dp_scorcnt = Util.checkString(rset7.getString("evlu_dp_scorcnt"));
			this.curlist.add(rec);
		}
		this.s_nops_2tms = Util.checkString(cstmt.getString(9));
		this.a_pls_nops_2tms = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_3302_500_LDataSet ds = (HD_EVLU_3302_500_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3302_500_LCURLISTRecord curlistRec = (HD_EVLU_3302_500_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getS_nops_2tms()%>
<%= ds.getA_pls_nops_2tms()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.sel_chk%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.asst_pnt%>
<%= curlistRec.spc_psdo_redu_scorcnt%>
<%= curlistRec.tmp_grad%>
<%= curlistRec.evlu_pers_meda_grad_1tms%>
<%= curlistRec.evlu_pers_deci_grad_2tms%>
<%= curlistRec.evlu_pers_meda_opn_2tms%>
<%= curlistRec.busn_rslt_scor%>
<%= curlistRec.evlu_grad_cd_01%>
<%= curlistRec.evlu_grad_cd_02%>
<%= curlistRec.evlu_grad_cd_03%>
<%= curlistRec.evlu_grad_cd_04%>
<%= curlistRec.evlu_grad_cd_05%>
<%= curlistRec.evlu_grad_cd_06%>
<%= curlistRec.evlu_dp_scorcnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 20 16:55:56 KST 2018 */
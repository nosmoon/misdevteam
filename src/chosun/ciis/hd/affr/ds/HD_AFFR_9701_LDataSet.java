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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9701_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9701_LDataSet(){}
	public HD_AFFR_9701_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			HD_AFFR_9701_LCURLISTRecord rec = new HD_AFFR_9701_LCURLISTRecord();
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.aply_obj_name = Util.checkString(rset0.getString("aply_obj_name"));
			rec.expn_clsf_nm = Util.checkString(rset0.getString("expn_clsf_nm"));
			rec.str_dt = Util.checkString(rset0.getString("str_dt"));
			rec.end_dt = Util.checkString(rset0.getString("end_dt"));
			rec.limt_amt = Util.checkString(rset0.getString("limt_amt"));
			rec.sply_amt = Util.checkString(rset0.getString("sply_amt"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.deps_per = Util.checkString(rset0.getString("deps_per"));
			rec.phon_no = Util.checkString(rset0.getString("phon_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.stlm_desty = Util.checkString(rset0.getString("stlm_desty"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_PRZ_1301_LDataSet ds = (HD_PRZ_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRZ_1301_LCURLISTRecord curlistRec = (HD_PRZ_1301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rnum%>
<%= curlistRec.aplc_clsf_nm%>
<%= curlistRec.obj_clsf_nm%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.req_pers_flnm%>
<%= curlistRec.req_pers_dept_nm%>
<%= curlistRec.case_nm%>
<%= curlistRec.atic_pubc_dt%>
<%= curlistRec.atic_pubc_side%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.tms%>
<%= curlistRec.prv_insp_dt%>
<%= curlistRec.prv_insp_ocom%>
<%= curlistRec.prv_insp_resn%>
<%= curlistRec.main_insp_dt%>
<%= curlistRec.main_insp_ocom%>
<%= curlistRec.prz_pnsh_cd_nm%>
<%= curlistRec.prz_grad%>
<%= curlistRec.prz_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Nov 23 14:12:37 KST 2009 */
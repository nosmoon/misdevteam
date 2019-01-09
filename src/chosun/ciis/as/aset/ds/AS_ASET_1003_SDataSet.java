/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1003_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1003_SDataSet(){}
	public AS_ASET_1003_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_ASET_1003_SCURLISTRecord rec = new AS_ASET_1003_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.unit_cd = Util.checkString(rset0.getString("unit_cd"));
			rec.unit_nm = Util.checkString(rset0.getString("unit_nm"));
			rec.redm_clsf = Util.checkString(rset0.getString("redm_clsf"));
			rec.redm_nm = Util.checkString(rset0.getString("redm_nm"));
			rec.redm_mthd_cd = Util.checkString(rset0.getString("redm_mthd_cd"));
			rec.redm_mthd_nm = Util.checkString(rset0.getString("redm_mthd_nm"));
			rec.svc_yys_cnt = Util.checkString(rset0.getString("svc_yys_cnt"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.buy_clsf = Util.checkString(rset0.getString("buy_clsf"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.aset_stat = Util.checkString(rset0.getString("aset_stat"));
			rec.aset_stat_nm = Util.checkString(rset0.getString("aset_stat_nm"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.orgin_acqr_amt = Util.checkString(rset0.getString("orgin_acqr_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.cur_acqr_amt = Util.checkString(rset0.getString("cur_acqr_amt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_ern = Util.checkString(rset0.getString("dlco_ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.bund_cd = Util.checkString(rset0.getString("bund_cd"));
			rec.bund_nm = Util.checkString(rset0.getString("bund_nm"));
			rec.aset_size = Util.checkString(rset0.getString("aset_size"));
			rec.aset_loca = Util.checkString(rset0.getString("aset_loca"));
			rec.aset_qunt_cnt = Util.checkString(rset0.getString("aset_qunt_cnt"));
			rec.aset_usag = Util.checkString(rset0.getString("aset_usag"));
			rec.aset_grp_yn = Util.checkString(rset0.getString("aset_grp_yn"));
			rec.phot_yn = Util.checkString(rset0.getString("phot_yn"));
			rec.sale_dt = Util.checkString(rset0.getString("sale_dt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.redm_dt = Util.checkString(rset0.getString("redm_dt"));
			rec.cur_redm_agg_amt = Util.checkString(rset0.getString("cur_redm_agg_amt"));
			rec.tot_redm_amt = Util.checkString(rset0.getString("tot_redm_amt"));
			rec.rem_amt = Util.checkString(rset0.getString("rem_amt"));
			rec.un_redm_amt = Util.checkString(rset0.getString("un_redm_amt"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.eis_aset_clsf = Util.checkString(rset0.getString("eis_aset_clsf"));
			rec.insr_type_cd = Util.checkString(rset0.getString("insr_type_cd"));
			rec.use_emp_no = Util.checkString(rset0.getString("use_emp_no"));
			rec.use_emp_nm = Util.checkString(rset0.getString("use_emp_nm"));
			rec.use_cmpy_nm = Util.checkString(rset0.getString("use_cmpy_nm"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.use_cmpy_cd = Util.checkString(rset0.getString("use_cmpy_cd"));
			rec.mst_remk = Util.checkString(rset0.getString("mst_remk"));
			rec.mst_chnl_clsf_cd = Util.checkString(rset0.getString("mst_chnl_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1003_SDataSet ds = (AS_ASET_1003_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1003_SCURLISTRecord curlistRec = (AS_ASET_1003_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.item_nm%>
<%= curlistRec.unit_cd%>
<%= curlistRec.unit_nm%>
<%= curlistRec.redm_clsf%>
<%= curlistRec.redm_nm%>
<%= curlistRec.redm_mthd_cd%>
<%= curlistRec.redm_mthd_nm%>
<%= curlistRec.svc_yys_cnt%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.buy_clsf%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.aset_stat%>
<%= curlistRec.aset_stat_nm%>
<%= curlistRec.acqr_dt%>
<%= curlistRec.orgin_acqr_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.cur_acqr_amt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.bund_cd%>
<%= curlistRec.bund_nm%>
<%= curlistRec.aset_size%>
<%= curlistRec.aset_loca%>
<%= curlistRec.aset_qunt_cnt%>
<%= curlistRec.aset_usag%>
<%= curlistRec.aset_grp_yn%>
<%= curlistRec.phot_yn%>
<%= curlistRec.sale_dt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.redm_dt%>
<%= curlistRec.cur_redm_agg_amt%>
<%= curlistRec.tot_redm_amt%>
<%= curlistRec.rem_amt%>
<%= curlistRec.un_redm_amt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.eis_aset_clsf%>
<%= curlistRec.insr_type_cd%>
<%= curlistRec.use_emp_no%>
<%= curlistRec.use_emp_nm%>
<%= curlistRec.use_cmpy_nm%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.use_cmpy_cd%>
<%= curlistRec.mst_remk%>
<%= curlistRec.mst_chnl_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 17:00:57 KST 2015 */
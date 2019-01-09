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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_1001_LDataSet(){}
	public MC_BUDG_1001_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_1001_LCURLISTRecord rec = new MC_BUDG_1001_LCURLISTRecord();
			rec.budg_clas_cd = Util.checkString(rset0.getString("budg_clas_cd"));
			rec.prt_clsf_cd = Util.checkString(rset0.getString("prt_clsf_cd"));
			rec.gf_commcdnm_prt_clsf_cd = Util.checkString(rset0.getString("gf_commcdnm_prt_clsf_cd"));
			rec.budg_type_cd = Util.checkString(rset0.getString("budg_type_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.budg_abrv_nm = Util.checkString(rset0.getString("budg_abrv_nm"));
			rec.clas_cd1 = Util.checkString(rset0.getString("clas_cd1"));
			rec.yf_brnm_budg_clas_cd1 = Util.checkString(rset0.getString("yf_brnm_budg_clas_cd1"));
			rec.clas_cd2 = Util.checkString(rset0.getString("clas_cd2"));
			rec.yf_budg_clas_cd2 = Util.checkString(rset0.getString("yf_budg_clas_cd2"));
			rec.clas_cd3 = Util.checkString(rset0.getString("clas_cd3"));
			rec.yf_budg_clas_cd3 = Util.checkString(rset0.getString("yf_budg_clas_cd3"));
			rec.clas_cd4 = Util.checkString(rset0.getString("clas_cd4"));
			rec.yf_budg_clas_cd4 = Util.checkString(rset0.getString("yf_budg_clas_cd4"));
			rec.gain_reso_yn = Util.checkString(rset0.getString("gain_reso_yn"));
			rec.cyov_yn = Util.checkString(rset0.getString("cyov_yn"));
			rec.lesd_yn = Util.checkString(rset0.getString("lesd_yn"));
			rec.advc_cndt_yn = Util.checkString(rset0.getString("advc_cndt_yn"));
			rec.limt_chk_yn = Util.checkString(rset0.getString("limt_chk_yn"));
			rec.posbfee_yn = Util.checkString(rset0.getString("posbfee_yn"));
			rec.fixfee_yn = Util.checkString(rset0.getString("fixfee_yn"));
			rec.medi_dstb_cd = Util.checkString(rset0.getString("medi_dstb_cd"));
			rec.gf_commcdnm_medi_dstb_cd = Util.checkString(rset0.getString("gf_commcdnm_medi_dstb_cd"));
			rec.whco_ndstb_cd = Util.checkString(rset0.getString("whco_ndstb_cd"));
			rec.gf_commcdnm_ycjsbbcd = Util.checkString(rset0.getString("gf_commcdnm_ycjsbbcd"));
			rec.whco_comn_cost_yn = Util.checkString(rset0.getString("whco_comn_cost_yn"));
			rec.via_dept_cd = Util.checkString(rset0.getString("via_dept_cd"));
			rec.if_buseonm_dept_cd = Util.checkString(rset0.getString("if_buseonm_dept_cd"));
			rec.dstb_acct_cd = Util.checkString(rset0.getString("dstb_acct_cd"));
			rec.drcr_bal_clsf = Util.checkString(rset0.getString("drcr_bal_clsf"));
			rec.use_bgn_dt = Util.checkString(rset0.getString("use_bgn_dt"));
			rec.use_end_dt = Util.checkString(rset0.getString("use_end_dt"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.ycentdate = Util.checkString(rset0.getString("ycentdate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_1001_LDataSet ds = (MC_BUDG_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_1001_LCURLISTRecord curlistRec = (MC_BUDG_1001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_clas_cd%>
<%= curlistRec.prt_clsf_cd%>
<%= curlistRec.gf_commcdnm_prt_clsf_cd%>
<%= curlistRec.budg_type_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.budg_abrv_nm%>
<%= curlistRec.clas_cd1%>
<%= curlistRec.yf_brnm_budg_clas_cd1%>
<%= curlistRec.clas_cd2%>
<%= curlistRec.yf_budg_clas_cd2%>
<%= curlistRec.clas_cd3%>
<%= curlistRec.yf_budg_clas_cd3%>
<%= curlistRec.clas_cd4%>
<%= curlistRec.yf_budg_clas_cd4%>
<%= curlistRec.gain_reso_yn%>
<%= curlistRec.cyov_yn%>
<%= curlistRec.lesd_yn%>
<%= curlistRec.advc_cndt_yn%>
<%= curlistRec.limt_chk_yn%>
<%= curlistRec.posbfee_yn%>
<%= curlistRec.fixfee_yn%>
<%= curlistRec.medi_dstb_cd%>
<%= curlistRec.gf_commcdnm_medi_dstb_cd%>
<%= curlistRec.whco_ndstb_cd%>
<%= curlistRec.gf_commcdnm_ycjsbbcd%>
<%= curlistRec.whco_comn_cost_yn%>
<%= curlistRec.via_dept_cd%>
<%= curlistRec.if_buseonm_dept_cd%>
<%= curlistRec.dstb_acct_cd%>
<%= curlistRec.drcr_bal_clsf%>
<%= curlistRec.use_bgn_dt%>
<%= curlistRec.use_end_dt%>
<%= curlistRec.use_yn%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.ycentdate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 09:55:26 KST 2009 */
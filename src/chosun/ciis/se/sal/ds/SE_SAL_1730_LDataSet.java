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


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1730_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList alllist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String trsmy_cnt;
	public String trsmn_cnt;

	public SE_SAL_1730_LDataSet(){}
	public SE_SAL_1730_LDataSet(String errcode, String errmsg, String trsmy_cnt, String trsmn_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.trsmy_cnt = trsmy_cnt;
		this.trsmn_cnt = trsmn_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTrsmy_cnt(String trsmy_cnt){
		this.trsmy_cnt = trsmy_cnt;
	}

	public void setTrsmn_cnt(String trsmn_cnt){
		this.trsmn_cnt = trsmn_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTrsmy_cnt(){
		return this.trsmy_cnt;
	}

	public String getTrsmn_cnt(){
		return this.trsmn_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.trsmy_cnt = Util.checkString(cstmt.getString(10));
		this.trsmn_cnt = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_SAL_1730_LALLLISTRecord rec = new SE_SAL_1730_LALLLISTRecord();
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.bns_sale_amt = Util.checkString(rset0.getString("bns_sale_amt"));
			rec.bns_vat_amt = Util.checkString(rset0.getString("bns_vat_amt"));
			rec.sum_amt = Util.checkString(rset0.getString("sum_amt"));
			rec.elec_trsm_yn = Util.checkString(rset0.getString("elec_trsm_yn"));
			rec.area_srt_seq = Util.checkString(rset0.getString("area_srt_seq"));
			rec.jd_addr = Util.checkString(rset0.getString("jd_addr"));
			rec.jd_dtls_addr = Util.checkString(rset0.getString("jd_dtls_addr"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.tel = Util.checkString(rset0.getString("tel"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.vitl_acct_no = Util.checkString(rset0.getString("vitl_acct_no"));
			rec.prvmm_dd_tot_shet_qty_110 = Util.checkString(rset0.getString("prvmm_dd_tot_shet_qty_110"));
			rec.prvmm_sale_amt_110 = Util.checkString(rset0.getString("prvmm_sale_amt_110"));
			rec.prvmm_dd_tot_shet_qty_130 = Util.checkString(rset0.getString("prvmm_dd_tot_shet_qty_130"));
			rec.prvmm_sale_amt_130 = Util.checkString(rset0.getString("prvmm_sale_amt_130"));
			rec.prvmm_dd_tot_shet_qty_210 = Util.checkString(rset0.getString("prvmm_dd_tot_shet_qty_210"));
			rec.prvmm_sale_amt_210 = Util.checkString(rset0.getString("prvmm_sale_amt_210"));
			rec.nxt_qty_110 = Util.checkString(rset0.getString("nxt_qty_110"));
			rec.prvmm_sale_amt = Util.checkString(rset0.getString("prvmm_sale_amt"));
			rec.prvmm_fpymt_amt = Util.checkString(rset0.getString("prvmm_fpymt_amt"));
			rec.prvmm_clam_amt = Util.checkString(rset0.getString("prvmm_clam_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.un_pymt_amt = Util.checkString(rset0.getString("un_pymt_amt"));
			rec.clam_amt = Util.checkString(rset0.getString("clam_amt"));
			rec.cntr_gurt_amt_stot = Util.checkString(rset0.getString("cntr_gurt_amt_stot"));
			rec.prvmm_sum_rcpm_amt = Util.checkString(rset0.getString("prvmm_sum_rcpm_amt"));
			rec.prvmm_rcpm_amt = Util.checkString(rset0.getString("prvmm_rcpm_amt"));
			rec.trgt_rcpm_amt = Util.checkString(rset0.getString("trgt_rcpm_amt"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			this.alllist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_1730_LDataSet ds = (SE_SAL_1730_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.alllist.size(); i++){
		SE_SAL_1730_LALLLISTRecord alllistRec = (SE_SAL_1730_LALLLISTRecord)ds.alllist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTrsmy_cnt()%>
<%= ds.getTrsmn_cnt()%>
<%= ds.getAlllist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= alllistRec.bo_cd%>
<%= alllistRec.bo_seq%>
<%= alllistRec.dept_cd%>
<%= alllistRec.dept_nm%>
<%= alllistRec.part_cd%>
<%= alllistRec.part_nm%>
<%= alllistRec.area_cd%>
<%= alllistRec.area_nm%>
<%= alllistRec.bo_nm%>
<%= alllistRec.sale_amt%>
<%= alllistRec.bns_sale_amt%>
<%= alllistRec.bns_vat_amt%>
<%= alllistRec.sum_amt%>
<%= alllistRec.elec_trsm_yn%>
<%= alllistRec.area_srt_seq%>
<%= alllistRec.jd_addr%>
<%= alllistRec.jd_dtls_addr%>
<%= alllistRec.bo_head_nm%>
<%= alllistRec.tel%>
<%= alllistRec.zip%>
<%= alllistRec.vitl_acct_no%>
<%= alllistRec.prvmm_dd_tot_shet_qty_110%>
<%= alllistRec.prvmm_sale_amt_110%>
<%= alllistRec.prvmm_dd_tot_shet_qty_130%>
<%= alllistRec.prvmm_sale_amt_130%>
<%= alllistRec.prvmm_dd_tot_shet_qty_210%>
<%= alllistRec.prvmm_sale_amt_210%>
<%= alllistRec.nxt_qty_110%>
<%= alllistRec.prvmm_sale_amt%>
<%= alllistRec.prvmm_fpymt_amt%>
<%= alllistRec.prvmm_clam_amt%>
<%= alllistRec.rcpm_amt%>
<%= alllistRec.un_pymt_amt%>
<%= alllistRec.clam_amt%>
<%= alllistRec.cntr_gurt_amt_stot%>
<%= alllistRec.prvmm_sum_rcpm_amt%>
<%= alllistRec.prvmm_rcpm_amt%>
<%= alllistRec.trgt_rcpm_amt%>
<%= alllistRec.ern%>
<%= alllistRec.yymm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 09:44:11 KST 2009 */
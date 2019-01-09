/***************************************************************************************************
* 파일명 : .java
* 기능 :  자산 - 임대사업 - 임대계약관리
* 작성일자 : 2010-08-13
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 임대인 연락처  및 미수정보 추가 
* 수정자 : 노상현
* 수정일자 : 2011-03-29
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 재무회계 - 부가세관리 - 세금계산서 조회
 */


public class AS_LEAS_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1102_LDataSet(){}
	public AS_LEAS_1102_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			AS_LEAS_1102_LCURLISTRecord rec = new AS_LEAS_1102_LCURLISTRecord();
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.bldg_cd_nm = Util.checkString(rset0.getString("bldg_cd_nm"));
			rec.ser_no = Util.checkString(rset0.getString("ser_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.leas_area_size = Util.checkString(rset0.getString("leas_area_size"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			rec.cntr_star = Util.checkString(rset0.getString("cntr_star"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.leas_clam_cycl = Util.checkString(rset0.getString("leas_clam_cycl"));
			rec.cntr_mang_amt = Util.checkString(rset0.getString("cntr_mang_amt"));
			rec.mang_clam_cycl = Util.checkString(rset0.getString("mang_clam_cycl"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.gurt_tot_amt = Util.checkString(rset0.getString("gurt_tot_amt"));
			rec.gurt_out_amt = Util.checkString(rset0.getString("gurt_out_amt"));
			rec.gurt_amt = Util.checkString(rset0.getString("gurt_amt"));
			rec.ref_cntr_no = Util.checkString(rset0.getString("ref_cntr_no"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.draft_no = Util.checkString(rset0.getString("draft_no"));
			rec.rcpm_amt_end = Util.checkString(rset0.getString("rcpm_amt_end"));
			rec.leas_cntr_dt = Util.checkString(rset0.getString("leas_cntr_dt"));
			rec.last_leas_clam_dt = Util.checkString(rset0.getString("last_leas_clam_dt"));
			rec.midw_expy_dt = Util.checkString(rset0.getString("midw_expy_dt"));
			rec.last_mang_clam_dt = Util.checkString(rset0.getString("last_mang_clam_dt"));
			rec.precpt_tot_amt = Util.checkString(rset0.getString("precpt_tot_amt"));
			rec.end_clsf = Util.checkString(rset0.getString("end_clsf"));
			rec.precpt_out_amt = Util.checkString(rset0.getString("precpt_out_amt"));
			rec.precpt_amt = Util.checkString(rset0.getString("precpt_amt"));
			rec.pymt_clsf = Util.checkString(rset0.getString("pymt_clsf"));
			rec.expy_remk = Util.checkString(rset0.getString("expy_remk"));
			rec.good_clsf = Util.checkString(rset0.getString("good_clsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.aset_addr = Util.checkString(rset0.getString("aset_addr"));
			rec.gurt_dlco_ern = Util.checkString(rset0.getString("gurt_dlco_ern"));
			rec.gurt_dlco_nm = Util.checkString(rset0.getString("gurt_dlco_nm"));
			rec.ref_cntr_nm = Util.checkString(rset0.getString("ref_cntr_nm"));
			rec.leas_dlco_ern = Util.checkString(rset0.getString("leas_dlco_ern"));
			rec.leas_ern_nm = Util.checkString(rset0.getString("leas_ern_nm"));
			rec.hire_dlco_clsf_cd = Util.checkString(rset0.getString("hire_dlco_clsf_cd"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.vat_non_yn = Util.checkString(rset0.getString("vat_non_yn"));
			rec.frex_rcpm_yn = Util.checkString(rset0.getString("frex_rcpm_yn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.leas_telno1 = Util.checkString(rset0.getString("leas_telno1"));
			rec.leas_telno2 = Util.checkString(rset0.getString("leas_telno2"));
			rec.leas_telno3 = Util.checkString(rset0.getString("leas_telno3"));
			rec.unrcpm_info = Util.checkString(rset0.getString("unrcpm_info"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1102_LDataSet ds = (AS_LEAS_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAS_1102_LCURLISTRecord curlistRec = (AS_LEAS_1102_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cntr_no%>
<%= curlistRec.bldg_cd_nm%>
<%= curlistRec.ser_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.leas_area_size%>
<%= curlistRec.leas_fr_dt%>
<%= curlistRec.leas_to_dt%>
<%= curlistRec.cntr_star%>
<%= curlistRec.cntr_leas_amt%>
<%= curlistRec.leas_clam_cycl%>
<%= curlistRec.cntr_mang_amt%>
<%= curlistRec.mang_clam_cycl%>
<%= curlistRec.tot_amt%>
<%= curlistRec.cntr_gurt_amt%>
<%= curlistRec.gurt_tot_amt%>
<%= curlistRec.gurt_out_amt%>
<%= curlistRec.gurt_amt%>
<%= curlistRec.ref_cntr_no%>
<%= curlistRec.bldg_cd%>
<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.draft_no%>
<%= curlistRec.rcpm_amt_end%>
<%= curlistRec.leas_cntr_dt%>
<%= curlistRec.last_leas_clam_dt%>
<%= curlistRec.midw_expy_dt%>
<%= curlistRec.last_mang_clam_dt%>
<%= curlistRec.precpt_tot_amt%>
<%= curlistRec.end_clsf%>
<%= curlistRec.precpt_out_amt%>
<%= curlistRec.precpt_amt%>
<%= curlistRec.pymt_clsf%>
<%= curlistRec.expy_remk%>
<%= curlistRec.good_clsf%>
<%= curlistRec.remk%>
<%= curlistRec.aset_addr%>
<%= curlistRec.gurt_dlco_ern%>
<%= curlistRec.gurt_dlco_nm%>
<%= curlistRec.ref_cntr_nm%>
<%= curlistRec.leas_dlco_ern%>
<%= curlistRec.leas_ern_nm%>
<%= curlistRec.hire_dlco_clsf_cd%>
<%= curlistRec.hire_dlco_ern%>
<%= curlistRec.hire_dlco_nm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.cntr_yy%>
<%= curlistRec.cntr_seq%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.vat_non_yn%>
<%= curlistRec.frex_rcpm_yn%>
<%= curlistRec.email%>
<%= curlistRec.leas_telno1%>
<%= curlistRec.leas_telno2%>
<%= curlistRec.leas_telno3%>
<%= curlistRec.unrcpm_info%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 29 11:38:47 KST 2011 */
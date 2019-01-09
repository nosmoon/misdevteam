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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_4301_LDataSet(){}
	public HD_SALY_4301_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_SALY_4301_LCURLISTRecord rec = new HD_SALY_4301_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.acpn_yy = Util.checkString(rset0.getString("acpn_yy"));
			rec.acpn_seq = Util.checkString(rset0.getString("acpn_seq"));
			rec.acpn_dt = Util.checkString(rset0.getString("acpn_dt"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.now_seiz_clsf = Util.checkString(rset0.getString("now_seiz_clsf"));
			rec.fst_seiz_clsf = Util.checkString(rset0.getString("fst_seiz_clsf"));
			rec.seiz_deci_dt = Util.checkString(rset0.getString("seiz_deci_dt"));
			rec.seiz_clsf_chg_dt = Util.checkString(rset0.getString("seiz_clsf_chg_dt"));
			rec.crdtor = Util.checkString(rset0.getString("crdtor"));
			rec.seiz_clam_amt = Util.checkString(rset0.getString("seiz_clam_amt"));
			rec.seiz_dduc_ratio = Util.checkString(rset0.getString("seiz_dduc_ratio"));
			rec.seiz_bgn_saly_yy = Util.checkString(rset0.getString("seiz_bgn_saly_yy"));
			rec.seiz_bgn_saly_no = Util.checkString(rset0.getString("seiz_bgn_saly_no"));
			rec.dduc_amt_agg = Util.checkString(rset0.getString("dduc_amt_agg"));
			rec.repay_amt_agg = Util.checkString(rset0.getString("repay_amt_agg"));
			rec.psdo_seiz_rels_dt = Util.checkString(rset0.getString("psdo_seiz_rels_dt"));
			rec.dduc_end_yn = Util.checkString(rset0.getString("dduc_end_yn"));
			rec.dduc_end_dt = Util.checkString(rset0.getString("dduc_end_dt"));
			rec.repay_end_yn = Util.checkString(rset0.getString("repay_end_yn"));
			rec.repay_end_dt = Util.checkString(rset0.getString("repay_end_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_4301_LDataSet ds = (HD_SALY_4301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_4301_LCURLISTRecord curlistRec = (HD_SALY_4301_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.acpn_yy%>
<%= curlistRec.acpn_seq%>
<%= curlistRec.acpn_dt%>
<%= curlistRec.flnm%>
<%= curlistRec.now_seiz_clsf%>
<%= curlistRec.fst_seiz_clsf%>
<%= curlistRec.seiz_deci_dt%>
<%= curlistRec.seiz_clsf_chg_dt%>
<%= curlistRec.crdtor%>
<%= curlistRec.seiz_clam_amt%>
<%= curlistRec.seiz_dduc_ratio%>
<%= curlistRec.seiz_bgn_saly_yy%>
<%= curlistRec.seiz_bgn_saly_no%>
<%= curlistRec.dduc_amt_agg%>
<%= curlistRec.repay_amt_agg%>
<%= curlistRec.psdo_seiz_rels_dt%>
<%= curlistRec.dduc_end_yn%>
<%= curlistRec.dduc_end_dt%>
<%= curlistRec.repay_end_yn%>
<%= curlistRec.repay_end_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 13:20:16 KST 2009 */
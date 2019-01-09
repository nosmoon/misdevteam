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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_1710_LDataSet(){}
	public IS_BAS_1710_LDataSet(String errcode, String errmsg){
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
			IS_BAS_1710_LCURLISTRecord rec = new IS_BAS_1710_LCURLISTRecord();
			rec.cntr_stat_clsf_nm = Util.checkString(rset0.getString("cntr_stat_clsf_nm"));
			rec.dlco_cd_seq = Util.checkString(rset0.getString("dlco_cd_seq"));
			rec.asnt_dstc_cd = Util.checkString(rset0.getString("asnt_dstc_cd"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.adms_dstc_cd = Util.checkString(rset0.getString("adms_dstc_cd"));
			rec.adms_dstc_cdd_nm = Util.checkString(rset0.getString("adms_dstc_cdd_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.jurs_dong_nm = Util.checkString(rset0.getString("jurs_dong_nm"));
			rec.jurs_apt = Util.checkString(rset0.getString("jurs_apt"));
			rec.leaf_addr = Util.checkString(rset0.getString("leaf_addr"));
			rec.job_ptph_no = Util.checkString(rset0.getString("job_ptph_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.setl_bank_nm = Util.checkString(rset0.getString("setl_bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.rcpm_main_nm = Util.checkString(rset0.getString("rcpm_main_nm"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_1710_LDataSet ds = (IS_BAS_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_1710_LCURLISTRecord curlistRec = (IS_BAS_1710_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cntr_stat_clsf_nm%>
<%= curlistRec.dlco_cd_seq%>
<%= curlistRec.asnt_dstc_cd%>
<%= curlistRec.asnt_dstc_cd_nm%>
<%= curlistRec.adms_dstc_cd%>
<%= curlistRec.adms_dstc_cdd_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.ptph_no%>
<%= curlistRec.addr%>
<%= curlistRec.jurs_dong_nm%>
<%= curlistRec.jurs_apt%>
<%= curlistRec.leaf_addr%>
<%= curlistRec.job_ptph_no%>
<%= curlistRec.ern%>
<%= curlistRec.setl_bank_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.rcpm_main_nm%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 27 10:12:01 KST 2012 */
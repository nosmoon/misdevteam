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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1203_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1203_LDataSet(){}
	public AS_LEAS_1203_LDataSet(String errcode, String errmsg){
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
			AS_LEAS_1203_LCURLIST1Record rec = new AS_LEAS_1203_LCURLIST1Record();
			rec.clam_star = Util.checkString(rset0.getString("clam_star"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.bldg_clsf = Util.checkString(rset0.getString("bldg_clsf"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.cntr_star_nm = Util.checkString(rset0.getString("cntr_star_nm"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.cntr_mang_amt = Util.checkString(rset0.getString("cntr_mang_amt"));
			rec.leas_clam_amt = Util.checkString(rset0.getString("leas_clam_amt"));
			rec.mang_clam_amt = Util.checkString(rset0.getString("mang_clam_amt"));
			rec.vat_clam_amt = Util.checkString(rset0.getString("vat_clam_amt"));
			rec.leas_clam_cycl = Util.checkString(rset0.getString("leas_clam_cycl"));
			rec.mang_clam_cycl = Util.checkString(rset0.getString("mang_clam_cycl"));
			rec.last_leas_clam_dt = Util.checkString(rset0.getString("last_leas_clam_dt"));
			rec.last_mang_clam_dt = Util.checkString(rset0.getString("last_mang_clam_dt"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.cntr_star = Util.checkString(rset0.getString("cntr_star"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1203_LDataSet ds = (AS_LEAS_1203_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_LEAS_1203_LCURLIST1Record curlist1Rec = (AS_LEAS_1203_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.clam_star%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.bldg_clsf%>
<%= curlist1Rec.cntr_yy%>
<%= curlist1Rec.cntr_seq%>
<%= curlist1Rec.cntr_no%>
<%= curlist1Rec.cntr_star_nm%>
<%= curlist1Rec.hire_dlco_ern%>
<%= curlist1Rec.hire_dlco_nm%>
<%= curlist1Rec.leas_fr_dt%>
<%= curlist1Rec.leas_to_dt%>
<%= curlist1Rec.cntr_leas_amt%>
<%= curlist1Rec.cntr_mang_amt%>
<%= curlist1Rec.leas_clam_amt%>
<%= curlist1Rec.mang_clam_amt%>
<%= curlist1Rec.vat_clam_amt%>
<%= curlist1Rec.leas_clam_cycl%>
<%= curlist1Rec.mang_clam_cycl%>
<%= curlist1Rec.last_leas_clam_dt%>
<%= curlist1Rec.last_mang_clam_dt%>
<%= curlist1Rec.bldg_cd%>
<%= curlist1Rec.cntr_star%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 16:51:33 KST 2009 */
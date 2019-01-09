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


package chosun.ciis.as.lear.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 
 */


public class AS_LEAR_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAR_1201_LDataSet(){}
	public AS_LEAR_1201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AS_LEAR_1201_LCURLIST1Record rec = new AS_LEAR_1201_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.ser_no = Util.checkString(rset0.getString("ser_no"));
			rec.leas_area_size = Util.checkString(rset0.getString("leas_area_size"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.clam_yymm = Util.checkString(rset0.getString("clam_yymm"));
			rec.leas_clam_amt = Util.checkString(rset0.getString("leas_clam_amt"));
			rec.mang_clam_amt = Util.checkString(rset0.getString("mang_clam_amt"));
			rec.vat_clam_amt = Util.checkString(rset0.getString("vat_clam_amt"));
			rec.clam_tot_amt = Util.checkString(rset0.getString("clam_tot_amt"));
			rec.rcpm_tot_amt = Util.checkString(rset0.getString("rcpm_tot_amt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.hire_dlco_ern_nm = Util.checkString(rset0.getString("hire_dlco_ern_nm"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.cntr_mang_amt = Util.checkString(rset0.getString("cntr_mang_amt"));
			rec.cntr_star_nm = Util.checkString(rset0.getString("cntr_star_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAR_1201_LDataSet ds = (AS_LEAR_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_LEAR_1201_LCURLIST1Record curlist1Rec = (AS_LEAR_1201_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.cntr_no%>
<%= curlist1Rec.ser_no%>
<%= curlist1Rec.leas_area_size%>
<%= curlist1Rec.bldg_cd%>
<%= curlist1Rec.cntr_yy%>
<%= curlist1Rec.cntr_seq%>
<%= curlist1Rec.clam_yymm%>
<%= curlist1Rec.leas_clam_amt%>
<%= curlist1Rec.mang_clam_amt%>
<%= curlist1Rec.vat_clam_amt%>
<%= curlist1Rec.clam_tot_amt%>
<%= curlist1Rec.rcpm_tot_amt%>
<%= curlist1Rec.misu_amt%>
<%= curlist1Rec.bldg_nm%>
<%= curlist1Rec.hire_dlco_ern%>
<%= curlist1Rec.hire_dlco_ern_nm%>
<%= curlist1Rec.leas_fr_dt%>
<%= curlist1Rec.leas_to_dt%>
<%= curlist1Rec.cntr_gurt_amt%>
<%= curlist1Rec.cntr_leas_amt%>
<%= curlist1Rec.cntr_mang_amt%>
<%= curlist1Rec.cntr_star_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 14:33:48 KST 2009 */
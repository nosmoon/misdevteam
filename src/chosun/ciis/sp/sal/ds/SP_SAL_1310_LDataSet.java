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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1310_LDataSet(){}
	public SP_SAL_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SP_SAL_1310_LCURLIST1Record rec = new SP_SAL_1310_LCURLIST1Record();
			rec.sell_dept_nm = Util.checkString(rset0.getString("sell_dept_nm"));
			rec.sell_area_cd = Util.checkString(rset0.getString("sell_area_cd"));
			rec.sell_area_nm = Util.checkString(rset0.getString("sell_area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.acol_no = Util.checkString(rset0.getString("acol_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.clam_apt = Util.checkString(rset0.getString("clam_apt"));
			rec.clam_hous = Util.checkString(rset0.getString("clam_hous"));
			rec.clam_shop_etc = Util.checkString(rset0.getString("clam_shop_etc"));
			rec.clam_tot = Util.checkString(rset0.getString("clam_tot"));
			rec.ufth_apt = Util.checkString(rset0.getString("ufth_apt"));
			rec.ufth_hous = Util.checkString(rset0.getString("ufth_hous"));
			rec.ufth_shop_etc = Util.checkString(rset0.getString("ufth_shop_etc"));
			rec.ufth_tot = Util.checkString(rset0.getString("ufth_tot"));
			rec.cnfm_apt = Util.checkString(rset0.getString("cnfm_apt"));
			rec.cnfm_hous = Util.checkString(rset0.getString("cnfm_hous"));
			rec.cnfm_shop_etc = Util.checkString(rset0.getString("cnfm_shop_etc"));
			rec.cnfm_tot = Util.checkString(rset0.getString("cnfm_tot"));
			rec.alon_clam_qty = Util.checkString(rset0.getString("alon_clam_qty"));
			rec.rdr_extn_alon = Util.checkString(rset0.getString("rdr_extn_alon"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1310_LDataSet ds = (SP_SAL_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_1310_LCURLIST1Record curlist1Rec = (SP_SAL_1310_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.sell_dept_nm%>
<%= curlist1Rec.sell_area_cd%>
<%= curlist1Rec.sell_area_nm%>
<%= curlist1Rec.bo_nm%>
<%= curlist1Rec.acol_no%>
<%= curlist1Rec.dlco_no%>
<%= curlist1Rec.clam_apt%>
<%= curlist1Rec.clam_hous%>
<%= curlist1Rec.clam_shop_etc%>
<%= curlist1Rec.clam_tot%>
<%= curlist1Rec.ufth_apt%>
<%= curlist1Rec.ufth_hous%>
<%= curlist1Rec.ufth_shop_etc%>
<%= curlist1Rec.ufth_tot%>
<%= curlist1Rec.cnfm_apt%>
<%= curlist1Rec.cnfm_hous%>
<%= curlist1Rec.cnfm_shop_etc%>
<%= curlist1Rec.cnfm_tot%>
<%= curlist1Rec.alon_clam_qty%>
<%= curlist1Rec.rdr_extn_alon%>
<%= curlist1Rec.pay_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 13 18:18:02 KST 2012 */
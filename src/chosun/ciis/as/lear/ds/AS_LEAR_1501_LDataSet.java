/***************************************************************************************************
* 파일명 : .java
* 기능 :  자산 - 임대사업 - 임대사업조회 - 임대사업현황
* 작성일자 : 2011-03-30
* 작성자 : 노상현
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
 * 자산 - 임대사업 - 임대사업조회 - 임대사업현황
 */


public class AS_LEAR_1501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAR_1501_LDataSet(){}
	public AS_LEAR_1501_LDataSet(String errcode, String errmsg){
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
			AS_LEAR_1501_LCURLIST1Record rec = new AS_LEAR_1501_LCURLIST1Record();
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			rec.leas_area_size = Util.checkString(rset0.getString("leas_area_size"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.cntr_mang_amt = Util.checkString(rset0.getString("cntr_mang_amt"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.leas_amt_tot = Util.checkString(rset0.getString("leas_amt_tot"));
			rec.mon_clam_amt = Util.checkString(rset0.getString("mon_clam_amt"));
			rec.year_clam_amt1 = Util.checkString(rset0.getString("year_clam_amt1"));
			rec.year_clam_amt2 = Util.checkString(rset0.getString("year_clam_amt2"));
			rec.cntr_star_nm = Util.checkString(rset0.getString("cntr_star_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAR_1501_LDataSet ds = (AS_LEAR_1501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_LEAR_1501_LCURLIST1Record curlist1Rec = (AS_LEAR_1501_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.bldg_nm%>
<%= curlist1Rec.hire_dlco_nm%>
<%= curlist1Rec.addr%>
<%= curlist1Rec.leas_fr_dt%>
<%= curlist1Rec.leas_to_dt%>
<%= curlist1Rec.leas_area_size%>
<%= curlist1Rec.cntr_leas_amt%>
<%= curlist1Rec.cntr_mang_amt%>
<%= curlist1Rec.cntr_gurt_amt%>
<%= curlist1Rec.leas_amt_tot%>
<%= curlist1Rec.mon_clam_amt%>
<%= curlist1Rec.year_clam_amt1%>
<%= curlist1Rec.year_clam_amt2%>
<%= curlist1Rec.cntr_star_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 30 21:01:21 KST 2011 */
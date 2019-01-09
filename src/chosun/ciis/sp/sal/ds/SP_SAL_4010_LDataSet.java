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


public class SP_SAL_4010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_4010_LDataSet(){}
	public SP_SAL_4010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SP_SAL_4010_LCURLIST1Record rec = new SP_SAL_4010_LCURLIST1Record();
			rec.sale_yymm = Util.checkString(rset0.getString("sale_yymm"));
			rec.sale_seq = Util.checkString(rset0.getString("sale_seq"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sale_item_cd = Util.checkString(rset0.getString("sale_item_cd"));
			rec.sale_item_cd_nm = Util.checkString(rset0.getString("sale_item_cd_nm"));
			rec.vat_flag = Util.checkString(rset0.getString("vat_flag"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.tot_rvord_amt = Util.checkString(rset0.getString("tot_rvord_amt"));
			rec.sale_cost = Util.checkString(rset0.getString("sale_cost"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_4010_LDataSet ds = (SP_SAL_4010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_4010_LCURLIST1Record curlist1Rec = (SP_SAL_4010_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.sale_yymm%>
<%= curlist1Rec.sale_seq%>
<%= curlist1Rec.dlco_no%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.sale_item_cd%>
<%= curlist1Rec.sale_item_cd_nm%>
<%= curlist1Rec.vat_flag%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.uprc%>
<%= curlist1Rec.suply_amt%>
<%= curlist1Rec.vat_amt%>
<%= curlist1Rec.tot_rvord_amt%>
<%= curlist1Rec.sale_cost%>
<%= curlist1Rec.rcpm_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 09 11:24:21 KST 2013 */
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


public class SP_SAL_3310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_3310_LDataSet(){}
	public SP_SAL_3310_LDataSet(String errcode, String errmsg){
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
			SP_SAL_3310_LCURLISTRecord rec = new SP_SAL_3310_LCURLISTRecord();
			rec.suply_pers_nm = Util.checkString(rset0.getString("suply_pers_nm"));
			rec.doco_no = Util.checkString(rset0.getString("doco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.sp_comp_chrg_pers_emp_nm = Util.checkString(rset0.getString("sp_comp_chrg_pers_emp_nm"));
			rec.gds_nm = Util.checkString(rset0.getString("gds_nm"));
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.buy_unit_price = Util.checkString(rset0.getString("buy_unit_price"));
			rec.buy_amt = Util.checkString(rset0.getString("buy_amt"));
			rec.buy_vat_amt = Util.checkString(rset0.getString("buy_vat_amt"));
			rec.btot_amt = Util.checkString(rset0.getString("btot_amt"));
			rec.sale_unit_price = Util.checkString(rset0.getString("sale_unit_price"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.sale_vat_amt = Util.checkString(rset0.getString("sale_vat_amt"));
			rec.stot_amt = Util.checkString(rset0.getString("stot_amt"));
			rec.profit_amt = Util.checkString(rset0.getString("profit_amt"));
			rec.profit_rate = Util.checkString(rset0.getString("profit_rate"));
			rec.clamt = Util.checkString(rset0.getString("clamt"));
			rec.mi_amt = Util.checkString(rset0.getString("mi_amt"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_3310_LDataSet ds = (SP_SAL_3310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_3310_LCURLISTRecord curlistRec = (SP_SAL_3310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.suply_pers_nm%>
<%= curlistRec.doco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.sp_comp_chrg_pers_emp_nm%>
<%= curlistRec.gds_nm%>
<%= curlistRec.ordr_dt%>
<%= curlistRec.qunt%>
<%= curlistRec.buy_unit_price%>
<%= curlistRec.buy_amt%>
<%= curlistRec.buy_vat_amt%>
<%= curlistRec.btot_amt%>
<%= curlistRec.sale_unit_price%>
<%= curlistRec.sale_amt%>
<%= curlistRec.sale_vat_amt%>
<%= curlistRec.stot_amt%>
<%= curlistRec.profit_amt%>
<%= curlistRec.profit_rate%>
<%= curlistRec.clamt%>
<%= curlistRec.mi_amt%>
<%= curlistRec.chrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 22 14:42:25 KST 2012 */
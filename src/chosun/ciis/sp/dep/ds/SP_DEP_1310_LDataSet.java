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


package chosun.ciis.sp.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.dep.dm.*;
import chosun.ciis.sp.dep.rec.*;

/**
 * 
 */


public class SP_DEP_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_DEP_1310_LDataSet(){}
	public SP_DEP_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SP_DEP_1310_LCURLISTRecord rec = new SP_DEP_1310_LCURLISTRecord();
			rec.sale_yymm = Util.checkString(rset0.getString("sale_yymm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.sale_item_cd_nm = Util.checkString(rset0.getString("sale_item_cd_nm"));
			rec.stot_amt = Util.checkString(rset0.getString("stot_amt"));
			rec.clamt = Util.checkString(rset0.getString("clamt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.sp_comp_chrg_pers_emp_nm = Util.checkString(rset0.getString("sp_comp_chrg_pers_emp_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_DEP_1310_LDataSet ds = (SP_DEP_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_DEP_1310_LCURLISTRecord curlistRec = (SP_DEP_1310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sale_yymm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.sale_item_cd_nm%>
<%= curlistRec.stot_amt%>
<%= curlistRec.clamt%>
<%= curlistRec.misu_amt%>
<%= curlistRec.sp_comp_chrg_pers_emp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 21 19:32:00 KST 2012 */
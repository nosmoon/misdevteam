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


public class SP_SAL_2610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_2610_LDataSet(){}
	public SP_SAL_2610_LDataSet(String errcode, String errmsg){
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
			SP_SAL_2610_LCURLISTRecord rec = new SP_SAL_2610_LCURLISTRecord();
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sale_item_cd_nm = Util.checkString(rset0.getString("sale_item_cd_nm"));
			rec.gds_nm = Util.checkString(rset0.getString("gds_nm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.stot_amt = Util.checkString(rset0.getString("stot_amt"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.sale_item_cd_sort = Util.checkString(rset0.getString("sale_item_cd_sort"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.sale_item_cd = Util.checkString(rset0.getString("sale_item_cd"));
			rec.rsort = Util.checkString(rset0.getString("rsort"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_2610_LDataSet ds = (SP_SAL_2610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_2610_LCURLISTRecord curlistRec = (SP_SAL_2610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ern%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.sale_item_cd_nm%>
<%= curlistRec.gds_nm%>
<%= curlistRec.qunt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.stot_amt%>
<%= curlistRec.presi_nm%>
<%= curlistRec.sale_item_cd_sort%>
<%= curlistRec.dept_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.sale_item_cd%>
<%= curlistRec.rsort%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 21 20:12:13 KST 2012 */
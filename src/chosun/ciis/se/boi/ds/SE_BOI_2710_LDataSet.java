/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2710_LDataSet(){}
	public SE_BOI_2710_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SE_BOI_2710_LCURLISTRecord rec = new SE_BOI_2710_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.rdr_qty = Util.checkString(rset0.getString("rdr_qty"));
			rec.vari_qty = Util.checkString(rset0.getString("vari_qty"));
			rec.extn_qty = Util.checkString(rset0.getString("extn_qty"));
			rec.susp_qty = Util.checkString(rset0.getString("susp_qty"));
			rec.clamt = Util.checkString(rset0.getString("clamt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.leaf_sales = Util.checkString(rset0.getString("leaf_sales"));
			rec.leaf_purc = Util.checkString(rset0.getString("leaf_purc"));
			rec.re_freeqty = Util.checkString(rset0.getString("re_freeqty"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2710_LDataSet ds = (SE_BOI_2710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2710_LCURLISTRecord curlistRec = (SE_BOI_2710_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.yymm%>
<%= curlistRec.rdr_qty%>
<%= curlistRec.vari_qty%>
<%= curlistRec.extn_qty%>
<%= curlistRec.susp_qty%>
<%= curlistRec.clamt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.leaf_sales%>
<%= curlistRec.leaf_purc%>
<%= curlistRec.re_freeqty%>
<%= curlistRec.meda_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 19 10:12:22 KST 2015 */
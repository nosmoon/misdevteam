/***************************************************************************************************
* 파일명 : SE_SAL_2210_LDataSet.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매체별매출현황
* 작성일자 : 2009-04-07
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_2210_LDataSet(){}
	public SE_SAL_2210_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SAL_2210_LCURLISTRecord rec = new SE_SAL_2210_LCURLISTRecord();
			rec.dept_nm 			= Util.checkString(rset0.getString("dept_nm"			));
			rec.sub_dept_cd 		= Util.checkString(rset0.getString("sub_dept_cd"		));
			rec.sub_dept_nm 		= Util.checkString(rset0.getString("sub_dept_nm"		));
			rec.area_cd 			= Util.checkString(rset0.getString("area_cd"			));
			rec.area_nm 			= Util.checkString(rset0.getString("area_nm"			));
			rec.bo_cd 				= Util.checkString(rset0.getString("bo_cd"				));
			rec.bo_nm 				= Util.checkString(rset0.getString("bo_nm"				));
			rec.bo_head_nm 			= Util.checkString(rset0.getString("bo_head_nm"			));
			rec.val_qty_110 		= Util.checkString(rset0.getString("val_qty_110"		));
			rec.sale_amt_110 		= Util.checkString(rset0.getString("sale_amt_110"		));
			rec.net_sale_amt_110 	= Util.checkString(rset0.getString("net_sale_amt_110"	));
			rec.val_qty_130 		= Util.checkString(rset0.getString("val_qty_130"		));
			rec.sale_amt_130 		= Util.checkString(rset0.getString("sale_amt_130"		));
			rec.net_sale_amt_130 	= Util.checkString(rset0.getString("net_sale_amt_130"	));
			rec.sale_amt 			= Util.checkString(rset0.getString("sale_amt"			));
			rec.net_sale_amt 		= Util.checkString(rset0.getString("net_sale_amt"		));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2210_LDataSet ds = (SE_SAL_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_2210_LCURLISTRecord curlistRec = (SE_SAL_2210_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.sub_dept_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.val_qty_110%>
<%= curlistRec.sale_amt_110%>
<%= curlistRec.net_sale_amt_110%>
<%= curlistRec.val_qty_130%>
<%= curlistRec.sale_amt_130%>
<%= curlistRec.net_sale_amt_130%>
<%= curlistRec.sale_amt%>
<%= curlistRec.net_sale_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 14:54:25 KST 2009 */
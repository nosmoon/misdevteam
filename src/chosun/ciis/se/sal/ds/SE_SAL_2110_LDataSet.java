/***************************************************************************************************
* 파일명 : SE_SAL_2110_LDataSet.java
* 기능 : 판매 - 지대관리 - 매출관리 - 순매출액산출현황
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


public class SE_SAL_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_2110_LDataSet(){}
	public SE_SAL_2110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 		= (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_SAL_2110_LCURLISTRecord rec = new SE_SAL_2110_LCURLISTRecord();
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			rec.sub_dept_cd 	= Util.checkString(rset0.getString("sub_dept_cd"	));
			rec.sub_dept_nm 	= Util.checkString(rset0.getString("sub_dept_nm"	));
			rec.area_cd 		= Util.checkString(rset0.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"		));
			rec.bo_cd 			= Util.checkString(rset0.getString("bo_cd"			));
			rec.bo_nm 			= Util.checkString(rset0.getString("bo_nm"			));
			rec.net_sale_amt 	= Util.checkString(rset0.getString("net_sale_amt"	));
			rec.val_qty 		= Util.checkString(rset0.getString("val_qty"		));
			rec.icdc_calc_qty 	= Util.checkString(rset0.getString("icdc_calc_qty"	));
			rec.spsl_qty 		= Util.checkString(rset0.getString("spsl_qty"		));
			rec.cntr_qty 		= Util.checkString(rset0.getString("cntr_qty"		));
			rec.basi_uprc 		= Util.checkString(rset0.getString("basi_uprc"		));
			rec.rdff_rdu_uprc 	= Util.checkString(rset0.getString("rdff_rdu_uprc"	));
			rec.cntr_uprc 		= Util.checkString(rset0.getString("cntr_uprc"		));
			rec.sale_amt 		= Util.checkString(rset0.getString("sale_amt"		));
			rec.fpymt_encur_amt = Util.checkString(rset0.getString("fpymt_encur_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2110_LDataSet ds = (SE_SAL_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_2110_LCURLISTRecord curlistRec = (SE_SAL_2110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.sub_dept_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.val_qty%>
<%= curlistRec.icdc_calc_qty%>
<%= curlistRec.spsl_qty%>
<%= curlistRec.cntr_qty%>
<%= curlistRec.basi_uprc%>
<%= curlistRec.rdff_rdu_uprc%>
<%= curlistRec.cntr_uprc%>
<%= curlistRec.sale_amt%>
<%= curlistRec.fpymt_encur_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 13:14:22 KST 2009 */
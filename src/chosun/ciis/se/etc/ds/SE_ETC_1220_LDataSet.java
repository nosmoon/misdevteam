/***************************************************************************************************
* 파일명 : SE_ETC_1220_LDataSet.java
* 기능 : 판매-기타관리-구독료 지급등록
* 작성일자 : 2009-03-05
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode	;
	public String errmsg	;

	public SE_ETC_1220_LDataSet(){}
	public SE_ETC_1220_LDataSet(String errcode, String errmsg){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
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
		ResultSet rset0	 		= (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_ETC_1220_LCURLISTRecord rec = new SE_ETC_1220_LCURLISTRecord();
			rec.yymm 			= Util.checkString(rset0.getString("yymm"			));
			rec.pay_seq 		= Util.checkString(rset0.getString("pay_seq"		));
			rec.pay_ptcr_seq 	= Util.checkString(rset0.getString("pay_ptcr_seq"	));
			rec.bo_cd 			= Util.checkString(rset0.getString("bo_cd"			));
			rec.bo_seq 			= Util.checkString(rset0.getString("bo_seq"			));
			rec.bo_nm 			= Util.checkString(rset0.getString("bo_nm"			));
			rec.recp_pers_nm 	= Util.checkString(rset0.getString("recp_pers_nm"	));
			rec.prn 			= Util.checkString(rset0.getString("prn"			));
			rec.qty 			= Util.checkString(rset0.getString("qty"			));
			rec.uprc 			= Util.checkString(rset0.getString("uprc"			));
			rec.amt 			= Util.checkString(rset0.getString("amt"			));
			rec.area_cd 		= Util.checkString(rset0.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"		));
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.supr_dept_nm 	= Util.checkString(rset0.getString("supr_dept_nm"	));
			rec.sub_dept_cd 	= Util.checkString(rset0.getString("sub_dept_cd"	));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			rec.acct_no 		= Util.checkString(rset0.getString("acct_no"		));
			rec.rcpm_main_nm 	= Util.checkString(rset0.getString("rcpm_main_nm"	));
			rec.setl_bank 		= Util.checkString(rset0.getString("setl_bank"		));
			rec.dlco_no 		= Util.checkString(rset0.getString("dlco_no"		));
			rec.rmks	 		= Util.checkString(rset0.getString("rmks"			));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_ETC_1220_LDataSet ds = (SE_ETC_1220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_ETC_1220_LCURLISTRecord curlistRec = (SE_ETC_1220_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.pay_seq%>
<%= curlistRec.pay_ptcr_seq%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.recp_pers_nm%>
<%= curlistRec.prn%>
<%= curlistRec.qty%>
<%= curlistRec.uprc%>
<%= curlistRec.amt%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.supr_dept_nm%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.rcpm_main_nm%>
<%= curlistRec.setl_bank%>
<%= curlistRec.dlco_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 13:39:42 KST 2009 */
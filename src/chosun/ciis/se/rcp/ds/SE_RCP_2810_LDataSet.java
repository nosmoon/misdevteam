/***************************************************************************************************
* 파일명 : SE_RCP_2810_LDataSet.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-27
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_2810_LDataSet(){}
	public SE_RCP_2810_LDataSet(String errcode, String errmsg){
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
		this.errcode 					= Util.checkString(cstmt.getString(1));
		this.errmsg 					= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 				= (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_RCP_2810_LCURLISTRecord rec = new SE_RCP_2810_LCURLISTRecord();
			rec.cmpy_cd 				= Util.checkString(rset0.getString("cmpy_cd"				));
			rec.yymm 					= Util.checkString(rset0.getString("yymm"					));
			rec.bo_cd 					= Util.checkString(rset0.getString("bo_cd"					));
			rec.bo_seq 					= Util.checkString(rset0.getString("bo_seq"					));
			rec.dept_cd 				= Util.checkString(rset0.getString("dept_cd"				));
			rec.dept_nm 				= Util.checkString(rset0.getString("dept_nm"				));
			rec.sub_dept_cd 			= Util.checkString(rset0.getString("sub_dept_cd"			));
			rec.part_nm 				= Util.checkString(rset0.getString("part_nm"				));
			rec.area_cd 				= Util.checkString(rset0.getString("area_cd"				));
			rec.area_nm 				= Util.checkString(rset0.getString("area_nm"				));
			rec.dlco_no 				= Util.checkString(rset0.getString("dlco_no"				));
			rec.bo_nm 					= Util.checkString(rset0.getString("bo_nm"					));
			rec.bo_head_nm 				= Util.checkString(rset0.getString("bo_head_nm"				));
			rec.cyov_bal	 			= Util.checkString(rset0.getString("cyov_bal"				));
			rec.net_sale_amt 			= Util.checkString(rset0.getString("net_sale_amt"			));
			rec.rcpm_amt 				= Util.checkString(rset0.getString("rcpm_amt"				));
			rec.uprcp_amt 				= Util.checkString(rset0.getString("uprcp_amt"				));
			rec.bal 					= Util.checkString(rset0.getString("bal"					));
			rec.cntr_gurt_amt_stot 		= Util.checkString(rset0.getString("cntr_gurt_amt_stot"		));
			rec.jont_debtgurt_limt_amt 	= Util.checkString(rset0.getString("jont_debtgurt_limt_amt"	));
			rec.sum_excs_uprcp_amt 		= Util.checkString(rset0.getString("sum_excs_uprcp_amt"		));
			rec.excs_uprcp_amt 			= Util.checkString(rset0.getString("excs_uprcp_amt"			));
			rec.gurt_pers_flnm 			= Util.checkString(rset0.getString("gurt_pers_flnm"			));
			rec.zip 					= Util.checkString(rset0.getString("zip"					));
			rec.addr 					= Util.checkString(rset0.getString("addr"					));
			rec.dtls_addr 				= Util.checkString(rset0.getString("dtls_addr"				));
			rec.tel 					= Util.checkString(rset0.getString("tel"					));
			rec.rn 						= Util.checkString(rset0.getString("rn"						));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_2810_LDataSet ds = (SE_RCP_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_2810_LCURLISTRecord curlistRec = (SE_RCP_2810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.yymm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.cyov_bal%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.uprcp_amt%>
<%= curlistRec.bal%>
<%= curlistRec.cntr_gurt_amt_stot%>
<%= curlistRec.jont_debtgurt_limt_amt%>
<%= curlistRec.sum_excs_uprcp_amt%>
<%= curlistRec.excs_uprcp_amt%>
<%= curlistRec.gurt_pers_flnm%>
<%= curlistRec.zip%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.tel%>
<%= curlistRec.rn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 11:26:08 KST 2009 */
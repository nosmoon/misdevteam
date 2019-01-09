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


public class SP_SAL_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_2810_LDataSet(){}
	public SP_SAL_2810_LDataSet(String errcode, String errmsg){
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
			SP_SAL_2810_LCURLISTRecord rec = new SP_SAL_2810_LCURLISTRecord();
			rec.adms_dstc_cd_nm = Util.checkString(rset0.getString("adms_dstc_cd_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_head = Util.checkString(rset0.getString("dlco_head"));
			rec.dlco_head_tel = Util.checkString(rset0.getString("dlco_head_tel"));
			rec.sp_comp_chrg_pers_emp_nm = Util.checkString(rset0.getString("sp_comp_chrg_pers_emp_nm"));
			rec.pre_misu = Util.checkString(rset0.getString("pre_misu"));
			rec.cur_stot_amt = Util.checkString(rset0.getString("cur_stot_amt"));
			rec.cur_in_amt = Util.checkString(rset0.getString("cur_in_amt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_2810_LDataSet ds = (SP_SAL_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_2810_LCURLISTRecord curlistRec = (SP_SAL_2810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.adms_dstc_cd_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_head%>
<%= curlistRec.dlco_head_tel%>
<%= curlistRec.sp_comp_chrg_pers_emp_nm%>
<%= curlistRec.pre_misu%>
<%= curlistRec.cur_stot_amt%>
<%= curlistRec.cur_in_amt%>
<%= curlistRec.misu_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jul 22 17:22:20 KST 2012 */
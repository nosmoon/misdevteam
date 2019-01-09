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


package chosun.ciis.is.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SAL_2110_LDataSet(){}
	public IS_SAL_2110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			IS_SAL_2110_LCURLISTRecord rec = new IS_SAL_2110_LCURLISTRecord();
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.dlco_clsf_cd_seq = Util.checkString(rset0.getString("dlco_clsf_cd_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.spc_sale_clsf_nm = Util.checkString(rset0.getString("spc_sale_clsf_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.not_suply_amt = Util.checkString(rset0.getString("not_suply_amt"));
			rec.indt_cd_nm = Util.checkString(rset0.getString("indt_cd_nm"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.erplace_cd_nm = Util.checkString(rset0.getString("erplace_cd_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SAL_2110_LDataSet ds = (IS_SAL_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SAL_2110_LCURLISTRecord curlistRec = (IS_SAL_2110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acwr_reg_dt%>
<%= curlistRec.acwr_reg_seq%>
<%= curlistRec.scat_dt%>
<%= curlistRec.advt_nm%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.dlco_clsf_cd_seq%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.sale_clsf_nm%>
<%= curlistRec.spc_sale_clsf_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.qunt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.not_suply_amt%>
<%= curlistRec.indt_cd_nm%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.erplace_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 16 11:50:05 KST 2012 */
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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2120_LDataSet(){}
	public IS_AGR_2120_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			IS_AGR_2120_LCURLISTRecord rec = new IS_AGR_2120_LCURLISTRecord();
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.indt_cd_nm = Util.checkString(rset0.getString("indt_cd_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.spc_sale_clsf_nm = Util.checkString(rset0.getString("spc_sale_clsf_nm"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.prft_amt = Util.checkString(rset0.getString("prft_amt"));
			rec.prft_rate = Util.checkString(rset0.getString("prft_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2120_LDataSet ds = (IS_AGR_2120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2120_LCURLISTRecord curlistRec = (IS_AGR_2120_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.scat_dt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.indt_cd_nm%>
<%= curlistRec.advt_nm%>
<%= curlistRec.sale_clsf_nm%>
<%= curlistRec.spc_sale_clsf_nm%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.uprc%>
<%= curlistRec.qunt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.purc_amt%>
<%= curlistRec.prft_amt%>
<%= curlistRec.prft_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 17:42:04 KST 2012 */
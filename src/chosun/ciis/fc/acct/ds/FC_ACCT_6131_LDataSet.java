/***************************************************************************************************
* 파일명 : .java
* 기능 :  재무회계-회계관리-부가세관리-부가세신고자료생성(조회)
* 작성일자 : 2010-04-23
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 재무회계-회계관리-부가세관리-부가세신고자료생성(조회)
 */


public class FC_ACCT_6131_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6131_LDataSet(){}
	public FC_ACCT_6131_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_ACCT_6131_LCURLISTRecord rec = new FC_ACCT_6131_LCURLISTRecord();
			rec.vat_decl_yymm = Util.checkString(rset0.getString("vat_decl_yymm"));
			rec.purc_sale_clsf_cd = Util.checkString(rset0.getString("purc_sale_clsf_cd"));
			rec.purc_sale_clsf_nm = Util.checkString(rset0.getString("purc_sale_clsf_nm"));
			rec.decl_amt1 = Util.checkString(rset0.getString("decl_amt1"));
			rec.decl_amt2 = Util.checkString(rset0.getString("decl_amt2"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.erplace_cd_nm = Util.checkString(rset0.getString("erplace_cd_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6131_LDataSet ds = (FC_ACCT_6131_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_6131_LCURLISTRecord curlistRec = (FC_ACCT_6131_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.vat_decl_yymm%>
<%= curlistRec.purc_sale_clsf_cd%>
<%= curlistRec.purc_sale_clsf_nm%>
<%= curlistRec.decl_amt1%>
<%= curlistRec.decl_amt2%>
<%= curlistRec.clos_yn%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.erplace_cd%>
<%= curlistRec.erplace_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 23 10:44:39 KST 2010 */
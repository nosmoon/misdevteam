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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_5173_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_5173_LDataSet(){}
	public MC_BUDG_5173_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_5173_LCURLISTRecord rec = new MC_BUDG_5173_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cdnm = Util.checkString(rset0.getString("medi_cdnm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.curmm_cndt_amt_01 = Util.checkString(rset0.getString("curmm_cndt_amt_01"));
			rec.curmm_cndt_amt_02 = Util.checkString(rset0.getString("curmm_cndt_amt_02"));
			rec.curmm_cndt_amt_03 = Util.checkString(rset0.getString("curmm_cndt_amt_03"));
			rec.curmm_cndt_amt_04 = Util.checkString(rset0.getString("curmm_cndt_amt_04"));
			rec.curmm_cndt_amt_05 = Util.checkString(rset0.getString("curmm_cndt_amt_05"));
			rec.curmm_cndt_amt_06 = Util.checkString(rset0.getString("curmm_cndt_amt_06"));
			rec.curmm_cndt_amt_07 = Util.checkString(rset0.getString("curmm_cndt_amt_07"));
			rec.curmm_cndt_amt_08 = Util.checkString(rset0.getString("curmm_cndt_amt_08"));
			rec.curmm_cndt_amt_09 = Util.checkString(rset0.getString("curmm_cndt_amt_09"));
			rec.curmm_cndt_amt_10 = Util.checkString(rset0.getString("curmm_cndt_amt_10"));
			rec.curmm_cndt_amt_11 = Util.checkString(rset0.getString("curmm_cndt_amt_11"));
			rec.curmm_cndt_amt_12 = Util.checkString(rset0.getString("curmm_cndt_amt_12"));
			rec.curmm_cndt_amt_tot = Util.checkString(rset0.getString("curmm_cndt_amt_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_5173_LDataSet ds = (MC_BUDG_5173_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_5173_LCURLISTRecord curlistRec = (MC_BUDG_5173_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cdnm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.curmm_cndt_amt_01%>
<%= curlistRec.curmm_cndt_amt_02%>
<%= curlistRec.curmm_cndt_amt_03%>
<%= curlistRec.curmm_cndt_amt_04%>
<%= curlistRec.curmm_cndt_amt_05%>
<%= curlistRec.curmm_cndt_amt_06%>
<%= curlistRec.curmm_cndt_amt_07%>
<%= curlistRec.curmm_cndt_amt_08%>
<%= curlistRec.curmm_cndt_amt_09%>
<%= curlistRec.curmm_cndt_amt_10%>
<%= curlistRec.curmm_cndt_amt_11%>
<%= curlistRec.curmm_cndt_amt_12%>
<%= curlistRec.curmm_cndt_amt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 24 14:28:53 KST 2017 */
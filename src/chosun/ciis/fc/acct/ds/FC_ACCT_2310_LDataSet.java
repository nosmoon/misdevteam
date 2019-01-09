/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
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
 * 독자-독자인증요청 조회
 */

public class FC_ACCT_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList vexc_coms_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2310_LDataSet(){}
	public FC_ACCT_2310_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_2310_LVEXC_COMS_LISTRecord rec = new FC_ACCT_2310_LVEXC_COMS_LISTRecord();
			rec.vexc_cmpy_cd = Util.checkString(rset0.getString("vexc_cmpy_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.pch_amt1 = Util.checkString(rset0.getString("pch_amt1"));
			rec.pch_amt2 = Util.checkString(rset0.getString("pch_amt2"));
			this.vexc_coms_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2310_LDataSet ds = (FC_ACCT_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.vexc_coms_list.size(); i++){
		FC_ACCT_2310_LVEXC_COMS_LISTRecord vexc_coms_listRec = (FC_ACCT_2310_LVEXC_COMS_LISTRecord)ds.vexc_coms_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getVexc_coms_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= vexc_coms_listRec.vexc_cmpy_cd%>
<%= vexc_coms_listRec.dlco_nm%>
<%= vexc_coms_listRec.suply_amt%>
<%= vexc_coms_listRec.pch_amt1%>
<%= vexc_coms_listRec.pch_amt1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 17 19:59:21 KST 2009 */

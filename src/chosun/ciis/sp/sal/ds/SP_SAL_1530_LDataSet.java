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


public class SP_SAL_1530_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1530_LDataSet(){}
	public SP_SAL_1530_LDataSet(String errcode, String errmsg){
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
			SP_SAL_1530_LCURLISTRecord rec = new SP_SAL_1530_LCURLISTRecord();
			rec.sggssno = Util.checkString(rset0.getString("sggssno"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.pch_konglan = Util.checkString(rset0.getString("pch_konglan"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.remk2 = Util.checkString(rset0.getString("remk2"));
			rec.mmdd = Util.checkString(rset0.getString("mmdd"));
			rec.item_2 = Util.checkString(rset0.getString("item_2"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.suply_amt_2 = Util.checkString(rset0.getString("suply_amt_2"));
			rec.vat_amt_2 = Util.checkString(rset0.getString("vat_amt_2"));
			rec.vexc_cmpy_cd = Util.checkString(rset0.getString("vexc_cmpy_cd"));
			rec.tax_stmt_aprv_yn = Util.checkString(rset0.getString("tax_stmt_aprv_yn"));
			rec.ern2 = Util.checkString(rset0.getString("ern2"));
			rec.dlco_nm2 = Util.checkString(rset0.getString("dlco_nm2"));
			rec.presi_nm2 = Util.checkString(rset0.getString("presi_nm2"));
			rec.addr2 = Util.checkString(rset0.getString("addr2"));
			rec.bizcond2 = Util.checkString(rset0.getString("bizcond2"));
			rec.item2 = Util.checkString(rset0.getString("item2"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1530_LDataSet ds = (SP_SAL_1530_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_1530_LCURLISTRecord curlistRec = (SP_SAL_1530_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sggssno%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.presi_nm%>
<%= curlistRec.addr%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.make_dt%>
<%= curlistRec.pch_konglan%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.remk%>
<%= curlistRec.remk2%>
<%= curlistRec.mmdd%>
<%= curlistRec.item_2%>
<%= curlistRec.std%>
<%= curlistRec.qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.suply_amt_2%>
<%= curlistRec.vat_amt_2%>
<%= curlistRec.vexc_cmpy_cd%>
<%= curlistRec.tax_stmt_aprv_yn%>
<%= curlistRec.ern2%>
<%= curlistRec.dlco_nm2%>
<%= curlistRec.presi_nm2%>
<%= curlistRec.addr2%>
<%= curlistRec.bizcond2%>
<%= curlistRec.item2%>
<%= curlistRec.erplace_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Aug 12 14:53:31 KST 2012 */
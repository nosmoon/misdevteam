/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5040_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5040_LDataSet(){}
	public SS_SLS_EXTN_5040_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_SLS_EXTN_5040_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_5040_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.adv_deptnm = Util.checkString(rset0.getString("adv_deptnm"));
			rec.adv_nm = Util.checkString(rset0.getString("adv_nm"));
			rec.medi_qty = Util.checkString(rset0.getString("medi_qty"));
			rec.mob_qty = Util.checkString(rset0.getString("mob_qty"));
			rec.extn_deptnm = Util.checkString(rset0.getString("extn_deptnm"));
			rec.extn_nm = Util.checkString(rset0.getString("extn_nm"));
			rec.extn_medi_qty = Util.checkString(rset0.getString("extn_medi_qty"));
			rec.extn_mob_qty = Util.checkString(rset0.getString("extn_mob_qty"));
			rec.regcode = Util.checkString(rset0.getString("regcode"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5040_LDataSet ds = (SS_SLS_EXTN_5040_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5040_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5040_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.yymm%>
<%= curcommlistRec.dncompnm%>
<%= curcommlistRec.adv_deptnm%>
<%= curcommlistRec.adv_nm%>
<%= curcommlistRec.medi_qty%>
<%= curcommlistRec.mob_qty%>
<%= curcommlistRec.extn_deptnm%>
<%= curcommlistRec.extn_nm%>
<%= curcommlistRec.extn_medi_qty%>
<%= curcommlistRec.extn_mob_qty%>
<%= curcommlistRec.regcode%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 08 14:10:00 KST 2016 */
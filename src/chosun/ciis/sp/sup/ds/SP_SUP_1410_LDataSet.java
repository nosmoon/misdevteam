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


package chosun.ciis.sp.sup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SUP_1410_LDataSet(){}
	public SP_SUP_1410_LDataSet(String errcode, String errmsg){
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
			SP_SUP_1410_LCURLISTRecord rec = new SP_SUP_1410_LCURLISTRecord();
			rec.acpn_dt = Util.checkString(rset0.getString("acpn_dt"));
			rec.acpn_dt_tm = Util.checkString(rset0.getString("acpn_dt_tm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.rdr_nm = Util.checkString(rset0.getString("rdr_nm"));
			rec.cns_clsf_nm = Util.checkString(rset0.getString("cns_clsf_nm"));
			rec.proc_clsf_nm = Util.checkString(rset0.getString("proc_clsf_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.acpn_no = Util.checkString(rset0.getString("acpn_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SUP_1410_LDataSet ds = (SP_SUP_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SUP_1410_LCURLISTRecord curlistRec = (SP_SUP_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acpn_dt%>
<%= curlistRec.acpn_dt_tm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.rdr_nm%>
<%= curlistRec.cns_clsf_nm%>
<%= curlistRec.proc_clsf_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.acpn_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 23:12:32 KST 2012 */
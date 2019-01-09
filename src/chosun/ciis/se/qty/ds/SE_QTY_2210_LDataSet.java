/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_2210_LDataSet(){}
	public SE_QTY_2210_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_QTY_2210_LCURLISTRecord rec = new SE_QTY_2210_LCURLISTRecord();
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.reg_seq = Util.checkString(rset0.getString("reg_seq"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.qty = rset0.getInt("qty");
			rec.amt = rset0.getInt("amt");
			rec.cnfm_msg = Util.checkString(rset0.getString("cnfm_msg"));
			rec.cnfm_stat_clsf_nm = Util.checkString(rset0.getString("cnfm_stat_clsf_nm"));
			rec.clos_aft_cnfm_yn = Util.checkString(rset0.getString("clos_aft_cnfm_yn"));
			rec.acpn_chrg_pers_dept_nm = Util.checkString(rset0.getString("acpn_chrg_pers_dept_nm"));
			rec.acpn_chrg_pers_nm = Util.checkString(rset0.getString("acpn_chrg_pers_nm"));
			rec.arvl_clsf_nm = Util.checkString(rset0.getString("arvl_clsf_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2210_LDataSet ds = (SE_QTY_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2210_LCURLISTRecord curlistRec = (SE_QTY_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.reg_dt%>
<%= curlistRec.reg_seq%>
<%= curlistRec.issu_dt%>
<%= curlistRec.medi_nm%>
<%= curlistRec.qty%>
<%= curlistRec.amt%>
<%= curlistRec.cnfm_msg%>
<%= curlistRec.cnfm_stat_clsf_nm%>
<%= curlistRec.clos_aft_cnfm_yn%>
<%= curlistRec.acpn_chrg_pers_dept_nm%>
<%= curlistRec.acpn_chrg_pers_nm%>
<%= curlistRec.arvl_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 15:30:28 KST 2009 */
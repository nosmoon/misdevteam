/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2009-01-29
* 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_1510_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_1510_LDataSet(){}
	public AD_DEP_1510_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_DEP_1510_LCURLISTRecord rec = new AD_DEP_1510_LCURLISTRecord();
			rec.payo_clsf = Util.checkString(rset0.getString("payo_clsf"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.payo_slip_no = Util.checkString(rset0.getString("payo_slip_no"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.hndl_clsf = Util.checkString(rset0.getString("hndl_clsf"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.drbk_amt = Util.checkString(rset0.getString("drbk_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_1510_LDataSet ds = (AD_DEP_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_1510_LCURLISTRecord curlistRec = (AD_DEP_1510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.payo_clsf%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.payo_slip_no%>
<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.medi_nm%>
<%= curlistRec.hndl_clsf%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.drbk_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 10:49:56 KST 2009 */
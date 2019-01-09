/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2110_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2110_LDataSet(){}
	public AD_BAS_2110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AD_BAS_2110_LCURLISTRecord rec = new AD_BAS_2110_LCURLISTRecord();
			rec.prfl_no = Util.checkString(rset0.getString("prfl_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.cur_job = Util.checkString(rset0.getString("cur_job"));
			rec.offi_tel_no = Util.checkString(rset0.getString("offi_tel_no"));
			rec.home_tel_no = Util.checkString(rset0.getString("home_tel_no"));
			rec.ceph_no1 = Util.checkString(rset0.getString("ceph_no1"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.cust_mang_item = Util.checkString(rset0.getString("cust_mang_item"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2110_LDataSet ds = (AD_BAS_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2110_LCURLISTRecord curlistRec = (AD_BAS_2110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.prfl_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.cur_job%>
<%= curlistRec.offi_tel_no%>
<%= curlistRec.home_tel_no%>
<%= curlistRec.ceph_no1%>
<%= curlistRec.email%>
<%= curlistRec.cust_mang_item%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 12:44:39 KST 2009 */
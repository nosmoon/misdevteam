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


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1020_LCURLISTRecord;

/**
 * 
 */


public class AD_RES_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1020_LDataSet(){}
	public AD_RES_1020_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_RES_1020_LCURLISTRecord rec = new AD_RES_1020_LCURLISTRecord();
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.sect_clas_cd1 = Util.checkString(rset0.getString("sect_clas_cd1"));
			rec.sect_nm_cd1 = Util.checkString(rset0.getString("sect_nm_cd1"));
			rec.sect_cd1 = Util.checkString(rset0.getString("sect_cd1"));
			rec.bgn_side1 = Util.checkString(rset0.getString("bgn_side1"));
			rec.end_side1 = Util.checkString(rset0.getString("end_side1"));
			rec.sect_clas_cd2 = Util.checkString(rset0.getString("sect_clas_cd2"));
			rec.sect_nm_cd2 = Util.checkString(rset0.getString("sect_nm_cd2"));
			rec.sect_cd2 = Util.checkString(rset0.getString("sect_cd2"));
			rec.bgn_side2 = Util.checkString(rset0.getString("bgn_side2"));
			rec.end_side2 = Util.checkString(rset0.getString("end_side2"));
			rec.sect_clas_cd3 = Util.checkString(rset0.getString("sect_clas_cd3"));
			rec.sect_nm_cd3 = Util.checkString(rset0.getString("sect_nm_cd3"));
			rec.sect_cd3 = Util.checkString(rset0.getString("sect_cd3"));
			rec.bgn_side3 = Util.checkString(rset0.getString("bgn_side3"));
			rec.end_side3 = Util.checkString(rset0.getString("end_side3"));
			rec.sect_clas_cd4 = Util.checkString(rset0.getString("sect_clas_cd4"));
			rec.sect_nm_cd4 = Util.checkString(rset0.getString("sect_nm_cd4"));
			rec.sect_cd4 = Util.checkString(rset0.getString("sect_cd4"));
			rec.bgn_side4 = Util.checkString(rset0.getString("bgn_side4"));
			rec.end_side4 = Util.checkString(rset0.getString("end_side4"));
			rec.sect_clas_cd5 = Util.checkString(rset0.getString("sect_clas_cd5"));
			rec.sect_nm_cd5 = Util.checkString(rset0.getString("sect_nm_cd5"));
			rec.sect_cd5 = Util.checkString(rset0.getString("sect_cd5"));
			rec.bgn_side5 = Util.checkString(rset0.getString("bgn_side5"));
			rec.end_side5 = Util.checkString(rset0.getString("end_side5"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1020_LDataSet ds = (AD_RES_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1020_LCURLISTRecord curlistRec = (AD_RES_1020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.wkdy%>
<%= curlistRec.sect_clas_cd1%>
<%= curlistRec.sect_nm_cd1%>
<%= curlistRec.sect_cd1%>
<%= curlistRec.bgn_side1%>
<%= curlistRec.end_side1%>
<%= curlistRec.sect_clas_cd2%>
<%= curlistRec.sect_nm_cd2%>
<%= curlistRec.sect_cd2%>
<%= curlistRec.bgn_side2%>
<%= curlistRec.end_side2%>
<%= curlistRec.sect_clas_cd3%>
<%= curlistRec.sect_nm_cd3%>
<%= curlistRec.sect_cd3%>
<%= curlistRec.bgn_side3%>
<%= curlistRec.end_side3%>
<%= curlistRec.sect_clas_cd4%>
<%= curlistRec.sect_nm_cd4%>
<%= curlistRec.sect_cd4%>
<%= curlistRec.bgn_side4%>
<%= curlistRec.end_side4%>
<%= curlistRec.sect_clas_cd5%>
<%= curlistRec.sect_nm_cd5%>
<%= curlistRec.sect_cd5%>
<%= curlistRec.bgn_side5%>
<%= curlistRec.end_side5%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 15:09:43 KST 2009 */
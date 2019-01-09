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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_2310_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2310_LDataSet(){}
	public AD_DEP_2310_LDataSet(String errcode, String errmsg){
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
			AD_DEP_2310_LCURLISTRecord rec = new AD_DEP_2310_LCURLISTRecord();
			rec.mchrg_pers_nm = Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.gjamt = Util.checkString(rset0.getString("gjamt"));
			rec.igamt = Util.checkString(rset0.getString("igamt"));
			rec.janamt = Util.checkString(rset0.getString("janamt"));
			rec.avg_pay = Util.checkString(rset0.getString("avg_pay"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2310_LDataSet ds = (AD_DEP_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2310_LCURLISTRecord curlistRec = (AD_DEP_2310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.mchrg_pers_nm%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.gjamt%>
<%= curlistRec.igamt%>
<%= curlistRec.janamt%>
<%= curlistRec.avg_pay%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 17:11:34 KST 2009 */
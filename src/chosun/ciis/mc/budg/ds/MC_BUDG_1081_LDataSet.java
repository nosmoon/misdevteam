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


public class MC_BUDG_1081_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_1081_LDataSet(){}
	public MC_BUDG_1081_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_BUDG_1081_LCURLISTRecord rec = new MC_BUDG_1081_LCURLISTRecord();
			rec.clas_cd1 = Util.checkString(rset0.getString("clas_cd1"));
			rec.clas_cd2 = Util.checkString(rset0.getString("clas_cd2"));
			rec.clas_cd3 = Util.checkString(rset0.getString("clas_cd3"));
			rec.clas_cd4 = Util.checkString(rset0.getString("clas_cd4"));
			rec.clas_nm = Util.checkString(rset0.getString("clas_nm"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.dtls_medi_dstb_cd = Util.checkString(rset0.getString("dtls_medi_dstb_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_1081_LDataSet ds = (MC_BUDG_1081_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_1081_LCURLISTRecord curlistRec = (MC_BUDG_1081_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.clas_cd1%>
<%= curlistRec.clas_cd2%>
<%= curlistRec.clas_cd3%>
<%= curlistRec.clas_cd4%>
<%= curlistRec.clas_nm%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.dtls_medi_dstb_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 16:26:01 KST 2009 */
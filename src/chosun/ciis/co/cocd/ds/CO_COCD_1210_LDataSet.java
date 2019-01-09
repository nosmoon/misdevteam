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


package chosun.ciis.co.cocd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_COCD_1210_LDataSet(){}
	public CO_COCD_1210_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			CO_COCD_1210_LCURLISTRecord rec = new CO_COCD_1210_LCURLISTRecord();
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.cd_clsf = Util.checkString(rset0.getString("cd_clsf"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.mang_cd_1 = Util.checkString(rset0.getString("mang_cd_1"));
			rec.mang_cd_2 = Util.checkString(rset0.getString("mang_cd_2"));
			rec.mang_cd_3 = Util.checkString(rset0.getString("mang_cd_3"));
			rec.mang_cd_4 = Util.checkString(rset0.getString("mang_cd_4"));
			rec.mang_cd_5 = Util.checkString(rset0.getString("mang_cd_5"));
			rec.mang_cd_6 = Util.checkString(rset0.getString("mang_cd_6"));
			rec.mang_cd_7 = Util.checkString(rset0.getString("mang_cd_7"));
			rec.mang_cd_8 = Util.checkString(rset0.getString("mang_cd_8"));
			rec.mang_cd_9 = Util.checkString(rset0.getString("mang_cd_9"));
			rec.mang_cd_10 = Util.checkString(rset0.getString("mang_cd_10"));
			rec.mang_cd_11 = Util.checkString(rset0.getString("mang_cd_11"));
			rec.mang_cd_12 = Util.checkString(rset0.getString("mang_cd_12"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_COCD_1210_LDataSet ds = (CO_COCD_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_COCD_1210_LCURLISTRecord curlistRec = (CO_COCD_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.job_clsf%>
<%= curlistRec.cd_clsf%>
<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.mang_cd_1%>
<%= curlistRec.mang_cd_2%>
<%= curlistRec.mang_cd_3%>
<%= curlistRec.mang_cd_4%>
<%= curlistRec.mang_cd_5%>
<%= curlistRec.mang_cd_6%>
<%= curlistRec.mang_cd_7%>
<%= curlistRec.mang_cd_8%>
<%= curlistRec.mang_cd_9%>
<%= curlistRec.mang_cd_10%>
<%= curlistRec.mang_cd_11%>
<%= curlistRec.mang_cd_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 15:21:35 KST 2009 */
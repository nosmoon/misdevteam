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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1050_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_g_ymgbcd_010;
	public String xx_g_cdgb_010;
	public String xx_g_cdgb_020;

	public FC_ACCT_1050_MDataSet(){}
	public FC_ACCT_1050_MDataSet(String errcode, String errmsg, String xx_g_ymgbcd_010, String xx_g_cdgb_010, String xx_g_cdgb_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_g_ymgbcd_010 = xx_g_ymgbcd_010;
		this.xx_g_cdgb_010 = xx_g_cdgb_010;
		this.xx_g_cdgb_020 = xx_g_cdgb_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_g_ymgbcd_010(String xx_g_ymgbcd_010){
		this.xx_g_ymgbcd_010 = xx_g_ymgbcd_010;
	}

	public void setXx_g_cdgb_010(String xx_g_cdgb_010){
		this.xx_g_cdgb_010 = xx_g_cdgb_010;
	}

	public void setXx_g_cdgb_020(String xx_g_cdgb_020){
		this.xx_g_cdgb_020 = xx_g_cdgb_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_g_ymgbcd_010(){
		return this.xx_g_ymgbcd_010;
	}

	public String getXx_g_cdgb_010(){
		return this.xx_g_cdgb_010;
	}

	public String getXx_g_cdgb_020(){
		return this.xx_g_cdgb_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_1050_MCURLISTRecord rec = new FC_ACCT_1050_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		this.xx_g_ymgbcd_010 = Util.checkString(cstmt.getString(6));
		this.xx_g_cdgb_010 = Util.checkString(cstmt.getString(7));
		this.xx_g_cdgb_020 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_1050_MDataSet ds = (FC_ACCT_1050_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1050_MCURLISTRecord curlistRec = (FC_ACCT_1050_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_g_ymgbcd_010()%>
<%= ds.getXx_g_cdgb_010()%>
<%= ds.getXx_g_cdgb_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 29 13:34:13 KST 2011 */
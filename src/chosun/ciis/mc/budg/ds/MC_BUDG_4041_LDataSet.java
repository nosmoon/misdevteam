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


public class MC_BUDG_4041_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4041_LDataSet(){}
	public MC_BUDG_4041_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_4041_LCURLISTRecord rec = new MC_BUDG_4041_LCURLISTRecord();
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.ys_ysnm_ghyscd = Util.checkString(rset0.getString("ys_ysnm_ghyscd"));
			rec.budg_req_amt = Util.checkString(rset0.getString("budg_req_amt"));
			rec.last_asin_amt = Util.checkString(rset0.getString("last_asin_amt"));
			rec.fix_asin_amt = Util.checkString(rset0.getString("fix_asin_amt"));
			rec.divycamt = Util.checkString(rset0.getString("divycamt"));
			rec.divhjamt = Util.checkString(rset0.getString("divhjamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4041_LDataSet ds = (MC_BUDG_4041_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4041_LCURLISTRecord curlistRec = (MC_BUDG_4041_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_yymm%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.ys_ysnm_ghyscd%>
<%= curlistRec.budg_req_amt%>
<%= curlistRec.last_asin_amt%>
<%= curlistRec.fix_asin_amt%>
<%= curlistRec.divycamt%>
<%= curlistRec.divhjamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 15:39:23 KST 2009 */
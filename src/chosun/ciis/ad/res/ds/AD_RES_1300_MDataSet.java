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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String team_auth;
	public String part_auth;
	public String chrg_auth;
	public String close_dt;

	public AD_RES_1300_MDataSet(){}
	public AD_RES_1300_MDataSet(String errcode, String errmsg, String team_auth, String part_auth, String chrg_auth, String close_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.team_auth = team_auth;
		this.part_auth = part_auth;
		this.chrg_auth = chrg_auth;
		this.close_dt = close_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTeam_auth(String team_auth){
		this.team_auth = team_auth;
	}

	public void setPart_auth(String part_auth){
		this.part_auth = part_auth;
	}

	public void setChrg_auth(String chrg_auth){
		this.chrg_auth = chrg_auth;
	}

	public void setClose_dt(String close_dt){
		this.close_dt = close_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTeam_auth(){
		return this.team_auth;
	}

	public String getPart_auth(){
		return this.part_auth;
	}

	public String getChrg_auth(){
		return this.chrg_auth;
	}

	public String getClose_dt(){
		return this.close_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.team_auth = Util.checkString(cstmt.getString(6));
		this.part_auth = Util.checkString(cstmt.getString(7));
		this.chrg_auth = Util.checkString(cstmt.getString(8));
		this.close_dt = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_RES_1300_MCURLISTRecord rec = new AD_RES_1300_MCURLISTRecord();
			rec.acct_id = Util.checkString(rset0.getString("acct_id"));
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1300_MDataSet ds = (AD_RES_1300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1300_MCURLISTRecord curlistRec = (AD_RES_1300_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeam_auth()%>
<%= ds.getPart_auth()%>
<%= ds.getChrg_auth()%>
<%= ds.getClose_dt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.acct_id%>
<%= curlistRec.acct_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 17 11:37:33 KST 2012 */
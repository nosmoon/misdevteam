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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_4026_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_stat_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_stat_cd;

	public FC_FUNC_4026_MDataSet(){}
	public FC_FUNC_4026_MDataSet(String errcode, String errmsg, String xx_stat_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_stat_cd = xx_stat_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_stat_cd(String xx_stat_cd){
		this.xx_stat_cd = xx_stat_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_stat_cd(){
		return this.xx_stat_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_4026_MXX_STAT_CD_LISTRecord rec = new FC_FUNC_4026_MXX_STAT_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_stat_cd_list.add(rec);
		}
		this.xx_stat_cd = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_4026_MDataSet ds = (FC_FUNC_4026_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_stat_cd_list.size(); i++){
		FC_FUNC_4026_MXX_STAT_CD_LISTRecord xx_stat_cd_listRec = (FC_FUNC_4026_MXX_STAT_CD_LISTRecord)ds.xx_stat_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_stat_cd_list()%>
<%= ds.getXx_stat_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_stat_cd_listRec.cd_nm%>
<%= xx_stat_cd_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 06 13:27:13 KST 2012 */
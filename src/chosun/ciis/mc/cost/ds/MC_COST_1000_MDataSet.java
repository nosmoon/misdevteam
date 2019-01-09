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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList xx_mang_cd_2_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_1000_MDataSet(){}
	public MC_COST_1000_MDataSet(String errcode, String errmsg){
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
			MC_COST_1000_MCURLISTRecord rec = new MC_COST_1000_MCURLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MC_COST_1000_MXX_MANG_CD_2_LISTRecord rec = new MC_COST_1000_MXX_MANG_CD_2_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.xx_mang_cd_2_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_1000_MDataSet ds = (MC_COST_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_1000_MCURLISTRecord curlistRec = (MC_COST_1000_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_mang_cd_2_list.size(); i++){
		MC_COST_1000_MXX_MANG_CD_2_LISTRecord xx_mang_cd_2_listRec = (MC_COST_1000_MXX_MANG_CD_2_LISTRecord)ds.xx_mang_cd_2_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_mang_cd_2_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd_nm%>
<%= curlistRec.cd%>
<%= xx_mang_cd_2_listRec.cd_nm%>
<%= xx_mang_cd_2_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 10 16:25:37 KST 2012 */
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


package chosun.ciis.hd.dalon.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1053_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DALON_1053_MDataSet(){}
	public HD_DALON_1053_MDataSet(String errcode, String errmsg){
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
			HD_DALON_1053_MXX_CD_LISTRecord rec = new HD_DALON_1053_MXX_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_cd_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DALON_1053_MDataSet ds = (HD_DALON_1053_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_cd_list.size(); i++){
		HD_DALON_1053_MXX_CD_LISTRecord xx_cd_listRec = (HD_DALON_1053_MXX_CD_LISTRecord)ds.xx_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_cd_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_cd_listRec.cd_nm%>
<%= xx_cd_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 31 13:21:43 KST 2012 */
/***************************************************************************************************
* 파일명 : SE_RCP_2820_LDataSet.java
* 기능 : 판매 - 입금관리 - 지대입금관리 - 보증인채무통보
* 작성일자 : 2009-04-27
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_2820_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList gurtlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_2820_LDataSet(){}
	public SE_RCP_2820_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_RCP_2820_LCURLISTRecord rec = new SE_RCP_2820_LCURLISTRecord();
			rec.bo_nm 			= Util.checkString(rset0.getString("bo_nm"			));
			rec.bo_head_nm 		= Util.checkString(rset0.getString("bo_head_nm"		));
			rec.gurt_pers_flnm 	= Util.checkString(rset0.getString("gurt_pers_flnm"	));
			rec.zip 			= Util.checkString(rset0.getString("zip"			));
			rec.tel 			= Util.checkString(rset0.getString("tel"			));
			rec.addr 			= Util.checkString(rset0.getString("addr"			));
			rec.dtls_addr 		= Util.checkString(rset0.getString("dtls_addr"		));
			this.gurtlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_2820_LDataSet ds = (SE_RCP_2820_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_2820_LCURLISTRecord curlistRec = (SE_RCP_2820_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.gurt_pers_flnm%>
<%= curlistRec.zip%>
<%= curlistRec.tel%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 14:30:07 KST 2009 */
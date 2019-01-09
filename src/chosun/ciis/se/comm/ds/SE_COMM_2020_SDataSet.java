/***************************************************************************************************
* 파일명 : SE_COMM_2010_LDataSet.java
* 기능 :  발송처 팝업 목록조회
* 작성일자 : 2009.01.29
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_COMM_2020_SDataSet(){}
	public SE_COMM_2020_SDataSet(String errcode, String errmsg){
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
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_COMM_2020_SCURLISTRecord rec = new SE_COMM_2020_SCURLISTRecord();
			rec.cmpy_cd 				= Util.checkString(rset0.getString("cmpy_cd"				));
			rec.bo_cd 					= Util.checkString(rset0.getString("bo_cd"					));
			rec.send_plac_seq 			= Util.checkString(rset0.getString("send_plac_seq"			));
			rec.send_plac_nm 			= Util.checkString(rset0.getString("send_plac_nm"			));
			rec.area_cd 				= Util.checkString(rset0.getString("area_cd"				));
			rec.area_nm 				= Util.checkString(rset0.getString("area_nm"				));
			rec.ariv_nomn 				= Util.checkString(rset0.getString("ariv_nomn"				));
			rec.adms_dstc_cd 			= Util.checkString(rset0.getString("adms_dstc_cd"			));
			rec.adms_dstc_nm 			= Util.checkString(rset0.getString("adms_dstc_nm"			));
			rec.bo_cd_send_plac_seq 	= Util.checkString(rset0.getString("bo_cd_send_plac_seq"	));
			rec.bo_seq 					= Util.checkString(rset0.getString("bo_seq"					));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_COMM_2010_LDataSet ds = (SE_COMM_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_COMM_2010_LCURLISTRecord curlistRec = (SE_COMM_2010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.bo_cd%>
<%= curlistRec.send_plac_seq%>
<%= curlistRec.send_plac_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.ariv_nomn%>
<%= curlistRec.adms_dstc_cd%>
<%= curlistRec.adms_dstc_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 23 11:20:56 KST 2009 */
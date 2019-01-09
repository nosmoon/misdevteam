/***************************************************************************************************
* 파일명 : SE_SND_1500_MDataSet.java
* 기능 : 판매 - 발송관리 - 공장별부수
* 작성일자 : 2009.02.03
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public String errcode;
	public String errmsg;
	
	public SE_SND_1500_MDataSet(){}
	public SE_SND_1500_MDataSet(String errcode, String errmsg){
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
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_SND_1500_MCURLISTRecord rec = new SE_SND_1500_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.curlist.add(rec);
		}
		ResultSet rset1 	= (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_SND_1500_MMEDILISTRecord rec = new SE_SND_1500_MMEDILISTRecord();
			rec.cd 			= Util.checkString(rset1.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset1.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset1.getString("cd_abrv_nm"	));
			this.medilist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_1500_MDataSet ds = (SE_SND_1500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1500_MCURLISTRecord curlistRec = (SE_SND_1500_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_SND_1500_MMEDILISTRecord medilistRec = (SE_SND_1500_MMEDILISTRecord)ds.medilist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getMedilist()%>
<%= ds.getRownum()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 09:26:38 KST 2009 */
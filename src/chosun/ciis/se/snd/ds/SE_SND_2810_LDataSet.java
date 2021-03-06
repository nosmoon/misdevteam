/***************************************************************************************************
* 파일명 : SE_SND_2810_LDataSet.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-25
* 작성자 : 김대준
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


public class SE_SND_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2810_LDataSet(){}
	public SE_SND_2810_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 	= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SND_2810_LCURLISTRecord rec = new SE_SND_2810_LCURLISTRecord();
			rec.issu_dt 	= Util.checkString(rset0.getString("issu_dt"	));
			rec.tmsg_seq 	= Util.checkString(rset0.getString("tmsg_seq"	));
			rec.tmsg_dt_tm 	= Util.checkString(rset0.getString("tmsg_dt_tm"	));
			rec.flnm	 	= Util.checkString(rset0.getString("flnm"		));
			rec.medi_nm 	= Util.checkString(rset0.getString("medi_nm"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2810_LDataSet ds = (SE_SND_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2810_LCURLISTRecord curlistRec = (SE_SND_2810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.issu_dt%>
<%= curlistRec.tmsg_seq%>
<%= curlistRec.tmsg_dt_tm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 20:29:53 KST 2009 */
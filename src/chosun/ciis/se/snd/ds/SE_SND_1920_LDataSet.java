/***************************************************************************************************
* 파일명 : SE_SND_1920_LDataSet.java
* 기능 : 판매-발송관리-발송마스터
* 작성일자 : 2009-02-10
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


public class SE_SND_1920_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;

	public SE_SND_1920_LDataSet(){}
	public SE_SND_1920_LDataSet(String errcode, String errmsg, String title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.title = title;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.title 			= Util.checkString(cstmt.getString(7));
		ResultSet rset0 	= (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_SND_1920_LCURLISTRecord rec = new SE_SND_1920_LCURLISTRecord();
			rec.medi_nm 	= Util.checkString(rset0.getString("medi_nm"	));
			rec.ecnt_nm 	= Util.checkString(rset0.getString("ecnt_nm"	));
			rec.ledt_nm 	= Util.checkString(rset0.getString("ledt_nm"	));
			rec.qty 		= Util.checkString(rset0.getString("qty"		));
			rec.prt_plac_nm = Util.checkString(rset0.getString("prt_plac_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_1920_LDataSet ds = (SE_SND_1920_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1920_LCURLISTRecord curlistRec = (SE_SND_1920_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTitle()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_nm%>
<%= curlistRec.ecnt_nm%>
<%= curlistRec.ledt_nm%>
<%= curlistRec.qty%>
<%= curlistRec.prt_plac_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 10 14:57:13 KST 2009 */
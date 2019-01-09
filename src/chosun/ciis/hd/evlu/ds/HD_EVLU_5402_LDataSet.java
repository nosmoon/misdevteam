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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_5402_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_5402_LDataSet(){}
	public HD_EVLU_5402_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EVLU_5402_LCURLISTRecord rec = new HD_EVLU_5402_LCURLISTRecord();
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.evlu_subj_cd = Util.checkString(rset0.getString("evlu_subj_cd"));
			rec.evlu_item_cd = Util.checkString(rset0.getString("evlu_item_cd"));
			rec.evlu_clon_cd = Util.checkString(rset0.getString("evlu_clon_cd"));
			rec.evlu_item_cd_nm = Util.checkString(rset0.getString("evlu_item_cd_nm"));
			rec.viewpoint = Util.checkString(rset0.getString("viewpoint"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_5402_LDataSet ds = (HD_EVLU_5402_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_5402_LCURLISTRecord curlistRec = (HD_EVLU_5402_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rnum%>
<%= curlistRec.evlu_subj_cd%>
<%= curlistRec.evlu_item_cd%>
<%= curlistRec.evlu_clon_cd%>
<%= curlistRec.evlu_item_cd_nm%>
<%= curlistRec.viewpoint%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 09:40:28 KST 2009 */
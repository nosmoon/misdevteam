/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
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

public class HD_EVLU_1804_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_1804_LDataSet(){}
	public HD_EVLU_1804_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EVLU_1804_LCURLISTRecord rec = new HD_EVLU_1804_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset0.getString("sel_chk"));
			rec.evlu_lcls_grp_nm = Util.checkString(rset0.getString("evlu_lcls_grp_nm"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.evlu_part_nm = Util.checkString(rset0.getString("evlu_part_nm"));
			rec.evlu_indx_nm = Util.checkString(rset0.getString("evlu_indx_nm"));
			rec.act_indx_def = Util.checkString(rset0.getString("act_indx_def"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			rec.evlu_part_cd = Util.checkString(rset0.getString("evlu_part_cd"));
			rec.evlu_indx_cd = Util.checkString(rset0.getString("evlu_indx_cd"));
			rec.act_indx_cd = Util.checkString(rset0.getString("act_indx_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_1804_LDataSet ds = (HD_EVLU_1804_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_1804_LCURLISTRecord curlistRec = (HD_EVLU_1804_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sel_chk%>
<%= curlistRec.evlu_lcls_grp_nm%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.evlu_part_nm%>
<%= curlistRec.evlu_indx_nm%>
<%= curlistRec.act_indx_def%>
<%= curlistRec.db_status%>
<%= curlistRec.evlu_grp_cd%>
<%= curlistRec.evlu_part_cd%>
<%= curlistRec.evlu_indx_cd%>
<%= curlistRec.act_indx_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 20:48:13 KST 2009 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_COMM_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_COMM_1110_LDataSet(){}
	public SE_COMM_1110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_COMM_1110_LCURLISTRecord rec = new SE_COMM_1110_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			rec.bo_telno = Util.checkString(rset0.getString("bo_telno"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset0.getString("supr_dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_COMM_1110_LDataSet ds = (SE_COMM_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_COMM_1110_LCURLISTRecord curlistRec = (SE_COMM_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.bo_telno%>
<%= curlistRec.dlco_no%>
<%= curlistRec.area_cd%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.dept_cd%>
<%= curlistRec.supr_dept_cd%>
<%= curlistRec.dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 25 11:27:13 KST 2009 */
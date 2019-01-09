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


package chosun.ciis.hd.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.com.dm.*;
import chosun.ciis.hd.com.rec.*;

/**
 * 
 */


public class HD_COM_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_COM_1100_LDataSet(){}
	public HD_COM_1100_LDataSet(String errcode, String errmsg){
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
			HD_COM_1100_LCURLISTRecord rec = new HD_COM_1100_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_team_clsf = Util.checkString(rset0.getString("dept_team_clsf"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.dept_team_nm = Util.checkString(rset0.getString("dept_team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.part_dn_nm = Util.checkString(rset0.getString("part_dn_nm"));
			rec.use_end_dt = Util.checkString(rset0.getString("use_end_dt"));
			rec.now_use_yn = Util.checkString(rset0.getString("now_use_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COM_1100_LDataSet ds = (HD_COM_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_COM_1100_LCURLISTRecord curlistRec = (HD_COM_1100_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_team_clsf%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.offi_nm%>
<%= curlistRec.dept_team_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.part_dn_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 28 14:20:15 KST 2009 */
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


package chosun.ciis.hd.orga.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_ORGA_1003_LDataSet(){}
	public HD_ORGA_1003_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_ORGA_1003_LCURLISTRecord rec = new HD_ORGA_1003_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.pre_dept_cd = Util.checkString(rset0.getString("pre_dept_cd"));
			rec.pre_dept_nm = Util.checkString(rset0.getString("pre_dept_nm"));
			rec.chg_aft_dept_cd = Util.checkString(rset0.getString("chg_aft_dept_cd"));
			rec.chg_aft_dept_nm = Util.checkString(rset0.getString("chg_aft_dept_nm"));
			rec.dept_clsf = Util.checkString(rset0.getString("dept_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_ORGA_1003_LDataSet ds = (HD_ORGA_1003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_ORGA_1003_LCURLISTRecord curlistRec = (HD_ORGA_1003_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.seq%>
<%= curlistRec.dept_nm%>
<%= curlistRec.pre_dept_cd%>
<%= curlistRec.pre_dept_nm%>
<%= curlistRec.chg_aft_dept_cd%>
<%= curlistRec.chg_aft_dept_nm%>
<%= curlistRec.dept_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 13:52:05 KST 2009 */
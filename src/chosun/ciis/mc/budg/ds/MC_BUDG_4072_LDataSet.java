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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4072_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4072_LDataSet(){}
	public MC_BUDG_4072_LDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			MC_BUDG_4072_LCURLISTRecord rec = new MC_BUDG_4072_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset3.getString("dept_cd"));
			rec.work_dt = Util.checkString(rset3.getString("work_dt"));
			rec.hsty_no = Util.checkString(rset3.getString("hsty_no"));
			rec.rmks2 = Util.checkString(rset3.getString("rmks2"));
			rec.sub_no = Util.checkString(rset3.getString("sub_no"));
			rec.evnt_cd = Util.checkString(rset3.getString("evnt_cd"));
			rec.budg_cd = Util.checkString(rset3.getString("budg_cd"));
			rec.budg_yymm = Util.checkString(rset3.getString("budg_yymm"));
			rec.use_dept_cd = Util.checkString(rset3.getString("use_dept_cd"));
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			rec.rmks = Util.checkString(rset3.getString("rmks"));
			rec.yramt = Util.checkString(rset3.getString("yramt"));
			rec.amt = Util.checkString(rset3.getString("amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4072_LDataSet ds = (MC_BUDG_4072_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4072_LCURLISTRecord curlistRec = (MC_BUDG_4072_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.work_dt%>
<%= curlistRec.hsty_no%>
<%= curlistRec.rmks2%>
<%= curlistRec.sub_no%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.rmks%>
<%= curlistRec.yramt%>
<%= curlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 20:24:17 KST 2009 */
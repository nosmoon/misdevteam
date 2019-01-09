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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_3022_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3022_LDataSet(){}
	public MC_COST_3022_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MC_COST_3022_LCURLISTRecord rec = new MC_COST_3022_LCURLISTRecord();
			rec.slip_no = Util.checkString(rset2.getString("slip_no"));
			rec.clam_dept_nm = Util.checkString(rset2.getString("clam_dept_nm"));
			rec.budg_nm = Util.checkString(rset2.getString("budg_nm"));
			rec.medi_nm = Util.checkString(rset2.getString("medi_nm"));
			rec.use_dept_nm = Util.checkString(rset2.getString("use_dept_nm"));
			rec.rmks1 = Util.checkString(rset2.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset2.getString("rmks2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3022_LDataSet ds = (MC_COST_3022_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3022_LCURLISTRecord curlistRec = (MC_COST_3022_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_no%>
<%= curlistRec.clam_dept_nm%>
<%= curlistRec.budg_nm%>
<%= curlistRec.medi_nm%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 20:24:07 KST 2009 */
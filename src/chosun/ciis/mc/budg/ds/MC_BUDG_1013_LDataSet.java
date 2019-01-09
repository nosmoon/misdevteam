/***************************************************************************************************
* 파일명 : .java
* 기능 :  예산관리 - 행사코드등록수정
* 작성일자 : 2011-07-12
* 작성자 : 노상현
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
 * 예산관리 - 행사코드등록수정
 */

public class MC_BUDG_1013_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_1013_LDataSet(){}
	public MC_BUDG_1013_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			MC_BUDG_1013_LCURLISTRecord rec = new MC_BUDG_1013_LCURLISTRecord();
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_cd_ch = Util.checkString(rset0.getString("evnt_cd_ch"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.bgn_dt = Util.checkString(rset0.getString("bgn_dt"));
			rec.last_dt = Util.checkString(rset0.getString("last_dt"));
			rec.supv_dept_cd = Util.checkString(rset0.getString("supv_dept_cd"));
			rec.buseonm = Util.checkString(rset0.getString("buseonm"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.a_igbhannm = Util.checkString(rset0.getString("a_igbhannm"));
			rec.evnt_nm1 = Util.checkString(rset0.getString("evnt_nm1"));
			rec.evnt_nm2 = Util.checkString(rset0.getString("evnt_nm2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_1013_LDataSet ds = (MC_BUDG_1013_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_1013_LCURLISTRecord curlistRec = (MC_BUDG_1013_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_cd_ch%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.bgn_dt%>
<%= curlistRec.last_dt%>
<%= curlistRec.supv_dept_cd%>
<%= curlistRec.buseonm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.a_igbhannm%>
<%= curlistRec.evnt_nm1%>
<%= curlistRec.evnt_nm2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 25 14:38:52 KST 2011 */
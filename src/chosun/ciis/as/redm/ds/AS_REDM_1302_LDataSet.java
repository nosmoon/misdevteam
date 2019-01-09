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


package chosun.ciis.as.redm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.rec.*;

/**
 * 
 */


public class AS_REDM_1302_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_REDM_1302_LDataSet(){}
	public AS_REDM_1302_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AS_REDM_1302_LCURLISTRecord rec = new AS_REDM_1302_LCURLISTRecord();
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.redm_mthd_cd = Util.checkString(rset0.getString("redm_mthd_cd"));
			rec.cont_yys = Util.checkString(rset0.getString("cont_yys"));
			rec.redm_rate = Util.checkString(rset0.getString("redm_rate"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_REDM_1302_LDataSet ds = (AS_REDM_1302_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_REDM_1302_LCURLISTRecord curlistRec = (AS_REDM_1302_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aply_dt%>
<%= curlistRec.redm_mthd_cd%>
<%= curlistRec.cont_yys%>
<%= curlistRec.redm_rate%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers_nm%>
<%= curlistRec.cmpy_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 10:00:06 KST 2009 */
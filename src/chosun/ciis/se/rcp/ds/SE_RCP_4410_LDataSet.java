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


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_4410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bgn_rcpm_dt;
	public String end_rcpm_dt;

	public SE_RCP_4410_LDataSet(){}
	public SE_RCP_4410_LDataSet(String errcode, String errmsg, String bgn_rcpm_dt, String end_rcpm_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bgn_rcpm_dt = bgn_rcpm_dt;
		this.end_rcpm_dt = end_rcpm_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBgn_rcpm_dt(String bgn_rcpm_dt){
		this.bgn_rcpm_dt = bgn_rcpm_dt;
	}

	public void setEnd_rcpm_dt(String end_rcpm_dt){
		this.end_rcpm_dt = end_rcpm_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBgn_rcpm_dt(){
		return this.bgn_rcpm_dt;
	}

	public String getEnd_rcpm_dt(){
		return this.end_rcpm_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bgn_rcpm_dt = Util.checkString(cstmt.getString(9));
		this.end_rcpm_dt = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_RCP_4410_LCURLISTRecord rec = new SE_RCP_4410_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_4410_LDataSet ds = (SE_RCP_4410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_4410_LCURLISTRecord curlistRec = (SE_RCP_4410_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBgn_rcpm_dt()%>
<%= ds.getEnd_rcpm_dt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.meda_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 21:04:39 KST 2009 */
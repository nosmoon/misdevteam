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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_6120_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_cboyjgbcd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_use_dept_cd;
	public String xx_deps_isav_stat_cd_010;

	public FC_FUNC_6120_MDataSet(){}
	public FC_FUNC_6120_MDataSet(String errcode, String errmsg, String xx_use_dept_cd, String xx_deps_isav_stat_cd_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_use_dept_cd = xx_use_dept_cd;
		this.xx_deps_isav_stat_cd_010 = xx_deps_isav_stat_cd_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_use_dept_cd(String xx_use_dept_cd){
		this.xx_use_dept_cd = xx_use_dept_cd;
	}

	public void setXx_deps_isav_stat_cd_010(String xx_deps_isav_stat_cd_010){
		this.xx_deps_isav_stat_cd_010 = xx_deps_isav_stat_cd_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_use_dept_cd(){
		return this.xx_use_dept_cd;
	}

	public String getXx_deps_isav_stat_cd_010(){
		return this.xx_deps_isav_stat_cd_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_6120_MCUR_CBOYJGBCDRecord rec = new FC_FUNC_6120_MCUR_CBOYJGBCDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.cur_cboyjgbcd.add(rec);
		}
		this.xx_use_dept_cd = Util.checkString(cstmt.getString(6));
		this.xx_deps_isav_stat_cd_010 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6120_MDataSet ds = (FC_FUNC_6120_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_cboyjgbcd.size(); i++){
		FC_FUNC_6120_MCUR_CBOYJGBCDRecord cur_cboyjgbcdRec = (FC_FUNC_6120_MCUR_CBOYJGBCDRecord)ds.cur_cboyjgbcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_cboyjgbcd()%>
<%= ds.getXx_use_dept_cd()%>
<%= ds.getXx_deps_isav_stat_cd_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_cboyjgbcdRec.cd_nm%>
<%= cur_cboyjgbcdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 14:32:14 KST 2012 */
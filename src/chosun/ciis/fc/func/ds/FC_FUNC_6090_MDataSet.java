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


public class FC_FUNC_6090_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_cbohy_yeyggb = new ArrayList();
	public ArrayList xx_budg_cd_list = new ArrayList();
	public ArrayList cur_cboyjgbcd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_deps_isav_stat_cd_010;
	public String xx_deps_isav_stat_cd_020;
	public String xx_deps_isav_stat_cd_030;
	public String xx_budg_cd_010;

	public FC_FUNC_6090_MDataSet(){}
	public FC_FUNC_6090_MDataSet(String errcode, String errmsg, String xx_deps_isav_stat_cd_010, String xx_deps_isav_stat_cd_020, String xx_deps_isav_stat_cd_030, String xx_budg_cd_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_deps_isav_stat_cd_010 = xx_deps_isav_stat_cd_010;
		this.xx_deps_isav_stat_cd_020 = xx_deps_isav_stat_cd_020;
		this.xx_deps_isav_stat_cd_030 = xx_deps_isav_stat_cd_030;
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_deps_isav_stat_cd_010(String xx_deps_isav_stat_cd_010){
		this.xx_deps_isav_stat_cd_010 = xx_deps_isav_stat_cd_010;
	}

	public void setXx_deps_isav_stat_cd_020(String xx_deps_isav_stat_cd_020){
		this.xx_deps_isav_stat_cd_020 = xx_deps_isav_stat_cd_020;
	}

	public void setXx_deps_isav_stat_cd_030(String xx_deps_isav_stat_cd_030){
		this.xx_deps_isav_stat_cd_030 = xx_deps_isav_stat_cd_030;
	}

	public void setXx_budg_cd_010(String xx_budg_cd_010){
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_deps_isav_stat_cd_010(){
		return this.xx_deps_isav_stat_cd_010;
	}

	public String getXx_deps_isav_stat_cd_020(){
		return this.xx_deps_isav_stat_cd_020;
	}

	public String getXx_deps_isav_stat_cd_030(){
		return this.xx_deps_isav_stat_cd_030;
	}

	public String getXx_budg_cd_010(){
		return this.xx_budg_cd_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_6090_MCUR_CBOYJGBCDRecord rec = new FC_FUNC_6090_MCUR_CBOYJGBCDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.cur_cboyjgbcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_6090_MCUR_CBOHY_YEYGGBRecord rec = new FC_FUNC_6090_MCUR_CBOHY_YEYGGBRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.cur_cbohy_yeyggb.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_6090_MXX_BUDG_CD_LISTRecord rec = new FC_FUNC_6090_MXX_BUDG_CD_LISTRecord();
			rec.budg_abrv_nm = Util.checkString(rset2.getString("budg_abrv_nm"));
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			this.xx_budg_cd_list.add(rec);
		}
		this.xx_deps_isav_stat_cd_010 = Util.checkString(cstmt.getString(8));
		this.xx_deps_isav_stat_cd_020 = Util.checkString(cstmt.getString(9));
		this.xx_deps_isav_stat_cd_030 = Util.checkString(cstmt.getString(10));
		this.xx_budg_cd_010 = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6090_MDataSet ds = (FC_FUNC_6090_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_cboyjgbcd.size(); i++){
		FC_FUNC_6090_MCUR_CBOYJGBCDRecord cur_cboyjgbcdRec = (FC_FUNC_6090_MCUR_CBOYJGBCDRecord)ds.cur_cboyjgbcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_cbohy_yeyggb.size(); i++){
		FC_FUNC_6090_MCUR_CBOHY_YEYGGBRecord cur_cbohy_yeyggbRec = (FC_FUNC_6090_MCUR_CBOHY_YEYGGBRecord)ds.cur_cbohy_yeyggb.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_list.size(); i++){
		FC_FUNC_6090_MXX_BUDG_CD_LISTRecord xx_budg_cd_listRec = (FC_FUNC_6090_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_cboyjgbcd()%>
<%= ds.getCur_cbohy_yeyggb()%>
<%= ds.getXx_budg_cd_list()%>
<%= ds.getXx_deps_isav_stat_cd_010()%>
<%= ds.getXx_deps_isav_stat_cd_020()%>
<%= ds.getXx_deps_isav_stat_cd_030()%>
<%= ds.getXx_budg_cd_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_cboyjgbcdRec.cd_nm%>
<%= cur_cboyjgbcdRec.cd%>
<%= cur_cbohy_yeyggbRec.cd_nm%>
<%= cur_cbohy_yeyggbRec.cd%>
<%= xx_budg_cd_listRec.budg_abrv_nm%>
<%= xx_budg_cd_listRec.budg_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 13:16:26 KST 2012 */
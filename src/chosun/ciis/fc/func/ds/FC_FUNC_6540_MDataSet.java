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


public class FC_FUNC_6540_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList xx_budg_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_deps_isav_stat_cd;
	public String xx_budg_cd_010;

	public FC_FUNC_6540_MDataSet(){}
	public FC_FUNC_6540_MDataSet(String errcode, String errmsg, String xx_deps_isav_stat_cd, String xx_budg_cd_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_deps_isav_stat_cd = xx_deps_isav_stat_cd;
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_deps_isav_stat_cd(String xx_deps_isav_stat_cd){
		this.xx_deps_isav_stat_cd = xx_deps_isav_stat_cd;
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

	public String getXx_deps_isav_stat_cd(){
		return this.xx_deps_isav_stat_cd;
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
			FC_FUNC_6540_MCURLIST1Record rec = new FC_FUNC_6540_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_6540_MCURLIST2Record rec = new FC_FUNC_6540_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_6540_MXX_BUDG_CD_LISTRecord rec = new FC_FUNC_6540_MXX_BUDG_CD_LISTRecord();
			rec.budg_abrv_nm = Util.checkString(rset2.getString("budg_abrv_nm"));
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			this.xx_budg_cd_list.add(rec);
		}
		this.xx_deps_isav_stat_cd = Util.checkString(cstmt.getString(8));
		this.xx_budg_cd_010 = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6040_MDataSet ds = (FC_FUNC_6040_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_6040_MCURLIST1Record curlist1Rec = (FC_FUNC_6040_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_6040_MCURLIST2Record curlist2Rec = (FC_FUNC_6040_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_list.size(); i++){
		FC_FUNC_6040_MXX_BUDG_CD_LISTRecord xx_budg_cd_listRec = (FC_FUNC_6040_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getXx_budg_cd_list()%>
<%= ds.getXx_deps_isav_stat_cd()%>
<%= ds.getXx_budg_cd_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= xx_budg_cd_listRec.budg_abrv_nm%>
<%= xx_budg_cd_listRec.budg_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 10:40:25 KST 2012 */
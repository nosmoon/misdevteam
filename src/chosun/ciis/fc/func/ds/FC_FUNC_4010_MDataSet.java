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


public class FC_FUNC_4010_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_issu_clsf_cd_list = new ArrayList();
	public ArrayList xx_budg_cd_list = new ArrayList();
	public ArrayList curdlco_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_4010_MDataSet(){}
	public FC_FUNC_4010_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_4010_MCURDLCO_CLSF_CDRecord rec = new FC_FUNC_4010_MCURDLCO_CLSF_CDRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curdlco_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_4010_MXX_ISSU_CLSF_CD_LISTRecord rec = new FC_FUNC_4010_MXX_ISSU_CLSF_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.xx_issu_clsf_cd_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_4010_MXX_BUDG_CD_LISTRecord rec = new FC_FUNC_4010_MXX_BUDG_CD_LISTRecord();
			rec.budg_abrv_nm = Util.checkString(rset2.getString("budg_abrv_nm"));
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			this.xx_budg_cd_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_4010_MDataSet ds = (FC_FUNC_4010_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdlco_clsf_cd.size(); i++){
		FC_FUNC_4010_MCURDLCO_CLSF_CDRecord curdlco_clsf_cdRec = (FC_FUNC_4010_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_issu_clsf_cd_list.size(); i++){
		FC_FUNC_4010_MXX_ISSU_CLSF_CD_LISTRecord xx_issu_clsf_cd_listRec = (FC_FUNC_4010_MXX_ISSU_CLSF_CD_LISTRecord)ds.xx_issu_clsf_cd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_budg_cd_list.size(); i++){
		FC_FUNC_4010_MXX_BUDG_CD_LISTRecord xx_budg_cd_listRec = (FC_FUNC_4010_MXX_BUDG_CD_LISTRecord)ds.xx_budg_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdlco_clsf_cd()%>
<%= ds.getXx_issu_clsf_cd_list()%>
<%= ds.getXx_budg_cd_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdlco_clsf_cdRec.cd%>
<%= curdlco_clsf_cdRec.cdnm%>
<%= curdlco_clsf_cdRec.cd_abrv_nm%>
<%= curdlco_clsf_cdRec.cdnm_cd%>
<%= curdlco_clsf_cdRec.cdabrvnm_cd%>
<%= xx_issu_clsf_cd_listRec.cd_nm%>
<%= xx_issu_clsf_cd_listRec.cd%>
<%= xx_budg_cd_listRec.budg_abrv_nm%>
<%= xx_budg_cd_listRec.budg_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 06 11:26:14 KST 2012 */
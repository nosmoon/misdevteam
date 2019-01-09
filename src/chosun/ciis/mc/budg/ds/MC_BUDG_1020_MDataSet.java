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


public class MC_BUDG_1020_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_job_clsf_02;
	public String xx_cd_clsf_010;

	public MC_BUDG_1020_MDataSet(){}
	public MC_BUDG_1020_MDataSet(String errcode, String errmsg, String xx_job_clsf_02, String xx_cd_clsf_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_job_clsf_02 = xx_job_clsf_02;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_job_clsf_02(String xx_job_clsf_02){
		this.xx_job_clsf_02 = xx_job_clsf_02;
	}

	public void setXx_cd_clsf_010(String xx_cd_clsf_010){
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_job_clsf_02(){
		return this.xx_job_clsf_02;
	}

	public String getXx_cd_clsf_010(){
		return this.xx_cd_clsf_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_BUDG_1020_MCURLISTRecord rec = new MC_BUDG_1020_MCURLISTRecord();
			rec.budg_clas_cdnm = Util.checkString(rset0.getString("budg_clas_cdnm"));
			rec.budg_clas_cd = Util.checkString(rset0.getString("budg_clas_cd"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			this.curlist.add(rec);
		}
		this.xx_job_clsf_02 = Util.checkString(cstmt.getString(6));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_1020_MDataSet ds = (MC_BUDG_1020_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_1020_MCURLISTRecord curlistRec = (MC_BUDG_1020_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_job_clsf_02()%>
<%= ds.getXx_cd_clsf_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.budg_clas_cdnm%>
<%= curlistRec.budg_clas_cd%>
<%= curlistRec.abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 13 11:38:33 KST 2012 */
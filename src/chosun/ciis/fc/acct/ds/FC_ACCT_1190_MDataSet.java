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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1190_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_dlco_cd_l;
	public String xx_job_clsf_02;
	public String xx_cd_clsf_020;
	public String xx_cd_clsf_030;

	public FC_ACCT_1190_MDataSet(){}
	public FC_ACCT_1190_MDataSet(String errcode, String errmsg, String xx_dlco_cd_l, String xx_job_clsf_02, String xx_cd_clsf_020, String xx_cd_clsf_030){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_dlco_cd_l = xx_dlco_cd_l;
		this.xx_job_clsf_02 = xx_job_clsf_02;
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
		this.xx_cd_clsf_030 = xx_cd_clsf_030;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_dlco_cd_l(String xx_dlco_cd_l){
		this.xx_dlco_cd_l = xx_dlco_cd_l;
	}

	public void setXx_job_clsf_02(String xx_job_clsf_02){
		this.xx_job_clsf_02 = xx_job_clsf_02;
	}

	public void setXx_cd_clsf_020(String xx_cd_clsf_020){
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
	}

	public void setXx_cd_clsf_030(String xx_cd_clsf_030){
		this.xx_cd_clsf_030 = xx_cd_clsf_030;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_dlco_cd_l(){
		return this.xx_dlco_cd_l;
	}

	public String getXx_job_clsf_02(){
		return this.xx_job_clsf_02;
	}

	public String getXx_cd_clsf_020(){
		return this.xx_cd_clsf_020;
	}

	public String getXx_cd_clsf_030(){
		return this.xx_cd_clsf_030;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_1190_MCURLISTRecord rec = new FC_ACCT_1190_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist.add(rec);
		}
		this.xx_dlco_cd_l = Util.checkString(cstmt.getString(6));
		this.xx_job_clsf_02 = Util.checkString(cstmt.getString(7));
		this.xx_cd_clsf_020 = Util.checkString(cstmt.getString(8));
		this.xx_cd_clsf_030 = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_1190_MDataSet ds = (FC_ACCT_1190_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1190_MCURLISTRecord curlistRec = (FC_ACCT_1190_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_dlco_cd_l()%>
<%= ds.getXx_job_clsf_02()%>
<%= ds.getXx_cd_clsf_020()%>
<%= ds.getXx_cd_clsf_030()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.cdnm_cd%>
<%= curlistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 29 14:47:10 KST 2011 */
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


public class MC_COST_3020_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_budg_cd;
	public String xx_job_clsf_00;
	public String xx_cd_clsf_010;

	public MC_COST_3020_MDataSet(){}
	public MC_COST_3020_MDataSet(String errcode, String errmsg, String xx_budg_cd, String xx_job_clsf_00, String xx_cd_clsf_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_budg_cd = xx_budg_cd;
		this.xx_job_clsf_00 = xx_job_clsf_00;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_budg_cd(String xx_budg_cd){
		this.xx_budg_cd = xx_budg_cd;
	}

	public void setXx_job_clsf_00(String xx_job_clsf_00){
		this.xx_job_clsf_00 = xx_job_clsf_00;
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

	public String getXx_budg_cd(){
		return this.xx_budg_cd;
	}

	public String getXx_job_clsf_00(){
		return this.xx_job_clsf_00;
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
			MC_COST_3020_MCURLISTRecord rec = new MC_COST_3020_MCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			this.curlist.add(rec);
		}
		this.xx_budg_cd = Util.checkString(cstmt.getString(6));
		this.xx_job_clsf_00 = Util.checkString(cstmt.getString(7));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3020_MDataSet ds = (MC_COST_3020_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3020_MCURLISTRecord curlistRec = (MC_COST_3020_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_budg_cd()%>
<%= ds.getXx_job_clsf_00()%>
<%= ds.getXx_cd_clsf_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yymm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 14:36:00 KST 2012 */
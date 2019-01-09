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


public class MC_COST_2040_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_cost_dstb_cdfr;
	public String xx_cost_dstb_cdto;
	public String xx_clos_clsf;
	public String xx_cd;
	public String xx_cost_dstb_cd;
	public String xx_cost_dstb_cd_020;
	public String xx_job_clsf_00;
	public String xx_cd_clsf_010;

	public MC_COST_2040_MDataSet(){}
	public MC_COST_2040_MDataSet(String errcode, String errmsg, String xx_cost_dstb_cdfr, String xx_cost_dstb_cdto, String xx_clos_clsf, String xx_cd, String xx_cost_dstb_cd, String xx_cost_dstb_cd_020, String xx_job_clsf_00, String xx_cd_clsf_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cost_dstb_cdfr = xx_cost_dstb_cdfr;
		this.xx_cost_dstb_cdto = xx_cost_dstb_cdto;
		this.xx_clos_clsf = xx_clos_clsf;
		this.xx_cd = xx_cd;
		this.xx_cost_dstb_cd = xx_cost_dstb_cd;
		this.xx_cost_dstb_cd_020 = xx_cost_dstb_cd_020;
		this.xx_job_clsf_00 = xx_job_clsf_00;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cost_dstb_cdfr(String xx_cost_dstb_cdfr){
		this.xx_cost_dstb_cdfr = xx_cost_dstb_cdfr;
	}

	public void setXx_cost_dstb_cdto(String xx_cost_dstb_cdto){
		this.xx_cost_dstb_cdto = xx_cost_dstb_cdto;
	}

	public void setXx_clos_clsf(String xx_clos_clsf){
		this.xx_clos_clsf = xx_clos_clsf;
	}

	public void setXx_cd(String xx_cd){
		this.xx_cd = xx_cd;
	}

	public void setXx_cost_dstb_cd(String xx_cost_dstb_cd){
		this.xx_cost_dstb_cd = xx_cost_dstb_cd;
	}

	public void setXx_cost_dstb_cd_020(String xx_cost_dstb_cd_020){
		this.xx_cost_dstb_cd_020 = xx_cost_dstb_cd_020;
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

	public String getXx_cost_dstb_cdfr(){
		return this.xx_cost_dstb_cdfr;
	}

	public String getXx_cost_dstb_cdto(){
		return this.xx_cost_dstb_cdto;
	}

	public String getXx_clos_clsf(){
		return this.xx_clos_clsf;
	}

	public String getXx_cd(){
		return this.xx_cd;
	}

	public String getXx_cost_dstb_cd(){
		return this.xx_cost_dstb_cd;
	}

	public String getXx_cost_dstb_cd_020(){
		return this.xx_cost_dstb_cd_020;
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
			MC_COST_2040_MCURLISTRecord rec = new MC_COST_2040_MCURLISTRecord();
			rec.work_cym = Util.checkString(rset0.getString("work_cym"));
			this.curlist.add(rec);
		}
		this.xx_cost_dstb_cdfr = Util.checkString(cstmt.getString(6));
		this.xx_cost_dstb_cdto = Util.checkString(cstmt.getString(7));
		this.xx_clos_clsf = Util.checkString(cstmt.getString(8));
		this.xx_cd = Util.checkString(cstmt.getString(9));
		this.xx_cost_dstb_cd = Util.checkString(cstmt.getString(10));
		this.xx_cost_dstb_cd_020 = Util.checkString(cstmt.getString(11));
		this.xx_job_clsf_00 = Util.checkString(cstmt.getString(12));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_2040_MDataSet ds = (MC_COST_2040_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_2040_MCURLISTRecord curlistRec = (MC_COST_2040_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_cost_dstb_cdfr()%>
<%= ds.getXx_cost_dstb_cdto()%>
<%= ds.getXx_clos_clsf()%>
<%= ds.getXx_cd()%>
<%= ds.getXx_cost_dstb_cd()%>
<%= ds.getXx_cost_dstb_cd_020()%>
<%= ds.getXx_job_clsf_00()%>
<%= ds.getXx_cd_clsf_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.work_cym%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 19:56:13 KST 2012 */
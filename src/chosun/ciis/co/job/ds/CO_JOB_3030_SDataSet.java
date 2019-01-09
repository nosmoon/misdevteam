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


package chosun.ciis.co.job.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_3030_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String sys_clsf;
	public String seq;
	public String titl;
	public String cont;
	public String eis_fix;
	public String eis_pers;
	public String eis_fix_dt_tm;

	public CO_JOB_3030_SDataSet(){}
	public CO_JOB_3030_SDataSet(String errcode, String errmsg, String sys_clsf, String seq, String titl, String cont, String eis_fix, String eis_pers, String eis_fix_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sys_clsf = sys_clsf;
		this.seq = seq;
		this.titl = titl;
		this.cont = cont;
		this.eis_fix = eis_fix;
		this.eis_pers = eis_pers;
		this.eis_fix_dt_tm = eis_fix_dt_tm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSys_clsf(String sys_clsf){
		this.sys_clsf = sys_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setEis_fix(String eis_fix){
		this.eis_fix = eis_fix;
	}

	public void setEis_pers(String eis_pers){
		this.eis_pers = eis_pers;
	}

	public void setEis_fix_dt_tm(String eis_fix_dt_tm){
		this.eis_fix_dt_tm = eis_fix_dt_tm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSys_clsf(){
		return this.sys_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getEis_fix(){
		return this.eis_fix;
	}

	public String getEis_pers(){
		return this.eis_pers;
	}

	public String getEis_fix_dt_tm(){
		return this.eis_fix_dt_tm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.sys_clsf = Util.checkString(cstmt.getString(4));
		this.seq = Util.checkString(cstmt.getString(5));
		this.titl = Util.checkString(cstmt.getString(6));
		this.cont = Util.checkString(cstmt.getString(7));
		this.eis_fix = Util.checkString(cstmt.getString(8));
		this.eis_pers = Util.checkString(cstmt.getString(9));
		this.eis_fix_dt_tm = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_JOB_3030_SDataSet ds = (CO_JOB_3030_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSys_clsf()%>
<%= ds.getSeq()%>
<%= ds.getTitl()%>
<%= ds.getCont()%>
<%= ds.getEis_fix()%>
<%= ds.getEis_pers()%>
<%= ds.getEis_fix_dt_tm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 09:07:13 KST 2009 */
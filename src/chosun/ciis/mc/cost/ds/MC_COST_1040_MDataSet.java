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


public class MC_COST_1040_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_cd;
	public String xx_dept_cd_010;
	public String xx_dept_cd_020;
	public String xx_cd1_010;
	public String xx_cd2_010;
	public String xx_cd1_020;
	public String xx_cd2_020;

	public MC_COST_1040_MDataSet(){}
	public MC_COST_1040_MDataSet(String errcode, String errmsg, String xx_cd, String xx_dept_cd_010, String xx_dept_cd_020, String xx_cd1_010, String xx_cd2_010, String xx_cd1_020, String xx_cd2_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cd = xx_cd;
		this.xx_dept_cd_010 = xx_dept_cd_010;
		this.xx_dept_cd_020 = xx_dept_cd_020;
		this.xx_cd1_010 = xx_cd1_010;
		this.xx_cd2_010 = xx_cd2_010;
		this.xx_cd1_020 = xx_cd1_020;
		this.xx_cd2_020 = xx_cd2_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cd(String xx_cd){
		this.xx_cd = xx_cd;
	}

	public void setXx_dept_cd_010(String xx_dept_cd_010){
		this.xx_dept_cd_010 = xx_dept_cd_010;
	}

	public void setXx_dept_cd_020(String xx_dept_cd_020){
		this.xx_dept_cd_020 = xx_dept_cd_020;
	}

	public void setXx_cd1_010(String xx_cd1_010){
		this.xx_cd1_010 = xx_cd1_010;
	}

	public void setXx_cd2_010(String xx_cd2_010){
		this.xx_cd2_010 = xx_cd2_010;
	}

	public void setXx_cd1_020(String xx_cd1_020){
		this.xx_cd1_020 = xx_cd1_020;
	}

	public void setXx_cd2_020(String xx_cd2_020){
		this.xx_cd2_020 = xx_cd2_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cd(){
		return this.xx_cd;
	}

	public String getXx_dept_cd_010(){
		return this.xx_dept_cd_010;
	}

	public String getXx_dept_cd_020(){
		return this.xx_dept_cd_020;
	}

	public String getXx_cd1_010(){
		return this.xx_cd1_010;
	}

	public String getXx_cd2_010(){
		return this.xx_cd2_010;
	}

	public String getXx_cd1_020(){
		return this.xx_cd1_020;
	}

	public String getXx_cd2_020(){
		return this.xx_cd2_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_COST_1040_MCURLISTRecord rec = new MC_COST_1040_MCURLISTRecord();
			rec.work_cym = Util.checkString(rset0.getString("work_cym"));
			this.curlist.add(rec);
		}
		this.xx_cd = Util.checkString(cstmt.getString(6));
		this.xx_dept_cd_010 = Util.checkString(cstmt.getString(7));
		this.xx_dept_cd_020 = Util.checkString(cstmt.getString(8));
		this.xx_cd1_010 = Util.checkString(cstmt.getString(9));
		this.xx_cd2_010 = Util.checkString(cstmt.getString(10));
		this.xx_cd1_020 = Util.checkString(cstmt.getString(11));
		this.xx_cd2_020 = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_1040_MDataSet ds = (MC_COST_1040_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_1040_MCURLISTRecord curlistRec = (MC_COST_1040_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_cd()%>
<%= ds.getXx_dept_cd_010()%>
<%= ds.getXx_dept_cd_020()%>
<%= ds.getXx_cd1_010()%>
<%= ds.getXx_cd2_010()%>
<%= ds.getXx_cd1_020()%>
<%= ds.getXx_cd2_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.work_cym%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 10 20:03:17 KST 2012 */
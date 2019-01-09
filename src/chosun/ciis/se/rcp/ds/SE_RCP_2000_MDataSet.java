/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_2000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList area_cdcur = new ArrayList();
	public ArrayList team_cdcur = new ArrayList();
	public ArrayList part_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String yymm;

	public SE_RCP_2000_MDataSet(){}
	public SE_RCP_2000_MDataSet(String errcode, String errmsg, String yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.yymm = yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getYymm(){
		return this.yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.yymm = Util.checkString(cstmt.getString(5));
		ResultSet rset7 = (ResultSet) cstmt.getObject(6);
		while(rset7.next()){
			SE_RCP_2000_MTEAM_CDCURRecord rec = new SE_RCP_2000_MTEAM_CDCURRecord();
			rec.dept_cd = Util.checkString(rset7.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset7.getString("dept_nm"));
			this.team_cdcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(7);
		while(rset8.next()){
			SE_RCP_2000_MPART_CDCURRecord rec = new SE_RCP_2000_MPART_CDCURRecord();
			rec.dept_cd = Util.checkString(rset8.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset8.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset8.getString("supr_dept_cd"));
			this.part_cdcur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(8);
		while(rset9.next()){
			SE_RCP_2000_MAREA_CDCURRecord rec = new SE_RCP_2000_MAREA_CDCURRecord();
			rec.area_cd = Util.checkString(rset9.getString("area_cd"));
			rec.area_nm = Util.checkString(rset9.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset9.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset9.getString("supr_dept_cd"));
			this.area_cdcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_2000_MDataSet ds = (SE_RCP_2000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.team_cdcur.size(); i++){
		SE_RCP_2000_MTEAM_CDCURRecord team_cdcurRec = (SE_RCP_2000_MTEAM_CDCURRecord)ds.team_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.part_cdcur.size(); i++){
		SE_RCP_2000_MPART_CDCURRecord part_cdcurRec = (SE_RCP_2000_MPART_CDCURRecord)ds.part_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.area_cdcur.size(); i++){
		SE_RCP_2000_MAREA_CDCURRecord area_cdcurRec = (SE_RCP_2000_MAREA_CDCURRecord)ds.area_cdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYymm()%>
<%= ds.getTeam_cdcur()%>
<%= ds.getPart_cdcur()%>
<%= ds.getArea_cdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= team_cdcurRec.dept_cd%>
<%= team_cdcurRec.dept_nm%>
<%= part_cdcurRec.dept_cd%>
<%= part_cdcurRec.dept_nm%>
<%= part_cdcurRec.supr_dept_cd%>
<%= area_cdcurRec.area_cd%>
<%= area_cdcurRec.area_nm%>
<%= area_cdcurRec.dept_cd%>
<%= area_cdcurRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 10:07:22 KST 2009 */
/***************************************************************************************************
* 파일명 : .java
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


package chosun.ciis.se.ang.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.ang.dm.*;
import chosun.ciis.se.ang.rec.*;

/**
 * 
 */


public class SE_ANG_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList area_cdcur = new ArrayList();
	public ArrayList team_cdcur = new ArrayList();
	public ArrayList part_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_ANG_1010_LDataSet(){}
	public SE_ANG_1010_LDataSet(String errcode, String errmsg){
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
			SE_ANG_1010_LTEAM_CDCURRecord rec = new SE_ANG_1010_LTEAM_CDCURRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.team_cdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_ANG_1010_LPART_CDCURRecord rec = new SE_ANG_1010_LPART_CDCURRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.part_cdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_ANG_1010_LAREA_CDCURRecord rec = new SE_ANG_1010_LAREA_CDCURRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.area_cdcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_ANG_1010_LDataSet ds = (SE_ANG_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.team_cdcur.size(); i++){
		SE_ANG_1010_LTEAM_CDCURRecord team_cdcurRec = (SE_ANG_1010_LTEAM_CDCURRecord)ds.team_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.part_cdcur.size(); i++){
		SE_ANG_1010_LPART_CDCURRecord part_cdcurRec = (SE_ANG_1010_LPART_CDCURRecord)ds.part_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.area_cdcur.size(); i++){
		SE_ANG_1010_LAREA_CDCURRecord area_cdcurRec = (SE_ANG_1010_LAREA_CDCURRecord)ds.area_cdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
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


/* 작성시간 : Mon Sep 18 14:47:59 KST 2017 */
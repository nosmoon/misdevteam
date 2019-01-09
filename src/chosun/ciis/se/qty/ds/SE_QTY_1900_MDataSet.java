/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1900_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList area_cdcur = new ArrayList();
	public ArrayList team_cdcur = new ArrayList();
	public ArrayList part_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long rownum1;
	public long rownum2;

	public SE_QTY_1900_MDataSet(){}
	public SE_QTY_1900_MDataSet(String errcode, String errmsg, long rownum1, long rownum2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rownum1 = rownum1;
		this.rownum2 = rownum2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRownum1(long rownum1){
		this.rownum1 = rownum1;
	}

	public void setRownum2(long rownum2){
		this.rownum2 = rownum2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getRownum1(){
		return this.rownum1;
	}

	public long getRownum2(){
		return this.rownum2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rownum1 = cstmt.getLong(5);
		this.rownum2 = cstmt.getLong(6);
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_QTY_1900_MTEAM_CDCURRecord rec = new SE_QTY_1900_MTEAM_CDCURRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.team_cdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SE_QTY_1900_MPART_CDCURRecord rec = new SE_QTY_1900_MPART_CDCURRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.part_cdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SE_QTY_1900_MAREA_CDCURRecord rec = new SE_QTY_1900_MAREA_CDCURRecord();
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
	SE_QTY_1900_MDataSet ds = (SE_QTY_1900_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.team_cdcur.size(); i++){
		SE_QTY_1900_MTEAM_CDCURRecord team_cdcurRec = (SE_QTY_1900_MTEAM_CDCURRecord)ds.team_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.part_cdcur.size(); i++){
		SE_QTY_1900_MPART_CDCURRecord part_cdcurRec = (SE_QTY_1900_MPART_CDCURRecord)ds.part_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.area_cdcur.size(); i++){
		SE_QTY_1900_MAREA_CDCURRecord area_cdcurRec = (SE_QTY_1900_MAREA_CDCURRecord)ds.area_cdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRownum1()%>
<%= ds.getRownum2()%>
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


/* 작성시간 : Fri Feb 27 17:40:49 KST 2009 */
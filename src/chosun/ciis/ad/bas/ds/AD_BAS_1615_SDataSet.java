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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1615_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String make_dt;
	public String diary_titl;
	public String make_pers;
	public String dlco_nm;
	public String diary_cont;

	public AD_BAS_1615_SDataSet(){}
	public AD_BAS_1615_SDataSet(String errcode, String errmsg, String make_dt, String diary_titl, String make_pers, String dlco_nm, String diary_cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.make_dt = make_dt;
		this.diary_titl = diary_titl;
		this.make_pers = make_pers;
		this.dlco_nm = dlco_nm;
		this.diary_cont = diary_cont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDiary_titl(String diary_titl){
		this.diary_titl = diary_titl;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDiary_cont(String diary_cont){
		this.diary_cont = diary_cont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDiary_titl(){
		return this.diary_titl;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDiary_cont(){
		return this.diary_cont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.make_dt = Util.checkString(cstmt.getString(6));
		this.diary_titl = Util.checkString(cstmt.getString(7));
		this.make_pers = Util.checkString(cstmt.getString(8));
		this.dlco_nm = Util.checkString(cstmt.getString(9));
		this.diary_cont = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			AD_BAS_1615_SCURLISTRecord rec = new AD_BAS_1615_SCURLISTRecord();
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.diary_titl = Util.checkString(rset0.getString("diary_titl"));
			rec.make_pers_nm = Util.checkString(rset0.getString("make_pers_nm"));
			rec.diary_cont = Util.checkString(rset0.getString("diary_cont"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1615_SDataSet ds = (AD_BAS_1615_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1615_SCURLISTRecord curlistRec = (AD_BAS_1615_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMake_dt()%>
<%= ds.getDiary_titl()%>
<%= ds.getMake_pers()%>
<%= ds.getDlco_nm()%>
<%= ds.getDiary_cont()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.make_dt%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.diary_titl%>
<%= curlistRec.make_pers_nm%>
<%= curlistRec.diary_cont%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 19:54:01 KST 2009 */
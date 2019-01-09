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


package chosun.ciis.hd.orga.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_ORGA_1101_LDataSet(){}
	public HD_ORGA_1101_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			HD_ORGA_1101_LCURLISTRecord rec = new HD_ORGA_1101_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.orga_reorga_dd = Util.checkString(rset0.getString("orga_reorga_dd"));
			rec.orga_reorga_dd_nm = Util.checkString(rset0.getString("orga_reorga_dd_nm"));
			rec.orga_reorga_resn = Util.checkString(rset0.getString("orga_reorga_resn"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			HD_ORGA_1101_LCURLIST1Record rec = new HD_ORGA_1101_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.orga_reorga_dd = Util.checkString(rset1.getString("orga_reorga_dd"));
			rec.orga_reorga_dd_nm = Util.checkString(rset1.getString("orga_reorga_dd_nm"));
			rec.orga_reorga_resn = Util.checkString(rset1.getString("orga_reorga_resn"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_ORGA_1101_LDataSet ds = (HD_ORGA_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_ORGA_1101_LCURLISTRecord curlistRec = (HD_ORGA_1101_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_ORGA_1101_LCURLIST1Record curlist1Rec = (HD_ORGA_1101_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.orga_reorga_dd%>
<%= curlistRec.orga_reorga_dd_nm%>
<%= curlistRec.orga_reorga_resn%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.orga_reorga_dd%>
<%= curlist1Rec.orga_reorga_dd_nm%>
<%= curlist1Rec.orga_reorga_resn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 11:48:17 KST 2009 */
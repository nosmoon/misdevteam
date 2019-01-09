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


public class HD_ORGA_1202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String level_cnt;

	public HD_ORGA_1202_LDataSet(){}
	public HD_ORGA_1202_LDataSet(String errcode, String errmsg, String level_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.level_cnt = level_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setLevel_cnt(String level_cnt){
		this.level_cnt = level_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getLevel_cnt(){
		return this.level_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_ORGA_1202_LCURLISTRecord rec = new HD_ORGA_1202_LCURLISTRecord();
			rec.lvl = Util.checkString(rset0.getString("lvl"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.insd_dept_cd = Util.checkString(rset0.getString("insd_dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset0.getString("supr_dept_cd"));
			rec.sub_cnt = Util.checkString(rset0.getString("sub_cnt"));
			this.curlist.add(rec);
		}
		this.level_cnt = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_ORGA_1202_LDataSet ds = (HD_ORGA_1202_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_ORGA_1202_LCURLISTRecord curlistRec = (HD_ORGA_1202_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getLevel_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.lvl%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.insd_dept_cd%>
<%= curlistRec.supr_dept_cd%>
<%= curlistRec.sub_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 13:53:57 KST 2009 */
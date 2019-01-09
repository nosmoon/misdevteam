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


public class MC_COST_2021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_2021_LDataSet(){}
	public MC_COST_2021_LDataSet(String errcode, String errmsg){
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

		ResultSet rset10 = (ResultSet) cstmt.getObject(6);
		while(rset10.next()){
			MC_COST_2021_LCURLISTRecord rec = new MC_COST_2021_LCURLISTRecord();
			rec.cost_dstb_cd = Util.checkString(rset10.getString("cost_dstb_cd"));
			rec.cost_dstb_nm = Util.checkString(rset10.getString("cost_dstb_nm"));
			rec.cur_mon_qty = Util.checkString(rset10.getString("cur_mon_qty"));
			rec.bef_mon_qty = Util.checkString(rset10.getString("bef_mon_qty"));
			rec.sub_qty = Util.checkString(rset10.getString("sub_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_2021_LDataSet ds = (MC_COST_2021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_2021_LCURLISTRecord curlistRec = (MC_COST_2021_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cost_dstb_cd%>
<%= curlistRec.cost_dstb_nm%>
<%= curlistRec.cur_mon_qty%>
<%= curlistRec.bef_mon_qty%>
<%= curlistRec.sub_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 13:01:51 KST 2009 */
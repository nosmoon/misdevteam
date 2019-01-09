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


public class MC_COST_3172_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3172_LDataSet(){}
	public MC_COST_3172_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MC_COST_3172_LCURLISTRecord rec = new MC_COST_3172_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.dstb_dept_cd2 = Util.checkString(rset0.getString("dstb_dept_cd2"));
			rec.dstb_dept_nm2 = Util.checkString(rset0.getString("dstb_dept_nm2"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.amt0100 = Util.checkString(rset0.getString("amt0100"));
			rec.amt0200 = Util.checkString(rset0.getString("amt0200"));
			rec.amt0300 = Util.checkString(rset0.getString("amt0300"));
			rec.amt0301 = Util.checkString(rset0.getString("amt0301"));
			rec.amt0302 = Util.checkString(rset0.getString("amt0302"));
			rec.amt0303 = Util.checkString(rset0.getString("amt0303"));
			rec.amt0304 = Util.checkString(rset0.getString("amt0304"));
			rec.amt0305 = Util.checkString(rset0.getString("amt0305"));
			rec.amt0306 = Util.checkString(rset0.getString("amt0306"));
			rec.amt0307 = Util.checkString(rset0.getString("amt0307"));
			rec.amt0308 = Util.checkString(rset0.getString("amt0308"));
			rec.amt0400 = Util.checkString(rset0.getString("amt0400"));
			rec.amt0401 = Util.checkString(rset0.getString("amt0401"));
			rec.amt0402 = Util.checkString(rset0.getString("amt0402"));
			rec.amt0403 = Util.checkString(rset0.getString("amt0403"));
			rec.amt0500 = Util.checkString(rset0.getString("amt0500"));
			rec.amt0501 = Util.checkString(rset0.getString("amt0501"));
			rec.amt0502 = Util.checkString(rset0.getString("amt0502"));
			rec.amt0503 = Util.checkString(rset0.getString("amt0503"));
			rec.amt0504 = Util.checkString(rset0.getString("amt0504"));
			rec.amt0505 = Util.checkString(rset0.getString("amt0505"));
			rec.amt0506 = Util.checkString(rset0.getString("amt0506"));
			rec.amt0600 = Util.checkString(rset0.getString("amt0600"));
			rec.amt0601 = Util.checkString(rset0.getString("amt0601"));
			rec.amt0602 = Util.checkString(rset0.getString("amt0602"));
			rec.amt0603 = Util.checkString(rset0.getString("amt0603"));
			rec.amt0604 = Util.checkString(rset0.getString("amt0604"));
			rec.amt0605 = Util.checkString(rset0.getString("amt0605"));
			rec.amt0606 = Util.checkString(rset0.getString("amt0606"));
			rec.amt0611 = Util.checkString(rset0.getString("amt0611"));
			rec.amt0612 = Util.checkString(rset0.getString("amt0612"));
			rec.amt0613 = Util.checkString(rset0.getString("amt0613"));
			rec.amt0614 = Util.checkString(rset0.getString("amt0614"));
			rec.amt0615 = Util.checkString(rset0.getString("amt0615"));
			rec.amt0616 = Util.checkString(rset0.getString("amt0616"));
			rec.amt0617 = Util.checkString(rset0.getString("amt0617"));
			rec.amt0621 = Util.checkString(rset0.getString("amt0621"));
			rec.amt0631 = Util.checkString(rset0.getString("amt0631"));
			rec.amt0632 = Util.checkString(rset0.getString("amt0632"));
			rec.amt0700 = Util.checkString(rset0.getString("amt0700"));
			rec.amt0701 = Util.checkString(rset0.getString("amt0701"));
			rec.amt0702 = Util.checkString(rset0.getString("amt0702"));
			rec.amt0703 = Util.checkString(rset0.getString("amt0703"));
			rec.amt0704 = Util.checkString(rset0.getString("amt0704"));
			rec.amt0705 = Util.checkString(rset0.getString("amt0705"));
			rec.amt0706 = Util.checkString(rset0.getString("amt0706"));
			rec.amt0707 = Util.checkString(rset0.getString("amt0707"));
			rec.amt0708 = Util.checkString(rset0.getString("amt0708"));
			rec.amt0709 = Util.checkString(rset0.getString("amt0709"));
			rec.amt0710 = Util.checkString(rset0.getString("amt0710"));
			rec.amt0711 = Util.checkString(rset0.getString("amt0711"));
			rec.amt0712 = Util.checkString(rset0.getString("amt0712"));
			rec.amt9999 = Util.checkString(rset0.getString("amt9999"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3172_LDataSet ds = (MC_COST_3172_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3172_LCURLISTRecord curlistRec = (MC_COST_3172_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.dstb_dept_cd2%>
<%= curlistRec.dstb_dept_nm2%>
<%= curlistRec.amt%>
<%= curlistRec.amt0100%>
<%= curlistRec.amt0200%>
<%= curlistRec.amt0300%>
<%= curlistRec.amt0301%>
<%= curlistRec.amt0302%>
<%= curlistRec.amt0303%>
<%= curlistRec.amt0304%>
<%= curlistRec.amt0305%>
<%= curlistRec.amt0306%>
<%= curlistRec.amt0307%>
<%= curlistRec.amt0308%>
<%= curlistRec.amt0400%>
<%= curlistRec.amt0401%>
<%= curlistRec.amt0402%>
<%= curlistRec.amt0403%>
<%= curlistRec.amt0500%>
<%= curlistRec.amt0501%>
<%= curlistRec.amt0502%>
<%= curlistRec.amt0503%>
<%= curlistRec.amt0504%>
<%= curlistRec.amt0505%>
<%= curlistRec.amt0506%>
<%= curlistRec.amt0600%>
<%= curlistRec.amt0601%>
<%= curlistRec.amt0602%>
<%= curlistRec.amt0603%>
<%= curlistRec.amt0604%>
<%= curlistRec.amt0605%>
<%= curlistRec.amt0606%>
<%= curlistRec.amt0611%>
<%= curlistRec.amt0612%>
<%= curlistRec.amt0613%>
<%= curlistRec.amt0614%>
<%= curlistRec.amt0615%>
<%= curlistRec.amt0616%>
<%= curlistRec.amt0617%>
<%= curlistRec.amt0621%>
<%= curlistRec.amt0631%>
<%= curlistRec.amt0632%>
<%= curlistRec.amt0700%>
<%= curlistRec.amt0701%>
<%= curlistRec.amt0702%>
<%= curlistRec.amt0703%>
<%= curlistRec.amt0704%>
<%= curlistRec.amt0705%>
<%= curlistRec.amt0706%>
<%= curlistRec.amt0707%>
<%= curlistRec.amt0708%>
<%= curlistRec.amt0709%>
<%= curlistRec.amt0710%>
<%= curlistRec.amt0711%>
<%= curlistRec.amt0712%>
<%= curlistRec.amt9999%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 23 09:47:11 KST 2009 */
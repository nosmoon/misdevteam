/***************************************************************************************************
* 파일명 : SE_BNS_1510_LDataSet.java
* 기능 : 판매 - 판촉물관리 - 판촉물배분처리
* 작성일자 : 2009-05-06
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode	;
	public String errmsg	;
	public String yymm		;
	public String tms		;
	public String bgn_dt	;
	public String end_dt	;
	public String divn_dt	;

	public SE_BNS_1510_LDataSet(){}
	public SE_BNS_1510_LDataSet(String errcode, String errmsg, String yymm, String tms, String bgn_dt, String end_dt, String divn_dt){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
		this.yymm 		= yymm		;
		this.tms 		= tms		;
		this.bgn_dt 	= bgn_dt	;
		this.end_dt 	= end_dt	;
		this.divn_dt 	= divn_dt	;
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

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
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

	public String getTms(){
		return this.tms;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.yymm 			= Util.checkString(cstmt.getString(8));
		this.tms 			= Util.checkString(cstmt.getString(9));
		this.bgn_dt 		= Util.checkString(cstmt.getString(10));
		this.end_dt 		= Util.checkString(cstmt.getString(11));
		this.divn_dt 		= Util.checkString(cstmt.getString(12));
		ResultSet rset0 	= (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SE_BNS_1510_LCURLISTRecord rec = new SE_BNS_1510_LCURLISTRecord();
			rec.bns_item_cd = Util.checkString(rset0.getString("bns_item_cd"));
			rec.bns_item_nm = Util.checkString(rset0.getString("bns_item_nm"));
			rec.send_qunt 	= Util.checkString(rset0.getString("send_qunt"	));
			rec.qunt 		= Util.checkString(rset0.getString("qunt"		));
			rec.divn_dt 	= Util.checkString(rset0.getString("divn_dt"	));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_1510_LDataSet ds = (SE_BNS_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_1510_LCURLISTRecord curlistRec = (SE_BNS_1510_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYymm()%>
<%= ds.getTms()%>
<%= ds.getBgn_dt()%>
<%= ds.getEnd_dt()%>
<%= ds.getDivn_dt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.bns_item_cd%>
<%= curlistRec.bns_item_nm%>
<%= curlistRec.send_qunt%>
<%= curlistRec.qunt%>
<%= curlistRec.divn_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 19:56:46 KST 2009 */
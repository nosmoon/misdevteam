/***************************************************************************************************
* 파일명 : SE_SND_3010_LDataSet.java
* 기능 : 판매-발송관리-발송부수증감체크 및 조회
* 작성일자 : 2009-05-22
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList sublist = new ArrayList();
	public String errcode	;
	public String errmsg	;
	public String issu_dt	;
	public String be_issu_dt;

	public SE_SND_3010_LDataSet(){}
	public SE_SND_3010_LDataSet(String errcode, String errmsg, String issu_dt, String be_issu_dt){
		this.errcode 	= errcode	;
		this.errmsg 	= errmsg	;
		this.issu_dt 	= issu_dt	;
		this.be_issu_dt = be_issu_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setBe_issu_dt(String be_issu_dt){
		this.be_issu_dt = be_issu_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getBe_issu_dt(){
		return this.be_issu_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode 		= Util.checkString(cstmt.getString(1));
		this.errmsg 		= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 	= (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_SND_3010_LCURLISTRecord rec = new SE_SND_3010_LCURLISTRecord();
			rec.medi_cd 	= Util.checkString(rset0.getString("medi_cd"	));
			rec.medi_nm 	= Util.checkString(rset0.getString("medi_nm"	));
			rec.be_qty 		= Util.checkString(rset0.getString("be_qty"		));
			rec.icdc_qty 	= Util.checkString(rset0.getString("icdc_qty"	));
			rec.qty 		= Util.checkString(rset0.getString("qty"		));
			rec.err_qty 	= Util.checkString(rset0.getString("err_qty"	));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SE_SND_3010_LSUBLISTRecord rec = new SE_SND_3010_LSUBLISTRecord();
			rec.medi_cd 		= Util.checkString(rset1.getString("medi_cd"		));
			rec.medi_nm			= Util.checkString(rset1.getString("medi_nm"		));
			rec.area_cd 		= Util.checkString(rset1.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset1.getString("area_nm"		));
			rec.bo_cd 			= Util.checkString(rset1.getString("bo_cd"			));
			rec.send_plac_seq 	= Util.checkString(rset1.getString("send_plac_seq"	));
			rec.send_plac_nm 	= Util.checkString(rset1.getString("send_plac_nm"	));
			rec.be_qty 			= Util.checkString(rset1.getString("be_qty"			));
			rec.icdc_qty 		= Util.checkString(rset1.getString("icdc_qty"		));
			rec.qty 			= Util.checkString(rset1.getString("qty"			));
			rec.err_qty 		= Util.checkString(rset1.getString("err_qty"		));
			this.sublist.add(rec);
		}
		this.issu_dt = Util.checkString(cstmt.getString(8));
		this.be_issu_dt = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_3010_LDataSet ds = (SE_SND_3010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_3010_LCURLISTRecord curlistRec = (SE_SND_3010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getIssu_dt()%>
<%= ds.getBe_issu_dt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.be_qty%>
<%= curlistRec.icdc_qty%>
<%= curlistRec.qty%>
<%= curlistRec.err_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 14:53:41 KST 2009 */
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


package chosun.ciis.se.trg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String evlu_dt;
	public String clos_yn;

	public SE_TRG_1510_LDataSet(){}
	public SE_TRG_1510_LDataSet(String errcode, String errmsg, String evlu_dt, String clos_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.evlu_dt = evlu_dt;
		this.clos_yn = clos_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setEvlu_dt(String evlu_dt){
		this.evlu_dt = evlu_dt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getEvlu_dt(){
		return this.evlu_dt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.evlu_dt = Util.checkString(cstmt.getString(10));
		this.clos_yn = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_TRG_1510_LCURLISTRecord rec = new SE_TRG_1510_LCURLISTRecord();
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.trgt = Util.checkString(rset0.getString("trgt"));
			rec.rslt = Util.checkString(rset0.getString("rslt"));
			rec.ufth_dedu = Util.checkString(rset0.getString("ufth_dedu"));
			rec.re_free_dedu = Util.checkString(rset0.getString("re_free_dedu"));
			rec.camp_dedu = Util.checkString(rset0.getString("camp_dedu"));
			rec.exst_rdr_dedu = Util.checkString(rset0.getString("exst_rdr_dedu"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_TRG_1510_LDataSet ds = (SE_TRG_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_TRG_1510_LCURLISTRecord curlistRec = (SE_TRG_1510_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEvlu_dt()%>
<%= ds.getClos_yn()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.trgt%>
<%= curlistRec.rslt%>
<%= curlistRec.ufth_dedu%>
<%= curlistRec.re_free_dedu%>
<%= curlistRec.camp_dedu%>
<%= curlistRec.exst_rdr_dedu%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 17:51:09 KST 2009 */
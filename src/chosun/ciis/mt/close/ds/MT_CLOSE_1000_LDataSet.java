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


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_1000_LDataSet(){}
	public MT_CLOSE_1000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_CLOSE_1000_LCURLISTRecord rec = new MT_CLOSE_1000_LCURLISTRecord();
			rec.aply_from_dt = Util.checkString(rset0.getString("aply_from_dt"));
			rec.aply_to_dt = Util.checkString(rset0.getString("aply_to_dt"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.matr_cd_nm = Util.checkString(rset0.getString("matr_cd_nm"));
			rec.shet_qunt = Util.checkString(rset0.getString("shet_qunt"));
			rec.matr_cd1 = Util.checkString(rset0.getString("matr_cd1"));
			rec.matr_cd2 = Util.checkString(rset0.getString("matr_cd2"));
			rec.matr_cd3 = Util.checkString(rset0.getString("matr_cd3"));
			rec.matr_cd4 = Util.checkString(rset0.getString("matr_cd4"));
			rec.matr_cd5 = Util.checkString(rset0.getString("matr_cd5"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.chemi_cd1 = Util.checkString(rset0.getString("chemi_cd1"));
			rec.chemi_cd2 = Util.checkString(rset0.getString("chemi_cd2"));
			rec.chemi_cd3 = Util.checkString(rset0.getString("chemi_cd3"));
			rec.chemi_cd4 = Util.checkString(rset0.getString("chemi_cd4"));
			rec.chemi_cd5 = Util.checkString(rset0.getString("chemi_cd5"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_1000_LDataSet ds = (MT_CLOSE_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_1000_LCURLISTRecord curlistRec = (MT_CLOSE_1000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aply_from_dt%>
<%= curlistRec.aply_to_dt%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.matr_cd_nm%>
<%= curlistRec.shet_qunt%>
<%= curlistRec.matr_cd1%>
<%= curlistRec.matr_cd2%>
<%= curlistRec.matr_cd3%>
<%= curlistRec.matr_cd4%>
<%= curlistRec.matr_cd5%>
<%= curlistRec.seq%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.matr_cd%>
<%= curlistRec.chemi_cd1%>
<%= curlistRec.chemi_cd2%>
<%= curlistRec.chemi_cd3%>
<%= curlistRec.chemi_cd4%>
<%= curlistRec.chemi_cd5%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 18:03:09 KST 2009 */
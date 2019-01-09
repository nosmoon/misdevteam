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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_2001_LDataSet(){}
	public MT_SUBMATRCLA_2001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATRCLA_2001_LCURLISTRecord rec = new MT_SUBMATRCLA_2001_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.clam_qunt = Util.checkString(rset0.getString("clam_qunt"));
			rec.fix_qunt = Util.checkString(rset0.getString("fix_qunt"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.res_yn = Util.checkString(rset0.getString("res_yn"));
			rec.buy_proc_stat = Util.checkString(rset0.getString("buy_proc_stat"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRCLA_2001_LDataSet ds = (MT_SUBMATRCLA_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_2001_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_2001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.std_modl%>
<%= curlistRec.unit%>
<%= curlistRec.usag%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.clam_qunt%>
<%= curlistRec.fix_qunt%>
<%= curlistRec.amt%>
<%= curlistRec.res_yn%>
<%= curlistRec.buy_proc_stat%>
<%= curlistRec.sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 19:54:28 KST 2009 */
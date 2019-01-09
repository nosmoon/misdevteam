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


public class AD_BAS_3711_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3711_LDataSet(){}
	public AD_BAS_3711_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_BAS_3711_LCURLISTRecord rec = new AD_BAS_3711_LCURLISTRecord();
			rec.sub_num = Util.checkString(rset0.getString("sub_num"));
			rec.c_medi_cd = Util.checkString(rset0.getString("c_medi_cd"));
			rec.c_pubc_dt = Util.checkString(rset0.getString("c_pubc_dt"));
			rec.c_pubc_seq = Util.checkString(rset0.getString("c_pubc_seq"));
			rec.c_sect = Util.checkString(rset0.getString("c_sect"));
			rec.c_advt_cont = Util.checkString(rset0.getString("c_advt_cont"));
			rec.c_slcrg_nm = Util.checkString(rset0.getString("c_slcrg_nm"));
			rec.j_medi_cd = Util.checkString(rset0.getString("j_medi_cd"));
			rec.j_pubc_dt = Util.checkString(rset0.getString("j_pubc_dt"));
			rec.j_pubc_seq = Util.checkString(rset0.getString("j_pubc_seq"));
			rec.j_sect = Util.checkString(rset0.getString("j_sect"));
			rec.j_advt_cont = Util.checkString(rset0.getString("j_advt_cont"));
			rec.j_slcrg_nm = Util.checkString(rset0.getString("j_slcrg_nm"));
			rec.d_medi_cd = Util.checkString(rset0.getString("d_medi_cd"));
			rec.d_pubc_dt = Util.checkString(rset0.getString("d_pubc_dt"));
			rec.d_pubc_seq = Util.checkString(rset0.getString("d_pubc_seq"));
			rec.d_sect = Util.checkString(rset0.getString("d_sect"));
			rec.d_advt_cont = Util.checkString(rset0.getString("d_advt_cont"));
			rec.d_slcrg_nm = Util.checkString(rset0.getString("d_slcrg_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3711_LDataSet ds = (AD_BAS_3711_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3711_LCURLISTRecord curlistRec = (AD_BAS_3711_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sub_num%>
<%= curlistRec.c_medi_cd%>
<%= curlistRec.c_pubc_dt%>
<%= curlistRec.c_pubc_seq%>
<%= curlistRec.c_sect%>
<%= curlistRec.c_advt_cont%>
<%= curlistRec.c_slcrg_nm%>
<%= curlistRec.j_medi_cd%>
<%= curlistRec.j_pubc_dt%>
<%= curlistRec.j_pubc_seq%>
<%= curlistRec.j_sect%>
<%= curlistRec.j_advt_cont%>
<%= curlistRec.j_slcrg_nm%>
<%= curlistRec.d_medi_cd%>
<%= curlistRec.d_pubc_dt%>
<%= curlistRec.d_pubc_seq%>
<%= curlistRec.d_sect%>
<%= curlistRec.d_advt_cont%>
<%= curlistRec.d_slcrg_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 04 16:42:16 KST 2014 */
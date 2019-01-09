/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1610_LDataSet(){}
	public PL_BAS_1610_LDataSet(String errcode, String errmsg){
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
			PL_BAS_1610_LPTCRLISTRecord rec = new PL_BAS_1610_LPTCRLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.mang_cd_1 = Util.checkString(rset0.getString("mang_cd_1"));
			rec.issu_cmpy = Util.checkString(rset0.getString("issu_cmpy"));
			rec.mang_cd_2 = Util.checkString(rset0.getString("mang_cd_2"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.mang_cd_3 = Util.checkString(rset0.getString("mang_cd_3"));
			rec.ser_no_basi = Util.checkString(rset0.getString("ser_no_basi"));
			rec.mang_cd_4 = Util.checkString(rset0.getString("mang_cd_4"));
			rec.issu_clsf = Util.checkString(rset0.getString("issu_clsf"));
			rec.mang_cd_5 = Util.checkString(rset0.getString("mang_cd_5"));
			rec.basi_wh = Util.checkString(rset0.getString("basi_wh"));
			rec.mang_cd_6 = Util.checkString(rset0.getString("mang_cd_6"));
			rec.mang_cd_7 = Util.checkString(rset0.getString("mang_cd_7"));
			rec.mang_cd_8 = Util.checkString(rset0.getString("mang_cd_8"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1610_LDataSet ds = (PL_BAS_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_BAS_1610_LPTCRLISTRecord ptcrlistRec = (PL_BAS_1610_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= ptcrlistRec.cd%>
<%= ptcrlistRec.cdnm%>
<%= ptcrlistRec.cd_abrv_nm%>
<%= ptcrlistRec.mang_cd_1%>
<%= ptcrlistRec.issu_cmpy%>
<%= ptcrlistRec.mang_cd_2%>
<%= ptcrlistRec.medi_clsf%>
<%= ptcrlistRec.mang_cd_3%>
<%= ptcrlistRec.ser_no_basi%>
<%= ptcrlistRec.mang_cd_4%>
<%= ptcrlistRec.issu_clsf%>
<%= ptcrlistRec.mang_cd_5%>
<%= ptcrlistRec.basi_wh%>
<%= ptcrlistRec.mang_cd_6%>
<%= ptcrlistRec.mang_cd_7%>
<%= ptcrlistRec.mang_cd_8%>
<%= ptcrlistRec.use_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 12:11:10 KST 2009 */
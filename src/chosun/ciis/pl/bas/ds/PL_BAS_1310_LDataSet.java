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


public class PL_BAS_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medi_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1310_LDataSet(){}
	public PL_BAS_1310_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PL_BAS_1310_LMEDI_CDCURRecord rec = new PL_BAS_1310_LMEDI_CDCURRecord();
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.issu_cmpy = Util.checkString(rset0.getString("issu_cmpy"));
			rec.issu_cmpy_nm = Util.checkString(rset0.getString("issu_cmpy_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cd_nm = Util.checkString(rset0.getString("medi_cd_nm"));
			rec.issu_clsf = Util.checkString(rset0.getString("issu_clsf"));
			rec.issu_clsf_nm = Util.checkString(rset0.getString("issu_clsf_nm"));
			this.medi_cdcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1310_LDataSet ds = (PL_BAS_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_cdcur.size(); i++){
		PL_BAS_1310_LMEDI_CDCURRecord medi_cdcurRec = (PL_BAS_1310_LMEDI_CDCURRecord)ds.medi_cdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_cdcurRec.medi_clsf%>
<%= medi_cdcurRec.issu_cmpy%>
<%= medi_cdcurRec.issu_cmpy_nm%>
<%= medi_cdcurRec.medi_cd%>
<%= medi_cdcurRec.medi_cd_nm%>
<%= medi_cdcurRec.issu_clsf%>
<%= medi_cdcurRec.issu_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 22:13:54 KST 2009 */
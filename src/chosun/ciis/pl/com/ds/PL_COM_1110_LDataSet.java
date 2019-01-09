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


package chosun.ciis.pl.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.rec.*;

/**
 * 
 */


public class PL_COM_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mediinfolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_COM_1110_LDataSet(){}
	public PL_COM_1110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			PL_COM_1110_LMEDIINFOLISTRecord rec = new PL_COM_1110_LMEDIINFOLISTRecord();
			rec.medi_cd = Util.checkString(rset5.getString("medi_cd"));
			rec.medi_cdnm = Util.checkString(rset5.getString("medi_cdnm"));
			rec.medi_ser_no = Util.checkString(rset5.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset5.getString("medi_nm"));
			rec.issu_cmpy = Util.checkString(rset5.getString("issu_cmpy"));
			rec.issu_cmpynm = Util.checkString(rset5.getString("issu_cmpynm"));
			rec.medi_clsf = Util.checkString(rset5.getString("medi_clsf"));
			rec.medi_clsfnm = Util.checkString(rset5.getString("medi_clsfnm"));
			rec.basi_yymm = Util.checkString(rset5.getString("basi_yymm"));
			rec.reg_dt = Util.checkString(rset5.getString("reg_dt"));
			rec.uprc = Util.checkString(rset5.getString("uprc"));
			rec.dcrate = Util.checkString(rset5.getString("dcrate"));
			rec.type = Util.checkString(rset5.getString("type"));
			rec.typenm = Util.checkString(rset5.getString("typenm"));
			rec.absence_clsf = Util.checkString(rset5.getString("absence_clsf"));
			rec.absence_clsfnm = Util.checkString(rset5.getString("absence_clsfnm"));
			rec.absence_dt = Util.checkString(rset5.getString("absence_dt"));
			rec.ser_no_basi = Util.checkString(rset5.getString("ser_no_basi"));
			rec.issu_clsf = Util.checkString(rset5.getString("issu_clsf"));
			rec.end_ser_no = Util.checkString(rset5.getString("end_ser_no"));
			this.mediinfolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_COM_1110_LDataSet ds = (PL_COM_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.mediinfolist.size(); i++){
		PL_COM_1110_LMEDIINFOLISTRecord mediinfolistRec = (PL_COM_1110_LMEDIINFOLISTRecord)ds.mediinfolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMediinfolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= mediinfolistRec.medi_cd%>
<%= mediinfolistRec.medi_cdnm%>
<%= mediinfolistRec.medi_ser_no%>
<%= mediinfolistRec.medi_nm%>
<%= mediinfolistRec.issu_cmpy%>
<%= mediinfolistRec.issu_cmpynm%>
<%= mediinfolistRec.medi_clsf%>
<%= mediinfolistRec.medi_clsfnm%>
<%= mediinfolistRec.basi_yymm%>
<%= mediinfolistRec.reg_dt%>
<%= mediinfolistRec.uprc%>
<%= mediinfolistRec.dcrate%>
<%= mediinfolistRec.type%>
<%= mediinfolistRec.typenm%>
<%= mediinfolistRec.absence_clsf%>
<%= mediinfolistRec.absence_clsfnm%>
<%= mediinfolistRec.absence_dt%>
<%= mediinfolistRec.ser_no_basi%>
<%= mediinfolistRec.issu_clsf%>
<%= mediinfolistRec.end_ser_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */
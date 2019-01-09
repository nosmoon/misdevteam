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


public class PL_BAS_1320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medi_cd_dlcocur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1320_LDataSet(){}
	public PL_BAS_1320_LDataSet(String errcode, String errmsg){
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
		ResultSet rset12 = (ResultSet) cstmt.getObject(7);
		while(rset12.next()){
			PL_BAS_1320_LMEDI_CD_DLCOCURRecord rec = new PL_BAS_1320_LMEDI_CD_DLCOCURRecord();
			rec.medi_cd = Util.checkString(rset12.getString("medi_cd"));
			rec.dlco_clsf = Util.checkString(rset12.getString("dlco_clsf"));
			rec.dlco_clsf_nm = Util.checkString(rset12.getString("dlco_clsf_nm"));
			rec.area = Util.checkString(rset12.getString("area"));
			rec.area_nm = Util.checkString(rset12.getString("area_nm"));
			rec.dlco_cd = Util.checkString(rset12.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset12.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset12.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset12.getString("dlco_abrv_nm"));
			rec.deal_yn = Util.checkString(rset12.getString("deal_yn"));
			rec.no_val_exne = Util.checkString(rset12.getString("no_val_exne"));
			rec.dcrate = Util.checkString(rset12.getString("dcrate"));
			rec.wh_cd = Util.checkString(rset12.getString("wh_cd"));
			rec.sendclsf = Util.checkString(rset12.getString("sendclsf"));
			rec.remk = Util.checkString(rset12.getString("remk"));
			this.medi_cd_dlcocur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1320_LDataSet ds = (PL_BAS_1320_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medi_cd_dlcocur.size(); i++){
		PL_BAS_1320_LMEDI_CD_DLCOCURRecord medi_cd_dlcocurRec = (PL_BAS_1320_LMEDI_CD_DLCOCURRecord)ds.medi_cd_dlcocur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd_dlcocur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medi_cd_dlcocurRec.medi_cd%>
<%= medi_cd_dlcocurRec.dlco_clsf%>
<%= medi_cd_dlcocurRec.dlco_clsf_nm%>
<%= medi_cd_dlcocurRec.area%>
<%= medi_cd_dlcocurRec.area_nm%>
<%= medi_cd_dlcocurRec.dlco_cd%>
<%= medi_cd_dlcocurRec.dlco_seq%>
<%= medi_cd_dlcocurRec.dlco_nm%>
<%= medi_cd_dlcocurRec.dlco_abrv_nm%>
<%= medi_cd_dlcocurRec.deal_yn%>
<%= medi_cd_dlcocurRec.no_val_exne%>
<%= medi_cd_dlcocurRec.dcrate%>
<%= medi_cd_dlcocurRec.wh_cd%>
<%= medi_cd_dlcocurRec.sendclsf%>
<%= medi_cd_dlcocurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */
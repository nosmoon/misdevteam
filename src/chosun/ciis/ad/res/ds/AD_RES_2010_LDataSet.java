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


package chosun.ciis.ad.res.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList extrudecurlist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList edtcurlist = new ArrayList();
	public ArrayList sectcurlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String remk;
	public String job_trsf;

	public AD_RES_2010_LDataSet(){}
	public AD_RES_2010_LDataSet(String errcode, String errmsg, String remk, String job_trsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.remk = remk;
		this.job_trsf = job_trsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setJob_trsf(String job_trsf){
		this.job_trsf = job_trsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getJob_trsf(){
		return this.job_trsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.remk = Util.checkString(cstmt.getString(6));
		this.job_trsf = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_RES_2010_LCURLISTRecord rec = new AD_RES_2010_LCURLISTRecord();
			rec.sect_nm_cd = Util.checkString(rset0.getString("sect_nm_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.stat = Util.checkString(rset0.getString("stat"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			AD_RES_2010_LSECTCURLISTRecord rec = new AD_RES_2010_LSECTCURLISTRecord();
			rec.sect_clas_cd = Util.checkString(rset1.getString("sect_clas_cd"));
			rec.sect_nm_cd = Util.checkString(rset1.getString("sect_nm_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.max_seq = Util.checkString(rset1.getString("max_seq"));
			this.sectcurlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			AD_RES_2010_LEXTRUDECURLISTRecord rec = new AD_RES_2010_LEXTRUDECURLISTRecord();
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset2.getString("sect_seq"));
			rec.advt_cont = Util.checkString(rset2.getString("advt_cont"));
			rec.cm = Util.checkString(rset2.getString("cm"));
			rec.dn = Util.checkString(rset2.getString("dn"));
			rec.uprc = Util.checkString(rset2.getString("uprc"));
			rec.advt_fee = Util.checkString(rset2.getString("advt_fee"));
			this.extrudecurlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			AD_RES_2010_LEDTCURLISTRecord rec = new AD_RES_2010_LEDTCURLISTRecord();
			rec.sect_cd = Util.checkString(rset3.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset3.getString("sect_seq"));
			rec.advt_cont = Util.checkString(rset3.getString("advt_cont"));
			rec.cm = Util.checkString(rset3.getString("cm"));
			rec.dn = Util.checkString(rset3.getString("dn"));
			rec.uprc = Util.checkString(rset3.getString("uprc"));
			rec.advt_fee = Util.checkString(rset3.getString("advt_fee"));
			this.edtcurlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_2010_LDataSet ds = (AD_RES_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_2010_LCURLISTRecord curlistRec = (AD_RES_2010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sectcurlist.size(); i++){
		AD_RES_2010_LSECTCURLISTRecord sectcurlistRec = (AD_RES_2010_LSECTCURLISTRecord)ds.sectcurlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.extrudecurlist.size(); i++){
		AD_RES_2010_LEXTRUDECURLISTRecord extrudecurlistRec = (AD_RES_2010_LEXTRUDECURLISTRecord)ds.extrudecurlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.edtcurlist.size(); i++){
		AD_RES_2010_LEDTCURLISTRecord edtcurlistRec = (AD_RES_2010_LEDTCURLISTRecord)ds.edtcurlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRemk()%>
<%= ds.getJob_trsf()%>
<%= ds.getCurlist()%>
<%= ds.getSectcurlist()%>
<%= ds.getExtrudecurlist()%>
<%= ds.getEdtcurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sect_nm_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.advt_cont%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.stat%>
<%= sectcurlistRec.sect_clas_cd%>
<%= sectcurlistRec.sect_nm_cd%>
<%= sectcurlistRec.sect_nm%>
<%= sectcurlistRec.sect_cd%>
<%= sectcurlistRec.max_seq%>
<%= extrudecurlistRec.sect_cd%>
<%= extrudecurlistRec.sect_seq%>
<%= extrudecurlistRec.advt_cont%>
<%= extrudecurlistRec.cm%>
<%= extrudecurlistRec.dn%>
<%= extrudecurlistRec.uprc%>
<%= extrudecurlistRec.advt_fee%>
<%= edtcurlistRec.sect_cd%>
<%= edtcurlistRec.sect_seq%>
<%= edtcurlistRec.advt_cont%>
<%= edtcurlistRec.cm%>
<%= edtcurlistRec.dn%>
<%= edtcurlistRec.uprc%>
<%= edtcurlistRec.advt_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 06 11:38:09 KST 2017 */